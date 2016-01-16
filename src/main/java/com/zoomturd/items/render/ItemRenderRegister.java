package com.zoomturd.items.render;

import com.zoomturd.items.ModItems;

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
    	
    	Minecraft.getMinecraft().getRenderItem().getItemModelMesher()
        .register(ModItems.bonesword, 0, new ModelResourceLocation("zoomturd:bonesword", "inventory"));
   
    	Minecraft.getMinecraft().getRenderItem().getItemModelMesher()
        .register(ModItems.handlewrap, 0, new ModelResourceLocation("zoomturd:handlewrap", "inventory"));
    	
    	Minecraft.getMinecraft().getRenderItem().getItemModelMesher()
        .register(ModItems.boneblade, 0, new ModelResourceLocation("zoomturd:boneblade", "inventory"));
    	
    	Minecraft.getMinecraft().getRenderItem().getItemModelMesher()
        .register(ModItems.bonehandle, 0, new ModelResourceLocation("zoomturd:bonehandle", "inventory"));
    	
    	Minecraft.getMinecraft().getRenderItem().getItemModelMesher()
        .register(ModItems.blood, 0, new ModelResourceLocation("zoomturd:blood", "inventory"));
    	
    	Minecraft.getMinecraft().getRenderItem().getItemModelMesher()
        .register(ModItems.celestialbronzesword, 0, new ModelResourceLocation("zoomturd:celestialbronzesword", "inventory"));
    	
    	Minecraft.getMinecraft().getRenderItem().getItemModelMesher()
        .register(ModItems.imperialgoldsword, 0, new ModelResourceLocation("zoomturd:imperialgoldsword", "inventory"));
    	
    	Minecraft.getMinecraft().getRenderItem().getItemModelMesher()
        .register(ModItems.stygianironsword, 0, new ModelResourceLocation("zoomturd:stygianironsword", "inventory"));
    	
    	Minecraft.getMinecraft().getRenderItem().getItemModelMesher()
        .register(ModItems.woodenspearshaft, 0, new ModelResourceLocation("zoomturd:woodenspearshaft", "inventory"));
    	
    	Minecraft.getMinecraft().getRenderItem().getItemModelMesher()
        .register(ModItems.woodenhandle, 0, new ModelResourceLocation("zoomturd:woodenhandle", "inventory"));
    }
}