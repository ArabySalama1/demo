package com.flairstech.com.service.impl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.flairstech.com.exception.ResourceNotFoundException;
import com.flairstech.com.model.Country;
import com.flairstech.com.repository.CountryRepository;
import com.flairstech.com.service.CountryService;

/**
 * The Class CountryServiceImpl.
 */
@Service
public class CountryServiceImpl implements CountryService {

	/** The country repository. */
	@Autowired
	private CountryRepository countryRepository;

	/**
	 * Find country by code.
	 *
	 * @param code the code
	 * @return the country
	 * @throws ResourceNotFoundException the resource not found exception
	 */
	@Override
	public Country findCountryByCode(String code) throws ResourceNotFoundException {
		Optional<Country> country = countryRepository.findById(code);
		if (!country.isPresent()) {
			throw new ResourceNotFoundException();
		}
		return country.get();
	}

}
