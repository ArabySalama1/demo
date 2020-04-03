
package com.flairstech.com.service;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

import java.util.Optional;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.MockitoJUnitRunner;

import com.flairstech.com.exception.ResourceNotFoundException;
import com.flairstech.com.model.Country;
import com.flairstech.com.repository.CountryRepository;
import com.flairstech.com.service.impl.CountryServiceImpl;

;

/**
 * The Class CategoryServiceImpTest.
 */
@RunWith(MockitoJUnitRunner.class)
class CategoryServiceImpTest {

	/** The category repository. */
	@Mock
	private CountryRepository countryRepository; // // @Mock // private

	/** The category service imp. */
	@InjectMocks
	private CountryServiceImpl countryServiceImpl;

	/**
	 * Sets the up.
	 */
	@BeforeEach
	void setUp() {
		MockitoAnnotations.initMocks(this);
		when(countryRepository.findById("XYZ")).thenReturn(Optional.ofNullable(null));

	}

	@Test
	void findNonExistentCountry() {
		try {
			countryServiceImpl.findCountryByCode("XYZ");
		} catch (ResourceNotFoundException ex) {
			assertEquals("internal server error", ex.getMessage());
		}

	}

}
