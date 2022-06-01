package com.ajcudd.first_mod;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;

@Mod("first_mod")
public class FirstMod {
	public FirstMod() {
		MinecraftForge.EVENT_BUS.register(this);
	}
}
