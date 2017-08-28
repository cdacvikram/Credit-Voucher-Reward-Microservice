package com.service.voucher.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.service.voucher.model.Voucher;

/**
 * VoucherService class for service the vouchers
 *  
 * @author Vikram
 */
@Service
public class VoucherService implements IVoucherService{

	/**
	 * static list of vouchers
	 */
	private static List<Voucher> vouchers = new ArrayList<>(Arrays.asList(
			new Voucher("V2378578346",1200,"INR","Drew","Barrymore"),
			new Voucher("V183240062",5,"USD","Johnny","Depp"),
			new Voucher("V45708293",500,"INR","Drew","Barrymore"),
			new Voucher("V1106",60,"INR","Brad","Pitt")
			));
	
	/**
	 * {@inheritDoc}
	 */
	@Override
	public List<Voucher> getAllVouchers() {
		return vouchers;
	}
}
