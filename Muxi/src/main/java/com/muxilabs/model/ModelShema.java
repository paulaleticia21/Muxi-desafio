package com.muxilabs.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "tb_shema")
public class ModelShema {
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String title;
	
	private String type;
		
	private ModelAPI properties;
	
	private String required[] = new String[4];
	
	
	public ModelShema() {
		this.required[0] = Integer.toString(this.properties.getLogic());
		this.required[1] = this.properties.getSerial();
		this.required[2] = this.properties.getModel();
		this.required[3] = this.properties.getVersion();
	}

	public String getTitle() {
		return title;
	}

	public String[] getRequired() {
		return required;
	}

	public void setRequired(String[] required) {
		this.required = required;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public ModelAPI getProperties() {
		return properties;
	}

	public void setProperties(ModelAPI properties) {
		this.properties = properties;
	}

	
	
	
	
	
	
	
	
	
	
}
