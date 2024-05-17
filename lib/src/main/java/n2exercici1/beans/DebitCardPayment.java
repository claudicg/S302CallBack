package n2exercici1.beans;

import n2exercici1.utils.Constants;

public class DebitCardPayment extends PaymentGateway{

	@Override
	public void processPayment() {
		
		System.out.println(Constants.Messages.DEBIT_CARD_PAYMENT);
	}
}
