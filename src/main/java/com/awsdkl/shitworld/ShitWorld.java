package com.awsdkl.shitworld;

import com.awsdkl.shitworld.item.ModFoodComponents;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.item.v1.FabricItem;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ShitWorld implements ModInitializer {
    //创建物品
    public static final Item SHIT = new Item(new Item.Settings().group(ItemGroup.FOOD).food(ModFoodComponents.SHIT));
    //创建方块和它的物品
    public static final Block SHIT_BLOCK = new Block(FabricBlockSettings.of(Material.METAL).strength(0.5f,3.0f));
    public static final BlockItem SHIT_BLOCK_ITEM = new BlockItem(SHIT_BLOCK,new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS));
    @Override
    public void onInitialize() {
        //注册物品
        {
            Registry.register(Registry.ITEM,new Identifier("shit-world","shit"),SHIT);
        }
        //注册方块及其物品
        {
            Registry.register(Registry.BLOCK,new Identifier("shit-world","shit_block"),SHIT_BLOCK);
            Registry.register(Registry.ITEM,new Identifier("shit-world","shit_block"),SHIT_BLOCK_ITEM);
        }
    }
}
