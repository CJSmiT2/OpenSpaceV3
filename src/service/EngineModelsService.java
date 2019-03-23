/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import values.common.statical.ShapeSt;
import values.common.statical.HpSt;
import values.common.statical.PowerSt;
import values.common.statical.WearRate;
import java.util.ArrayList;
import ship.systems.engine.Consumption;
import ship.systems.engine.EngineModel;
import ship.systems.engine.EngineModelName;
import values.consumption.BurningOilSt;
import values.consumption.EnergySt;
import values.consumption.OxygenSt;
import values.consumption.XenonSt;

/**
 *
 * @author smit
 */
public class EngineModelsService {
    
    private final ArrayList<EngineModel> engineModels = new ArrayList();
    
    public EngineModelsService(){
        
        Consumption consumption = new Consumption(
                new EnergySt(0f), 
                new XenonSt(0f), 
                new OxygenSt(0f), 
                new BurningOilSt(0f));
        
        boolean[][] shape = {
            {true, true}, 
            {true, true, true}
        }; 
        
        EngineModel EngineModel = new EngineModel(
                EngineModelName.MODEL_1, 
                new ShapeSt(shape), 
                new WearRate(0f), 
                new HpSt(0), 
                new PowerSt(0), 
                consumption);
    }
    
    public EngineModel find(EngineModelName engineModelName){
        for (EngineModel engineModel : engineModels){
            if (engineModel.getName() == engineModelName){
                return engineModel;
            }
        }
        throw new RuntimeException("Engine model '" + engineModelName + "' not found!");
    }
    
}
