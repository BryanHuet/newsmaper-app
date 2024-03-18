package com.project.newsmaper.repository;

import org.springframework.data.repository.CrudRepository;
import com.project.newsmaper.objects.Date;

// This will be AUTO IMPLEMENTED by Spring into a Bean called userRepository
// CRUD refers Create, Read, Update, Delete

public interface DateRepository extends CrudRepository<Date, Integer> {

}