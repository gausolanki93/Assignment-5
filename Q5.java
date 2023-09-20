class Calculator{

    public int add(int a,int b){
        return a+b;
    }

    public int sub(int a,int b){
        return a-b;
    }

    public int mul(int a,int b){
        return a*b;
    }
}

class AdvCalculator extends Calculator{
    
    public int square(int a){
        return a*a;
    }

    public boolean oddEven(int a){

        if(a%2==0){
            return true;
        }

        else{
            return false;
        }
    }

}

public class Q5{
    public static void main(String[] args){

        
        AdvCalculator avd = new AdvCalculator();

        System.out.println(avd.add(10,20));
        System.out.println(avd.sub(30,15));
        System.out.println(avd.mul(10,2));
        System.out.println(avd.square(5));
        System.out.println(avd.oddEven(2));

    }
}