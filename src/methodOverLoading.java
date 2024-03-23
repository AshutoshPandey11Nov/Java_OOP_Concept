/* method-overloading is a compile-time-polymorphism

methodOverloading is when two functions of same name and different parameters are created in a same class
their return type can be different or same because methodOverloading does not depend upon the return type but on parameters*/
public class methodOverLoading {
    /*  public int sum(int a,int b,int c){
        return a+b+c;
        }  */
    public float sum(int d,int e,int f){
        return d+e+f;
    }

    /*  There are two methods with same name and parameters therefore it will not run
     and when we run this it will show error that "method is already defined in the method-overloading class"
     this is because of the ambiguity, i.e. which method to call. */
}
  class mainrunner{
    public static void main(String[] args){
        methodOverLoading ashu=new methodOverLoading();
        int a=(int)ashu.sum(10,20,30);
        System.out.println(a);
    }
}
