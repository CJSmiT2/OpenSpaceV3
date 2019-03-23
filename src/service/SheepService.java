/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import ship.PartPosition;
import ship.Ship;
import ship.ShipShapeName;

/**
 *
 * @author smit
 */
public class SheepService {
    
    ShapeService shapeService = new ShapeService();
    EngineService engineService = new EngineService();
    
    public Ship getDefaultShip(){
        Ship ship = new Ship(1, shapeService.get(ShipShapeName.DEFAULT));
        ship.systems.engineSystem.installEngine(engineService.findById(1), new PartPosition(0b, 0b));
        return ship;
    }
}
