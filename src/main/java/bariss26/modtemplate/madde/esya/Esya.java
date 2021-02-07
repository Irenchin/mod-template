package bariss26.modtemplate.madde.esya;

import bariss26.modtemplate.Ana;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.Item;

public class Esya extends Item{

	public Esya(String isim) {
		this.setUnlocalizedName(isim);
		this.setCreativeTab(Ana.sekme);
		this.setTextureName(isim);
		GameRegistry.registerItem(this, isim);
	}

}
