package com.service.credit.service;

/**
 * Interface ICreditService
 * 
 * @author Vikram
 */
import java.util.List;

import com.service.credit.model.Credit;

public interface ICreditService {
	
	/**
	 * gets all credits
	 * @return List<Credit> 
	 */
	List<Credit> getAllCredits();

}
