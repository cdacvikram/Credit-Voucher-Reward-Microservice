package com.service.voucher.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

/**
 * Voucher class
 * 
 * @author Vikram
 */
@Data
public class Voucher {

	/** Properties **/
	@JsonProperty("voucher-number")
	private String voucherNumber;
	
	@JsonProperty("voucher-value")
	private long voucherValue;
	
	@JsonProperty("currency")
	private String currency;
	
	@JsonProperty("firstname")
	private String firstName;
	
	@JsonProperty("lastname")
	private String lastName;
	
	/**
	 * default constructor
	 */
	public Voucher(){}

	/**
	 * Parameterized constructor
	 * 
	 * @param voucherNumber the voucherNumber
	 * @param voucherValue the voucherValue
	 * @param currency the currency
	 * @param firstName the firstName
	 * @param lastName the lastName
	 */
	public Voucher(String voucherNumber, long voucherValue, String currency, String firstName, String lastName) {
		super();
		this.voucherNumber = voucherNumber;
		this.voucherValue = voucherValue;
		this.currency = currency;
		this.firstName = firstName;
		this.lastName = lastName;
	}
}
