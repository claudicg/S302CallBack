package n2exercici1.beans;

import n2exercici1.utils.Constants;

public class CreditCardPayment extends PaymentGateway{

	@Override
	public void processPayment() {
		
		System.out.println(Constants.Messages.CREDIT_CARD_PAYMENT);
	}
}
