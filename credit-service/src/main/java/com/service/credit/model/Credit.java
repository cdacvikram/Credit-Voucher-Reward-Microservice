package com.service.credit.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

/**
 * Credit class
 * 
 * @author Vikram
 */
@Data
public class Credit {
	
	/** Properties **/
	@JsonProperty("credit-id")
	private String creditId;
	
	@JsonProperty("points")
	private long points;
	
	@JsonProperty("firstname")
	private String firstName;
	
	@JsonProperty("lastname")
	private String lastName;
	
	
	/**
	 * default constructor
	 */
	public Credit(){}

	/**
	 * Parameterized constructor
	 * 
	 * @param creditId
	 * @param points
	 * @param firstName
	 * @param lastName
	 */
	public Credit(String creditId, long points, String firstName, String lastName) {
		super();
		this.creditId = creditId;
		this.points = points;
		this.firstName = firstName;
		this.lastName = lastName;
	}
}
