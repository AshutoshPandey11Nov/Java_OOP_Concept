/* 1 --> method overriding is when subclass uses its own method than using the method defined in the superclass
*  and the method defined in the subclass has same method name also same parameters and return type
*
*  2--> A static method cannot be overridden but can be inherited in the subclass.
*  3--> It is a run-time-polymorphism */

public class methodOverriding {
   public static void main(String[] args){
        Truck mahindra=new Truck();
        mahindra.topSpeed();
        mahindra.engine_power();
        mahindra.no_of_wheels();
        mahindra.hornblow(); // we can call a static method using objects or directly Truck.hornblow both will work


       // explanation of point no.2
       Veichle p=new Truck();
       p.no_of_wheels();
       p.engine_power();
       p.hornblow();
       p.topSpeed();
   }
}
class Veichle{
    public static void hornblow(){
        System.out.println("yes it blows horn");
    }
    public void no_of_wheels(){
        System.out.println("4");
    }
    public void engine_power(){
        System.out.println("2000cc");
    }
    public static void topSpeed(){
        System.out.println("200kmph");
    }
}
class Truck extends Veichle{

    public void engine_power() {  //overriding the engine_power function of Veichle class
        System.out.println("4000cc");
    }
    public void no_of_wheels(){   //overriding the no_of_wheels function of Veichle class
        System.out.println("10");
    }
   public  static void hornblow(){
        System.out.println("the horn honks ");
    }
}
