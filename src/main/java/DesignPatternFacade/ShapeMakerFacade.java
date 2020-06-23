package DesignPatternFacade;

public class ShapeMakerFacade {

    private Shape circle;
    private Shape square;
    private Shape rectangle;

    public ShapeMakerFacade() {
         circle =new Circle();
         square = new Square();
         rectangle = new Rectangle();
    }

    public  void drawCircle (){
        circle.draw();
    }
    public void drawSquare(){
        square.draw();
    }
    public  void drawRectangle(){
        rectangle.draw();
    }
}
