class Example{
    private String city;
    private String state;
    private String country;

    Example(String city){
        this.city = city;
        System.out.println("Your City Is "+this.city);
    }
    Example(String city,String state){
        this.city = city;
        this.state = state;
        System.out.println("Your City Is "+this.city);
        System.out.println("Your State Is "+this.state);
    }
    Example(String city,String state,String country){
        this.city = city;
        this.state = state;
        this.country = country;
        System.out.println("Your City Is "+this.city);
        System.out.println("Your State Is "+this.state);
        System.out.println("Your Country Is "+this.country);
    }

}

public class Q3{
    public static void main (String[] args){
        Example e1 = new Example("Vadodara");
        Example e2 = new Example("Vadodara","Gujarat");
        Example e3 = new Example("Vadodara","Gujarat","India");
    }
}
