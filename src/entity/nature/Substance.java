/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity.nature;

/**
 *
 * @author smit
 */
public class Substance {
    
    private final float volume;
    private final SubstanceType element;

    public Substance(float volume, SubstanceType element) {
        this.volume = volume;
        this.element = element;
    }
    
    
}
