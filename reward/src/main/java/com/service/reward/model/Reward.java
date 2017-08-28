package com.service.reward.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
public class Reward {

	@JsonProperty("credit")
	private List<Credit> credit;
	
	@JsonProperty("voucher")
	private List<Voucher> voucher;
	
	@JsonProperty("firstname")
	private String firstName;
	
	@JsonProperty("lastname")
	private String lastName;
	
	public Reward(){}

	public Reward(List<Credit> credit, List<Voucher> voucher, String firstName, String lastName) {
		super();
		this.credit = credit;
		this.voucher = voucher;
		this.firstName = firstName;
		this.lastName = lastName;
	}
}
