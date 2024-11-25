package com.basics.khan.basics.photo.clone.repository;

import org.springframework.data.repository.CrudRepository;

import com.basics.khan.basics.photo.clone.model.Photo;

public interface PhotozRepository extends CrudRepository<Photo, Integer> {
}