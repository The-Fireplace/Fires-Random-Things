package the_fireplace.frt.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import the_fireplace.frt.FRT;

import javax.annotation.Nonnull;

public class FRTBlock extends Block {

	public FRTBlock(Material materialIn) {
		super(materialIn);
		setCreativeTab(FRT.TabFRT);
	}

	@Nonnull
	public FRTBlock setSoundType(@Nonnull SoundType sound) {
		return (FRTBlock) super.setSoundType(sound);
	}

	public FRTBlock setHarvestTool(String tool, int tier) {
		this.setHarvestLevel(tool, tier);
		return this;
	}
}
