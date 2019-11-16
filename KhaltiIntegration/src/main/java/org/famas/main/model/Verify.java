package org.famas.main.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Verify {
	private String idx;
	private Type type;
	private State state;
	private String amount;
	private String fee_amount;
	private String refunded;
	private String created_on;
	private String ebanker;
	private User user;
	private Merchant merchant;
}
