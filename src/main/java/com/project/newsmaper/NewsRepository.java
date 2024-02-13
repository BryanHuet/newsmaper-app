package com.project.newsmaper;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.Query;
import java.util.List;

// This will be AUTO IMPLEMENTED by Spring into a Bean called userRepository
// CRUD refers Create, Read, Update, Delete

@Repository
public interface NewsRepository extends CrudRepository<News, Integer> {

    @Query(value = "SELECT * FROM news c WHERE c.country_id=%?1",nativeQuery = true)
    public List<News> findByCountryId(Integer country_id);
}