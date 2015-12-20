package com.zoomturd;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
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
	@SidedProxy(clientSide="com.zoomturd.ClientProxy", serverSide="com.zoomturd.ServerProxy")
	public static CommonProxy proxy;
	
	@Instance
	public static mod instance = new mod();
	
    public static final String MODID = "zoomturd";
    public static final String MODNAME = "mythicalminecraft";
    public static final String VERSION = "alpha";
    
    @EventHandler
    public void preInit(FMLPreInitializationEvent e) 
    {
    	this.proxy.preInit(e);
    }
    
    @EventHandler
    public void init(FMLInitializationEvent e)
    {
    	this.proxy.init(e);
    	proxy.registerRenders();
    }
    
    @EventHandler
    public void postInit(FMLPostInitializationEvent e) 
    {
    	this.proxy.postInit(e);
    }
}
