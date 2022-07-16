package mrcreeps.mods.nightrealm.world;

import net.minecraftforge.fml.common.ObfuscationReflectionHelper;

import net.minecraft.world.GameRules;

import mrcreeps.mods.nightrealm.NightrealmModElements;

import java.lang.reflect.Method;

@NightrealmModElements.ModElement.Tag
public class BloodrainDebugGameRule extends NightrealmModElements.ModElement {
	public static final GameRules.RuleKey<GameRules.BooleanValue> gamerule = GameRules.register("bloodrainDebug", GameRules.Category.MISC,
			create(false));

	public BloodrainDebugGameRule(NightrealmModElements instance) {
		super(instance, 102);
	}

	public static GameRules.RuleType<GameRules.BooleanValue> create(boolean defaultValue) {
		try {
			Method createGameruleMethod = ObfuscationReflectionHelper.findMethod(GameRules.BooleanValue.class, "func_223568_b", boolean.class);
			createGameruleMethod.setAccessible(true);
			return (GameRules.RuleType<GameRules.BooleanValue>) createGameruleMethod.invoke(null, defaultValue);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
}
