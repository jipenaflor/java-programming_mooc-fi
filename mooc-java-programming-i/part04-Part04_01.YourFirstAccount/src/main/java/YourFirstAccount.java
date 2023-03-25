
public class YourFirstAccount {

    public static void main(String[] args) {
        // Do not touch the code in Account.java
        
        //Account with a balance of 100.0
        Account myAccount = new Account("My account", 100.0);
        //Account is deposited with 20.0 amount
        myAccount.deposit(20.0);
        //Prints the balance
        System.out.println(myAccount);
        

    }
}
