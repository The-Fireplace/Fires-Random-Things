package the_fireplace.frt.recipes;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraftforge.common.brewing.BrewingRecipeRegistry;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.oredict.OreDictionary;
import org.apache.commons.lang3.ArrayUtils;
import the_fireplace.frt.FRT;
import the_fireplace.frt.api.ItemExploderRegistry;
import the_fireplace.frt.config.ConfigValues;

/**
 * @author The_Fireplace
 */
public class RecipeHandler {
	//Vanilla Blocks
	static ItemStack alliumStack = new ItemStack(Blocks.RED_FLOWER, 1, 2);
	static ItemStack azureBluetStack = new ItemStack(Blocks.RED_FLOWER, 1, 3);
	static ItemStack blueOrchidStack = new ItemStack(Blocks.RED_FLOWER, 1, 1);
	static ItemStack dandelionStack = new ItemStack(Blocks.YELLOW_FLOWER, 1, 0);
	static ItemStack glassStack = new ItemStack(Blocks.GLASS);
	static ItemStack glowstoneStack = new ItemStack(Blocks.GLOWSTONE);
	static ItemStack lilacStack = new ItemStack(Blocks.DOUBLE_PLANT, 1, 1);
	static ItemStack orangeTulipStack = new ItemStack(Blocks.RED_FLOWER, 1, 5);
	static ItemStack oxeyeDaisyStack = new ItemStack(Blocks.RED_FLOWER, 1, 8);
	static ItemStack peonyStack = new ItemStack(Blocks.DOUBLE_PLANT, 1, 5);
	static ItemStack pinkTulipStack = new ItemStack(Blocks.RED_FLOWER, 1, 7);
	static ItemStack poppyStack = new ItemStack(Blocks.RED_FLOWER, 1, 0);
	static ItemStack redTulipStack = new ItemStack(Blocks.RED_FLOWER, 1, 4);
	static ItemStack roseBushStack = new ItemStack(Blocks.DOUBLE_PLANT, 1, 4);
	static ItemStack sandStack = new ItemStack(Blocks.SAND);
	static ItemStack stainedGlassStack = new ItemStack(Blocks.STAINED_GLASS, 1, OreDictionary.WILDCARD_VALUE);
	static ItemStack sunflowerStack = new ItemStack(Blocks.DOUBLE_PLANT, 1, 0);
	static ItemStack whiteTulipStack = new ItemStack(Blocks.RED_FLOWER, 1, 6);
	//Vanilla Items
	static ItemStack blazePowderStack = new ItemStack(Items.BLAZE_POWDER);
	static ItemStack blazeRodStack = new ItemStack(Items.BLAZE_ROD);
	static ItemStack boneStack = new ItemStack(Items.BONE);
	static ItemStack boneMealStack = new ItemStack(Items.DYE, 1, 15);
	static ItemStack bottleStack = new ItemStack(Items.GLASS_BOTTLE);
	static ItemStack dragonBreathStack = new ItemStack(Items.DRAGON_BREATH);
	static ItemStack fireChargeStack = new ItemStack(Items.FIRE_CHARGE);
	static ItemStack flintAndSteelStack = new ItemStack(Items.FLINT_AND_STEEL);
	static ItemStack glisteringMelonStack = new ItemStack(Items.SPECKLED_MELON);
	static ItemStack glowstoneDustStack = new ItemStack(Items.GLOWSTONE_DUST);
	static ItemStack goldIngotStack = new ItemStack(Items.GOLD_INGOT);
	static ItemStack goldNuggetStack = new ItemStack(Items.GOLD_NUGGET);
	static ItemStack goldenAppleStack = new ItemStack(Items.GOLDEN_APPLE);
	static ItemStack goldenCarrotStack = new ItemStack(Items.GOLDEN_CARROT);
	static ItemStack gunpowderStack = new ItemStack(Items.GUNPOWDER);
	static ItemStack magentaDyeStack = new ItemStack(Items.DYE, 1, 13);
	static ItemStack orangeDyeStack = new ItemStack(Items.DYE, 1, 14);
	static ItemStack pinkDyeStack = new ItemStack(Items.DYE, 1, 9);
	static ItemStack redDyeStack = new ItemStack(Items.DYE, 1, 1);
	static ItemStack redMushroomStack = new ItemStack(Blocks.RED_MUSHROOM);
	static ItemStack redstoneStack = new ItemStack(Items.REDSTONE);
	static ItemStack silverDyeStack = new ItemStack(Items.DYE, 1, 7);
	static ItemStack skyDyeStack = new ItemStack(Items.DYE, 1, 12);
	static ItemStack sugarStack = new ItemStack(Items.SUGAR);
	static ItemStack sugarCaneStack = new ItemStack(Items.REEDS);
	static ItemStack yellowDyeStack = new ItemStack(Items.DYE, 1, 11);
	//Custom Blocks
	static ItemStack candleStack = new ItemStack(FRT.candle);
	static ItemStack candlePlateStack = new ItemStack(FRT.candle_with_base);
	static ItemStack meatBlockStack = new ItemStack(FRT.meat_block);
	//Custom Items
	static ItemStack coatedCoalStack = new ItemStack(FRT.restabilized_coal);
	static ItemStack firestarterSubstituteStack = new ItemStack(FRT.firestarter_substitute);
	static ItemStack gunpowderSubstituteStack = new ItemStack(FRT.gunpowder_substitute);
	static ItemStack mysteryMeatStack = new ItemStack(FRT.mystery_meat);
	static ItemStack mysteryMeatStack8 = new ItemStack(FRT.mystery_meat, 8);
	static ItemStack rawMysteryMeatStack = new ItemStack(FRT.raw_mystery_meat);
	static ItemStack refinedCoalStack = new ItemStack(FRT.refined_coal);
	static ItemStack unstableCoalStack = new ItemStack(FRT.destabilized_coal);
	static ItemStack waxStack = new ItemStack(FRT.wax);

