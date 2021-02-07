package bariss26.modtemplate.madde.esya;

import bariss26.modtemplate.Ana;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.ItemFood;

public class Yiyecek extends ItemFood{

	public Yiyecek(String isim, int p_i45339_1_, float p_i45339_2_) {
		super(p_i45339_1_, p_i45339_2_, true);
		this.setUnlocalizedName(isim);
		this.setCreativeTab(Ana.sekme);
		GameRegistry.registerItem(this, isim);
	}
	
	@Override
	public void registerIcons(IIconRegister iconReg){
		itemIcon = iconReg.registerIcon(Ana.modKimlik+":"+this.getUnlocalizedName().substring(5));
	}

}
