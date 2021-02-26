package com.muxilabs.repository;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.muxilabs.model.ModelAPI;

@Repository
public interface RepositoryAPI extends JpaRepository <ModelAPI, Long> {
	public List<ModelAPI> findAllByVersionAndLogic(String version , int logic);
	

}
