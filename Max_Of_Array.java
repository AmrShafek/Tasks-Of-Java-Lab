
package max;
import java.util.Scanner;
public class Max {
 static Scanner input = new Scanner(System.in);

    public static void main(String[] args) 
    {
        int size;
        int x;
         System.out.println("enter the size of array ");  
         size = input.nextInt();
         int []arr = new int [size];
         fill_array(arr);
         print_array(arr);
     x = max(arr);
        
                 System.out.println("the maximum value is "+x);  

  
        
    }
       public static void fill_array(int[]list)
    {
        for(int i=0 ;i<list.length;i++)
        {
            System.out.println("Please enter the the item no "+i);
            list[i]=input.nextInt();
        }
    }
       
       
       
  public static void print_array(int list[])
        {
      
        for(int j=0 ;j<list.length;j++)
      
            System.out.print(list[j]+"  ");
        }
        
 public static int max(int list[])
        {
              int   max=0;
         for(int k=0 ;k<list.length;k++)
         {
          
         if (list[k]>max)
             
             max=list[k];
         }
return  max ;
        }
          
          
          
          
          
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

