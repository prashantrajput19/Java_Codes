 // Helper Class 
 class Calculator{

    int x;
    int y;

    // Ya toh constructor se pass kerdo 

    Calculator(int x, int y){
        this.x=x;
        this.y=y;
    }
    // Ya fir function se pass kerdo
    public int add(){
        return x+y;
    }
    public int sub(){
        return x-y;
    }
    public int mul(){
        return x*y;
    }
    public int divi(){
        return x/y;
    }

}

//  Main class (Only one public class in java)

public class ClassAndObject {
    
    public static void main(String args[]){

        int x=20;
        int y=5;

        Calculator cal= new Calculator(x,y);

        int add = cal.add();
        int sub = cal.sub();
        int mul = cal.mul();
        int div = cal.divi();


        System.out.println("Addition " +  add);
        System.out.println("Subtraction " +  sub);
        System.out.println("Multiplication " + mul);
        System.out.println("Division " + div);

    }
}
