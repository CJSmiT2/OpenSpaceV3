/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import common.Position;

/**
 *
 * @author smit
 */
public class Voxel {
    
    private final int id;
    private final Position position;

    public Voxel(int id, Position position) {
        this.id = id;
        this.position = position;
    }
    
    
}
