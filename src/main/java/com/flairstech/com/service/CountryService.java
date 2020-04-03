package com.flairstech.com.service;

import org.springframework.stereotype.Service;

import com.flairstech.com.exception.ResourceNotFoundException;
import com.flairstech.com.model.Country;

/**
 * The Interface CountryService.
 */
@Service
public interface CountryService {

	/**
	 * Find country by code.
	 *
	 * @param code the code
	 * @return the country
	 * @throws ResourceNotFoundException the resource not found exception
	 */
	public Country findCountryByCode(String code) throws ResourceNotFoundException;

}
