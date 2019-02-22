package com.mjr.extraplanets.world.features;

import java.util.Random;

import com.mjr.extraplanets.Config;
import com.mjr.extraplanets.util.MessageUtilities;
import com.mjr.extraplanets.util.WorldGenHelper;

import micdoodle8.mods.galacticraft.core.blocks.GCBlocks;
import net.minecraft.init.Blocks;
import net.minecraft.tileentity.TileEntityChest;
import net.minecraft.util.WeightedRandomChestContent;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.WorldGenerator;
import net.minecraftforge.common.ChestGenHooks;

public class WorldGenIgloo extends WorldGenerator {

	@Override
	public boolean generate(World world, Random rand, int x, int y, int z) {
		if (WorldGenHelper.checkValidSpawn(world, x, y, z, 5) == false)
			return false;
		else {
			if (Config.debugMode)
				MessageUtilities.debugMessageToLog("Spawning Brown Hut at (x, y, z)" + x + " " + y + " " + z);

			if (rand.nextInt(50) != 50) {
				return generateBasic(world, rand, x, y, z);
			} else {
				return generateAdvanced(world, rand, x, y, z);
			}
		}
	}

	public boolean generateBasic(World world, Random rand, int x, int y, int z) {
		world.setBlock(x + 3, y + 0, z + 1, Blocks.snow, 0, 3);
		world.setBlock(x + 4, y + 0, z + 1, Blocks.snow, 0, 3);
		world.setBlock(x + 5, y + 0, z + 1, Blocks.snow, 0, 3);
		world.setBlock(x + 6, y + 0, z + 1, Blocks.snow, 0, 3);
		world.setBlock(x + 7, y + 0, z + 1, Blocks.snow, 0, 3);
		world.setBlock(x + 8, y + 0, z + 1, Blocks.snow, 0, 3);
		world.setBlock(x + 9, y + 0, z + 1, Blocks.snow, 0, 3);
		world.setBlock(x + 2, y + 0, z + 2, Blocks.snow, 0, 3);
		world.setBlock(x + 3, y + 0, z + 2, Blocks.snow, 0, 3);
		world.setBlock(x + 4, y + 0, z + 2, Blocks.snow, 0, 3);
		world.setBlock(x + 5, y + 0, z + 2, Blocks.snow, 0, 3);
		world.setBlock(x + 6, y + 0, z + 2, Blocks.snow, 0, 3);
		world.setBlock(x + 7, y + 0, z + 2, Blocks.snow, 0, 3);
		world.setBlock(x + 8, y + 0, z + 2, Blocks.snow, 0, 3);
		world.setBlock(x + 9, y + 0, z + 2, Blocks.snow, 0, 3);
		world.setBlock(x + 10, y + 0, z + 2, Blocks.snow, 0, 3);
		world.setBlock(x + 2, y + 0, z + 3, Blocks.snow, 0, 3);
		world.setBlock(x + 3, y + 0, z + 3, Blocks.snow, 0, 3);
		world.setBlock(x + 4, y + 0, z + 3, Blocks.snow, 0, 3);
		world.setBlock(x + 5, y + 0, z + 3, Blocks.snow, 0, 3);
		world.setBlock(x + 6, y + 0, z + 3, Blocks.snow, 0, 3);
		world.setBlock(x + 7, y + 0, z + 3, Blocks.snow, 0, 3);
		world.setBlock(x + 8, y + 0, z + 3, Blocks.snow, 0, 3);
		world.setBlock(x + 9, y + 0, z + 3, Blocks.snow, 0, 3);
		world.setBlock(x + 10, y + 0, z + 3, Blocks.snow, 0, 3);
		world.setBlock(x + 1, y + 0, z + 4, Blocks.snow, 0, 3);
		world.setBlock(x + 2, y + 0, z + 4, Blocks.snow, 1, 3);
		world.setBlock(x + 3, y + 0, z + 4, Blocks.snow, 0, 3);
		world.setBlock(x + 4, y + 0, z + 4, Blocks.snow, 0, 3);
		world.setBlock(x + 5, y + 0, z + 4, Blocks.snow, 0, 3);
		world.setBlock(x + 6, y + 0, z + 4, Blocks.snow, 0, 3);
		world.setBlock(x + 7, y + 0, z + 4, Blocks.snow, 0, 3);
		world.setBlock(x + 8, y + 0, z + 4, Blocks.snow, 0, 3);
		world.setBlock(x + 9, y + 0, z + 4, Blocks.snow, 0, 3);
		world.setBlock(x + 10, y + 0, z + 4, Blocks.snow, 1, 3);
		world.setBlock(x + 11, y + 0, z + 4, Blocks.snow, 0, 3);
		world.setBlock(x + 1, y + 0, z + 5, Blocks.snow, 0, 3);
		world.setBlock(x + 2, y + 0, z + 5, Blocks.snow, 1, 3);
		world.setBlock(x + 3, y + 0, z + 5, Blocks.snow, 0, 3);
		world.setBlock(x + 4, y + 0, z + 5, Blocks.snow, 0, 3);
		world.setBlock(x + 5, y + 0, z + 5, Blocks.snow, 0, 3);
		world.setBlock(x + 6, y + 0, z + 5, Blocks.snow, 0, 3);
		world.setBlock(x + 7, y + 0, z + 5, Blocks.snow, 0, 3);
		world.setBlock(x + 8, y + 0, z + 5, Blocks.snow, 0, 3);
		world.setBlock(x + 9, y + 0, z + 5, Blocks.snow, 0, 3);
		world.setBlock(x + 10, y + 0, z + 5, Blocks.snow, 1, 3);
		world.setBlock(x + 11, y + 0, z + 5, Blocks.snow, 0, 3);
		world.setBlock(x + 1, y + 0, z + 6, Blocks.snow, 0, 3);
		world.setBlock(x + 2, y + 0, z + 6, Blocks.snow, 1, 3);
		world.setBlock(x + 3, y + 0, z + 6, Blocks.snow, 0, 3);
		world.setBlock(x + 4, y + 0, z + 6, Blocks.snow, 0, 3);
		world.setBlock(x + 5, y + 0, z + 6, Blocks.snow, 0, 3);
		world.setBlock(x + 6, y + 0, z + 6, Blocks.snow, 0, 3);
		world.setBlock(x + 7, y + 0, z + 6, Blocks.snow, 0, 3);
		world.setBlock(x + 8, y + 0, z + 6, Blocks.snow, 0, 3);
		world.setBlock(x + 9, y + 0, z + 6, Blocks.snow, 0, 3);
		world.setBlock(x + 10, y + 0, z + 6, Blocks.snow, 1, 3);
		world.setBlock(x + 11, y + 0, z + 6, Blocks.snow, 0, 3);
		world.setBlock(x + 2, y + 0, z + 7, Blocks.snow, 1, 3);
		world.setBlock(x + 3, y + 0, z + 7, Blocks.snow, 0, 3);
		world.setBlock(x + 4, y + 0, z + 7, Blocks.snow, 0, 3);
		world.setBlock(x + 5, y + 0, z + 7, Blocks.snow, 0, 3);
		world.setBlock(x + 6, y + 0, z + 7, Blocks.snow, 0, 3);
		world.setBlock(x + 7, y + 0, z + 7, Blocks.snow, 0, 3);
		world.setBlock(x + 8, y + 0, z + 7, Blocks.snow, 0, 3);
		world.setBlock(x + 9, y + 0, z + 7, Blocks.snow, 0, 3);
		world.setBlock(x + 10, y + 0, z + 7, Blocks.snow, 0, 3);
		world.setBlock(x + 2, y + 0, z + 8, Blocks.snow, 0, 3);
		world.setBlock(x + 3, y + 0, z + 8, Blocks.snow, 0, 3);
		world.setBlock(x + 4, y + 0, z + 8, Blocks.snow, 0, 3);
		world.setBlock(x + 5, y + 0, z + 8, Blocks.snow, 0, 3);
		world.setBlock(x + 6, y + 0, z + 8, Blocks.snow, 0, 3);
		world.setBlock(x + 7, y + 0, z + 8, Blocks.snow, 0, 3);
		world.setBlock(x + 8, y + 0, z + 8, Blocks.snow, 0, 3);
		world.setBlock(x + 9, y + 0, z + 8, Blocks.snow, 0, 3);
		world.setBlock(x + 10, y + 0, z + 8, Blocks.snow, 0, 3);
		world.setBlock(x + 3, y + 0, z + 9, Blocks.snow, 0, 3);
		world.setBlock(x + 4, y + 0, z + 9, Blocks.snow, 0, 3);
		world.setBlock(x + 5, y + 0, z + 9, Blocks.snow, 1, 3);
		world.setBlock(x + 6, y + 0, z + 9, Blocks.snow, 1, 3);
		world.setBlock(x + 7, y + 0, z + 9, Blocks.snow, 1, 3);
		world.setBlock(x + 8, y + 0, z + 9, Blocks.snow, 0, 3);
		world.setBlock(x + 9, y + 0, z + 9, Blocks.snow, 0, 3);
		world.setBlock(x + 5, y + 0, z + 10, Blocks.snow, 0, 3);
		world.setBlock(x + 6, y + 0, z + 10, Blocks.snow, 0, 3);
		world.setBlock(x + 7, y + 0, z + 10, Blocks.snow, 0, 3);
		world.setBlock(x + 3, y + 1, z + 1, Blocks.snow, 0, 3);
		world.setBlock(x + 4, y + 1, z + 1, Blocks.snow, 0, 3);
		world.setBlock(x + 8, y + 1, z + 1, Blocks.snow, 0, 3);
		world.setBlock(x + 9, y + 1, z + 1, Blocks.snow, 0, 3);
		world.setBlock(x + 2, y + 1, z + 2, Blocks.snow, 0, 3);
		world.setBlock(x + 10, y + 1, z + 2, Blocks.snow, 0, 3);
		world.setBlock(x + 2, y + 1, z + 3, Blocks.snow, 0, 3);
		world.setBlock(x + 10, y + 1, z + 3, Blocks.snow, 0, 3);
		world.setBlock(x + 1, y + 1, z + 4, Blocks.snow, 0, 3);
		world.setBlock(x + 2, y + 1, z + 4, Blocks.snow, 0, 3);
		world.setBlock(x + 10, y + 1, z + 4, Blocks.snow, 0, 3);
		world.setBlock(x + 11, y + 1, z + 4, Blocks.snow, 0, 3);
		world.setBlock(x + 1, y + 1, z + 5, Blocks.snow, 0, 3);
		world.setBlock(x + 2, y + 1, z + 5, Blocks.snow, 0, 3);
		world.setBlock(x + 3, y + 1, z + 5, Blocks.bed, 9, 3);
		world.setBlock(x + 4, y + 1, z + 5, Blocks.bed, 1, 3);
		world.setBlock(x + 9, y + 1, z + 5, Blocks.chest, 4, 3);
		world.setBlock(x + 10, y + 1, z + 5, Blocks.snow, 0, 3);
		world.setBlock(x + 11, y + 1, z + 5, Blocks.snow, 0, 3);
		world.setBlock(x + 1, y + 1, z + 6, Blocks.snow, 0, 3);
		world.setBlock(x + 2, y + 1, z + 6, Blocks.snow, 0, 3);
		world.setBlock(x + 10, y + 1, z + 6, Blocks.snow, 0, 3);
		world.setBlock(x + 11, y + 1, z + 6, Blocks.snow, 0, 3);
		world.setBlock(x + 2, y + 1, z + 7, Blocks.snow, 0, 3);
		world.setBlock(x + 10, y + 1, z + 7, Blocks.snow, 0, 3);
		world.setBlock(x + 2, y + 1, z + 8, Blocks.snow, 0, 3);
		world.setBlock(x + 10, y + 1, z + 8, Blocks.snow, 0, 3);
		world.setBlock(x + 3, y + 1, z + 9, Blocks.snow, 0, 3);
		world.setBlock(x + 4, y + 1, z + 9, Blocks.snow, 0, 3);
		world.setBlock(x + 5, y + 1, z + 9, Blocks.snow, 0, 3);
		world.setBlock(x + 6, y + 1, z + 9, Blocks.snow, 0, 3);
		world.setBlock(x + 7, y + 1, z + 9, Blocks.snow, 0, 3);
		world.setBlock(x + 8, y + 1, z + 9, Blocks.snow, 0, 3);
		world.setBlock(x + 9, y + 1, z + 9, Blocks.snow, 0, 3);
		world.setBlock(x + 5, y + 1, z + 10, Blocks.snow, 0, 3);
		world.setBlock(x + 6, y + 1, z + 10, Blocks.snow, 0, 3);
		world.setBlock(x + 7, y + 1, z + 10, Blocks.snow, 0, 3);
		world.setBlock(x + 4, y + 2, z + 1, Blocks.snow, 0, 3);
		world.setBlock(x + 8, y + 2, z + 1, Blocks.snow, 0, 3);
		world.setBlock(x + 3, y + 2, z + 2, Blocks.snow, 0, 3);
		world.setBlock(x + 9, y + 2, z + 2, Blocks.snow, 0, 3);
		world.setBlock(x + 2, y + 2, z + 3, Blocks.snow, 0, 3);
		world.setBlock(x + 10, y + 2, z + 3, Blocks.snow, 0, 3);
		world.setBlock(x + 2, y + 2, z + 4, Blocks.snow, 0, 3);
		world.setBlock(x + 10, y + 2, z + 4, Blocks.snow, 0, 3);
		world.setBlock(x + 1, y + 2, z + 5, Blocks.snow, 0, 3);
		world.setBlock(x + 2, y + 2, z + 5, Blocks.snow, 0, 3);
		world.setBlock(x + 10, y + 2, z + 5, Blocks.snow, 0, 3);
		world.setBlock(x + 11, y + 2, z + 5, Blocks.snow, 0, 3);
		world.setBlock(x + 2, y + 2, z + 6, Blocks.snow, 0, 3);
		world.setBlock(x + 10, y + 2, z + 6, Blocks.snow, 0, 3);
		world.setBlock(x + 2, y + 2, z + 7, Blocks.snow, 0, 3);
		world.setBlock(x + 10, y + 2, z + 7, Blocks.snow, 0, 3);
		world.setBlock(x + 3, y + 2, z + 8, Blocks.snow, 0, 3);
		world.setBlock(x + 9, y + 2, z + 8, Blocks.snow, 0, 3);
		world.setBlock(x + 4, y + 2, z + 9, Blocks.snow, 0, 3);
		world.setBlock(x + 5, y + 2, z + 9, Blocks.snow, 0, 3);
		world.setBlock(x + 6, y + 2, z + 9, Blocks.snow, 0, 3);
		world.setBlock(x + 7, y + 2, z + 9, Blocks.snow, 0, 3);
		world.setBlock(x + 8, y + 2, z + 9, Blocks.snow, 0, 3);
		world.setBlock(x + 6, y + 2, z + 10, Blocks.snow, 0, 3);
		world.setBlock(x + 5, y + 3, z + 1, Blocks.snow, 0, 3);
		world.setBlock(x + 6, y + 3, z + 1, Blocks.snow, 0, 3);
		world.setBlock(x + 7, y + 3, z + 1, Blocks.snow, 0, 3);
		world.setBlock(x + 4, y + 3, z + 2, Blocks.snow, 0, 3);
		world.setBlock(x + 6, y + 3, z + 2, GCBlocks.glowstoneTorch, 3, 3);
		world.setBlock(x + 8, y + 3, z + 2, Blocks.snow, 0, 3);
		world.setBlock(x + 3, y + 3, z + 3, Blocks.snow, 0, 3);
		world.setBlock(x + 9, y + 3, z + 3, Blocks.snow, 0, 3);
		world.setBlock(x + 2, y + 3, z + 4, Blocks.snow, 0, 3);
		world.setBlock(x + 10, y + 3, z + 4, Blocks.snow, 0, 3);
		world.setBlock(x + 2, y + 3, z + 5, Blocks.snow, 0, 3);
		world.setBlock(x + 10, y + 3, z + 5, Blocks.snow, 0, 3);
		world.setBlock(x + 2, y + 3, z + 6, Blocks.snow, 0, 3);
		world.setBlock(x + 10, y + 3, z + 6, Blocks.snow, 0, 3);
		world.setBlock(x + 3, y + 3, z + 7, Blocks.snow, 0, 3);
		world.setBlock(x + 9, y + 3, z + 7, Blocks.snow, 0, 3);
		world.setBlock(x + 4, y + 3, z + 8, Blocks.snow, 0, 3);
		world.setBlock(x + 8, y + 3, z + 8, Blocks.snow, 0, 3);
		world.setBlock(x + 5, y + 3, z + 9, Blocks.snow, 0, 3);
		world.setBlock(x + 6, y + 3, z + 9, Blocks.snow, 0, 3);
		world.setBlock(x + 7, y + 3, z + 9, Blocks.snow, 0, 3);
		world.setBlock(x + 5, y + 4, z + 2, Blocks.snow, 0, 3);
		world.setBlock(x + 6, y + 4, z + 2, Blocks.snow, 0, 3);
		world.setBlock(x + 7, y + 4, z + 2, Blocks.snow, 0, 3);
		world.setBlock(x + 4, y + 4, z + 3, Blocks.snow, 0, 3);
		world.setBlock(x + 5, y + 4, z + 3, Blocks.snow, 0, 3);
		world.setBlock(x + 6, y + 4, z + 3, Blocks.snow, 0, 3);
		world.setBlock(x + 7, y + 4, z + 3, Blocks.snow, 0, 3);
		world.setBlock(x + 8, y + 4, z + 3, Blocks.snow, 0, 3);
		world.setBlock(x + 3, y + 4, z + 4, Blocks.snow, 0, 3);
		world.setBlock(x + 4, y + 4, z + 4, Blocks.snow, 0, 3);
		world.setBlock(x + 5, y + 4, z + 4, Blocks.snow, 0, 3);
		world.setBlock(x + 6, y + 4, z + 4, Blocks.snow, 0, 3);
		world.setBlock(x + 7, y + 4, z + 4, Blocks.snow, 0, 3);
		world.setBlock(x + 8, y + 4, z + 4, Blocks.snow, 0, 3);
		world.setBlock(x + 9, y + 4, z + 4, Blocks.snow, 0, 3);
		world.setBlock(x + 3, y + 4, z + 5, Blocks.snow, 0, 3);
		world.setBlock(x + 4, y + 4, z + 5, Blocks.snow, 0, 3);
		world.setBlock(x + 5, y + 4, z + 5, Blocks.snow, 0, 3);
		world.setBlock(x + 6, y + 4, z + 5, Blocks.snow, 0, 3);
		world.setBlock(x + 7, y + 4, z + 5, Blocks.snow, 0, 3);
		world.setBlock(x + 8, y + 4, z + 5, Blocks.snow, 0, 3);
		world.setBlock(x + 9, y + 4, z + 5, Blocks.snow, 0, 3);
		world.setBlock(x + 3, y + 4, z + 6, Blocks.snow, 0, 3);
		world.setBlock(x + 4, y + 4, z + 6, Blocks.snow, 0, 3);
		world.setBlock(x + 5, y + 4, z + 6, Blocks.snow, 0, 3);
		world.setBlock(x + 6, y + 4, z + 6, Blocks.snow, 0, 3);
		world.setBlock(x + 7, y + 4, z + 6, Blocks.snow, 0, 3);
		world.setBlock(x + 8, y + 4, z + 6, Blocks.snow, 0, 3);
		world.setBlock(x + 9, y + 4, z + 6, Blocks.snow, 0, 3);
		world.setBlock(x + 4, y + 4, z + 7, Blocks.snow, 0, 3);
		world.setBlock(x + 5, y + 4, z + 7, Blocks.snow, 0, 3);
		world.setBlock(x + 6, y + 4, z + 7, Blocks.snow, 0, 3);
		world.setBlock(x + 7, y + 4, z + 7, Blocks.snow, 0, 3);
		world.setBlock(x + 8, y + 4, z + 7, Blocks.snow, 0, 3);
		world.setBlock(x + 5, y + 4, z + 8, Blocks.snow, 0, 3);
		world.setBlock(x + 6, y + 4, z + 8, Blocks.snow, 0, 3);
		world.setBlock(x + 7, y + 4, z + 8, Blocks.snow, 0, 3);

		// Determined if loot should be generated using a 1/2 chance
		int random = rand.nextInt(10) + 1;
		if (random < 5) {
			TileEntityChest chest = (TileEntityChest) world.getTileEntity(x + 9, y + 1, z + 5);

			if (chest != null) {
				for (int i = 0; i < chest.getSizeInventory(); i++) {
					chest.setInventorySlotContents(i, null);
				}

				ChestGenHooks info = ChestGenHooks.getInfo(ChestGenHooks.DUNGEON_CHEST);

				// Determined how many times loot should be generated. Range: 1 - 2
				int lootTimes = rand.nextInt(2) + 1;
				for (int i = 0; i < lootTimes; i++) {
					WeightedRandomChestContent.generateChestContents(rand, info.getItems(rand), chest, info.getCount(rand));
				}
			}
		}
		return true;
	}

