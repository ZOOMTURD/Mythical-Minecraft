package com.zoomturd.items.render;

import com.zoomturd.items.ModItems;
import com.zoomturd.items.modblocks;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.entity.RenderItem;
import net.minecraft.client.resources.model.ModelResourceLocation;

public final class ItemRenderRegister {

    public static void registerItemRenderer() 
    {
    	Minecraft.getMinecraft().getRenderItem().getItemModelMesher()
        .register(ModItems.celestialbronzeingot, 0, new ModelResourceLocation("zoomturd:celestialbronzeingot", "inventory"));
    
    	Minecraft.getMinecraft().getRenderItem().getItemModelMesher()
        .register(ModItems.imperialgoldingot, 0, new ModelResourceLocation("zoomturd:imperialgoldingot", "inventory"));
    	
    	Minecraft.getMinecraft().getRenderItem().getItemModelMesher()
        .register(ModItems.stygianironingot, 0, new ModelResourceLocation("zoomturd:stygianironingot", "inventory"));
    
    	Minecraft.getMinecraft().getRenderItem().getItemModelMesher()
        .register(ModItems.reapsting, 0, new ModelResourceLocation("zoomturd:reapsting", "inventory"));
   
    }
}