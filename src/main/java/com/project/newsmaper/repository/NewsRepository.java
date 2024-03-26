package com.project.newsmaper.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.project.newsmaper.objects.News;

import org.springframework.data.jpa.repository.Query;
import java.util.List;

// This will be AUTO IMPLEMENTED by Spring into a Bean called userRepository
// CRUD refers Create, Read, Update, Delete

@Repository
public interface NewsRepository extends CrudRepository<News, Integer> {

    @Query(value = "SELECT n.id, n.id_country, n.id_source ,n.id_date, n.title, n.link, n.description, n.media, s.name as source, d.year, d.month, d.day, d.hours FROM news n JOIN sources s ON n.id_source = s.id JOIN date d ON n.id_date = d.id WHERE n.id_country=%?1",nativeQuery = true)
    public List<News> findByCountryId(Integer country_id);

    @Query(value = "SELECT n.id, n.id_country, n.id_source ,n.id_date, n.title, n.link, n.description, n.media, s.name as source, d.year, d.month, d.day, d.hours FROM news n JOIN sources s ON n.id_source = s.id JOIN date d ON n.id_date = d.id",nativeQuery = true)
    public List<News> queryAll();
}