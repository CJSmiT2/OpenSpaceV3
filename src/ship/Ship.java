/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ship;

import ship.systems.Systems;

/**
 *
 * @author smit
 */
public class Ship {
    
    public final int id;
    public final ShipShape shape;
    public final Systems systems = new Systems(this);

    public Ship(int id, ShipShape shape) {
        this.id = id;
        this.shape = shape;
    }

}
