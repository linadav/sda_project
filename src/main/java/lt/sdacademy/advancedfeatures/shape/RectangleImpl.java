package lt.sdacademy.advancedfeatures.shape;

public class RectangleImpl extends RightAngleRectangle {
    public RectangleImpl(String shapeDescription, double height, double width) {
        super(shapeDescription, height, width);
    }

    @Override
    public double getShapeArea() {
        return super.getHeight() * super.getWidth();
    }

    @Override
    public double getShapePerimeter(){
        return (super.getWidth() + super.getHeight())*2;
    }

}