	public boolean generateAdvanced(World world, Random rand, int x, int y, int z) {
		world.setBlock(x + 2, y + 0, z + 5, Blocks.snow, 0, 3);
		world.setBlock(x + 3, y + 0, z + 5, Blocks.snow, 0, 3);
		world.setBlock(x + 4, y + 0, z + 5, Blocks.snow, 0, 3);
		world.setBlock(x + 5, y + 0, z + 5, Blocks.snow, 0, 3);
		world.setBlock(x + 6, y + 0, z + 5, Blocks.snow, 0, 3);
		world.setBlock(x + 7, y + 0, z + 5, Blocks.snow, 0, 3);
		world.setBlock(x + 8, y + 0, z + 5, Blocks.snow, 0, 3);
		world.setBlock(x + 2, y + 0, z + 6, Blocks.snow, 0, 3);
		world.setBlock(x + 3, y + 0, z + 6, Blocks.snow, 0, 3);
		world.setBlock(x + 4, y + 0, z + 6, Blocks.snow, 0, 3);
		world.setBlock(x + 5, y + 0, z + 6, Blocks.snow, 0, 3);
		world.setBlock(x + 6, y + 0, z + 6, Blocks.snow, 0, 3);
		world.setBlock(x + 7, y + 0, z + 6, Blocks.snow, 0, 3);
		world.setBlock(x + 8, y + 0, z + 6, Blocks.snow, 0, 3);
		world.setBlock(x + 2, y + 0, z + 7, Blocks.snow, 0, 3);
		world.setBlock(x + 3, y + 0, z + 7, Blocks.snow, 0, 3);
		world.setBlock(x + 4, y + 0, z + 7, Blocks.snow, 0, 3);
		world.setBlock(x + 5, y + 0, z + 7, Blocks.snow, 0, 3);
		world.setBlock(x + 6, y + 0, z + 7, Blocks.snow, 0, 3);
		world.setBlock(x + 7, y + 0, z + 7, Blocks.snow, 0, 3);
		world.setBlock(x + 8, y + 0, z + 7, Blocks.snow, 0, 3);
		world.setBlock(x + 6, y + 0, z + 8, Blocks.snow, 0, 3);
		world.setBlock(x + 7, y + 0, z + 8, Blocks.snow, 0, 3);
		world.setBlock(x + 8, y + 0, z + 8, Blocks.snow, 0, 3);
		world.setBlock(x + 6, y + 0, z + 9, Blocks.snow, 0, 3);
		world.setBlock(x + 7, y + 0, z + 9, Blocks.snow, 0, 3);
		world.setBlock(x + 8, y + 0, z + 9, Blocks.snow, 0, 3);
		world.setBlock(x + 2, y + 1, z + 5, Blocks.snow, 0, 3);
		world.setBlock(x + 3, y + 1, z + 5, Blocks.snow, 0, 3);
		world.setBlock(x + 4, y + 1, z + 5, Blocks.snow, 0, 3);
		world.setBlock(x + 5, y + 1, z + 5, Blocks.snow, 0, 3);
		world.setBlock(x + 6, y + 1, z + 5, Blocks.snow, 0, 3);
		world.setBlock(x + 7, y + 1, z + 5, Blocks.snow, 0, 3);
		world.setBlock(x + 8, y + 1, z + 5, Blocks.snow, 0, 3);
		world.setBlock(x + 2, y + 1, z + 6, Blocks.snow, 0, 3);
		world.setBlock(x + 3, y + 1, z + 6, GCBlocks.aluminumWire, 0, 3);
		world.setBlock(x + 4, y + 1, z + 6, GCBlocks.aluminumWire, 0, 3);
		world.setBlock(x + 5, y + 1, z + 6, GCBlocks.aluminumWire, 0, 3);
		world.setBlock(x + 6, y + 1, z + 6, GCBlocks.aluminumWire, 0, 3);
		world.setBlock(x + 7, y + 1, z + 6, GCBlocks.aluminumWire, 0, 3);
		world.setBlock(x + 8, y + 1, z + 6, Blocks.snow, 0, 3);
		world.setBlock(x + 2, y + 1, z + 7, Blocks.snow, 0, 3);
		world.setBlock(x + 3, y + 1, z + 7, Blocks.snow, 0, 3);
		world.setBlock(x + 4, y + 1, z + 7, Blocks.snow, 0, 3);
		world.setBlock(x + 5, y + 1, z + 7, Blocks.snow, 0, 3);
		world.setBlock(x + 6, y + 1, z + 7, Blocks.snow, 0, 3);
		world.setBlock(x + 7, y + 1, z + 7, GCBlocks.aluminumWire, 0, 3);
		world.setBlock(x + 8, y + 1, z + 7, Blocks.snow, 0, 3);
		world.setBlock(x + 6, y + 1, z + 8, Blocks.snow, 0, 3);
		world.setBlock(x + 7, y + 1, z + 8, GCBlocks.aluminumWire, 0, 3);
		world.setBlock(x + 8, y + 1, z + 8, Blocks.snow, 0, 3);
		world.setBlock(x + 6, y + 1, z + 9, Blocks.snow, 0, 3);
		world.setBlock(x + 7, y + 1, z + 9, Blocks.snow, 0, 3);
		world.setBlock(x + 8, y + 1, z + 9, Blocks.snow, 0, 3);
		world.setBlock(x + 3, y + 2, z + 1, Blocks.snow, 0, 3);
		world.setBlock(x + 4, y + 2, z + 1, Blocks.snow, 0, 3);
		world.setBlock(x + 5, y + 2, z + 1, Blocks.snow, 0, 3);
		world.setBlock(x + 6, y + 2, z + 1, Blocks.snow, 0, 3);
		world.setBlock(x + 7, y + 2, z + 1, Blocks.snow, 0, 3);
		world.setBlock(x + 8, y + 2, z + 1, Blocks.snow, 0, 3);
		world.setBlock(x + 9, y + 2, z + 1, Blocks.snow, 0, 3);
		world.setBlock(x + 2, y + 2, z + 2, Blocks.snow, 0, 3);
		world.setBlock(x + 3, y + 2, z + 2, Blocks.snow, 0, 3);
		world.setBlock(x + 4, y + 2, z + 2, Blocks.snow, 0, 3);
		world.setBlock(x + 5, y + 2, z + 2, Blocks.snow, 0, 3);
		world.setBlock(x + 6, y + 2, z + 2, Blocks.snow, 0, 3);
		world.setBlock(x + 7, y + 2, z + 2, Blocks.snow, 0, 3);
		world.setBlock(x + 8, y + 2, z + 2, Blocks.snow, 0, 3);
		world.setBlock(x + 9, y + 2, z + 2, Blocks.snow, 0, 3);
		world.setBlock(x + 10, y + 2, z + 2, Blocks.snow, 0, 3);
		world.setBlock(x + 2, y + 2, z + 3, Blocks.snow, 0, 3);
		world.setBlock(x + 3, y + 2, z + 3, Blocks.snow, 0, 3);
		world.setBlock(x + 4, y + 2, z + 3, Blocks.snow, 0, 3);
		world.setBlock(x + 5, y + 2, z + 3, Blocks.snow, 0, 3);
		world.setBlock(x + 6, y + 2, z + 3, Blocks.snow, 0, 3);
		world.setBlock(x + 7, y + 2, z + 3, Blocks.snow, 0, 3);
		world.setBlock(x + 8, y + 2, z + 3, Blocks.snow, 0, 3);
		world.setBlock(x + 9, y + 2, z + 3, Blocks.snow, 0, 3);
		world.setBlock(x + 10, y + 2, z + 3, Blocks.snow, 0, 3);
		world.setBlock(x + 1, y + 2, z + 4, Blocks.snow, 0, 3);
		world.setBlock(x + 2, y + 2, z + 4, Blocks.snow, 0, 3);
		world.setBlock(x + 3, y + 2, z + 4, Blocks.snow, 0, 3);
		world.setBlock(x + 4, y + 2, z + 4, Blocks.snow, 0, 3);
		world.setBlock(x + 5, y + 2, z + 4, Blocks.snow, 0, 3);
		world.setBlock(x + 6, y + 2, z + 4, Blocks.snow, 0, 3);
		world.setBlock(x + 7, y + 2, z + 4, Blocks.snow, 0, 3);
		world.setBlock(x + 8, y + 2, z + 4, Blocks.snow, 0, 3);
		world.setBlock(x + 9, y + 2, z + 4, Blocks.snow, 0, 3);
		world.setBlock(x + 10, y + 2, z + 4, Blocks.snow, 0, 3);
		world.setBlock(x + 11, y + 2, z + 4, Blocks.snow, 0, 3);
		world.setBlock(x + 1, y + 2, z + 5, Blocks.snow, 0, 3);
		world.setBlock(x + 2, y + 2, z + 5, Blocks.snow, 0, 3);
		world.setBlock(x + 3, y + 2, z + 5, Blocks.snow, 0, 3);
		world.setBlock(x + 4, y + 2, z + 5, Blocks.snow, 0, 3);
		world.setBlock(x + 5, y + 2, z + 5, Blocks.snow, 0, 3);
		world.setBlock(x + 6, y + 2, z + 5, Blocks.snow, 0, 3);
		world.setBlock(x + 7, y + 2, z + 5, Blocks.snow, 0, 3);
		world.setBlock(x + 8, y + 2, z + 5, Blocks.snow, 0, 3);
		world.setBlock(x + 9, y + 2, z + 5, Blocks.snow, 0, 3);
		world.setBlock(x + 10, y + 2, z + 5, Blocks.snow, 0, 3);
		world.setBlock(x + 11, y + 2, z + 5, Blocks.snow, 0, 3);
		world.setBlock(x + 1, y + 2, z + 6, Blocks.snow, 0, 3);
		world.setBlock(x + 2, y + 2, z + 6, Blocks.snow, 0, 3);
		world.setBlock(x + 3, y + 2, z + 6, GCBlocks.aluminumWire, 0, 3);
		world.setBlock(x + 4, y + 2, z + 6, Blocks.snow, 0, 3);
		world.setBlock(x + 5, y + 2, z + 6, Blocks.snow, 0, 3);
		world.setBlock(x + 6, y + 2, z + 6, Blocks.snow, 0, 3);
		world.setBlock(x + 7, y + 2, z + 6, Blocks.snow, 0, 3);
		world.setBlock(x + 8, y + 2, z + 6, Blocks.snow, 0, 3);
		world.setBlock(x + 9, y + 2, z + 6, Blocks.snow, 0, 3);
		world.setBlock(x + 10, y + 2, z + 6, Blocks.snow, 0, 3);
		world.setBlock(x + 11, y + 2, z + 6, Blocks.snow, 0, 3);
		world.setBlock(x + 2, y + 2, z + 7, Blocks.snow, 0, 3);
		world.setBlock(x + 3, y + 2, z + 7, Blocks.snow, 0, 3);
		world.setBlock(x + 4, y + 2, z + 7, Blocks.snow, 0, 3);
		world.setBlock(x + 5, y + 2, z + 7, Blocks.snow, 0, 3);
		world.setBlock(x + 6, y + 2, z + 7, Blocks.snow, 0, 3);
		world.setBlock(x + 7, y + 2, z + 7, Blocks.snow, 0, 3);
		world.setBlock(x + 8, y + 2, z + 7, Blocks.snow, 0, 3);
		world.setBlock(x + 9, y + 2, z + 7, Blocks.snow, 0, 3);
		world.setBlock(x + 10, y + 2, z + 7, Blocks.snow, 0, 3);
		world.setBlock(x + 2, y + 2, z + 8, Blocks.snow, 0, 3);
		world.setBlock(x + 3, y + 2, z + 8, Blocks.snow, 0, 3);
		world.setBlock(x + 4, y + 2, z + 8, Blocks.snow, 0, 3);
		world.setBlock(x + 5, y + 2, z + 8, Blocks.snow, 0, 3);
		world.setBlock(x + 6, y + 2, z + 8, Blocks.snow, 0, 3);
		world.setBlock(x + 7, y + 2, z + 8, GCBlocks.aluminumWire, 0, 3);
		world.setBlock(x + 8, y + 2, z + 8, Blocks.snow, 0, 3);
		world.setBlock(x + 9, y + 2, z + 8, Blocks.snow, 0, 3);
		world.setBlock(x + 10, y + 2, z + 8, Blocks.snow, 0, 3);
		world.setBlock(x + 3, y + 2, z + 9, Blocks.snow, 0, 3);
		world.setBlock(x + 4, y + 2, z + 9, Blocks.snow, 0, 3);
		world.setBlock(x + 5, y + 2, z + 9, Blocks.snow, 0, 3);
		world.setBlock(x + 6, y + 2, z + 9, Blocks.snow, 0, 3);
		world.setBlock(x + 7, y + 2, z + 9, Blocks.snow, 0, 3);
		world.setBlock(x + 8, y + 2, z + 9, Blocks.snow, 0, 3);
		world.setBlock(x + 9, y + 2, z + 9, Blocks.snow, 0, 3);
		world.setBlock(x + 5, y + 2, z + 10, Blocks.snow, 0, 3);
		world.setBlock(x + 6, y + 2, z + 10, Blocks.snow, 0, 3);
		world.setBlock(x + 7, y + 2, z + 10, Blocks.snow, 0, 3);
		world.setBlock(x + 3, y + 3, z + 1, Blocks.snow, 0, 3);
		world.setBlock(x + 4, y + 3, z + 1, Blocks.snow, 0, 3);
		world.setBlock(x + 8, y + 3, z + 1, Blocks.snow, 0, 3);
		world.setBlock(x + 9, y + 3, z + 1, Blocks.snow, 0, 3);
		world.setBlock(x + 2, y + 3, z + 2, Blocks.snow, 0, 3);
		world.setBlock(x + 10, y + 3, z + 2, Blocks.snow, 0, 3);
		world.setBlock(x + 2, y + 3, z + 3, Blocks.snow, 0, 3);
		world.setBlock(x + 10, y + 3, z + 3, Blocks.snow, 0, 3);
		world.setBlock(x + 1, y + 3, z + 4, Blocks.snow, 0, 3);
		world.setBlock(x + 2, y + 3, z + 4, Blocks.snow, 0, 3);
		world.setBlock(x + 10, y + 3, z + 4, Blocks.snow, 0, 3);
		world.setBlock(x + 11, y + 3, z + 4, Blocks.snow, 0, 3);
		world.setBlock(x + 1, y + 3, z + 5, Blocks.snow, 0, 3);
		world.setBlock(x + 2, y + 3, z + 5, Blocks.snow, 0, 3);
		world.setBlock(x + 3, y + 3, z + 5, GCBlocks.machineBase, 1, 3);
		world.setBlock(x + 9, y + 3, z + 5, Blocks.chest, 4, 3);
		world.setBlock(x + 10, y + 3, z + 5, Blocks.snow, 0, 3);
		world.setBlock(x + 11, y + 3, z + 5, Blocks.snow, 0, 3);
		world.setBlock(x + 1, y + 3, z + 6, Blocks.snow, 0, 3);
		world.setBlock(x + 2, y + 3, z + 6, Blocks.snow, 0, 3);
		world.setBlock(x + 3, y + 3, z + 6, GCBlocks.aluminumWire, 0, 3);
		world.setBlock(x + 10, y + 3, z + 6, Blocks.snow, 0, 3);
		world.setBlock(x + 11, y + 3, z + 6, Blocks.snow, 0, 3);
		world.setBlock(x + 2, y + 3, z + 7, Blocks.snow, 0, 3);
		world.setBlock(x + 10, y + 3, z + 7, Blocks.snow, 0, 3);
		world.setBlock(x + 2, y + 3, z + 8, Blocks.snow, 0, 3);
		world.setBlock(x + 6, y + 3, z + 8, GCBlocks.oxygenDistributor, 3, 3);
		world.setBlock(x + 7, y + 3, z + 8, GCBlocks.aluminumWire, 0, 3);
		world.setBlock(x + 10, y + 3, z + 8, Blocks.snow, 0, 3);
		world.setBlock(x + 3, y + 3, z + 9, Blocks.snow, 0, 3);
		world.setBlock(x + 4, y + 3, z + 9, Blocks.snow, 0, 3);
		world.setBlock(x + 5, y + 3, z + 9, Blocks.snow, 0, 3);
		world.setBlock(x + 6, y + 3, z + 9, Blocks.snow, 0, 3);
		world.setBlock(x + 7, y + 3, z + 9, Blocks.snow, 0, 3);
		world.setBlock(x + 8, y + 3, z + 9, Blocks.snow, 0, 3);
		world.setBlock(x + 9, y + 3, z + 9, Blocks.snow, 0, 3);
		world.setBlock(x + 5, y + 3, z + 10, Blocks.snow, 0, 3);
		world.setBlock(x + 6, y + 3, z + 10, Blocks.snow, 0, 3);
		world.setBlock(x + 7, y + 3, z + 10, Blocks.snow, 0, 3);
		world.setBlock(x + 4, y + 4, z + 1, Blocks.snow, 0, 3);
		world.setBlock(x + 8, y + 4, z + 1, Blocks.snow, 0, 3);
		world.setBlock(x + 3, y + 4, z + 2, Blocks.snow, 0, 3);
		world.setBlock(x + 9, y + 4, z + 2, Blocks.snow, 0, 3);
		world.setBlock(x + 2, y + 4, z + 3, Blocks.snow, 0, 3);
		world.setBlock(x + 10, y + 4, z + 3, Blocks.snow, 0, 3);
		world.setBlock(x + 2, y + 4, z + 4, Blocks.snow, 0, 3);
		world.setBlock(x + 10, y + 4, z + 4, Blocks.snow, 0, 3);
		world.setBlock(x + 1, y + 4, z + 5, Blocks.snow, 0, 3);
		world.setBlock(x + 2, y + 4, z + 5, Blocks.snow, 0, 3);
		world.setBlock(x + 10, y + 4, z + 5, Blocks.snow, 0, 3);
		world.setBlock(x + 11, y + 4, z + 5, Blocks.snow, 0, 3);
		world.setBlock(x + 2, y + 4, z + 6, Blocks.snow, 0, 3);
		world.setBlock(x + 10, y + 4, z + 6, Blocks.snow, 0, 3);
		world.setBlock(x + 2, y + 4, z + 7, Blocks.snow, 0, 3);
		world.setBlock(x + 10, y + 4, z + 7, Blocks.snow, 0, 3);
		world.setBlock(x + 3, y + 4, z + 8, Blocks.snow, 0, 3);
		world.setBlock(x + 9, y + 4, z + 8, Blocks.snow, 0, 3);
		world.setBlock(x + 4, y + 4, z + 9, Blocks.snow, 0, 3);
		world.setBlock(x + 5, y + 4, z + 9, Blocks.snow, 0, 3);
		world.setBlock(x + 6, y + 4, z + 9, Blocks.snow, 0, 3);
		world.setBlock(x + 7, y + 4, z + 9, Blocks.snow, 0, 3);
		world.setBlock(x + 8, y + 4, z + 9, Blocks.snow, 0, 3);
		world.setBlock(x + 6, y + 4, z + 10, Blocks.snow, 0, 3);
		world.setBlock(x + 5, y + 5, z + 1, Blocks.snow, 0, 3);
		world.setBlock(x + 6, y + 5, z + 1, Blocks.snow, 0, 3);
		world.setBlock(x + 7, y + 5, z + 1, Blocks.snow, 0, 3);
		world.setBlock(x + 4, y + 5, z + 2, Blocks.snow, 0, 3);
		world.setBlock(x + 6, y + 5, z + 2, GCBlocks.glowstoneTorch, 3, 3);
		world.setBlock(x + 8, y + 5, z + 2, Blocks.snow, 0, 3);
		world.setBlock(x + 3, y + 5, z + 3, Blocks.snow, 0, 3);
		world.setBlock(x + 9, y + 5, z + 3, Blocks.snow, 0, 3);
		world.setBlock(x + 2, y + 5, z + 4, Blocks.snow, 0, 3);
		world.setBlock(x + 10, y + 5, z + 4, Blocks.snow, 0, 3);
		world.setBlock(x + 2, y + 5, z + 5, Blocks.snow, 0, 3);
		world.setBlock(x + 10, y + 5, z + 5, Blocks.snow, 0, 3);
		world.setBlock(x + 2, y + 5, z + 6, Blocks.snow, 0, 3);
		world.setBlock(x + 10, y + 5, z + 6, Blocks.snow, 0, 3);
		world.setBlock(x + 3, y + 5, z + 7, Blocks.snow, 0, 3);
		world.setBlock(x + 9, y + 5, z + 7, Blocks.snow, 0, 3);
		world.setBlock(x + 4, y + 5, z + 8, Blocks.snow, 0, 3);
		world.setBlock(x + 8, y + 5, z + 8, Blocks.snow, 0, 3);
		world.setBlock(x + 5, y + 5, z + 9, Blocks.snow, 0, 3);
		world.setBlock(x + 6, y + 5, z + 9, Blocks.snow, 0, 3);
		world.setBlock(x + 7, y + 5, z + 9, Blocks.snow, 0, 3);
		world.setBlock(x + 5, y + 6, z + 2, Blocks.snow, 0, 3);
		world.setBlock(x + 6, y + 6, z + 2, Blocks.snow, 0, 3);
		world.setBlock(x + 7, y + 6, z + 2, Blocks.snow, 0, 3);
		world.setBlock(x + 4, y + 6, z + 3, Blocks.snow, 0, 3);
		world.setBlock(x + 5, y + 6, z + 3, Blocks.snow, 0, 3);
		world.setBlock(x + 6, y + 6, z + 3, Blocks.snow, 0, 3);
		world.setBlock(x + 7, y + 6, z + 3, Blocks.snow, 0, 3);
		world.setBlock(x + 8, y + 6, z + 3, Blocks.snow, 0, 3);
		world.setBlock(x + 3, y + 6, z + 4, Blocks.snow, 0, 3);
		world.setBlock(x + 4, y + 6, z + 4, Blocks.snow, 0, 3);
		world.setBlock(x + 5, y + 6, z + 4, Blocks.snow, 0, 3);
		world.setBlock(x + 6, y + 6, z + 4, Blocks.snow, 0, 3);
		world.setBlock(x + 7, y + 6, z + 4, Blocks.snow, 0, 3);
		world.setBlock(x + 8, y + 6, z + 4, Blocks.snow, 0, 3);
		world.setBlock(x + 9, y + 6, z + 4, Blocks.snow, 0, 3);
		world.setBlock(x + 3, y + 6, z + 5, Blocks.snow, 0, 3);
		world.setBlock(x + 4, y + 6, z + 5, Blocks.snow, 0, 3);
		world.setBlock(x + 5, y + 6, z + 5, Blocks.snow, 0, 3);
		world.setBlock(x + 6, y + 6, z + 5, Blocks.snow, 0, 3);
		world.setBlock(x + 7, y + 6, z + 5, Blocks.snow, 0, 3);
		world.setBlock(x + 8, y + 6, z + 5, Blocks.snow, 0, 3);
		world.setBlock(x + 9, y + 6, z + 5, Blocks.snow, 0, 3);
		world.setBlock(x + 3, y + 6, z + 6, Blocks.snow, 0, 3);
		world.setBlock(x + 4, y + 6, z + 6, Blocks.snow, 0, 3);
		world.setBlock(x + 5, y + 6, z + 6, Blocks.snow, 0, 3);
		world.setBlock(x + 6, y + 6, z + 6, Blocks.snow, 0, 3);
		world.setBlock(x + 7, y + 6, z + 6, Blocks.snow, 0, 3);
		world.setBlock(x + 8, y + 6, z + 6, Blocks.snow, 0, 3);
		world.setBlock(x + 9, y + 6, z + 6, Blocks.snow, 0, 3);
		world.setBlock(x + 4, y + 6, z + 7, Blocks.snow, 0, 3);
		world.setBlock(x + 5, y + 6, z + 7, Blocks.snow, 0, 3);
		world.setBlock(x + 6, y + 6, z + 7, Blocks.snow, 0, 3);
		world.setBlock(x + 7, y + 6, z + 7, Blocks.snow, 0, 3);
		world.setBlock(x + 8, y + 6, z + 7, Blocks.snow, 0, 3);
		world.setBlock(x + 5, y + 6, z + 8, Blocks.snow, 0, 3);
		world.setBlock(x + 6, y + 6, z + 8, Blocks.snow, 0, 3);
		world.setBlock(x + 7, y + 6, z + 8, Blocks.snow, 0, 3);

		// Determined if loot should be generated using a 1/2 chance
		int random = rand.nextInt(10) + 1;
		if (random < 5) {
			TileEntityChest chest = (TileEntityChest) world.getTileEntity(x + 9, y + 3, z + 5);

			if (chest != null) {
				for (int i = 0; i < chest.getSizeInventory(); i++) {
					chest.setInventorySlotContents(i, null);
				}

				ChestGenHooks info = ChestGenHooks.getInfo(ChestGenHooks.DUNGEON_CHEST);

				// Determined how many times loot should be generated. Range: 1 - 4
				int lootTimes = rand.nextInt(4) + 1;
				for (int i = 0; i < lootTimes; i++) {
					WeightedRandomChestContent.generateChestContents(rand, info.getItems(rand), chest, info.getCount(rand));
				}
			}
		}
		return true;
	}
}