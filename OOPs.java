public class OOPs{
    public static void main(String args[]){
        Pen p1 = new Pen();   //constructor
        p1.setColor("Blue"); //calling fuction in class with value
        System.out.println(p1.color); //printing color value throw attributes

        p1.setTip(5);
        System.out.println(p1.tip);
    }
}

class Pen{
    String color;   //initial defoinig attribute
    int tip;

    void setColor(String newColor){  //fuction defining 
        color = newColor;
    }

    void setTip(int newTip){
        tip = newTip;
    }
}

class student{
    String name;
    int age;
    float percentage;
    
    void calPercentage(int phy, int che, int math){
        percentage = (phy+che+math)/3;
    }
}