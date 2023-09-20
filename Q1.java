class Example{
    private String name;

    public void setName(String name){
        this.name = name;  
    }

    public String showName(){
        return this.name;
    }
}

public class Q1{
    public static void main(String[] args){
        Example e1 = new Example();
        e1.setName("Gaurav");
        System.out.println(e1.showName());
    }
}