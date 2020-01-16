package lt.sdacademy.advancedfeatures.shape;

/*
Susikurti abstrakčią klasę `Shape` ir jį paveldėti:
    * `Shape` klasė privalo turėti lauką: `shapeDescription`;
    * Susikurti objektą `Circle` su lauku `radius`;
    * Susikurti  abstrakčią klasę `RightAngleRectangle` su laukais `width`, `height`;
    * Susikurti objektą `Rectangle` ir paveldėti objektą RightAngleRectangle;
    * Inicializuoti sukurtus `Circle` ir `Rectangle` objektus;
    * Apskaičiuoti apskritimo plotą ir ilgį;
    * Apskaičiuoti stataus trikampio plotą - ```(a*b)/2``` ir stačiakampio plotą;
    * Duomenys įvedami naudotojo per ekraną;
    * Gautus rezultatus įrašyti į failą naudojantis BufferedWriter objekta.
 */
public class ShapeMain {
    public static void main (String [] args)    {
        Shape circle = new CircleImpl("apskritimas", 10);
        Shape rectangle = new RectangleImpl("staciakampis", 5, 6);

        System.out.println("Trikampio plotas: " + circle.getShapeArea() + "; perimetras: " + circle.getShapePerimeter());
        System.out.println("Staciakampio plotas: " + rectangle.getShapeArea() + "; perimetras: " + rectangle.getShapePerimeter());
    }
}

