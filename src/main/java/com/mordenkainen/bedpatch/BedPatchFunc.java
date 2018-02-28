package com.mordenkainen.bedpatch;

import java.util.ArrayList;
import java.util.List;

import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.ClassInheritanceMultiMap;
import net.minecraft.world.World;

public final class BedPatchFunc {
	
	private BedPatchFunc() {}
	
	public static void onChunkUnload(final World world, final ClassInheritanceMultiMap<Entity>[] entityLists) {
		final List<EntityPlayer> players = new ArrayList<EntityPlayer>();
        for (final ClassInheritanceMultiMap<Entity> classinheritancemultimap : entityLists) {
            for(final EntityPlayer player : classinheritancemultimap.getByClass(EntityPlayer.class)) {
                players.add(player);
            }
        }
        for (final EntityPlayer player : players) {
            world.updateEntityWithOptionalForce(player, false);
        }
    }
	
}
