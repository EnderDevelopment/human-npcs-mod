package com.markchristiannuhaygesolgon.humannpcsmod.spawner;

import com.markchristiannuhaygesolgon.humannpcsmod.entity.NPCEntity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.level.Level;

public class NPCSpawner {
    public static void spawnNPC(Level level, double x, double y, double z) {
        NPCEntity npc = new NPCEntity(EntityType.PLAYER, level);
        npc.setPos(x, y, z);
        level.addFreshEntity(npc);
    }
}