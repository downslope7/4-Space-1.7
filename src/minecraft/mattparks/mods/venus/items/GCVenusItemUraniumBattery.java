package mattparks.mods.venus.items;

import mattparks.mods.venus.GCVenus;
import micdoodle8.mods.galacticraft.api.transmission.core.item.ItemElectric;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class GCVenusItemUraniumBattery extends ItemElectric
{
	public GCVenusItemUraniumBattery(int id, String assetName)
	{
		super(id);
		this.setUnlocalizedName(assetName);
		this.setTextureName(GCVenus.TEXTURE_PREFIX + assetName);
	}

	@Override
	public CreativeTabs getCreativeTab()
	{
		return GCVenus.galacticraftVenusTab;
	}

	@Override
	public float getMaxElectricityStored(ItemStack itemStack)
	{
		return 750000;
	}

	@Override
	public float getVoltage(ItemStack itemStack)
	{
		return 120;
	}
}
