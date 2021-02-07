package bariss26.modtemplate.sanal;

import bariss26.modtemplate.madde.EsyalarBloklar;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class Sekme extends CreativeTabs{

	public Sekme(int index, String label) {
		super(index, label);
	}

	@Override
	@SideOnly(Side.CLIENT)
	public Item getTabIconItem() {
		return EsyalarBloklar.esya;
	}
	
}
