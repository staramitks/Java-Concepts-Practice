package home.amit.designpattern.structural.bridge;
/*
User :- AmitSingh
Date :- 8/1/2023
Time :- 10:06 AM
Year :- 2023
*/

// Abstraction Base Class
abstract class ShapeDrawing {
    protected Shape shape;

    public ShapeDrawing(Shape shape) {
        this.shape = shape;
    }

    public abstract void drawShape();
}

