package com.dev.hrpayroll.services;

import org.springframework.stereotype.Service;

import com.dev.hrpayroll.entities.Payment;

@Service
public class PaymentService {
	
	public Payment getPayment(long WorkerId, int days) {
		return new Payment("Bob", 200.0, days);
	}
}
