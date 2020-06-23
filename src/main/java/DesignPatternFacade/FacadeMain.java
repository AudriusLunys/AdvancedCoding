package DesignPatternFacade;

public class FacadeMain {
    public static void main(String[] args) {
        ShapeMakerFacade shapeMakerFacade = new ShapeMakerFacade();
        shapeMakerFacade.drawCircle();
        shapeMakerFacade.drawRectangle();
        shapeMakerFacade.drawSquare();
    }
}
