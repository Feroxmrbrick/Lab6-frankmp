import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.io.UnsupportedEncodingException;
import java.util.Locale;

import org.junit.Test;


public class PrintBalanceTest {

	private static final Locale enUS = new Locale("en", "US");
	private static final Locale frFR = new Locale("fr", "FR");
	private static final Locale deDE = new Locale("de", "DE");
	
	@Test
	public void testHelloWorldEN_US() {
		assertEquals("Hello World", PrintBalance.printHello(enUS));
	}

	@Test
	public void testHelloWorldFR_FR(){
		assertEquals("Bonjour tout le monde", PrintBalance.printHello(frFR));
	}
	
	@Test
	public void testHelloWorldDE_DE() {
		assertEquals("Hallo Welt", PrintBalance.printHello(deDE));
	}
	
	@Test
	public void testGetNameEN_US() {
		assertEquals("Please enter your name", PrintBalance.printGetName(enUS));
	}

	@Test
	public void testGetNameFR_FR() {
		assertEquals("S'il vous plaît entrer votre nom", PrintBalance.printGetName(frFR));
	}
	
	@Test
	public void testGetNameDE_DE() {
		assertEquals("Bitte geben Sie Ihren Namen", PrintBalance.printGetName(deDE));
	}
	
	@Test
	public void testGreetingEN_US() {
		assertEquals("I am pleased to meet you ", PrintBalance.printGreeting(enUS));
	}
	
	@Test
	public void testGreetingFR_FR() {
		assertEquals("Je suis heureux de vous rencontrer ", PrintBalance.printGreeting(frFR));
	}
	
	@Test
	public void testGreetingDE_DE() {
		assertEquals("Ich freue mich, Sie kennen zu lernen ", PrintBalance.printGreeting(deDE));
	}
	
	@Test
	public void testDateNotificationEN_US() {
		assertEquals("As of: ", PrintBalance.printDateNotification(enUS));
	}
	
	@Test
	public void testDateNotificationFR_FR() {
		assertEquals("En date du: ", PrintBalance.printDateNotification(frFR));
	}
	
	@Test
	public void testDateNotificationDE_DE() {
		assertEquals("Stand: ", PrintBalance.printDateNotification(deDE));
	}
	
	@Test
	public void testDebtNotificationEN_US() {
		assertEquals("You owe the school ", PrintBalance.printDebtNotification(enUS));
	}
	
	@Test
	public void testDebtNotificationFR_FR() {
		assertEquals("Vous devez l'école ", PrintBalance.printDebtNotification(frFR));
	}
	
	@Test
	public void testDebtNotificationDE_DE() {
		assertEquals("Sie schulden die Schule ", PrintBalance.printDebtNotification(deDE));
	}
	
	@Test
	public void testGoodbyeEN_US() {
		assertEquals("Good Bye", PrintBalance.printGoodbye(enUS));
	}
	
	@Test
	public void testGoodbyeFR_FR() {
		assertEquals("au revoir", PrintBalance.printGoodbye(frFR));
	}
	
	@Test
	public void testGoodbyeDE_DE() {
		assertEquals("Auf Wiedersehen", PrintBalance.printGoodbye(deDE));
	}
}
