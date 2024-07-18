public class abstraction{
    public static void main(String[] args) {
        chiken neo = new chiken();
        neo.walk();

    }

}

abstract class Animal{
    void eat(){
        System.out.println("animal eats");
    }

    abstract void walk();
}

class Horse extends Animal{
    void walk(){
        System.out.println("can walk on 4");
    }
}

class chiken extends Animal{
    void walk(){
        System.out.println("can Walk on 2");
    }
}