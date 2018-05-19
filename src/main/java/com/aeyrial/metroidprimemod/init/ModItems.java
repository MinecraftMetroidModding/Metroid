package com.aeyrial.metroidprimemod.init;

import java.util.ArrayList;
import java.util.List;

import com.aeyrial.metroidprimemod.armour.ArmourBase;
import com.aeyrial.metroidprimemod.items.ItemBase;
import com.aeyrial.metroidprimemod.tools.ToolAxe;
import com.aeyrial.metroidprimemod.tools.ToolHoe;
import com.aeyrial.metroidprimemod.tools.ToolPickaxe;
import com.aeyrial.metroidprimemod.tools.ToolShovel;
import com.aeyrial.metroidprimemod.tools.ToolSword;
import com.aeyrial.metroidprimemod.util.Reference;

import net.minecraft.init.SoundEvents;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraftforge.common.util.EnumHelper;

public class ModItems
{

	public static final List<Item> ITEMS = new ArrayList<Item>();
	
	//Materials Template
	/*public static final ToolMaterial TOOL_PHAZON = EnumHelper.addToolMaterial(name, harvestLevel, maxUses, efficiency, damage, enchantability)*/
	/*public static final ArmorMaterial ARMOUR_PHAZON = EnumHelper.addArmorMaterial(name, textureName, durability, reductionAmounts, enchantability, soundOnEquip, toughness);*/
	
	//Material
	public static final ToolMaterial TOOL_PHAZON = EnumHelper.addToolMaterial("tool_phazon", 5, 50, 15.0F, 2.5F, 20);
	public static final ArmorMaterial ARMOUR_PHAZON = EnumHelper.addArmorMaterial("armour_phazon", Reference.MOD_ID + ":phazon", 9, new int[] {4,5,7,2}, 20, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.1F);
	
	// Find phazon sound clip for armour equipping		
			
			
	//Items
	public static final Item PHAZON_BLUE_ORE = new ItemBase("phazon_blue_ore");
	
	//Tools
	public static final Item AXE_PHAZON = new ToolAxe("axe_phazon", TOOL_PHAZON);
	public static final Item HOE_PHAZON = new ToolHoe("hoe_phazon", TOOL_PHAZON);
	public static final Item PICKAXE_PHAZON = new ToolPickaxe("pickaxe_phazon", TOOL_PHAZON);
	public static final Item SHOVEL_PHAZON = new ToolShovel("shovel_phazon", TOOL_PHAZON);
	public static final Item SWORD_PHAZON = new ToolSword("sword_phazon", TOOL_PHAZON);
	
	//Armour
	public static final Item HELMET_VARIA_SUIT = new ArmourBase("varia_suit_helmet", ARMOUR_PHAZON, 1, EntityEquipmentSlot.HEAD);
	public static final Item CHESTPLATE_VARIA_SUIT = new ArmourBase("varia_suit_chestplate", ARMOUR_PHAZON, 1, EntityEquipmentSlot.CHEST);
	public static final Item LEGGINGS_VARIA_SUIT = new ArmourBase("varia_suit_leggings", ARMOUR_PHAZON, 2, EntityEquipmentSlot.LEGS);
	public static final Item BOOTS_VARIA_SUIT = new ArmourBase("varia_suit_boots", ARMOUR_PHAZON, 1, EntityEquipmentSlot.FEET);
	
	
}
