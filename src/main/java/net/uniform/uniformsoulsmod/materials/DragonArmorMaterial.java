package net.uniform.uniformsoulsmod.materials;

import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.recipe.Ingredient;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;
import net.uniform.uniformsoulsmod.registry.ModItems;

public class DragonArmorMaterial implements ArmorMaterial {

    //Durability Head To Feet From Right To Left

    private static final int[] DURABILITY = {1533, 1615, 1656, 1451};
    private static final int[] PROTECTION = {6, 9, 11, 6};
    public static final DragonArmorMaterial INSTANCE = new DragonArmorMaterial();


    @Override
    public int getDurability(EquipmentSlot slot) {
        return DURABILITY[slot.getEntitySlotId()];
    }

    @Override
    public int getProtectionAmount(EquipmentSlot slot) {
        return PROTECTION[slot.getEntitySlotId()];
    }

    @Override
    public int getEnchantability() {
        return 20;
    }

    @Override
    public SoundEvent getEquipSound() {
        return SoundEvents.ITEM_ARMOR_EQUIP_NETHERITE;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return Ingredient.ofItems(ModItems.DRAGON_INGOT);
    }

    @Override
    public String getName() {
        return "dragon";
    }

    @Override
    public float getToughness() {
        return 6;
    }

    @Override
    public float getKnockbackResistance() {
        return 0.15F;
    }

}
