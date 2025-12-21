package net.loobaid.combatenvolved;

import net.fabricmc.api.ModInitializer;

import net.loobaid.combatenvolved.block.ModBlocks;
import net.loobaid.combatenvolved.item.ModItems;
import net.loobaid.combatenvolved.item.custom.ModItemGroups;
import net.loobaid.combatenvolved.world.gen.ModWorldGeneration;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import org.intellij.lang.annotations.Identifier;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CombatEnvolved implements ModInitializer {
	public static final String MOD_ID = "combatenvolved";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
        ModItems.initialize();
        ModBlocks.initialize();
        ModItemGroups.initialize();
        ModWorldGeneration.initialize();
    }
}