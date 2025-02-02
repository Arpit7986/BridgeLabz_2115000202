public class Circle {
    private double radius;
    public Circle() {
        this(1.0); 
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        System.out.println("Radius of Circle is : " + radius);
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        System.out.println("Area of Circle is : " + Math.PI * radius * radius);
        return Math.PI * radius * radius;
    }

    public double getCircumference() {
        System.out.println("Circumference of Circle is : " + 2 * Math.PI * radius);
        return 2 * Math.PI * radius;
    }

    public void displayDetails() {
        System.out.println("Radius: " + radius);
        System.out.println("Area: " + getArea());
        System.out.println("Circumference: " + getCircumference());
    }

    public static void main(String[] args) {
        Circle circle1 = new Circle(9.0);
        System.out.println("Radius: " + circle1.getRadius());
        System.out.println("Area: " + circle1.getArea());
        System.out.println("Circumference: " + circle1.getCircumference());
    }
}