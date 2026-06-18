 // Helper Class 
 class Calculator{

    int x;
    int y;

    Calculator(int x, int y){
        this.x=x;
        this.y=y;
    }

    public int add(int x , int y){
        return x+y;
    }
    public int sub(int x , int y){
        return x-y;
    }
    public int mul(int x , int y){
        return x*y;
    }
    public int divi(int x , int y){
        return x/y;
    }

}

//  Main class (Only one public class in java)

public class ClassAndObject {
    
    public static void main(String args[]){

        int x=20;
        int y=5;

        Calculator cal= new Calculator(x, y);

        int add = cal.add(x, y);
        int sub = cal.sub(x, y);
        int mul = cal.mul(x, y);
        int div = cal.divi(x, y);


        System.out.println("Addition " +  add);
        System.out.println("Subtraction " +  sub);
        System.out.println("Multiplication " + mul);
        System.out.println("Division " + div);

    }
}
