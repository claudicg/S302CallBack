package n2exercici1.utils;

public class Validations {

	public static boolean isValidOption(String ticketMenuOption) {
		return ticketMenuOption.matches("^[1-3]{1}$");
	}
}
