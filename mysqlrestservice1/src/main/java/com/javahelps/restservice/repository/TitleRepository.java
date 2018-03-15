package com.javahelps.restservice.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.javahelps.restservice.entity.Title;

@RepositoryRestResource(path = "/titles")
public interface TitleRepository extends JpaRepository<Title, Long> {

}
