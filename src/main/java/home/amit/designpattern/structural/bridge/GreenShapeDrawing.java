package home.amit.designpattern.structural.bridge;
/*
User :- AmitSingh
Date :- 8/1/2023
Time :- 10:06 AM
Year :- 2023
*/

// Refined Abstraction 1
class GreenShapeDrawing extends ShapeDrawing {
    public GreenShapeDrawing(Shape shape) {
        super(shape);
    }

    @Override
    public void drawShape() {
        System.out.print("Drawing in Green: ");
        shape.draw();
    }
}

