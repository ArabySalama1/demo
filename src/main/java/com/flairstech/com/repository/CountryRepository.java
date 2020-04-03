package com.flairstech.com.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.flairstech.com.model.Country;

/**
 * The Interface CountryRepository.
 */
@Repository
public interface CountryRepository extends JpaRepository<Country, String> {

}
