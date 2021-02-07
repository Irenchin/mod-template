package bariss26.modtemplate.madde.esya;

import bariss26.modtemplate.Ana;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.Item;

public class Esya extends Item{

	public Esya(String isim) {
		this.setUnlocalizedName(isim);
		this.setCreativeTab(Ana.sekme);
		GameRegistry.registerItem(this, isim);
	}
	
	@Override
	public void registerIcons(IIconRegister iconReg){
		itemIcon = iconReg.registerIcon(Ana.modKimlik+":"+this.getUnlocalizedName().substring(5));
	}

}
