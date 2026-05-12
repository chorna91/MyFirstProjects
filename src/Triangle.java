class Triangle extends Shape{
    private final double a;
    private final double b;
    private final double c;

     protected Triangle(double a, double b, double c) {
        super("Triangle");

         //перевірка валидности трикутника
         if (a <= 0 || b <= 0 || c <= 0){
             throw new IllegalArgumentException("Sides must be > 0");
         }
         if (a + b <= c || a +c <= b || b + c <= a){
             throw new IllegalArgumentException("Invalid triangle sides");
         }

         this.a = a;
         this.b = b;
         this.c = c;
     }

    @Override
    public double area() {
         //формула Герона
        double s = perimeter()/2;
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }

    @Override
    public double perimeter() {
        return a + b + c;
    }
}
