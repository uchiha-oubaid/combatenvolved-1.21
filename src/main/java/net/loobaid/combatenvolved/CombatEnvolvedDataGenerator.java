package net.loobaid.combatenvolved;

import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.loobaid.combatenvolved.datagen.ModModelProvider;
import net.loobaid.combatenvolved.datagen.ModRecipeProvider;
import net.loobaid.combatenvolved.datagen.ModRegistryProvider;
import net.loobaid.combatenvolved.world.ModConfiguredFeatures;
import net.loobaid.combatenvolved.world.ModPlacedFeatures;
import net.minecraft.registry.RegistryBuilder;
import net.minecraft.registry.RegistryKeys;

public class CombatEnvolvedDataGenerator implements DataGeneratorEntrypoint {
	@Override
	public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
        FabricDataGenerator.Pack pack = fabricDataGenerator.createPack();

        pack.addProvider(ModModelProvider::new);
        pack.addProvider(ModRegistryProvider::new);
        pack.addProvider(ModRecipeProvider::new);
	}

    @Override
    public void buildRegistry(RegistryBuilder registryBuilder) {
        // the configured features
        registryBuilder.addRegistry(RegistryKeys.CONFIGURED_FEATURE,
                ModConfiguredFeatures::bootstrap);
        // the placed features
        registryBuilder.addRegistry(RegistryKeys.PLACED_FEATURE,
                ModPlacedFeatures::bootstrap);
    }
}