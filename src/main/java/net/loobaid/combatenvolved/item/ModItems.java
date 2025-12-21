package net.loobaid.combatenvolved.item;

import net.loobaid.combatenvolved.CombatEnvolved;
import net.loobaid.combatenvolved.item.custom.ModArmorMaterials;
import net.loobaid.combatenvolved.item.custom.ModtoolMaterials;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {

    public static final Item BROWN_DUST = registerModItems("brown_dust",
            new Item(new Item.Settings()));

    // the tools
    public static final Item BROWN_SWORD = registerModItems("brown_sword",
            new SwordItem(ModtoolMaterials.BROWN, (new Item.Settings().maxCount(1).attributeModifiers(
                    SwordItem.createAttributeModifiers(ModtoolMaterials.BROWN,
                            4, -2.4F)))));

    public static final Item BROWN_PICKAXE = registerModItems("brown_pickaxe",
            new PickaxeItem(ModtoolMaterials.BROWN, (new Item.Settings().maxCount(1).attributeModifiers(
                    PickaxeItem.createAttributeModifiers(ModtoolMaterials.BROWN,
                            3, -2.1F)))));

    public static final Item BROWN_AXE = registerModItems("brown_axe",
            new AxeItem(ModtoolMaterials.BROWN, (new Item.Settings().maxCount(1).attributeModifiers(
                    AxeItem.createAttributeModifiers(ModtoolMaterials.BROWN,
                            5.5f, -3.0F)))));

    public static final Item BROWN_SHOVEL = registerModItems("brown_shovel",
            new ShovelItem(ModtoolMaterials.BROWN, (new Item.Settings().maxCount(1).attributeModifiers(
                    ShovelItem.createAttributeModifiers(ModtoolMaterials.BROWN,
                            1.5f, -3.0F)))));

    public static final Item BROWN_HOE = registerModItems("brown_hoe",
            new HoeItem(ModtoolMaterials.BROWN, (new Item.Settings().maxCount(1).attributeModifiers(
                    HoeItem.createAttributeModifiers(ModtoolMaterials.BROWN,
                            -2.0F, -1.5F)))));

    // for the armor items now
    public static final Item BROWN_HELMET = registerModItems("brown_helmet",
            new ArmorItem(ModArmorMaterials.BROWN_ARMOR_MATERIAL, ArmorItem.Type.HELMET,
                    new Item.Settings().maxCount(1).maxDamage(ArmorItem.Type.HELMET.getMaxDamage(15))));

    public static final Item BROWN_CHESTPLATE = registerModItems("brown_chestplate",
            new ArmorItem(ModArmorMaterials.BROWN_ARMOR_MATERIAL, ArmorItem.Type.CHESTPLATE,
                    new Item.Settings().maxCount(1).maxDamage(ArmorItem.Type.CHESTPLATE.getMaxDamage(15))));

    public static final Item BROWN_LEGGINGS = registerModItems("brown_leggings",
            new ArmorItem(ModArmorMaterials.BROWN_ARMOR_MATERIAL, ArmorItem.Type.LEGGINGS,
                    new Item.Settings().maxCount(1).maxDamage(ArmorItem.Type.LEGGINGS.getMaxDamage(15))));

    public static final Item BROWN_BOOTS = registerModItems("brown_boots",
            new ArmorItem(ModArmorMaterials.BROWN_ARMOR_MATERIAL, ArmorItem.Type.BOOTS,
                    new Item.Settings().maxCount(1).maxDamage(ArmorItem.Type.BOOTS.getMaxDamage(15))));

    public static final Item WOODEN_SPEAR = registerModItems("wooden_spear",
            new AxeItem(ToolMaterials.WOOD, (new Item.Settings().maxCount(1).attributeModifiers(
                    AxeItem.createAttributeModifiers(ToolMaterials.WOOD,
                            3, -2.4F)))));

    public static final Item STONE_SPEAR = registerModItems("stone_spear",
            new AxeItem(ToolMaterials.STONE, (new Item.Settings().maxCount(1).attributeModifiers(
                    AxeItem.createAttributeModifiers(ToolMaterials.STONE,
                            3, -2.4F)))));

    public static Item registerModItems(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(CombatEnvolved.MOD_ID, name), item);
    }

    public static void initialize() {
        CombatEnvolved.LOGGER.info("initializing items for "+CombatEnvolved.MOD_ID);
    }
}
