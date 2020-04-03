package com.flairstech.com.model;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Transient;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 * Gets the country languages.
 *
 * @return the country languages
 */
@Getter

/**
 * Sets the country language.
 *
 * @param countryLanguage the new country language
 */
@Setter

/**
 * Instantiates a new country.
 */
@NoArgsConstructor

@AllArgsConstructor

/**
 * To string.
 *
 * @return the java.lang. string
 */
@ToString
@Entity
@Table(name = "country")
public class Country implements Serializable {

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 1L;

	/** The code. */
	@Id
	private String code;

	/** The name. */
	private String name;

	/** The continent. */
	private String continent;

	/** The region. */
	private String region;

	/** The surface area. */
	@Column(name = "surface_area")
	private String surfaceArea;

	/** The indep year. */
	@Column(name = "indep_year")
	private Integer indepYear;

	/** The population. */
	private Integer population;

	/** The life expectancy. */
	@Column(name = "life_expectancy")
	private String lifeExpectancy;

	/** The gnp. */
	private Integer gnp;

	/** The gnp old. */
	@Column(name = "gnp_old")
	private Integer gnpOld;

	/** The local name. */
	@Column(name = "local_name")
	private String localName;

	/** The government form. */
	@Column(name = "government_form")
	private String governmentForm;

	/** The head of state. */
	@Column(name = "head_of_state")
	private String headOfState;

	/** The capital. */
	private Integer capital;

	/** The code 2. */
	private String code2;

	/** The country languages. */
	@JsonIgnore
	@OneToMany(mappedBy = "country", cascade = CascadeType.ALL)
	private Set<CountryLanguage> countryLanguages;

	/** The country language. */
	@Transient
	private String countryLanguage;

	/**
	 * Gets the country language.
	 *
	 * @return the country language
	 */
	public String getCountryLanguage() {
		if (countryLanguages != null && countryLanguages.iterator().hasNext())
			return countryLanguages.iterator().next().getLanguage();
		else
			return "";
	}

}
