package sightfulmw.demo1;

/**
 * Hello world!
 *
 */
public class App 
{
	
    public static void main( String[] args )
    {
    	BankAccount ba = new BankAccount();
    	ba.setAccountNumber("52");
    	ba.setBalance(100);
    	ba.setCustomerName("Bob");
    	ba.setPhoneNumber("111-111-1111");
    	
    	ba.withdrawFunds(101);
    	ba.depositFunds(20);
    	ba.withdrawFunds(101);

    	System.out.println("Test confirmed!");

    }
}
