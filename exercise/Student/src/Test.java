public class Test {
    public static void main(String[] args) {
        Student student1 = new Student();
        student1.setName("Long");
        student1.setClasses("Codegym");
        System.out.println(student1.getName());
        System.out.println(student1.getClasses());

        Student student2 = new Student();
        System.out.println(student2.getName());
        System.out.println(student2.getClasses());

    }
}
