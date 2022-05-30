package net.fradaut.fairy.item;

import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.fradaut.fairy.Main;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

public class ModItemGroup {
    public static final ItemGroup FAIRY = FabricItemGroupBuilder.build(new Identifier(Main.MOD_ID, "fairy"),
            () -> new ItemStack(ModItems.TEST_ITEM));
}
