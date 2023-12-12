package com.gros.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class GrosEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String name;
	private String filepath;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getFilepath() {
		return filepath;
	}

	public void setFilepath(String imglist) {
		this.filepath = imglist;
	}

	@Override
	public String toString() {
		return "GrosEntity [id=" + id + ", name=" + name + ", filepath=" + filepath + "]";
	}

	public GrosEntity() {
		super();
		// TODO Auto-generated constructor stub
	}

	public GrosEntity(Long id, String name, String filepath) {
		super();
		this.id = id;
		this.name = name;
		this.filepath = filepath;
	}
}
