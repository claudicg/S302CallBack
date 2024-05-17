package n2exercici1.beans;

import n2exercici1.utils.Constants;

public class PayPalPayment extends PaymentGateway{

	@Override
	public void processPayment() {
		
		System.out.println(Constants.Messages.PAY_PAL_PAYMENT);
	}
}
