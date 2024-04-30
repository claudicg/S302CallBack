package n2exercici1.handlers;

import n2exercici1.interfaces.IPaymentMethodCallBack;

public class PaymentGatewayHandler {

	public void processPayment(IPaymentMethodCallBack callback) {
        
        System.out.println("Processing payment...");
        
        callback.processPayment();
	}
}
