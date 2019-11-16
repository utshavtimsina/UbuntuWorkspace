package org.famas.main.controller;

import org.famas.main.model.Payment;
import org.famas.main.service.PaymentVerification;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@RequestMapping("/")
@Controller
public class WalletController {
	PaymentVerification paymentVerification;
	
	public WalletController(PaymentVerification paymentVerification) {
		this.paymentVerification = paymentVerification;
	}

	@GetMapping
	public String sendView() {
		return "index";
	}

	@PostMapping("/paymentVerify")
	@ResponseBody
	public Object verifyPayment(@RequestBody Payment pay) {
		return paymentVerification.SendToken(pay);
	}

}
