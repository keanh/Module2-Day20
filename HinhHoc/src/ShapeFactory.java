public class ShapeFactory {
    public Shape getShape(String type) {
        try {
            if (type.equals("Circle")) {
                return new Circle();
            } else if (type.equals("Rectangle")) {
                return new Rectangle();
            } else if (type.equals("Square")) {
                return new Square();
            }else{
                return new Nothing();
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return null;
    }
}
