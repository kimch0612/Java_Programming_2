package week02;

public class ShapeMain {
    public static void main(String[] args) {
        Circle myCircle = new Circle("동그라미", 9);
        System.out.println(myCircle.calcArea());
        
        Shape myShape = new Rectangle("네모", 3, 2);
        System.out.println("사각형의 넓이는: " + myShape.calcArea());

        myShape = myCircle;
        System.out.println("원의 넓이는: " + myShape.calcArea());

        Shape[] shapes = new Shape[2];
        shapes[0] = myCircle;
        shapes[1] = new Rectangle("직사각형", 5, 4);

        Object[] objs = new Object[3]; // 최상의 클래스이므로 어떤 클래스(내용)라도 담을 수 있음
        objs[0] = "Hello";
        objs[1] = myCircle;
        objs[2] = 100; // int class형으로 담겨짐
        Shape shapeObject = (Shape)objs[1];
        System.out.println(shapeObject.calcArea());
    }
}
