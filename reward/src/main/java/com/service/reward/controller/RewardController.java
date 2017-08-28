package com.service.reward.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.service.reward.model.Reward;
import com.service.reward.service.IRewardService;

/**
 * RewardController controls the requests for rewards
 * 
 * @author Vikram

 */
@RestController
public class RewardController {
	
	/**
	 * The reward service
	 */
	@Autowired
	private IRewardService service;
	
	/**
	 * Method returns all rewards
	 * @return List<Reward> 
	 */
	@GetMapping("/rewards")
	public List<Reward> getRewards(){
		return service.getRewards();
		
	}

}
