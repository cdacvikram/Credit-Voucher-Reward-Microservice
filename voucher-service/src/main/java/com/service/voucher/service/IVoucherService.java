package com.service.voucher.service;

import java.util.List;

import com.service.voucher.model.Voucher;

/**
 * Interface IVoucherService
 * 
 * @author Vikram
 */
public interface IVoucherService {
	
	/**
	 * gets all vouchers
	 * @return List<Voucher> 
	 */
	List<Voucher> getAllVouchers();
}
