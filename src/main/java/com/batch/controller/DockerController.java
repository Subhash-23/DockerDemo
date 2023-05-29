package com.batch.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.batch.entity.DockerEntity;
import com.batch.repo.DockerRepo;

@RestController
public class DockerController {

	@Autowired
	private DockerRepo repo;
	
	@PostMapping("/save")
	public String postMethod(@RequestBody DockerEntity entity) {
		repo.save(entity);
		return "Data Saved";
	}
	
	@GetMapping("/findAll")
	public List<DockerEntity> getMethod() {
		List<DockerEntity> getList = (List<DockerEntity>) repo.findAll();
		return getList;
	}
}
