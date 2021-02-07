package bariss26.modtemplate.madde;

import bariss26.modtemplate.madde.blok.Blok;
import bariss26.modtemplate.madde.esya.Esya;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;

public class EsyalarBloklar {

	public static Item esya;
	public static Block blok;
	
	public static void firla() {
		esya = new Esya("esya");
		blok = new Blok("blok", Material.rock);
	}
	
}
