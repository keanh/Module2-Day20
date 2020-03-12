import java.util.Scanner;

public class TestFactory {
    public static void main(String[] args) {
        System.out.println("Nhập hình bạn muốn tìm");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        ShapeFactory shapeFactory = new ShapeFactory();
        Shape shape = (Shape) shapeFactory.getShape(input);
        System.out.println("Hình muốn tìm là: " + shape.identyfied());
    }
}
