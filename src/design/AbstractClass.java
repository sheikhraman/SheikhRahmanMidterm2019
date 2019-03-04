package design;

public abstract class AbstractClass  implements Employee{
    final String empName ="John";
    static String resignationDate="10/10/10";
    int rating;
    //overloading
    public void performance(){

    }
    public void performance(String rating){

    }
    //overriding
    public void farewell(){
        System.out.println("Farewell date is : "+resignationDate);
    }
    public void farewell(int date){
        System.out.println(empName +" 's last day was " + resignationDate);
    }
}
