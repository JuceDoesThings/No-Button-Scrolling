package com.jucedoesthings.no_button_scrolling;

import org.quiltmc.loader.api.ModContainer;
import org.quiltmc.qsl.base.api.entrypoint.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class NoButtonScrolling implements ModInitializer {
	public static final String MOD_ID = "no_button_scrolling";
	public static final String MOD_NAME = "No Button Scrolling";
	public static final Logger LOGGER = LoggerFactory.getLogger("No Button Scrolling");

	@Override
	public void onInitialize(ModContainer mod) {
		LOGGER.info("Why hello there! " + NoButtonScrolling.MOD_NAME + " is removing your text scrolling!", mod.metadata().name());
	}
}
