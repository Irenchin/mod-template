package bariss26.modtemplate.madde.esya;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.Item;

public class Esya extends Item{

	public Esya(String isim) {
		this.setUnlocalizedName(isim);
		GameRegistry.registerItem(this, isim);
	}

}
