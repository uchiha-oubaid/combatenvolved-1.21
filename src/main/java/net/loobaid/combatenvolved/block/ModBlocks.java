package net.loobaid.combatenvolved.block;

import net.loobaid.combatenvolved.CombatEnvolved;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;

public class ModBlocks {

    public static final Block BROWN_STONE = registerModBlocks("brown_stone",
            new Block(AbstractBlock.Settings.create().nonOpaque().strength(3f).requiresTool()
                    .sounds(BlockSoundGroup.STONE)));

    public static final Block BROWN_DEEPSLATE = registerModBlocks("brown_deepslate",
            new Block(AbstractBlock.Settings.create().nonOpaque().strength(4f).requiresTool()
                    .sounds(BlockSoundGroup.DEEPSLATE)));

    public static final Block BROWN_BLOCK = registerModBlocks("brown_block",
            new Block(AbstractBlock.Settings.create().nonOpaque().strength(4f).requiresTool()));

    public static Block registerModBlocks(String name, Block block) {
        registerModBlockItems(name, block);
        return Registry.register(Registries.BLOCK, Identifier.of(CombatEnvolved.MOD_ID, name), block);
    }

    public static void registerModBlockItems(String name, Block block) {
        Registry.register(Registries.ITEM, Identifier.of(CombatEnvolved.MOD_ID, name),
                new BlockItem(block, new Item.Settings()));
    }

    public static void initialize() {
        CombatEnvolved.LOGGER.info("Registering blocks for "+CombatEnvolved.MOD_ID);
    }
}
