package net.uxhy.mod_2;

import java.util.Random;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Mod_2.MOD_ID, version = Mod_2.VERSION, dependencies = Mod_2.DEPENDENCIES)

public class Mod_2 {

	// constants
	public static final String MOD_ID = "mod_2";
	public static final String MOD_NAME = "uxhy:mod_2";
	public static final String VERSION = "@VERSION@";
	public static final String DEPENDENCIES = "required-after:forge@[13.19.1.2188,)";
	public static final String RESOURCE_PREFIX = MOD_ID.toLowerCase() + ":";

	// variables
	public static Random random = new Random();

	@Instance(MOD_ID)
	public static Mod_2 instance;

	@SidedProxy(clientSide = "net.uxhy.mod_2.ClientProxy", serverSide = "net.uxhy.mod_2.CommonProxy")
	public static CommonProxy proxy;

	@EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		proxy.preInit(event);

	}

	@EventHandler
	public void init(FMLInitializationEvent event) {
		proxy.init(event);

	}

	@EventHandler
	public void postInit(FMLPostInitializationEvent event) {
		proxy.postInit(event);

	}

}
