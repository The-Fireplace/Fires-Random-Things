package the_fireplace.frt.blocks;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;

/**
 * @author The_Fireplace
 */
public class BlockScreen extends FRTBlock {

	public BlockScreen(String color) {
		super(Material.CLOTH);
		setHardness(0.4F);
		setUnlocalizedName(color + "_screen");
		setSoundType(SoundType.CLOTH);
	}

	@Override
	public int getFlammability(IBlockAccess world, BlockPos pos, EnumFacing face) {
		return 200;
	}

	@Override
	public int getFireSpreadSpeed(IBlockAccess world, BlockPos pos, EnumFacing face) {
		return 20;
	}
}
