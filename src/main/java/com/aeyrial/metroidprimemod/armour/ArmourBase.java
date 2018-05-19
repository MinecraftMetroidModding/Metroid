package com.aeyrial.metroidprimemod.armour;

import com.aeyrial.metroidprimemod.Main;
import com.aeyrial.metroidprimemod.init.ModItems;
import com.aeyrial.metroidprimemod.util.IHasModel;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;

public class ArmourBase extends ItemArmor implements IHasModel
{
	public ArmourBase(String name, ArmorMaterial materialIn, int renderIndexIn, EntityEquipmentSlot equipmentSlotIn)
	{
		super(materialIn, renderIndexIn, equipmentSlotIn);
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
