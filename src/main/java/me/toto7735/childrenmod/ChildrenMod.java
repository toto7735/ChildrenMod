package me.toto7735.childrenmod;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ChildrenMod implements ModInitializer {

	public static String MOD_ID = "childrenmod";
	public static final Item LOLLIPOPS = new Item(new FabricItemSettings().group(ItemGroup.MISC));
	public static final Item CANDY_CANE = new Item(new FabricItemSettings().group(ItemGroup.MISC));
	public static final Item CHOCOLATE_BAR = new Item(new FabricItemSettings().group(ItemGroup.MISC));

	@Override
	public void onInitialize() {
		Registry.register(Registry.ITEM, new Identifier(MOD_ID, "lollipops"), LOLLIPOPS);
		Registry.register(Registry.ITEM, new Identifier(MOD_ID, "candy_cane"), CANDY_CANE);
		Registry.register(Registry.ITEM, new Identifier(MOD_ID, "chocolate_bar"), CHOCOLATE_BAR);
	}
}
