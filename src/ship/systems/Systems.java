/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ship.systems;

/**
 *
 * @author smit
 */
public class Systems {
    
    private final EnergySystem energySystem = new EnergySystem();
    private final EngineSystem engineSystem = new EngineSystem();
    private final FuelTanksSystem fuelTanksSystem = new FuelTanksSystem();
    private final StorageSystem storageSystem = new StorageSystem();
    private final TanksSystem tankSystem = new TanksSystem();
    private final PassiveSystem passiveSystem = new PassiveSystem();
}
