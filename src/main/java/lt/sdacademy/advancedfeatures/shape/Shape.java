package lt.sdacademy.advancedfeatures.shape;

public abstract class Shape {
    private String shapeDescription;
    public Shape (String shapeDescription){

        this.shapeDescription = shapeDescription;
    }

    public String getShapeDescription() {
        return shapeDescription;
    }

    abstract public double getShapeArea();
    abstract public double getShapePerimeter ();

}
