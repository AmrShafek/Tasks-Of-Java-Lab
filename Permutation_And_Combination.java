
package assignment;
import java.util.Scanner;
public class Permutation_And_Combination {
    public static void main(String[] args) {
  Scanner input =new Scanner(System.in);
  int n ,r,option,npr,ncr , numerator,numerator2, denominator,denominator2,x;
  System.out.println("Enter value of n ");
  n=input.nextInt();
    System.out.println("Enter value of r ");
   r=input.nextInt();
    x= n-r;
  
  System.out.println("To Find Permutation press '1' And To Find Combination '2' ");

option = input.nextInt();
  switch (option)
  {
    case 1:
        numerator = factorial(n);
        denominator = factorial(x);
        npr = numerator / denominator;                             //  nPr = n!/(n-r)!
        System.out.println("The Result is " + npr);

    break;
      
    case 2:
        numerator2 = factorial(n);
        denominator2 = factorial(r) * x;
        ncr = numerator2 / denominator2;                          //   nCr = n!/r!(n-r)!
        System.out.println("The Result is " + ncr);
    break;
    default : 
         System.out.println("invaled value ");
  
  
  }
 
    }
    
 static public int factorial (int n)
{
int factorial = 1;
        for (int i =1; i<=n;i++)
    {
        factorial*=i;
    }
return factorial;

}
  
}
