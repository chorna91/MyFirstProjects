public class Rectangle extends Shape {

    private final double width;
    private final double heigth;

    public Rectangle(double width, double heigth) {
        super("Rectangle");

        if (width <=0 || heigth <=0){
            throw new IllegalArgumentException("Width and height must be > 0");
        }
        this.width=width;
        this.heigth=heigth;
    }


    @Override
    public double area() {
        return width * heigth;
    }

    @Override
    public double perimeter() {
        return 2* (width+heigth);
    }
}
