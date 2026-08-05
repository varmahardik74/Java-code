class Student {
    String name;
    void study(){
        System.out.println(name + " is studying");
    }
}

public class Main {
    public static void main(String[] args){
        Student s1 = new Student();
        // s.name = "Hardik";
        s1.name = "jatin";
        s1.study();
    }
}
