package com.service.credit.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.service.credit.model.Credit;
import com.service.credit.service.ICreditService;

/**
 * CreditController controls the requests for credits
 * 
 * @author Vikram
 *
 */
@RestController
public class CreditController {
	
	/**
	 * The credit service
	 */
	@Autowired
	private ICreditService service;
	
	/**
	 * Method returns all credits
	 * @return List<Credit> 
	 */
	@GetMapping("/credits")
	public List<Credit> getAllCredits(){
		return service.getAllCredits();
	}

}
