package com.example.demo;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "models", path = "models")
public interface DemoModelRepository extends PagingAndSortingRepository<DemoModel, String>
{}
