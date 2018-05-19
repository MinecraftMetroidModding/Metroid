package com.aeyrial.metroidprimemod.tools;

import com.aeyrial.metroidprimemod.Main;
import com.aeyrial.metroidprimemod.init.ModItems;
import com.aeyrial.metroidprimemod.util.IHasModel;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemPickaxe;

public class ToolPickaxe extends ItemPickaxe implements IHasModel
{
	public ToolPickaxe(String name, ToolMaterial material) {
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
