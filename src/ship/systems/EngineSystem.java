/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ship.systems;

import ship.systems.engine.Engine;
import java.util.ArrayList;
import ship.Ship;

/**
 *
 * @author smit
 */
public class EngineSystem {
    
    private final Ship ship;
    private final ArrayList<Engine> engines = new ArrayList();

    EngineSystem(Ship ship) {
        this.ship = ship;
    }
    
}
