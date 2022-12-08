
package bank_account;

import java.util.Scanner;

public class Bank_Account {

    public static void main(String[] args) {
   Account obj =new Account(10000,"Amr",1234); 
obj.show();
    }
    
}
class Account{
int balance ;
int previous_transaction;
String cus_name ;
int cus_id ;

Account(int balance,String name,int id )
{
this.balance=balance;
this.cus_name=name;
this.cus_id=id;
}






public void deposit (int amount)
{
if (amount>=0)
this.balance+=amount;
this.previous_transaction=amount;
}




 void withdraw (int amount)
{
if (amount>=0)
this.balance-=amount;
this.previous_transaction=(-amount);
Math.abs(this.previous_transaction);
}
void get_previous ()
{
if(previous_transaction>0)
      System.out.println("the privous transaction is deposit"+previous_transaction);
else 
          System.out.println("the privous transaction is withdraw"+previous_transaction);
}




void show ()
{
Scanner input = new Scanner(System.in);
char op ;

do
{
     System.out.println("1-For deposit press 'D' 2-for withdraw press W");
     System.out.println("3-For previous_transaction'P' 4-for Exit press 'E'");
op = input.next().charAt(0);

switch(op)
        {
        case 'D':
        System.out.println("enter the amount");        
        int x = input.nextInt();
       deposit(x);
        break;
        case 'W':
        System.out.println("enter the amount");        
        int y = input.nextInt();
        withdraw(y);  
        break;
        case 'P':
         get_previous();   
        }
}

while(op!='E');
}

}