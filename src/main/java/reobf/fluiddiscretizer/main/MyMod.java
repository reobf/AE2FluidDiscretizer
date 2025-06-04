package reobf.fluiddiscretizer.main;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import reobf.fluiddiscretizer.Tags;
import reobf.fluiddiscretizer.ae.part2.ICacheFD;

@Mod(modid = Tags.MODID, version = Tags.VERSION, name = Tags.MODNAME, acceptedMinecraftVersions = "[1.7.10]"// ,
// dependencies =
// "required-after:appliedenergistics2;required-after:gregtech;"// ,

)
public class MyMod {

	public static final Logger LOG = LogManager.getLogger(Tags.MODID);

	@Mod.EventHandler

	public void postInit(FMLPostInitializationEvent event) {

		appeng.core.Api.INSTANCE.registries().gridCache().registerGridCache(ICacheFD.class, ICacheFD.CacheFD.class);
	}

}
