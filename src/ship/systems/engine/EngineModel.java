/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ship.systems.engine;

import values.common.statical.ShapeSt;
import values.common.statical.HpSt;
import values.common.statical.PowerSt;
import values.common.statical.WearRate;


/**
 *
 * @author smit
 */
public class EngineModel {
    
    private final EngineModelName name;
    private final ShapeSt shape;
    private final WearRate wearRate; //коэффициент износа
    private final HpSt hp;
    private final PowerSt power; 
    
    private final Consumption consumption;

    public EngineModel(EngineModelName name, ShapeSt shape, WearRate wearRate, HpSt hp, PowerSt power, Consumption consumption) {
        this.name = name;
        this.shape = shape;
        this.wearRate = wearRate;
        this.hp = hp;
        this.power = power;
        this.consumption = consumption;
    }

    public EngineModelName getName() {
        return name;
    }

    public ShapeSt getShape() {
        return shape;
    }

    public WearRate getWearRate() {
        return wearRate;
    }

    public HpSt getHp() {
        return hp;
    }

    public PowerSt getPower() {
        return power;
    }

    public Consumption getConsumption() {
        return consumption;
    }
    
    
    
    
    
}
