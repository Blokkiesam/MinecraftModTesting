package com.dimmerworld.tutorialmod;

import com.dimmerworld.tutorialmod.item.ModItems;
import com.dimmerworld.tutorialmod.proxy.CommonProxy;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = TutorialMod.MODID, version = TutorialMod.VERSION, name = TutorialMod.NAME)
public class TutorialMod
{
    public static final String MODID = "tutorialmod";
    public static final String VERSION = "1.0";
    public static final String NAME = "Tutorial Mod";
    @SidedProxy(clientSide= "com.dimmerworld.tutorialmod.proxy.ClientProxy", serverSide ="com.dimmerworld.tutorialmod.proxy.CommonProxy;")
    public static CommonProxy proxy;
    
    
    @Mod.Instance
    public static TutorialMod instance;
    
    public static CreativeTabTutorial TabTutorial;
    @EventHandler
    public void preinit(FMLPreInitializationEvent event){
    	TabTutorial = new CreativeTabTutorial(CreativeTabs.getNextID(), "Cancer");
    	ModItems.preinit();
    		proxy.preinit(event);
    }
    @EventHandler
    public void init(FMLInitializationEvent event)
    {
           proxy.init(event);
    }
    @EventHandler
    public void postinit(FMLPostInitializationEvent event)
    {
     proxy.postinit(event);
    }
}
