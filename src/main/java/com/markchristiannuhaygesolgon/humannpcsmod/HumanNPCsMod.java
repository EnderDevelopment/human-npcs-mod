package com.markchristiannuhaygesolgon.humannpcsmod;

import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class HumanNPCsMod implements ModInitializer {
    public static final String MOD_ID = "humannpcsmod";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    @Override
    public void onInitialize() {
        NPCRegistry.register();
        LOGGER.info("HumanNPCsMod has been initialized!");
    }
}