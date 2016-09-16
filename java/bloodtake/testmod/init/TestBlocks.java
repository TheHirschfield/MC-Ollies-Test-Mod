package bloodtake.testmod.init;

import bloodtake.testmod.init.blocks.RubyBlock;
import bloodtake.testmod.main.Reference;
import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class TestBlocks {
	
	
	public static RubyBlock ruby_block;
	
	public static void init(){
		
		ruby_block = new RubyBlock();
		ruby_block.setUnlocalizedName("ruby_block");
		ruby_block.setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
	}
	
	public static void registerRenders(){
		
		registerRender(ruby_block);
	}
	
	public static void registerRender(Block block){
		
		Item item = Item.getItemFromBlock(block);
		
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(Reference.MODID + ":" + item.getUnlocalizedName().substring(5), "inventory"));

	}
}
