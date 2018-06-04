package com.aeyrial.metroidprimemod.proxy;

import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;

public class ClientProxy extends CommonProxy
{
	@Override
	public void registerItemRenderer(Item item, int meta, String id)
	{
		ModelLoader.setCustomModelResourceLocation(item, meta, new ModelResourceLocation(item.getRegistryName(), id));
	}
	
	/*@Override
	public void initialize() {
	// calling super will register any 2-sided tick handlers you have that are registered in the CommonProxy
	// this is important since the CommonProxy will only register it on the server side, and you will need it
	// registered on the client as well; however, we do not have any at this point
	super.initialize();

	// here we register our RenderTickHandler - be sure to pass in the instance of Minecraft!
	FMLCommonHandler.instance().bus().register(new RenderTickHandler(Minecraft.getMinecraft()));

	// this is also an ideal place to register things like KeyBindings
	}*/
}