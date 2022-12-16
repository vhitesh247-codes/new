import java.util.*;
import java.io.*;

class Account{

	private String accnum;
	private String name;
	private int balance;

	Scanner s = new Scanner(System.in);
    
    public void openAcount(){

    	System.out.println("plz enter ur accnt num");
    	accnum = s.next();

    	System.out.println("plz enter ur user name");
    	name = s.next();

    	System.out.println("your accnt balance");
    	balance = s.next();
    }
    public void showInfo(){
    	System.out.println("name");
    	System.out.println("accnum");
    	System.out.println("balance");
    }
    public void withdrawMoney(){
    	System.out.println("enter amount to withraw");
    	int money=s.next();

    	if (balance>=money) {
    		System.out.println("cashout successful");
    	}
    	else if (balance<=money) {
    		System.out.println("sorry don't have enough balance");
    	}
    	else{
    		System.out.println("sorry you have zero balance");
    	}   
    }
    public void depositMoney(){
    	System.out.println("enter money to deposit");
    	int money= s.nextInt();
    	balance=balance+money;
    }
    public boolean userCheck(){
    	if (this.accnum=accnum) {
    		System.out.println("Account is verified");
    		showInfo();
    		return true;
    	}
    	else {
    		return false;
    	}
    }
}
class Banking{
	public static void main(String[] args) {
		Scanner s1= new Scanner(System.in);
		System.out.println("accounts to add");
		int n = s.nextInt();

		Account acc= new Account[];
		for (int i=0;i.length();i++) {
			acc[i]=new Account();
			acc[i]=openAcount();
		}
		int ch ;
		do(){

			 System.out.println("1.exit");
            System.out.println("2.display");
            System.out.println("3.search");
            System.out.println("4.deposit");
            System.out.println("5.withdraw");

            System.out.println("plz select your choice");
            ch = s1.nextInt();
            switch (ch) {
            	
            
		case 1:
         break;
		case 2:
             for (int j=0;acc.length();j++) {
             	acc[i].showInfo();
             	
             }
			break;
        case 3:
        	System.out.println("to search");
        	String accnum=s1.nextInt();
        	Boolean f=false;
        	for (int j=0;acc.length();j++) {
        		f=acc[j].userCheck(accnum);	
        		if (f) {
        			f=false;
        			acc[j].depositMoney(accnum);
        			break;
        		}
        		if(f){ System.out.println("their is no account holder like this !!");}
        	}

			break;
        case 4:
        	 System.out.println("enter account no from withdraw");
                accnum=s1.next();
                f=false;
                for(int j=0;j<acc.length;j++){
                    f=acc[j].userCheck(accno);
                    if(f){
                      f=false;
                      acc[j].withDrawMoney();
                      break;
                      
                    }}
                    if(!f){ System.out.println("no user founded like this !!");}
			break;
        case 5:
        	 System.out.println("enter Account to check details !!");
                accnum=s1.next();
                f=false;
                for( int j=0;j<acc.length;j++){
                  if(acc[j].userCheck(accnum))
                  	{
                  	 f=true;
                    System.out.println( " data has been shown");
                  }
                 }
                  if(!f){System.out.println("no user found ");}
                
                break;

                default:
                System.out.println("enter valid choice!!");
			break;



}

			
	}while(n!=1)
		}
}