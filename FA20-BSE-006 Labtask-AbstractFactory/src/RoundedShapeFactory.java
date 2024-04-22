/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author FA20-BSE-005
 */
public class RoundedShapeFactory extends AbstractFactory {
   @Override
   public Shape getShape(String shapeType){    
      if(shapeType.equalsIgnoreCase("RECTANGLE")){
         return new RoundedRectangle(); 
      } else if(shapeType.equalsIgnoreCase("SQUARE")){
         return new RoundedSquare();
      } else if(shapeType.equalsIgnoreCase("TRIANGLE")){
         return new RoundedTriangle();
      }
      return null;
   }
     
   
}
