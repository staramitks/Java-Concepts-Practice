package home.amit.designpattern.structural.bridge;
/*
User :- AmitSingh
Date :- 8/1/2023
Time :- 10:06 AM
Year :- 2023
*/

class BlueShapeDrawing extends ShapeDrawing {
    public BlueShapeDrawing(Shape shape) {
        super(shape);
    }

    @Override
    public void drawShape() {
        System.out.print("Drawing in Blue: ");
        shape.draw();
    }
}