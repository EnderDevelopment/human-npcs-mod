package com.markchristiannuhaygesolgon.humannpcsmod.registry;

import com.markchristiannuhaygesolgon.humannpcsmod.HumanNPCsMod;
import com.markchristiannuhaygesolgon.humannpcsmod.entity.NPCEntity;
import net.minecraft.core.Registry;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;

public class NPCRegistry {
    public static final EntityType<NPCEntity> NPC_ENTITY = Registry.register(
            Registry.ENTITY_TYPE,
            new ResourceLocation(HumanNPCsMod.MOD_ID, "npc_entity"),
            EntityType.Builder.of(NPCEntity::new, MobCategory.CREATURE)
                    .sized(0.6F, 1.8F)
                    .build("npc_entity")
    );

    public static void register() {
        // Registration is done via the static initializer
    }
}