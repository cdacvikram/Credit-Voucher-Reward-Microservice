package com.service.voucher;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.test.context.junit4.SpringRunner;

import com.service.voucher.model.Voucher;
import com.service.voucher.service.IVoucherService;
import com.service.voucher.service.VoucherService;

/**
 * VoucherServiceTest class for Voucher Service
 * 
 * @author Vikram
 */
@RunWith(SpringRunner.class)
public class VoucherServiceTest {
	
	/**
	 * VoucherServiceTestContextConfiguration class to create the Voucher service bean
	 */
	@TestConfiguration
    static class VoucherServiceTestContextConfiguration {
  
		/**
		 * Voucher Service bean
		 * @return VoucherService
		 */
        @Bean
        public IVoucherService voucherService() {
            return new VoucherService();
        }
    }
	
	/**
	 * The voucher service
	 */
	@Autowired
	private IVoucherService service;

	/**
	 * Test case to test get all vouchers
	 */
	@Test
	public void testGetAllVouchers() {
		List<Voucher> allVouchers = service.getAllVouchers();
		assertNotNull(allVouchers);
		assertEquals(4, allVouchers.size());
	}
}
