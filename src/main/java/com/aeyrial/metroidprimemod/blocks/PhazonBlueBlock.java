package com.aeyrial.metroidprimemod.blocks;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;

public class PhazonBlueBlock extends BlockBase
{

	public PhazonBlueBlock(String name, Material material)
	{
		super(name, material);
		
		setSoundType(SoundType.METAL); // Sound of walking on block. Vary for effect or find a short clip to use here
		setHardness(3.0F); // Time it takes to mine
		setResistance (20.0F); // Resistance of block to explosives
		setHarvestLevel("pickaxe", 1); // Which tool is appropriate for breaking the block? Level of Equipment needed.
		setLightLevel(1.0F);
		setLightOpacity(1);
		canProvidePower(getDefaultState());
		
		//setBlockUnbreakable();
		
	}

}
