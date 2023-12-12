package com.gros.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.gros.entity.GrosEntity;
import com.gros.service.GrosService;
@CrossOrigin("http://localhost:3000")
@RestController
public class GrosController {
	
	@Autowired
	GrosService grosService;

//	@PostMapping("/saveImages")
//	public List<GrosEntity> saveImages(@RequestBody List<GrosEntity> filepath) {
////		GrosEntity img = new GrosEntity();
//		List<GrosEntity> imglist = new ArrayList<>();
//		for (GrosEntity imgfile : filepath) {
//			imglist.add(imgfile);
//		}
////		img.setFilepath(imglist);
//		List<GrosEntity> savedImage = grosService.saveImage(imglist);
//		return savedImage ;
//	}

	@PostMapping("/saveImages")
	public ResponseEntity<List<GrosEntity>> saveImages(@RequestBody List<GrosEntity> images) 
	{ 
	   List<GrosEntity> savedImages = grosService.saveImage(images);
	    return new ResponseEntity<>(savedImages, HttpStatus.CREATED);
	}
	@GetMapping("/getAllmages")
	public List<GrosEntity> getAllImages(){
		 List<GrosEntity> getimages = grosService.getAllImages();
		return getimages;
		
	}

}
