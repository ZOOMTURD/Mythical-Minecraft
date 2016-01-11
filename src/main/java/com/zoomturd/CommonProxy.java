package com.zoomturd;

import com.zoomturd.blocks.ModBlocks;
import com.zoomturd.items.ModItems;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

public class CommonProxy {

    public void preInit(FMLPreInitializationEvent e) 
    {
    	ModItems.createItems();
    
    }

    public void init(FMLInitializationEvent e) {
    	ModItems.init();
    }

    public void postInit(FMLPostInitializationEvent e) {

    }

	public void registerRenders() {
		
	}
}

