public class Circle {
    private double radius;
    private String color;

    public Circle(){

    }
    public Circle(double r){
        radius = r;
    }
    protected double getRadius(){
        return radius;
    }
    protected double getArea(){
        return Math.PI * radius * radius;
    }


}
