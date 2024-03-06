import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nВыберите фигуру:");
            System.out.println("1. Квадрат");
            System.out.println("2. Треугольник");
            System.out.println("3. Прямоугольник");
            System.out.println("q. Выход и программы\n");

            String choice = scanner.nextLine();

            switch (choice) {
                case "1":
                    System.out.print("Введите длину стороны квадрата: ");
                    double sideLength = scanner.nextDouble();
                    Square square = new Square(sideLength);
                    System.out.println("Площадь: " + square.calculateArea());
                    System.out.println("Периметр: " + square.calculatePerimeter());
                    break;
                case "2":
                    System.out.print("Введите длины сторон треугольника через Enter: ");
                    double side1 = scanner.nextDouble();
                    double side2 = scanner.nextDouble();
                    double side3 = scanner.nextDouble();
                    Triangle triangle = new Triangle(side1, side2, side3);
                    System.out.println("Площадь: " + triangle.calculateArea());
                    System.out.println("Периметр: " + triangle.calculatePerimeter());
                    break;
                case "3":
                    System.out.print("Введите длину и ширину прямоугольника через Enter: ");
                    double length = scanner.nextDouble();
                    double width = scanner.nextDouble();
                    Rectangle rectangle = new Rectangle(length, width);
                    System.out.println("Площадь: " + rectangle.calculateArea());
                    System.out.println("Периметр: " + rectangle.calculatePerimeter());
                    break;
                case "q":
                    System.out.println("Выход из программы.");
                    System.exit(0);
                default:
                    System.out.println("Неверный выбор. Попробуйте снова.");
            }
            scanner.nextLine();
        }
    }
}