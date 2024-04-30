package n2exercici1.beans;

import n2exercici1.interfaces.IPaymentMethodCallBack;
import n2exercici1.utils.Constants;

public class DebitCardPayment implements IPaymentMethodCallBack{

	@Override
	public void processPayment() {
		
		System.out.println(Constants.Messages.DEBIT_CARD_PAYMENT);
	}
}
