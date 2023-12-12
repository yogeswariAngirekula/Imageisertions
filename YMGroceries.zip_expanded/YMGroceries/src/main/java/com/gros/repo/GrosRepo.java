package com.gros.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gros.entity.GrosEntity;

@Repository
public interface GrosRepo extends JpaRepository<GrosEntity, Long> {

	
	
}
