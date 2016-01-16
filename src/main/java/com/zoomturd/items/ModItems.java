package com.zoomturd.items;

import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.fml.common.registry.GameRegistry;

public final class ModItems {
	
	public static Item celestialbronzeingot;
	
	public static Item imperialgoldingot;
	
	public static Item stygianironingot;
	
	public static ItemModSword reapsting;
	
	public static Item handlewrap;
	
	public static Item blood;
	
	public static Item bonehandle;
	
	public static Item boneblade;
	
	public static ItemModSword bonesword;
	
	public static ItemModSword celestialbronzesword;
	
	public static ItemModSword imperialgoldsword;
	
	public static ItemModSword stygianironsword;
	
	public static Item woodenhandle;
	
	public static Item woodenspearshaft;
	
	public static void createItems() 
    {
    	
    	GameRegistry.registerItem(reapsting = new ItemModSword("reapsting", BBONE), "reapsting");
    	
    	GameRegistry.registerItem(bonesword = new ItemModSword("bonesword", BONE), "bonesword");
    	
    	GameRegistry.registerItem(celestialbronzesword = new ItemModSword("celestialbronzesword", cbronze), "celestialbronzesword");
    	
    	GameRegistry.registerItem(imperialgoldsword = new ItemModSword("imperialgoldsword", igold), "imperialgoldsword");
    	
    	GameRegistry.registerItem(stygianironsword = new ItemModSword("stygianironsword", siron), "stygianironsword");
    	
    	GameRegistry.registerItem(celestialbronzeingot = new IngotItem("celestialbronzeingot"), "celestialbronzeingot");
    	
    	GameRegistry.registerItem(imperialgoldingot = new IngotItem("imperialgoldingot"), "imperialgoldingot");
    	
    	GameRegistry.registerItem(stygianironingot = new IngotItem("stygianironingot"), "stygianironingot");
    	
    	GameRegistry.registerItem(handlewrap = new ComponentItem("handlewrap"), "handlewrap");
    	
    	GameRegistry.registerItem(boneblade = new ComponentItem("boneblade"), "boneblade");
    	
    	GameRegistry.registerItem(bonehandle = new ComponentItem("bonehandle"), "bonehandle");
    	//May change blood's item type
    	GameRegistry.registerItem(blood = new ComponentItem("blood"), "blood");
    	
    	GameRegistry.registerItem(woodenhandle = new ComponentItem("woodenhandle"), "woodenhandle");
    	
    	GameRegistry.registerItem(woodenspearshaft = new ComponentItem("woodenspearshaft"), "woodenspearshaft");
    }
    public static ToolMaterial BBONE = EnumHelper.addToolMaterial("Bone", 3, 1738, 9.0F, 9, 21);
    //Edit regular bone material
    public static ToolMaterial BONE = EnumHelper.addToolMaterial("Bone", 3, 1738, 9.0F, 9, 21);
    
    public static ToolMaterial cbronze = EnumHelper.addToolMaterial("cbronze", 3, 1738, 9.0F, 9, 21);
    
    public static ToolMaterial igold = EnumHelper.addToolMaterial("igold", 3, 1738, 9.0F, 9, 21);
    
    public static ToolMaterial siron = EnumHelper.addToolMaterial("siron", 3, 1738, 9.0F, 9, 21);

	public static void init() {		
	}

}

