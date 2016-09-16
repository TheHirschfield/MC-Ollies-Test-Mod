package bloodtake.testmod.init.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class SapphireBlock  extends Block{

	public SapphireBlock() {
		super(Material.IRON);
		setRegistryName("sapphire_block");
		GameRegistry.register(this);
		GameRegistry.register(new ItemBlock(this), getRegistryName());
	
	}
}
