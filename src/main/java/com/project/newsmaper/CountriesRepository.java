package com.project.newsmaper;

import org.springframework.data.repository.CrudRepository;


// This will be AUTO IMPLEMENTED by Spring into a Bean called userRepository
// CRUD refers Create, Read, Update, Delete

public interface CountriesRepository extends CrudRepository<Country, Integer> {

}