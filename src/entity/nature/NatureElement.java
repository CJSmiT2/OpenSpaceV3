/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity.nature;

import common.Position;
import entity.Voxel;
import java.util.ArrayList;

/**
 *
 * @author smit
 */
public class NatureElement extends Voxel{
    
    private final ArrayList<Substance> substanceArray;

    public NatureElement(ArrayList<Substance> substanceArray, int id, Position position) {
        super(id, position);
        this.substanceArray = substanceArray;
    }
    
    
}
