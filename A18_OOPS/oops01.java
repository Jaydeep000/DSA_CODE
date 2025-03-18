package A18_OOPS;

public class oops01 {
    public static void main(String[] args) {
        Pen p1=new Pen();
        p1.setColor("Blue");
        System.out.println(p1.getColor());
        p1.setTip(5);
        System.out.println(p1.getTip());
        p1.setColor("Yello");
        System.out.println(p1.getColor());
    }
    
}

class Pen{ //class name first should be in capital
    //prop + functions
    private String color;
    private int tip;
    String getColor(){
        return this.color;
    }
    void setColor(String newColor){
        color=newColor;
    }
    int getTip(){
        return this.tip;
    }
    void setTip(int newTip){
        tip=newTip;
    }
}
class Student{
    String name;
    int age;
    float Percentage;

    void calcPercentage(int phy ,int chem, int math){
        Percentage= (phy+chem+math)/3;

    }
}