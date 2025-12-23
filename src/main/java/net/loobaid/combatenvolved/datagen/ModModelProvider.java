package net.loobaid.combatenvolved.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.loobaid.combatenvolved.block.ModBlocks;
import net.loobaid.combatenvolved.item.ModItems;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;
import net.minecraft.item.ArmorItem;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.BROWN_STONE);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.BROWN_DEEPSLATE);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.BROWN_BLOCK);
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(ModItems.WOODEN_SPEAR, Models.HANDHELD);
        itemModelGenerator.register(ModItems.STONE_SPEAR, Models.HANDHELD);
        itemModelGenerator.register(ModItems.BROWN_DUST, Models.GENERATED);
        itemModelGenerator.register(ModItems.BLAZED_BROWN_STAFF, Models.HANDHELD);
        // the tools
        itemModelGenerator.register(ModItems.BROWN_SWORD, Models.HANDHELD);
        itemModelGenerator.register(ModItems.BROWN_PICKAXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.BROWN_AXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.BROWN_SHOVEL, Models.HANDHELD);
        itemModelGenerator.register(ModItems.BROWN_HOE, Models.HANDHELD);
        // the armor
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.BROWN_HELMET));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.BROWN_CHESTPLATE));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.BROWN_LEGGINGS));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.BROWN_BOOTS));
    }
}
