package com.service.reward.service;

/**
 * Interface IRewardService
 * 
 * @author Vikram
 */
import java.util.List;

import com.service.reward.model.Reward;

public interface IRewardService {
	
	/**
	 * gets all rewards
	 * @return List<Reward> 
	 */
	List<Reward> getRewards();

}