	public static void registerConstantRecipes() {
		addSmelting(coatedCoalStack, refinedCoalStack, 0.05F);
		addSmelting(meatBlockStack, mysteryMeatStack8, 0.01F);
		addSmelting(rawMysteryMeatStack, mysteryMeatStack, 0.02F);
		NBTTagCompound potionS = new NBTTagCompound();
		NBTTagCompound potionL = new NBTTagCompound();
		NBTTagCompound potionA = new NBTTagCompound();
		potionS.setString("Potion", "frt:hallucination");
		potionL.setString("Potion", "frt:long_hallucination");
		potionA.setString("Potion", "minecraft:awkward");
		ItemStack hallucinationPotionStackS = new ItemStack(Items.POTIONITEM);
		hallucinationPotionStackS.setTagCompound(potionS);
		ItemStack hallucinationPotionStackL = new ItemStack(Items.POTIONITEM);
		hallucinationPotionStackL.setTagCompound(potionL);
		ItemStack hallucinationPotionStackSS = new ItemStack(Items.SPLASH_POTION);
		hallucinationPotionStackSS.setTagCompound(potionS);
		ItemStack hallucinationPotionStackSL = new ItemStack(Items.SPLASH_POTION);
		hallucinationPotionStackSL.setTagCompound(potionL);
		ItemStack hallucinationPotionStackLS = new ItemStack(Items.LINGERING_POTION);
		hallucinationPotionStackLS.setTagCompound(potionS);
		ItemStack hallucinationPotionStackLL = new ItemStack(Items.LINGERING_POTION);
		hallucinationPotionStackLL.setTagCompound(potionL);
		ItemStack awkwardPotionStack = new ItemStack(Items.POTIONITEM);
		awkwardPotionStack.setTagCompound(potionA);
		ItemStack awkwardSplashPotionStack = new ItemStack(Items.SPLASH_POTION);
		awkwardSplashPotionStack.setTagCompound(potionA);
		ItemStack awkwardLingeringPotionStack = new ItemStack(Items.LINGERING_POTION);
		awkwardLingeringPotionStack.setTagCompound(potionA);
		BrewingRecipeRegistry.addRecipe(awkwardPotionStack, redMushroomStack, hallucinationPotionStackS);
		BrewingRecipeRegistry.addRecipe(hallucinationPotionStackS, redstoneStack, hallucinationPotionStackL);
		BrewingRecipeRegistry.addRecipe(hallucinationPotionStackS, gunpowderStack, hallucinationPotionStackSS);
		BrewingRecipeRegistry.addRecipe(hallucinationPotionStackL, gunpowderStack, hallucinationPotionStackSL);
		BrewingRecipeRegistry.addRecipe(hallucinationPotionStackSS, redstoneStack, hallucinationPotionStackSL);
		BrewingRecipeRegistry.addRecipe(hallucinationPotionStackSS, dragonBreathStack, hallucinationPotionStackLS);
		BrewingRecipeRegistry.addRecipe(hallucinationPotionStackSL, dragonBreathStack, hallucinationPotionStackLL);
		BrewingRecipeRegistry.addRecipe(hallucinationPotionStackLS, redstoneStack, hallucinationPotionStackLL);
		BrewingRecipeRegistry.addRecipe(awkwardLingeringPotionStack, redMushroomStack, hallucinationPotionStackLS);
		BrewingRecipeRegistry.addRecipe(awkwardSplashPotionStack, redMushroomStack, hallucinationPotionStackSS);
		ItemExploderRegistry.registerExplosive(gunpowderStack, gunpowderSubstituteStack, unstableCoalStack);
		ItemExploderRegistry.registerFirestarter(flintAndSteelStack, fireChargeStack, firestarterSubstituteStack);
		ItemExploderRegistry.registerExploderRecipe(glassStack, sandStack, 1);
		ItemExploderRegistry.registerExploderRecipe(stainedGlassStack, sandStack, 1);
		ItemExploderRegistry.registerExploderRecipe(bottleStack, sandStack, 1);
		ItemExploderRegistry.registerExploderRecipe(sugarCaneStack, sugarStack, 2);
		ItemExploderRegistry.registerExploderRecipe(glowstoneStack, glowstoneDustStack, 4);
		ItemExploderRegistry.registerExploderRecipe(boneStack, boneMealStack, 4);
		ItemExploderRegistry.registerExploderRecipe(blazeRodStack, blazePowderStack, 4);
		ItemExploderRegistry.registerExploderRecipe(dandelionStack, yellowDyeStack, 2);
		ItemExploderRegistry.registerExploderRecipe(poppyStack, redDyeStack, 2);
		ItemExploderRegistry.registerExploderRecipe(blueOrchidStack, skyDyeStack, 2);
		ItemExploderRegistry.registerExploderRecipe(alliumStack, magentaDyeStack, 2);
		ItemExploderRegistry.registerExploderRecipe(azureBluetStack, silverDyeStack, 2);
		ItemExploderRegistry.registerExploderRecipe(redTulipStack, redDyeStack, 2);
		ItemExploderRegistry.registerExploderRecipe(orangeTulipStack, orangeDyeStack, 2);
		ItemExploderRegistry.registerExploderRecipe(whiteTulipStack, silverDyeStack, 2);
		ItemExploderRegistry.registerExploderRecipe(pinkTulipStack, pinkDyeStack, 2);
		ItemExploderRegistry.registerExploderRecipe(oxeyeDaisyStack, silverDyeStack, 2);
		ItemExploderRegistry.registerExploderRecipe(sunflowerStack, yellowDyeStack, 3);
		ItemExploderRegistry.registerExploderRecipe(lilacStack, magentaDyeStack, 3);
		ItemExploderRegistry.registerExploderRecipe(roseBushStack, redDyeStack, 3);
		ItemExploderRegistry.registerExploderRecipe(peonyStack, pinkDyeStack, 3);
		ItemExploderRegistry.registerExploderRecipe(candleStack, waxStack, 2);
		ItemExploderRegistry.registerExploderRecipe(candlePlateStack, waxStack, 2);
		ItemExploderRegistry.registerExploderRecipe(goldenAppleStack, goldIngotStack, 8);
		ItemExploderRegistry.registerExploderRecipe(glisteringMelonStack, goldNuggetStack, 8);
		ItemExploderRegistry.registerExploderRecipe(goldenCarrotStack, goldNuggetStack, 8);
		for (int i = 0; i < 16; i++)
			ItemExploderRegistry.registerExploderRecipe(new ItemStack(Blocks.CONCRETE, 1, i), new ItemStack(Blocks.CONCRETE_POWDER, 1, i));
		addSmelting(new ItemStack(FRT.raw_meat_pie), new ItemStack(FRT.meat_pie), 5.0f);
	}

	public static void addSmelting(ItemStack input, ItemStack output, float xp) {
		if (input.getItem() == null || output.getItem() == null || ArrayUtils.contains(ConfigValues.DISABLEDITEMS, input.getItem().getUnlocalizedName().substring(5)) || ArrayUtils.contains(ConfigValues.DISABLEDITEMS, output.getItem().getUnlocalizedName().substring(5)))
			return;
		GameRegistry.addSmelting(input, output, xp);
	}
}
