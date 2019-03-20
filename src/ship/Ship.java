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
    
    private final int id;
    private final ShipShape shape;
    private final Systems systems = new Systems();
    
}
