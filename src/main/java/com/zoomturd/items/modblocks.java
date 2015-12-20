package com.zoomturd.items;

import com.zoomturd.Reference;
import com.zoomturd.mod;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class modblocks {
	
	public static Block celestialbronzeore;
	public static Block stygianironore;
	public static Block imperialgoldore;
	
	public static void init()
	{
		celestialbronzeore = new Blockclass(Material.iron).setUnlocalizedName("celestialbronzeore");
		stygianironore = new Blockclass(Material.iron).setUnlocalizedName("stygianironore");
		imperialgoldore = new Blockclass(Material.iron).setUnlocalizedName("imperialgoldore");
			
	}
	public static void register()
	{
		GameRegistry.registerBlock(celestialbronzeore, celestialbronzeore.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(imperialgoldore, imperialgoldore.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(stygianironore, stygianironore.getUnlocalizedName().substring(5));
	
	}
	public static void registerRenders()
	{
		registerRender(celestialbronzeore);
		registerRender(imperialgoldore);
		registerRender(stygianironore);
		
	}
	public static void registerRender(Block block)
	{
		Item item = Item.getItemFromBlock(block);
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(Reference.MOD_ID + "i" + item.getUnlocalizedName().substring(5), "inventory"));
	}
	public static void createBlocks() 
	{
	
	}

}
