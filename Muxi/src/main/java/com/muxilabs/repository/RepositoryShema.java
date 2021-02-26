package com.muxilabs.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.muxilabs.model.ModelShema;

@Repository
public interface RepositoryShema extends JpaRepository <ModelShema, Long> {

}
