package bariss26.modtemplate;

import org.apache.logging.log4j.Logger;

import bariss26.modtemplate.sanal.Sekme;
import cpw.mods.fml.common.FMLLog;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import net.minecraft.creativetab.CreativeTabs;

@Mod(modid = Ana.modKimlik, version = Ana.modSurum, name = Ana.modIsim)
public class Ana {

	public static final String modKimlik = "modtemplate";
	public static final String modSurum = "1.0.0";
	public static final String modIsim = "Mod Template";	

	public static Logger oduncu = FMLLog.getLogger();
	
	@SidedProxy(clientSide="bariss26.modtemplate.Musteri", serverSide="bariss26.modtemplate.Sunucu")
	public static Sunucu sunucu;
	public static Musteri musteri;
	
	@EventHandler
	public static void giris(FMLPreInitializationEvent event) {
		
	}
	
	@EventHandler
	public static void gelisme(FMLInitializationEvent event) {
		sunucu.rendele();
	}
	
	@EventHandler
	public static void sonuc(FMLPostInitializationEvent event) {
		
	}
	
	public static CreativeTabs sekme = new Sekme(CreativeTabs.getNextID(), "Sekme");
	
}
