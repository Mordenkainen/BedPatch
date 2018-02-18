package com.mordenkainen.bedpatch;

import java.util.ArrayList;
import java.util.List;

import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.ClassInheritanceMultiMap;
import net.minecraft.world.World;

public class BedPatchFunc {
    public static void onChunkUnload(World world, ClassInheritanceMultiMap<Entity>[] entityLists) {
        List<EntityPlayer> players = new ArrayList<EntityPlayer>();
        for (ClassInheritanceMultiMap<Entity> classinheritancemultimap : entityLists) {
            for(EntityPlayer player : classinheritancemultimap.getByClass(EntityPlayer.class)) {
                players.add(player);
            }
        }
        for (EntityPlayer player : players) {
            world.updateEntityWithOptionalForce(player, false);
        }
    }
}
