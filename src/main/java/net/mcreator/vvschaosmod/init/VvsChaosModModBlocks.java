
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.vvschaosmod.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.level.block.Block;

import net.mcreator.vvschaosmod.block.VeinBlock;
import net.mcreator.vvschaosmod.block.MuscleBlock;
import net.mcreator.vvschaosmod.block.MeatBlockBlock;
import net.mcreator.vvschaosmod.VvsChaosModMod;

public class VvsChaosModModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, VvsChaosModMod.MODID);
	public static final RegistryObject<Block> MEAT_BLOCK = REGISTRY.register("meat_block", () -> new MeatBlockBlock());
	public static final RegistryObject<Block> VEIN = REGISTRY.register("vein", () -> new VeinBlock());
	public static final RegistryObject<Block> MUSCLE = REGISTRY.register("muscle", () -> new MuscleBlock());

	@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
	public static class ClientSideHandler {
		@SubscribeEvent
		public static void clientSetup(FMLClientSetupEvent event) {
			MeatBlockBlock.registerRenderLayer();
		}
	}
}
