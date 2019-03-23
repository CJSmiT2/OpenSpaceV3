/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ship.systems;

import ship.Ship;

/**
 *
 * @author smit
 */
public class Systems {
    
    public final EnergySystem energySystem;
    public final EngineSystem engineSystem;
    public final FuelTanksSystem fuelTanksSystem;
    public final StorageSystem storageSystem;
    public final TanksSystem tankSystem;
    public final PassiveSystem passiveSystem;

    public Systems(Ship ship) {
        energySystem = new EnergySystem(ship);
        engineSystem = new EngineSystem(ship);
        fuelTanksSystem = new FuelTanksSystem(ship);
        storageSystem = new StorageSystem(ship);
        tankSystem = new TanksSystem(ship);
        passiveSystem = new PassiveSystem(ship);
    }
    
    
    
}
