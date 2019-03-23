/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ship.systems.engine;

import values.consumption.BurningOilSt;
import values.consumption.EnergySt;
import values.consumption.OxygenSt;
import values.consumption.XenonSt;

/**
 *
 * @author smit
 */
public class Consumption {
    
    private final EnergySt energy;
    private final XenonSt xenon;
    private final OxygenSt oxygen;
    private final BurningOilSt burningOil;

    public Consumption(EnergySt energy, XenonSt xenon, OxygenSt oxygen, BurningOilSt burningOil) {
        this.energy = energy;
        this.xenon = xenon;
        this.oxygen = oxygen;
        this.burningOil = burningOil;
    }

    public EnergySt getEnergy() {
        return energy;
    }

    public XenonSt getXenon() {
        return xenon;
    }

    public OxygenSt getOxygen() {
        return oxygen;
    }

    public BurningOilSt getBurningOil() {
        return burningOil;
    }

    
    
    
}
