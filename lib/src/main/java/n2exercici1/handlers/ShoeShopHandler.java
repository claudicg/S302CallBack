package n2exercici1.handlers;

import java.util.Scanner;

import n2exercici1.beans.CreditCardPayment;
import n2exercici1.beans.DebitCardPayment;
import n2exercici1.beans.PayPalPayment;
import n2exercici1.beans.ShoeShop;
import n2exercici1.utils.Constants;
import n2exercici1.utils.Validations;

public class ShoeShopHandler {
	
	private Scanner scanner;
	private ShoeShop shoeShop;
	
	public ShoeShopHandler() {
		super();
		this.scanner = new Scanner(System.in);
		this.shoeShop = new ShoeShop();
	}
	
	public ShoeShop getShoeShop() {
		return shoeShop;
	}

	public void setShoeShop(ShoeShop shoeShop) {
		this.shoeShop = shoeShop;
	}


	public void runWayToPay() {
		
		System.out.println(Constants.Messages.CHOOSE);
		System.out.println(Constants.Menu.PAYMENT_MENU);
		
		String menuOption = "";
		
		do {
			
			System.out.println(Constants.Messages.VALID_OPTION);
			menuOption = scanner.nextLine().trim();
			
		} while(!Validations.isValidOption(menuOption));
		
		switch(menuOption) {
			case "1":
				shoeShop.makePurchase(new CreditCardPayment());
				break;
			case "2":
				shoeShop.makePurchase(new DebitCardPayment());
				break;
			case "3":
				shoeShop.makePurchase(new PayPalPayment());
				break;
			default:
				break;
		}
		scanner.close();
	}
}
