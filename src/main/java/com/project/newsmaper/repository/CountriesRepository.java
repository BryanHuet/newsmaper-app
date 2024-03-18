package com.project.newsmaper.repository;

import org.springframework.data.repository.CrudRepository;

import com.project.newsmaper.objects.Country;


// This will be AUTO IMPLEMENTED by Spring into a Bean called userRepository
// CRUD refers Create, Read, Update, Delete

public interface CountriesRepository extends CrudRepository<Country, Integer> {

}