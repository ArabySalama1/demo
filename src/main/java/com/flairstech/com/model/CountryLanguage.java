package com.flairstech.com.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 * Gets the percentage.
 *
 * @return the percentage
 */
@Getter

/**
 * Sets the percentage.
 *
 * @param percentage the new percentage
 */
@Setter

/**
 * Instantiates a new country language.
 */
@NoArgsConstructor

/**
 * Instantiates a new country language.
 *
 * @param country    the country
 * @param language   the language
 * @param isOfficial the is official
 * @param percentage the percentage
 */
@AllArgsConstructor

/**
 * To string.
 *
 * @return the java.lang. string
 */
@ToString
@Entity
@Table(name = "country_language")
public class CountryLanguage implements Serializable {

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 1L;

	/** The country. */
	@Id
	@JsonIgnore
	@ManyToOne
	@JoinColumn(name = "country_code")
	private Country country;

	/** The language. */
	@Id
	private String language;

	/** The is official. */
	@Column(name = "is_official")
	private Boolean isOfficial;

	/** The percentage. */
	private String percentage;

}
