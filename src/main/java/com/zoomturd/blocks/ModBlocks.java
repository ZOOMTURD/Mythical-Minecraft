package com.zoomturd.blocks;

import com.zoomturd.Reference;
import com.zoomturd.blocks.blocks.OreBlock;

import com.zoomturd.ctab;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModBlocks {
	
	public static Block celestialbronzeore;
	
	public static void init()
	{
		celestialbronzeore = new OreBlock(Material.iron).setUnlocalizedName("celestialbronzeore");
	}
	
	public static void register()
	{
		GameRegistry.registerBlock(celestialbronzeore, celestialbronzeore.getUnlocalizedName().substring(5));
	}
	
	public static void registerRenders()
	{
		registerRender(celestialbronzeore);
	}
	
	public static void registerRender(Block block)
	{
		Item item = Item.getItemFromBlock(block);
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(Reference.MOD_ID + ":" + item.getUnlocalizedName().substring(5), "inventory"));
	}
}
