package n2exercici1.beans;

import n2exercici1.handlers.PaymentGatewayHandler;
import n2exercici1.interfaces.IPaymentMethodCallBack;

public class ShoeShop {
	
	public void makePurchase(IPaymentMethodCallBack callback) {
        PaymentGatewayHandler paymentGateway = new PaymentGatewayHandler();
       
        paymentGateway.processPayment(callback);
    }
}
