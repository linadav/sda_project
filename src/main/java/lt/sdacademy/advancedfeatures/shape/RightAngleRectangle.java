package lt.sdacademy.advancedfeatures.shape;

public abstract class RightAngleRectangle extends Shape {
    private double width;
    private double height;

    public RightAngleRectangle (String shapeDescription, double height, double width) {
       super (shapeDescription);
        this.height = height;
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public double getWidth() {
        return width;
    }

//    abstract public double getShapeArea();
//    abstract public double getShapePerimeter();

}
