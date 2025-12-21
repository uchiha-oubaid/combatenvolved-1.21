package net.loobaid.combatenvolved.world;

import net.loobaid.combatenvolved.CombatEnvolved;
import net.loobaid.combatenvolved.block.ModBlocks;
import net.minecraft.registry.*;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.structure.rule.RuleTest;
import net.minecraft.structure.rule.TagMatchRuleTest;
import net.minecraft.util.Identifier;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.FeatureConfig;
import net.minecraft.world.gen.feature.OreFeatureConfig;

import java.util.List;

public class ModConfiguredFeatures {
    // the registry keys for the ores
    public static final RegistryKey<ConfiguredFeature<?, ?>> BROWN_ORE_KEY =
            registerKey("brown_ore"); // for the stone and deepslate ores

    // CF -> PF -> BM
    public static void bootstrap(Registerable<ConfiguredFeature<?, ?>> context) {

        // the rules for placing the ores (not yet set to the ores)
        RuleTest stoneReplaceables = new TagMatchRuleTest(BlockTags.STONE_ORE_REPLACEABLES);
        RuleTest deepslateReplaceables = new TagMatchRuleTest(BlockTags.DEEPSLATE_ORE_REPLACEABLES);

        // listing the blocks to their rules
        List<OreFeatureConfig.Target> overworldBrownOres =
                List.of(OreFeatureConfig.createTarget(stoneReplaceables, ModBlocks.BROWN_STONE.getDefaultState()),
                        OreFeatureConfig.createTarget(deepslateReplaceables, ModBlocks.BROWN_DEEPSLATE.getDefaultState()));

        // registering all
        register(context, BROWN_ORE_KEY, Feature.ORE, new OreFeatureConfig(overworldBrownOres, 12));
    }

    public static RegistryKey<ConfiguredFeature<?, ?>> registerKey(String name) {
        return RegistryKey.of(RegistryKeys.CONFIGURED_FEATURE,
                Identifier.of(CombatEnvolved.MOD_ID, name));
    }

    private static <FC extends FeatureConfig, F extends Feature<FC>> void register(Registerable<ConfiguredFeature<?, ?>> context,
                                                                                   RegistryKey<ConfiguredFeature<?, ?>> key,F feature, FC config) {
        context.register(key, new ConfiguredFeature<>(feature, config));
    }
}
