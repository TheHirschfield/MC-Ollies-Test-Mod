package bloodtake.testmod.proxy;

import bloodtake.testmod.init.TestBlocks;
import bloodtake.testmod.init.TestItems;
import net.minecraft.item.Item;

import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

public class ClientProxy extends CommonProxy{
	
	@Override
	public void preInit(FMLPreInitializationEvent event){
		super.preInit(event);
		TestItems.init();
		TestBlocks.init();
	}
	
	@Override
	public void init(FMLInitializationEvent event){
		super.init(event);		
		
		TestItems.registerRenders();
		TestBlocks.registerRenders();
		
	}
	
	@Override
	public void postInit(FMLPostInitializationEvent event){
		super.postInit(event);
	}
	
	
}
