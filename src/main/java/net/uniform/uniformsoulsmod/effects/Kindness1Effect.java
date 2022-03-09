package net.uniform.uniformsoulsmod.effects;

import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectCategory;

public class Kindness1Effect extends StatusEffect {
    public Kindness1Effect() {
        super(
                StatusEffectCategory.BENEFICIAL, // whether beneficial or harmful for entities
                5177089); // color in RGB
    }

    // This method is called every tick to check whether it should apply the status effect or not
    @Override
    public boolean canApplyUpdateEffect(int duration, int amplifier) {
        // In our case, we just make it return true so that it applies the status effect every tick.
        return true;
    }

    @Override
    public void applyUpdateEffect(LivingEntity entity, int amplifier) {
        if (entity instanceof Entity) {
            entity.heal(0.05F);
        }
    }
}