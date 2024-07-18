public class Constructor {
    public static void main(String[] args) {
        Student s1 = new Student("Rushii");
        System.out.println(s1.name);
        
        Student s2 = new Student();

    }
    
}


class Student{

    String name;
    int roll;

    //parameterized constructor
    Student(String name){
        this.name = name;
        System.out.println("Constructor called");
    }

    //non paramaterised cocnstructor
    Student(){
        System.out.println("hello");
    }
}