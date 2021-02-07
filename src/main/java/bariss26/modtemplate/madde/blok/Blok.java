package bariss26.modtemplate.madde.blok;

import bariss26.modtemplate.Ana;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.util.IIcon;

public class Blok extends Block{

	public IIcon ust;
	public IIcon yan;
	public IIcon alt;
	
	public Blok(String isim, Material materialIn) {
		super(materialIn);
		this.setUnlocalizedName(isim);
		this.setCreativeTab(Ana.sekme);
		this.setTextureName(isim);
		GameRegistry.registerBlock(this, isim);
	}

	@Override
	public void registerIcons(IIconRegister icon) {
		super.registerIcons(icon);
		ust = icon.registerIcon(Ana.modKimlik+":"+this.getUnlocalizedName().substring(5));
		yan = icon.registerIcon(Ana.modKimlik+":"+this.getUnlocalizedName().substring(5));
		alt = icon.registerIcon(Ana.modKimlik+":"+this.getUnlocalizedName().substring(5));
	}
	
	@Override
	public IIcon getIcon(int side, int meta) {
		switch(side) {
		case 0:
			return alt;
		case 1:
			return ust;
		default:
			return yan;
		}
	}
	
}
