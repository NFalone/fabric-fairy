package net.fradaut.fairy;

import net.fabricmc.api.ModInitializer;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class Main implements ModInitializer {
    public static final Logger LOGGER = LoggerFactory.getLogger("fairy");
    public static final String MOD_ID = "fairy";
    public static final Item TEST_ITEM = new Item(new Item.Settings());

    @Override
    public void onInitialize() {
        System.out.println("fairy mod initial");

        Registry.register(Registry.ITEM, new Identifier("demo", "test_item"), TEST_ITEM);
    }
}
