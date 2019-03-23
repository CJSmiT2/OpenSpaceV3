/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ship;

import values.common.statical.ShapeSt;

/**
 *
 * @author smit
 */
public class ShipShape {
    
    private final ShipShapeName shape;
    private final ShapeSt bodyMatrix;
    private final ShapeSt engineMatrix;

    public ShipShape(ShipShapeName shape, ShapeSt bodyMatrix, ShapeSt engineMatrix) {
        this.shape = shape;
        this.bodyMatrix = bodyMatrix;
        this.engineMatrix = engineMatrix;
    }

    public ShipShapeName getShape() {
        return shape;
    }

    public ShapeSt getBodyMatrix() {
        return bodyMatrix;
    }

    public ShapeSt getEngineMatrix() {
        return engineMatrix;
    }
    
    
}
