package com.zoomturd;

import com.zoomturd.CommonProxy;
import com.zoomturd.blocks.ModBlocks;
import com.zoomturd.items.ModItems;
import com.zoomturd.world.generator.WorldGeneratorZOOM;

import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.entity.RenderItem;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.FMLCommonHandler;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;

@Mod(modid = mod.MODID, name = mod.MODNAME, version = mod.VERSION)
public class mod
{
	WorldGeneratorZOOM worldGenerator = new WorldGeneratorZOOM();
	
	public static final CreativeTabs ctab = new ctab("ctab");
	
	@SidedProxy(clientSide="com.zoomturd.ClientProxy", serverSide="com.zoomturd.ServerProxy")
	public static CommonProxy proxy;
	
	@Instance
	public static mod instance = new mod();
	
    public static final String MODID = "zoomturd";
    public static final String MODNAME = "Mythical Minecraft";
    public static final String VERSION = "Alpha";
    
    @EventHandler
    public void preInit(FMLPreInitializationEvent e) 
    {
    	this.proxy.preInit(e);
    	ModBlocks.init();
    	ModBlocks.register();
    	worldgeninit.init();
    	
    }
    
    @EventHandler
    public void init(FMLInitializationEvent e)
    {
    	this.proxy.init(e);
    	proxy.registerRenders();
    	//recipes
    	GameRegistry.addRecipe(new ItemStack(ModItems.bonesword)," A "," B "," C ",'A', ModItems.boneblade, 'B', ModItems.handlewrap, 'C', ModItems.bonehandle);
    	GameRegistry.addRecipe(new ItemStack(ModItems.reapsting),"DA "," B "," C ",'D', ModItems.blood, 'A', ModItems.boneblade, 'B', ModItems.handlewrap, 'C', ModItems.bonehandle);
    	//Not recipes
    }
 
    @EventHandler
    public void postInit(FMLPostInitializationEvent e) 
    {
    	this.proxy.postInit(e);
    }
}


