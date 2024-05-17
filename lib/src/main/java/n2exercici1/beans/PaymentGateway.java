package n2exercici1.beans;

import java.util.Optional;

import n2exercici1.interfaces.IPaymentMethodCallBack;

public abstract class PaymentGateway {

	public final void executeWith(IPaymentMethodCallBack callback) {
		processPayment();
        Optional.ofNullable(callback).ifPresent(IPaymentMethodCallBack::call);
    }
	
	protected abstract void processPayment();

}
