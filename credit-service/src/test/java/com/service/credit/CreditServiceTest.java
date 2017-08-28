package com.service.credit;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.test.context.junit4.SpringRunner;

import com.service.credit.model.Credit;
import com.service.credit.service.CreditService;
import com.service.credit.service.ICreditService;

/**
 * CreditServiceTest class for Credit Service
 * 
 * @author Vikram
 */
@RunWith(SpringRunner.class)
public class CreditServiceTest {
	
	/**
	 * CreditServiceTestContextConfiguration class to create the credit service bean
	 */
	@TestConfiguration
    static class CreditServiceTestContextConfiguration {
  
		/**
		 * Credit Service bean
		 * @return CreditService
		 */
        @Bean
        public ICreditService creditService() {
            return new CreditService();
        }
    }
	
	/**
	 * The credit service
	 */
	@Autowired
	private ICreditService service;

	/**
	 * Test case to test get all credits
	 */
	@Test
	public void testGetAllCredits() {
		List<Credit> allCredits = service.getAllCredits();
		assertNotNull(allCredits);
		assertEquals(3, allCredits.size());
	}
}
