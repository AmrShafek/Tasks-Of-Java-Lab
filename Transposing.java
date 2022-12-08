
package transposing;

import java.util.Scanner;

public class Transposing {
 static Scanner input = new Scanner(System.in);

    public static void main(String[] args) 
    {
        int row,col;
         System.out.println("enter the no of rows and no of col ");  
         row  = input.nextInt();
         col = input.nextInt();
         int [][]arr = new int [row][col];
       
         fill_array(arr);
         print_array(arr);
                 
         System.out.println("the transpose is : ");
          trans(arr) ; 
     
    }

    public static void fill_array(int[][] list)
    {
    for(int row=0 ;row<list.length;row++)
        for(int col=0 ;col<list[0].length;col++)
        {
            System.out.println("Please enter the row no "+row+ " And the column no "+ col);
            list[row][col]=input.nextInt();
        }
    
    
    }
    
      public static void print_array(int list[][])
    {
      
          for(int row=0 ;row<list.length;row++)
          {
        for(int col=0 ;col<list[row].length;col++)
        {
            System.out.print(list[row][col]+"  ");
        }
        
      System.out.print("\n");

        }
    }
    
       public static void trans(int list[][])
    {
      
          for(int row=0 ;row<list.length;row++)
          {
        for(int col=0 ;col<list[row].length;col++)
        {
            System.out.print(list[col][row]+"  ");
        }
        
      System.out.print("\n");

        }
    }
    
    
}
