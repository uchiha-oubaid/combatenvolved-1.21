package net.loobaid.combatenvolved.item.custom;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.loobaid.combatenvolved.CombatEnvolved;
import net.loobaid.combatenvolved.block.ModBlocks;
import net.loobaid.combatenvolved.item.ModItems;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {

    // registering the mod item group
    public static final ItemGroup COMBAT_ENVOLVED_ITEM_GROUP =
            Registry.register(Registries.ITEM_GROUP, Identifier.of(CombatEnvolved.MOD_ID),
                    FabricItemGroup.builder()
                            .icon(() -> new ItemStack(ModItems.WOODEN_SPEAR))
                            .displayName(Text.translatable("item_group.combat_envolved"))
                            .entries((displayContext, e) -> {
                                e.add(ModItems.WOODEN_SPEAR);
                                e.add(ModItems.STONE_SPEAR);
                                e.add(ModItems.BROWN_DUST);
                                e.add(ModBlocks.BROWN_STONE);
                                e.add(ModBlocks.BROWN_DEEPSLATE);
                                // the tools
                                e.add(ModItems.BROWN_SWORD);
                                e.add(ModItems.BROWN_PICKAXE);
                                e.add(ModItems.BROWN_AXE);
                                e.add(ModItems.BROWN_SHOVEL);
                                e.add(ModItems.BROWN_HOE);
                                e.add(ModBlocks.BROWN_BLOCK);
                                // the armor
                                e.add(ModItems.BROWN_HELMET);
                                e.add(ModItems.BROWN_CHESTPLATE);
                                e.add(ModItems.BROWN_LEGGINGS);
                                e.add(ModItems.BROWN_BOOTS);
                            })
                            .build());

    public static void initialize() {
        CombatEnvolved.LOGGER.info("initializing item groups for "+CombatEnvolved.MOD_ID);
    }
}
