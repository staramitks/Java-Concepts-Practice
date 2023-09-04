package home.amit.designpattern.structural.decorator2;

public class DecoratorPatternDemo {
    public static void main(String[] args) {

        Shape circle = new CircleShape();

        Shape redCircle = new RedShapeDecorator(new CircleShape());

        Shape redRectangle = new RedShapeDecorator(new SquareShape());
        System.out.println("Circle with normal border");
        circle.draw();

        System.out.println("Circle of red border");
        redCircle.draw();

        System.out.println("Rectangle of red border");
        redRectangle.draw();
    }
}
