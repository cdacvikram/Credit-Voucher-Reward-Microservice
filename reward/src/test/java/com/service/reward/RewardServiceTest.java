package com.service.reward;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Spy;
import org.mockito.runners.MockitoJUnitRunner;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import com.service.reward.model.Credit;
import com.service.reward.model.Voucher;
import com.service.reward.service.IRewardService;

@RunWith(MockitoJUnitRunner.class)
public class RewardServiceTest {
	
	@InjectMocks
	@Spy
	private IRewardService service;
	
	@Mock
	private RestTemplate restTemplate;

	ResponseEntity<List<Voucher>> voucherEntity = new ResponseEntity<List<Voucher>>(HttpStatus.ACCEPTED);
	ResponseEntity<List<Credit>> creditEntity = new ResponseEntity<List<Credit>>(HttpStatus.ACCEPTED);
	
	@Test
	public void testGetRewardsByPerson() {
		//To be implemented
	}
}
