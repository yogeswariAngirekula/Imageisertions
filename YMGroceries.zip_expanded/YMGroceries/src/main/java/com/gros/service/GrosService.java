package com.gros.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gros.entity.GrosEntity;
import com.gros.repo.GrosRepo;


@Service
public class GrosService {

	@Autowired
	GrosRepo grosRepo;

	public List<GrosEntity> saveImage(List<GrosEntity> imglist) {
		List<GrosEntity> saved = grosRepo.saveAll(imglist);
		return saved;
	}

	public List<GrosEntity> getAllImages() {
		List<GrosEntity> getImages = grosRepo.findAll();
		return getImages;
	}

}
