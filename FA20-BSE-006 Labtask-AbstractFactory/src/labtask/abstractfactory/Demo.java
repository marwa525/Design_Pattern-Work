/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labtask.abstractfactory;

public class Demo {
    public static void main(String[] args) {
        // Get a factory for normal shapes
        AbstractFactory shapeFactory = FactoryProducer.getFactory(false);

        // Get a factory for rounded shapes
        AbstractFactory roundedShapeFactory = FactoryProducer.getFactory(true);

        // Get a factory for double bordered shapes
        AbstractFactory doubleBorderShapeFactory = new DoubleBorderShapeFactory();

        // Create and display products
        Shape rectangle = shapeFactory.getShape("RECTANGLE");
        rectangle.draw();

        Shape square = shapeFactory.getShape("SQUARE");
        square.draw();

        Shape triangle = shapeFactory.getShape("TRIANGLE");
        triangle.draw();

        Shape roundedRectangle = roundedShapeFactory.getShape("RECTANGLE");
        roundedRectangle.draw();

        Shape roundedSquare = roundedShapeFactory.getShape("SQUARE");
        roundedSquare.draw();

        Shape roundedTriangle = roundedShapeFactory.getShape("TRIANGLE");
        roundedTriangle.draw();

        Shape doubleBorderTriangle = doubleBorderShapeFactory.getShape("TRIANGLE");
        doubleBorderTriangle.draw();
    }




