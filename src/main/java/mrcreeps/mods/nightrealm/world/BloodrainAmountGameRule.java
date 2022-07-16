package mrcreeps.mods.nightrealm.world;

import net.minecraftforge.fml.common.ObfuscationReflectionHelper;

import net.minecraft.world.GameRules;

import mrcreeps.mods.nightrealm.NightrealmModElements;

import java.lang.reflect.Method;

@NightrealmModElements.ModElement.Tag
public class BloodrainAmountGameRule extends NightrealmModElements.ModElement {
	public static final GameRules.RuleKey<GameRules.IntegerValue> gamerule = GameRules.register("bloodrainAmount", GameRules.Category.MISC,
			create(0));

	public BloodrainAmountGameRule(NightrealmModElements instance) {
		super(instance, 98);
	}

	public static GameRules.RuleType<GameRules.IntegerValue> create(int defaultValue) {
		try {
			Method createGameruleMethod = ObfuscationReflectionHelper.findMethod(GameRules.IntegerValue.class, "func_223559_b", int.class);
			createGameruleMethod.setAccessible(true);
			return (GameRules.RuleType<GameRules.IntegerValue>) createGameruleMethod.invoke(null, defaultValue);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
}
