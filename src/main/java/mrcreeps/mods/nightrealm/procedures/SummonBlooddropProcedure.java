package mrcreeps.mods.nightrealm.procedures;

import net.minecraft.world.server.ServerWorld;
import net.minecraft.world.IWorld;
import net.minecraft.world.Difficulty;
import net.minecraft.potion.Effects;
import net.minecraft.potion.EffectInstance;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;

import mrcreeps.mods.nightrealm.world.BloodrainAmountGameRule;
import mrcreeps.mods.nightrealm.particle.BlooddropParticle;
import mrcreeps.mods.nightrealm.NightrealmMod;

import java.util.Map;

public class SummonBlooddropProcedure {

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				NightrealmMod.LOGGER.warn("Failed to load dependency world for procedure SummonBlooddrop!");
			return;
		}
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				NightrealmMod.LOGGER.warn("Failed to load dependency x for procedure SummonBlooddrop!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				NightrealmMod.LOGGER.warn("Failed to load dependency y for procedure SummonBlooddrop!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				NightrealmMod.LOGGER.warn("Failed to load dependency z for procedure SummonBlooddrop!");
			return;
		}
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				NightrealmMod.LOGGER.warn("Failed to load dependency entity for procedure SummonBlooddrop!");
			return;
		}
		IWorld world = (IWorld) dependencies.get("world");
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		Entity entity = (Entity) dependencies.get("entity");
		if (world.getWorldInfo().getGameRulesInstance().getInt(BloodrainAmountGameRule.gamerule) >= 0) {
			if (world instanceof ServerWorld) {
				((ServerWorld) world).spawnParticle(BlooddropParticle.particle, x, y, z, (int) 1600, 30, (y + 32), 30, 0);
			}
			if (world instanceof ServerWorld) {
				((ServerWorld) world).spawnParticle(BlooddropParticle.particle, x, y, z, (int) 2200, 30, (y + 16), 30, 0);
			}
			if (world instanceof ServerWorld) {
				((ServerWorld) world).spawnParticle(BlooddropParticle.particle, x, y, z, (int) 2600, 30, (y + 12), 30, 0);
			}
			if (world instanceof ServerWorld) {
				((ServerWorld) world).spawnParticle(BlooddropParticle.particle, x, y, z, (int) 3000, 30, (y + 8), 30, 0);
			}
		}
		if (world.getWorldInfo().getGameRulesInstance().getInt(BloodrainAmountGameRule.gamerule) >= 1) {
			if (world instanceof ServerWorld) {
				((ServerWorld) world).spawnParticle(BlooddropParticle.particle, x, y, z, (int) 800, 25, (y + 20), 25, 0);
			}
			if (world instanceof ServerWorld) {
				((ServerWorld) world).spawnParticle(BlooddropParticle.particle, x, y, z, (int) 800, 25, (y + 14), 25, 0);
			}
			if (world instanceof ServerWorld) {
				((ServerWorld) world).spawnParticle(BlooddropParticle.particle, x, y, z, (int) 800, 25, (y + 10), 25, 0);
			}
			if (world instanceof ServerWorld) {
				((ServerWorld) world).spawnParticle(BlooddropParticle.particle, x, y, z, (int) 800, 25, (y + 4), 25, 0);
			}
		}
		if (world.getWorldInfo().getGameRulesInstance().getInt(BloodrainAmountGameRule.gamerule) >= 2) {
			if (world instanceof ServerWorld) {
				((ServerWorld) world).spawnParticle(BlooddropParticle.particle, x, y, z, (int) 600, 20, (y + 22), 20, 0);
			}
			if (world instanceof ServerWorld) {
				((ServerWorld) world).spawnParticle(BlooddropParticle.particle, x, y, z, (int) 600, 20, (y + 18), 20, 0);
			}
			if (world instanceof ServerWorld) {
				((ServerWorld) world).spawnParticle(BlooddropParticle.particle, x, y, z, (int) 600, 20, (y + 9), 20, 0);
			}
			if (world instanceof ServerWorld) {
				((ServerWorld) world).spawnParticle(BlooddropParticle.particle, x, y, z, (int) 600, 20, (y + 6), 20, 0);
			}
		}
		if (world.getWorldInfo().getGameRulesInstance().getInt(BloodrainAmountGameRule.gamerule) >= 3) {
			if (world instanceof ServerWorld) {
				((ServerWorld) world).spawnParticle(BlooddropParticle.particle, x, y, z, (int) 300, 10, (y + 28), 10, 0);
			}
			if (world instanceof ServerWorld) {
				((ServerWorld) world).spawnParticle(BlooddropParticle.particle, x, y, z, (int) 300, 10, (y + 2), 10, 0);
			}
			if (world instanceof ServerWorld) {
				((ServerWorld) world).spawnParticle(BlooddropParticle.particle, x, y, z, (int) 300, 10, (y + 3), 10, 0);
			}
			if (world instanceof ServerWorld) {
				((ServerWorld) world).spawnParticle(BlooddropParticle.particle, x, y, z, (int) 300, 10, (y + 5), 10, 0);
			}
		}
		if (world.getDifficulty() == Difficulty.NORMAL) {
			if (entity instanceof LivingEntity)
				((LivingEntity) entity).addPotionEffect(new EffectInstance(Effects.WEAKNESS, (int) 60, (int) 0));
		}
		if (world.getDifficulty() == Difficulty.HARD) {
			if (entity instanceof LivingEntity)
				((LivingEntity) entity).addPotionEffect(new EffectInstance(Effects.WEAKNESS, (int) 60, (int) 0));
			if (entity instanceof LivingEntity)
				((LivingEntity) entity).addPotionEffect(new EffectInstance(Effects.BLINDNESS, (int) 60, (int) 0));
		}
	}
}
