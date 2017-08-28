package com.service.credit.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.service.credit.model.Credit;

/**
 * CreditService class for service the credits
 *  
 * @author Vikram
 */
@Service
public class CreditService implements ICreditService{

	/**
	 * static list of credits
	 */
	private static List<Credit> credits = new ArrayList<>(Arrays.asList(
			new Credit("C072341",100,"Drew","Barrymore"),
			new Credit("C3475634",50,"Johnny","Depp"),
			new Credit("C34857",10,"Drew","Barrymore")
			));
	
	/**
	 * {@inheritDoc}
	 */
	@Override
	public List<Credit> getAllCredits() {
		return credits;
	}
}
