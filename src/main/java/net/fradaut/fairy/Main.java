package net.fradaut.fairy;

import net.fabricmc.api.ModInitializer;
import net.fradaut.fairy.block.ModBlocks;
import net.fradaut.fairy.item.ModItems;
import net.fradaut.fairy.util.ModRegistries;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class Main implements ModInitializer {
    public static final String MOD_ID = "fairy";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    @Override
    public void onInitialize() {
        ModItems.registerModItems();
        ModBlocks.registerModBlocks();

        ModRegistries.registerModStuff();
    }
}
