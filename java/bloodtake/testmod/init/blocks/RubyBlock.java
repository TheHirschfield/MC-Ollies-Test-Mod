package bloodtake.testmod.init.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class RubyBlock extends Block{

	public RubyBlock() {
		super(Material.IRON);
		setRegistryName("ruby_block");
		setResistance(3F);
		setHardness(3F);
		setHarvestLevel("pickaxe", 2);
		GameRegistry.register(this);
		GameRegistry.register(new ItemBlock(this), getRegistryName());
	
	}
	
}
