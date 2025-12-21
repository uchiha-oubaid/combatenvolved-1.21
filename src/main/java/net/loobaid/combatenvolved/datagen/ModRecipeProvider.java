package net.loobaid.combatenvolved.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.loobaid.combatenvolved.block.ModBlocks;
import net.loobaid.combatenvolved.item.ModItems;
import net.minecraft.data.server.recipe.RecipeExporter;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.item.Items;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.registry.RegistryWrapper;

import java.util.concurrent.CompletableFuture;

public class ModRecipeProvider extends FabricRecipeProvider {
    public ModRecipeProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    public void generate(RecipeExporter recipeExporter) {
        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.BROWN_HELMET)
                .pattern("BBB")
                .pattern("B B")
                .pattern("   ")
                .input('B', ModItems.BROWN_DUST)
                .criterion(hasItem(ModItems.BROWN_HELMET), conditionsFromItem(ModItems.BROWN_HELMET))
                .offerTo(recipeExporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.BROWN_CHESTPLATE)
                .pattern("B B")
                .pattern("BBB")
                .pattern("BBB")
                .input('B', ModItems.BROWN_DUST)
                .criterion(hasItem(ModItems.BROWN_CHESTPLATE), conditionsFromItem(ModItems.BROWN_CHESTPLATE))
                .offerTo(recipeExporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.BROWN_LEGGINGS)
                .pattern("BBB")
                .pattern("B B")
                .pattern("B B")
                .input('B', ModItems.BROWN_DUST)
                .criterion(hasItem(ModItems.BROWN_LEGGINGS), conditionsFromItem(ModItems.BROWN_LEGGINGS))
                .offerTo(recipeExporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.BROWN_BOOTS)
                .pattern("   ")
                .pattern("B B")
                .pattern("B B")
                .input('B', ModItems.BROWN_DUST)
                .criterion(hasItem(ModItems.BROWN_BOOTS), conditionsFromItem(ModItems.BROWN_BOOTS))
                .offerTo(recipeExporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.BROWN_SWORD)
                .pattern(" B ")
                .pattern(" B ")
                .pattern(" S ")
                .input('B', ModItems.BROWN_DUST)
                .input('S', Items.STICK)
                .criterion(hasItem(ModItems.BROWN_SWORD), conditionsFromItem(ModItems.BROWN_SWORD))
                .offerTo(recipeExporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.BROWN_AXE)
                .pattern(" BB")
                .pattern(" SB")
                .pattern(" S ")
                .input('B', ModItems.BROWN_DUST)
                .input('S', Items.STICK)
                .criterion(hasItem(ModItems.BROWN_AXE), conditionsFromItem(ModItems.BROWN_AXE))
                .offerTo(recipeExporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.BROWN_PICKAXE)
                .pattern("BBB")
                .pattern(" S ")
                .pattern(" S ")
                .input('B', ModItems.BROWN_DUST)
                .input('S', Items.STICK)
                .criterion(hasItem(ModItems.BROWN_PICKAXE), conditionsFromItem(ModItems.BROWN_PICKAXE))
                .offerTo(recipeExporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.BROWN_SHOVEL)
                .pattern(" B ")
                .pattern(" S ")
                .pattern(" S ")
                .input('B', ModItems.BROWN_DUST)
                .input('S', Items.STICK)
                .criterion(hasItem(ModItems.BROWN_SHOVEL), conditionsFromItem(ModItems.BROWN_SHOVEL))
                .offerTo(recipeExporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.BROWN_HOE)
                .pattern(" BB")
                .pattern(" S ")
                .pattern(" S ")
                .input('B', ModItems.BROWN_DUST)
                .input('S', Items.STICK)
                .criterion(hasItem(ModItems.BROWN_HOE), conditionsFromItem(ModItems.BROWN_HOE))
                .offerTo(recipeExporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModBlocks.BROWN_BLOCK)
                .pattern("BBB")
                .pattern("BBB")
                .pattern("BBB")
                .input('B', ModItems.BROWN_DUST)
                .criterion(hasItem(ModBlocks.BROWN_BLOCK), conditionsFromItem(ModBlocks.BROWN_BLOCK))
                .offerTo(recipeExporter);
    }
}
