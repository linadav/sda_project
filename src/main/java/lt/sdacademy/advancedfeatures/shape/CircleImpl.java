package lt.sdacademy.advancedfeatures.shape;

public class CircleImpl extends Shape {
    private int radius;
    public CircleImpl(String shapeDescription, int radius) {
        super(shapeDescription);
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    @Override
    public double getShapeArea (){
        return Math.PI*radius*radius;
    }

    @Override
    public double getShapePerimeter() {
        return 2*Math.PI*radius;
    }
}
