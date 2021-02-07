package bariss26.modtemplate.madde;

import bariss26.modtemplate.madde.blok.Blok;
import bariss26.modtemplate.madde.esya.Esya;
import bariss26.modtemplate.madde.esya.Yiyecek;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;

public class EsyalarBloklar {

	public static Item esya, yiyecek;
	public static Block blok;
	
	public static void firla() {
		esya = new Esya("esya");
		yiyecek = new Yiyecek("yiyecek", 6, 0.5f);
		blok = new Blok("blok", Material.rock);
	}
	
}
