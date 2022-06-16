package com.example.p006myprojectseconomyapi;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CountryRepository extends MongoRepository<Country,String> {

    @Query(value = "{country_name:?0}")
    List<Country> findByCountry(String country_name);
}
