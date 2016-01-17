package com.zoomturd;

import com.zoomturd.blocks.ModBlocks;
import com.zoomturd.items.ModItems;
import com.zoomturd.world.generator.WorldGeneratorZOOM;

import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class CommonProxy {

    public void preInit(FMLPreInitializationEvent e) 
    {
    	ModItems.createItems();
    
    }

    public void init(FMLInitializationEvent e) {
    	ModItems.init();
    	GameRegistry.registerWorldGenerator(new WorldGeneratorZOOM(), 0);
    }
    

    public void postInit(FMLPostInitializationEvent e) {

    }

	public void registerRenders() {
		
	}
}

