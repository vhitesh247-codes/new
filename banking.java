import java.util.*;
import java.io.*;

class User
      {
	 private String accnum;
	 private String name;
	 private int balance;
 
	 Scanner st=new Scanner(System.in);
       public void openAccount()
      {
     	
     	 System.out.println("enter account number :");
     	 accnum=st.next();

     	 System.out.println("enter user name : ");
     	 name=st.next();
        
       System.out.println("enter  account balance : ");
       balance=st.nextInt();

	}
	public void showInformation()
	{
		System.out.println("accnt no. of user= "+accnum);
		System.out.println("user name= "+name);
		System.out.println("balance= "+balance);
	}
	public void withdrawAmount()
	{
		System.out.println("enter amnt to withraw");
            int money=st.nextInt();
            if (balance<=money) {
            	System.out.println("sorry insufficient balance");
            }
            else if(balance>=money) {
            	balance=balance-money;
            	System.out.println("cash out sucessful");
            }
            else{
            	System.out.println("not enough balance");
            }
	}
	public void deposit()
	{
		System.out.println("enter amnt to deposit");
		int money=st.nextInt();
		balance=balance+money;
	}
	  public boolean userCheck(String accno){
    	      if(this.accnum==accnum){
    		System.out.println("user founded the details");
    		showInformation();
    		return true;
    	      }
    	      else
    		return false;
        }

}
class Banking{
	public static void main(String[] args) {
		Scanner st1=new Scanner(System.in);
		System.out.println("enter accnt no. to add");
		int n = st1.nextInt();
		User acc[] = new User[n];
	 	for (int i=0;i<acc.length ;i++) {
		acc[i]=new User();  
            acc[i].openAccount();  	
		}

		int ch;
        do{
            System.out.println("1.exit");
            System.out.println("2.display");
            System.out.println("3.search");
            System.out.println("4.deposit");
            System.out.println("5.withraw");

            System.out.println("plz select your choice");
            ch = st1.nextInt();

            switch(ch){
 
            case 1:
            	break;

            case 2:
            	 for (int i = 0; i < acc.length; i++) {  
                            acc[i].showInformation();  
                        }  
                        break;
            case 3:  
                        System.out.print("Enter account no. you want to search: ");  
                        String accnum = st1.next();  
                        boolean f = false;  
                        for (int i = 0; i < acc.length; i++) {  
                            f = acc[i].userCheck(accnum);  
                            if (f) {  
                                break;  
                            }  
                        }  
                        if (!f) {  
                            System.out.println("user account doesn't exist!!");  
                        }  
                        break;
            case 4:  
                        System.out.print("Enter Account no. : ");  
                        accnum= st1.next();  
                        f = false;  
                        for (int i = 0; i < acc.length; i++) {  
                            f = acc[i].userCheck(accnum);  
                            if (f) {  
                                acc[i].deposit();  
                                break;  
                            }  
                        }  
                        if (!f) {  
                            System.out.println("Search failed! Account doesn't exist..!!");  
                        }  
                        break; 

               case 5:  
                        System.out.print("Enter Account No : ");  
                        accnum = st1.next();  
                        f = false;  
                        for (int i = 0; i < acc.length; i++) {  
                            f = acc[i].userCheck(accnum);  
                            if (f)
                             {  
                                acc[i].withdrawAmount ();  
                                break;
                          }  
                        }  
                        if (!f) {  
                            System.out.println("Search failed! Account doesn't exist..!!");  
                        }  
                        break;  
                        default :
                        System.out.println("enter valid choise !!");
                }  
            }  
            while (ch!=1);                            

	}
}

	