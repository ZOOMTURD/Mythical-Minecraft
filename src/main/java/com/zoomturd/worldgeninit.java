package com.zoomturd;

import com.zoomturd.world.generator.WorldGeneratorZOOM;

import net.minecraftforge.fml.common.registry.GameRegistry;

public class worldgeninit {

	public static void init() {

		GameRegistry.registerWorldGenerator(new WorldGeneratorZOOM(), 0);
	}
}