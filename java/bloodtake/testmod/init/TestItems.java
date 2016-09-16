package bloodtake.testmod.init;

import bloodtake.testmod.main.Reference;
import bloodtake.testmod.main.TestMod;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class TestItems {
	
	public static Item first_item;
	
	public static void init(){
		first_item = registerItem(new Item(),"first_item").setUnlocalizedName("first_item").setCreativeTab(CreativeTabs.TOOLS);
	}
	
	public static void registerRenders(){
		
		registerRender(first_item);
	}
	
	public static void registerRender(Item item){
		
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(Reference.MODID + ":" + item.getUnlocalizedName().substring(5), "inventory"));
		
	}
	
	//Register Item Start
	public static Item registerItem(Item item,String name){
		
		return registerItem(item,name,null);
	}	
	public static Item registerItem(Item item, String name, CreativeTabs tab){
		
		GameRegistry.register(item, new ResourceLocation(Reference.MODID, name));
		return item;
	}
	//Register Item End
}
