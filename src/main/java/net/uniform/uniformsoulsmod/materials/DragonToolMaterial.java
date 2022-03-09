package net.uniform.uniformsoulsmod.materials;

import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;
import net.uniform.uniformsoulsmod.registry.ModItems;

public class DragonToolMaterial implements ToolMaterial {

    public static final DragonToolMaterial INSTANCE = new DragonToolMaterial();

    public int getDurability() {
        return 2501;
    }

    public float getMiningSpeedMultiplier() {
        return 10.0F;
    }

    public float getAttackDamage() {
        return 5.0F;
    }

    public int getMiningLevel() {
        return 5;
    }

    public int getEnchantability() {
        return 20;
    }

    public Ingredient getRepairIngredient() {
        return Ingredient.ofItems(ModItems.DRAGON_INGOT);
    }

}
