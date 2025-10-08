class car{
    String colour;
    String brand;
    int years;

    void display(){
        System.out.println("colour is :" + colour);
        System.out .println("brand is :" + brand);
        System.out.println("years is :" + years);
    }
    }
class bike{
    String colour;
    String brand;
    int years;
    void display(){
        System.out.println("colour is :" + colour);
        System.out .println("brand is :" + brand);
        System.out.println("years is :" + years);
    }
}

public class classExample {
    public static void main(String[]agrs){
        car c1 =new car();
        c1.colour ="red";
        c1.brand ="bmw";
        c1.years =2020;
        c1.display();

        bike b1 =new bike();
        b1.colour ="black";
        b1.brand="dure";
        b1.years=2023;
        b1.display();
    
    }
}
