package com.example;

import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ExampleMod implements ModInitializer {
	public static final Logger LOGGER = LoggerFactory.getLogger("mymod");
	public static final Item TEST_ITEM = new Item(new Item.Settings());

	@Override
	public void onInitialize() {
		Registry.register(Registries.ITEM, Identifier.of("mymod", "test_item"), TEST_ITEM);
		LOGGER.info("Test item registered!");
	}
}