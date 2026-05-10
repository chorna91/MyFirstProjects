import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //масив базового типу (поліморфізм)
        Shape[] shapes = new Shape[]{
                new Circle(5);
                new Rectangle (4,6);
                new Triangle(3,4,5)
        };

        //прохід по масиву
        for (Shape shape: shapes){
            System.out.println("Shape: " + shape.getName());
            System.out.println("Area: " + shape.area());
            System.out.println("Perimeter: " + shape.perimeter());
            System.out.println("---------------------------");
        }

        //static доступ
        System.out.println("Total shapes created: " + Shape.getCount());

        Scanner scan = new Scanner(System.in);

        System.out.println("Size array: ");
        while (!scan.hasNextInt()) {
            System.out.println("Invalid input, try again");
            scan.next();
        }
        int n = scan.nextInt();
        System.out.println("Size array is=> " + n);
        int[] arr = new int[n];
        System.out.print("Enter int values: ");
        for (int i = 0; i < n; i++) {
            arr[i] = scan.nextInt();
        }
        System.out.print("Array: ");
        ArrayStats.printArray(arr);

        System.out.println("Sum = " + ArrayStats.sum(arr));
        System.out.println("Min = " + ArrayStats.min(arr));
        System.out.println("Max = " + ArrayStats.max(arr));
        System.out.println("Average = " + ArrayStats.average(arr));

        ArrayStats.printEvenOddCount(arr);

    }
}