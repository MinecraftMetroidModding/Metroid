package com.aeyrial.metroidprimemod.tools;

import com.aeyrial.metroidprimemod.Main;
import com.aeyrial.metroidprimemod.init.ModItems;
import com.aeyrial.metroidprimemod.util.IHasModel;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemSpade;
import net.minecraft.item.Item.ToolMaterial;

public class ToolShovel extends ItemSpade implements IHasModel
{

	public ToolShovel(String name, ToolMaterial material) {
		super(material);
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(CreativeTabs.TOOLS);
		
		ModItems.ITEMS.add(this);
	}
	
	@Override
	public void registerModels()
	{
		Main.proxy.registerItemRenderer(this, 0, "inventory");
		
	}

}
