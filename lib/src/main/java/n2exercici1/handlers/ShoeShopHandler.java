package n2exercici1.handlers;

import java.util.Scanner;

import n2exercici1.beans.PaymentGateway;
import n2exercici1.beans.CreditCardPayment;
import n2exercici1.beans.DebitCardPayment;
import n2exercici1.beans.PayPalPayment;
import n2exercici1.utils.Constants;
import n2exercici1.utils.Validations;

public class ShoeShopHandler {
	
	private Scanner scanner;
	
	public ShoeShopHandler() {
		super();
		this.scanner = new Scanner(System.in);
	}


	public void runPayment() {
		
		System.out.println(Constants.Messages.CHOOSE);
		System.out.println(Constants.Menu.PAYMENT_MENU);
		
		String menuOption = "";
		
		do {
			
			System.out.println(Constants.Messages.VALID_OPTION);
			menuOption = scanner.nextLine().trim();
			
		} while(!Validations.isValidOption(menuOption));
		
		PaymentGateway payment = null;
		
		switch(menuOption) {
			case "1":
				payment = new CreditCardPayment();
				break;
			case "2":
				payment = new DebitCardPayment();
				break;
			case "3":
				payment = new PayPalPayment();
				break;
			default:
				break;
		}
		payment.executeWith(()-> System.out.println(Constants.Messages.CALL_BACK));
		
		scanner.close();
	}
}
