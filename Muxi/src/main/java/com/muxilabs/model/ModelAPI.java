package com.muxilabs.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tb_api")
public class ModelAPI {

	// Construindo as VARIAVÉIS 
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private Long id;
	
	private int logic;
	
	private String serial;
	
	private String model;
	
	private int sam;
	
	private String ptid;
	
	private int plat;
	
	private String version;
	
	private int mxr;
	
	private int mxf;
	
	private String verfm;
	

	
	
	// Construtor GETT E SET 
	
	public int getLogic() {
		return logic;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public void setLogic(int logic) {
		this.logic = logic;
	}

	public String getSerial() {
		return serial;
	}

	public void setSerial(String serial) {
		this.serial = serial;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getSam() {
		return sam;
	}

	public void setSam(int sam) {
		this.sam = sam;
	}

	public String getPtid() {
		return ptid;
	}

	public void setPtid(String ptid) {
		this.ptid = ptid;
	}

	public int getPlat() {
		return plat;
	}

	public void setPlat(int plat) {
		this.plat = plat;
	}

	public String getVersion() {
		return version;
	}

	public void setVersion(String version) {
		this.version = version;
	}

	public int getMxr() {
		return mxr;
	}

	public void setMxr(int mxr) {
		this.mxr = mxr;
	}

	public int getMxf() {
		return mxf;
	}

	public void setMxf(int mxf) {
		this.mxf = mxf;
	}

	public String getVerfm() {
		return verfm;
	}

	public void setVerfm(String verfm) {
		this.verfm = verfm;
	}
	
	
	
	
	
	
	
	
	
}
