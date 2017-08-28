package com.service.reward.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.service.reward.model.Credit;
import com.service.reward.model.Reward;
import com.service.reward.model.Voucher;

/**
 * RewardService class for service the rewards
 *  
 * @author Vikram
 */
@Service
public class RewardService implements IRewardService{
	
	/**
	 * static list of rewards
	 */
	private static List<Reward> rewards = new ArrayList<>(Arrays.asList(
			new Reward(null,null,"Drew","Barrymore"),
			new Reward(null,null,"Johnny","Depp"),
			new Reward(null,null,"Brad","Pitt")
			));
	
	/**
	 * The Resttemplate
	 */
	@Autowired
	private RestTemplate restTemplate;

	/**
	 * {@inheritDoc}
	 */
	@Override
	public List<Reward> getRewards() {
				
		ResponseEntity<Voucher[]> vouchers = restTemplate.getForEntity("http://localhost:8082/vouchers", Voucher[].class);
		ResponseEntity<Credit[]> credits = restTemplate.getForEntity("http://localhost:8083/credits", Credit[].class);
		
		Voucher[] voucherArr = vouchers.getBody();
		Credit[] creditArr = credits.getBody();
		
		List<Reward> rewardsByPerson = getRewardsByPerson(new ArrayList<>(Arrays.asList(voucherArr)), new ArrayList<>(Arrays.asList(creditArr)));
		return rewardsByPerson;
	}
	
	/**
	 * Method returns the list of rewards by person
	 * 
	 * @param vouchers
	 * @param credits
	 * @return List<Reward>
	 */
	private List<Reward> getRewardsByPerson(List<Voucher> vouchers, List<Credit> credits){
		rewards.forEach(reward -> {
			String personName = reward.getFirstName() + " " + reward.getLastName();
			reward.setVoucher(vouchers.stream().filter(voucher -> (personName.equals(voucher.getFirstName() + " " + voucher.getLastName()))).collect(Collectors.toList()));
			reward.setCredit(credits.stream().filter(credit -> (personName.equals(credit.getFirstName() + " " + credit.getLastName()))).collect(Collectors.toList()));
		});
		
		return rewards;
	}

}
