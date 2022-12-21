
package shop_online_by_interface;
public class Shop_online_by_interface {

    public static void main(String[] args) {
        product arr []=new product[3];
        arr[0] = new book("story", 150);
        arr[1] = new Child_book("cats", 150);
        arr[2] = new cartoon("tom and jerry",70);
for (int i=0;i<arr.length;i++){
  System.out.println ("the price of the book : "+(i+1) +arr[i].getPrice());
    
} 
    
    }
    
}
interface product {
public double  getPrice() ;
}
class book implements product{
 String book_name ;
 float book_price ;
    public book (){}
    public book(String book_name, float book_price) {
        this.book_name = book_name;
        this.book_price = book_price;
    }

    @Override
    public double getPrice() {
     return this.book_price*.5;   
    }

 
}
class Child_book implements  product{
 String Child_book_name ;
 float Child_book_price ;
    public Child_book(){}
    public Child_book(String Child_book_name, float Child_book_price) {
        this.Child_book_name = Child_book_name;
        this.Child_book_price = Child_book_price;
    }

    @Override
    public double getPrice() {
    return this.Child_book_price*0.3;
    }

}
class cartoon implements product{
 String cartoon_name ;
 float cartoon_price ;
    public cartoon(){}
    public cartoon(String cartoon_name, float cartoon_price) {
        this.cartoon_name = cartoon_name;
        this.cartoon_price = cartoon_price;
    }

    @Override
    public double getPrice() {
        return this.cartoon_price*0.2;
    }


}