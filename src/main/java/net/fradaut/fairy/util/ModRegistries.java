package net.fradaut.fairy.util;

import net.fabricmc.fabric.api.registry.FuelRegistry;
import net.fradaut.fairy.Main;
import net.fradaut.fairy.item.ModItems;

public class ModRegistries {
    public static void registerModStuff(){
        registerFuels();
    }

    private static void registerFuels(){
        Main.LOGGER.info("Registering Fuels for " + Main.MOD_ID);
        FuelRegistry registry = FuelRegistry.INSTANCE;  //map

        registry.add(ModItems.LILAC_FLOWER_BULB, 200); //tick
    }
}
