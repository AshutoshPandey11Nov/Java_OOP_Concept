public class DynamicDispatchMechanism {
    public static void main(String[] args){
        Super A=new Sub();
        A.displayMethod();
        ((Sub) A).fetchcall();  // way to use methods of subclass which are not present in the superclass using reference variable of super class
// if we do not do the above casting then ClassCastException will occur;

        // Sub B=new Super(); is not possible because it does not follow "is-a relationship" of inheritance
    }
}
class Super{
    void displayMethod(){
        System.out.println("Ashutosh Pandey");
    }
}
class Sub extends Super{
    void displayMethod() {
        System.out.println("Suraj Singh");
    }

    void fetchcall(){
        System.out.println("Hello");
        }
}
