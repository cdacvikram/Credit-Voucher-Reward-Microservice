package com.service.voucher.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.service.voucher.model.Voucher;
import com.service.voucher.service.IVoucherService;

/**
 * VoucherController controls the requests for vouchers
 * 
 * @author Vikram
 *
 */
@RestController
public class VoucherController {
	
	/**
	 * The voucher service
	 */
	@Autowired
	private IVoucherService service;
	
	/**
	 * Method returns all vouchers
	 * @return List<Voucher> 
	 */
	@GetMapping("/vouchers")
	public List<Voucher> getAllVouchers(){
		return service.getAllVouchers();
	}
	
}
