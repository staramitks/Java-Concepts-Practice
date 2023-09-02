package home.amit.designpattern.structural.bridge;
/*
User :- AmitSingh
Date :- 8/1/2023
Time :- 10:07 AM
Year :- 2023
*/

public class BridgeRunner {
    public static void main(String[] args) {
        Shape circle = new Circle();
        Shape rectangle = new Rectangle();

        ShapeDrawing greenCircle = new GreenShapeDrawing(circle);
        ShapeDrawing blueRectangle = new BlueShapeDrawing(rectangle);

        greenCircle.drawShape(); // Output: Drawing in Green: Drawing a Circle
        blueRectangle.drawShape(); // Output: Drawing in Blue: Drawing a Rectangle
    }
}
