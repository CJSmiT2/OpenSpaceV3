/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import java.util.ArrayList;
import ship.ShipShape;
import ship.ShipShapeName;
import values.common.statical.ShapeSt;

/**
 *
 * @author smit
 */
public class ShapeService {
    
    private final ArrayList<ShipShape> shipShapes = new ArrayList();
    
    public ShapeService(){
        
        boolean[][] shapeBody = {
            {true}, 
            {true, true}, 
            {true, true}, 
            {true, true}, 
            {true, true, true},
            {true, true, true},
            {true, true, true},
            {true, true, true, true},
            {true, true, true},
            {true, true}
        }; 
        ShapeSt bodyMatrix = new ShapeSt(shapeBody);
        
        boolean[][] shapeEngine = {
            {false}, 
            {false, false}, 
            {false, false}, 
            {false, false}, 
            {false, false, false},
            {false, false, false},
            {false, false, false},
            {false, false, false, false},
            {true, true, false},
            {true, true}
        }; 
        
        ShapeSt engineMatrix = new ShapeSt(shapeEngine);
        ShipShape shipShape = new ShipShape(ShipShapeName.DEFAULT, bodyMatrix, engineMatrix);
        
        shipShapes.add(shipShape);
    }
    
    public ShipShape get(ShipShapeName name) {
        for (ShipShape shape : shipShapes){
            if (shape.getShape() == name){
                return shape;
            }
        }
        
        throw new RuntimeException("ShipShape '" + name + "' not found!");
    }
    
}
