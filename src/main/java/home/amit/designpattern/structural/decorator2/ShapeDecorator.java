package home.amit.designpattern.structural.decorator2;

public abstract class ShapeDecorator implements Shape {


    protected Shape shape;

    public ShapeDecorator(Shape shp) {
        this.shape = shp;
    }

    @Override
    public void draw() {
        shape.draw();
        addBorder();
    }

    private void addBorder() {
        System.out.println("Adding RedBorder");
    }
}
