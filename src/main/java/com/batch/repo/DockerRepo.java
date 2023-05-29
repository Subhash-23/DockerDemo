package com.batch.repo;

import org.springframework.data.repository.CrudRepository;

import com.batch.entity.DockerEntity;

public interface DockerRepo extends CrudRepository<DockerEntity, Integer>{

}
