package bariss26.modtemplate;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Ana.modKimlik, version = Ana.modSurum, name = Ana.modIsim)
public class Ana {

	public static final String modKimlik = "modtemplate";
	public static final String modSurum = "1.0.0";
	public static final String modIsim = "Mod-Template";	
	
	@EventHandler
	public static void giris(FMLPreInitializationEvent event) {
		
	}
	
	@EventHandler
	public static void gelisme(FMLInitializationEvent event) {
		
	}
	
	@EventHandler
	public static void sonuc(FMLPostInitializationEvent event) {
		
	}
	
}
