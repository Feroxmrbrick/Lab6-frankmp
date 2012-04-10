import java.io.PrintStream;
import java.io.UnsupportedEncodingException;
import java.text.DateFormat;
import java.text.NumberFormat;
import java.util.Date;
import java.util.Locale;
import java.util.ResourceBundle;
import java.util.Scanner;

/**
 * TODO A simple class that needs to be localized
 * 
 * @author mohan. Created Mar 27, 2011.
 */
public class PrintBalance {

	/**
	 * Simple Java Method that is crying out to be localized.
	 * 
	 * @param args
	 * @throws UnsupportedEncodingException
	 */
	public static void main(String args[]) throws UnsupportedEncodingException {
		Scanner scanInput = new Scanner(System.in);
		Date today = new Date();

		Locale currentLocale;
		ResourceBundle messages;
		PrintStream out = new PrintStream(System.out, true, "UTF-8");

		currentLocale = new Locale("en", "US");

		messages = ResourceBundle.getBundle("MessagesBundle", currentLocale, new UTF8Control());

		// Greeting
		out.println(messages.getString("hello"));

		// Get User's Name
		out.println(messages.getString("getName"));

		String name = scanInput.nextLine();
		out.println(messages.getString("greeting") + name);

		// print today's date, balance and bid goodbye
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.FULL, DateFormat.FULL, currentLocale);
		out.println(messages.getString("dateNotification") + dateFormat.format(today));

		NumberFormat numFormat = NumberFormat.getCurrencyInstance(currentLocale);
		out.println(messages.getString("debtNotification")+ numFormat.format(9876543.21));

		out.println(messages.getString("goodbye"));
	}

	public static String printHello(Locale locale) {
		ResourceBundle messages = ResourceBundle.getBundle("MessagesBundle", locale, new UTF8Control());

		return messages.getString("hello");
	}

	public static String printGetName(Locale locale) {
		ResourceBundle messages = ResourceBundle.getBundle("MessagesBundle", locale, new UTF8Control());

		return messages.getString("getName");
	}

	public static String printGreeting(Locale locale) {
		ResourceBundle messages = ResourceBundle.getBundle("MessagesBundle", locale, new UTF8Control());

		return messages.getString("greeting");
	}

	public static String printDateNotification(Locale locale) {
		ResourceBundle messages = ResourceBundle.getBundle("MessagesBundle", locale, new UTF8Control());

		return messages.getString("dateNotification");
	}
	
	public static String printDebtNotification(Locale locale) {
		ResourceBundle messages = ResourceBundle.getBundle("MessagesBundle", locale, new UTF8Control());

		return messages.getString("debtNotification");
	}
	
	public static String printGoodbye(Locale locale) {
		ResourceBundle messages = ResourceBundle.getBundle("MessagesBundle", locale, new UTF8Control());

		return messages.getString("goodbye");
	}
}