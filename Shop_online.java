
package shop_online;

public class Shop_online {

    public static void main(String[] args) {
Book obj = new Book("story", 150);
Child_book obj2 = new Child_book("cats", 150);      
System.out.println(obj.getPrice());   
System.out.println(obj2.getPrice());         
    }
    
}
abstract class Product {
public String name ;
public double price ;

    public Product() {}
    public Product(String name,double price) {
        this.name = name;
        this.price=price;
    }
    public abstract double  getPrice() ;
    

}
class Book extends Product{

    public Book() {}

    public Book(String name,double price) {
        super(name,price);
        
    }
    
   
   @Override
   public double getPrice(){
    return price*.5;
} 

        
    }

class Child_book extends Product
{


    public Child_book() {}

    public Child_book(String name,double price) {
     super(name,price);
    }
@Override
    public  double  getPrice(){
    return price*.3;
    
    }
        
    }



