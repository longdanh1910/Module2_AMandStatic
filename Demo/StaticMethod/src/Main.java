//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
       Student.change();
       Student s1=new Student(111,"Hoang");
       Student s2=new Student(222,"Long");

       s1.display();
       s2.display();
    }
}