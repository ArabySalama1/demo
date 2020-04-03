
package com.flairstech.com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.flairstech.com.exception.ResourceNotFoundException;
import com.flairstech.com.model.Country;
import com.flairstech.com.service.CountryService;

/**
 * The Class CountryController.
 */
@RestController
@RequestMapping("/api/v1")
public class CountryController {

	/** The country service. */
	@Autowired
	private CountryService countryService;

	/**
	 * Gets the country by code.
	 *
	 * @param code the code
	 * @return the country by code
	 * @throws ResourceNotFoundException the resource not found exception
	 */
	@GetMapping("/country/{code}")
	public Country getCountryByCode(@Validated @PathVariable String code) throws ResourceNotFoundException {

		return countryService.findCountryByCode(code);
	}

}
