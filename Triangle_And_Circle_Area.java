
package triangle_and_circle._area;
import java.util.Scanner;

public class Triangle_And_Circle_Area {
    

    public static void main(String[] args) {
   triangle obj1 =new triangle();
   circle obj2 = new circle();
   obj1.set_parameters();
   System.out.println(obj1.get_area());
   obj2.set_radius();
   System.out.println(obj2.get_area());
   }
    }
      class triangle{
          Scanner input = new Scanner(System.in);  
      
      double base ;
      double hight ;
      public void set_parameters()
      {
          System.out.println("Enter the base value");
          this.base=input.nextDouble();
          System.out.println("Enter the hight value");
          this.hight=input.nextDouble();
      }
      public double get_area()
      {
      return .5*this.base*this.hight;
      }
      
      }
      class circle {
      Scanner input = new Scanner(System.in);
      double radius;
            public void set_radius()
      {
          System.out.println("Enter the radius value");
          this.radius=input.nextDouble();

      }
      public double get_area()
      {
      return 3.14*radius*radius;
      }
            
      }