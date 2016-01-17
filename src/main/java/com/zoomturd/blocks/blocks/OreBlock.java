package com.zoomturd.blocks.blocks;

import com.zoomturd.ctab;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class OreBlock extends Block{

	public OreBlock(Material materialIn) {
		super(materialIn);
		this.setHarvestLevel("pickaxe", 3);
		this.setHardness(7f);
		this.setCreativeTab(ctab.ctab);
	}

}
