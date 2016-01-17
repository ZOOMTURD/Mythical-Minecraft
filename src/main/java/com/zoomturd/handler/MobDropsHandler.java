package com.zoomturd.handler;

import com.zoomturd.items.ModItems;

import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.monster.EntityZombie;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.event.entity.living.LivingDropsEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class MobDropsHandler
{
    @SubscribeEvent
    public void onMobDrops(LivingDropsEvent event)
    {
        if (event.entity instanceof EntityZombie)
        {
         
            ItemStack stack = new ItemStack(ModItems.blood);
            EntityItem drop = new EntityItem(event.entity.worldObj, event.entity.posX, event.entity.posY, event.entity.posZ, stack);
 
            event.drops.add(drop);
        }
    }
}