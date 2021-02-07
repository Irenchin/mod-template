package bariss26.modtemplate.madde.blok;

import bariss26.modtemplate.Ana;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class Blok extends Block{

	public Blok(String isim, Material materialIn) {
		super(materialIn);
		this.setUnlocalizedName(isim);
		this.setCreativeTab(Ana.sekme);
		this.setTextureName(isim);
		GameRegistry.registerBlock(this, isim);
	}

	
	
}
