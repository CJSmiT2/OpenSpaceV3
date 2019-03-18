/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import common.WorldSettings;

/**
 *
 * @author smit
 */
public class BoxParticle {
    
    private final int id;
    private final int width = WorldSettings.BOX_SIZE;
    private final int height = WorldSettings.BOX_SIZE;
    private final Position position;
    private int weight;
    
}
