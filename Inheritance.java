public class Inheritance {
    public static void main(String arg[]){
        fish Shark = new fish();
        Shark.eat();

    }
}


//base class or parent class 
class animal{
    String color;

    void eat(){
        System.out.println("Eats");
    }

    void brearth(){
        System.out.println("breaths");
    }
}


//derived class
class fish extends animal{
    int fish;
    void Swim(){
        System.out.println("Swim");
    }
}