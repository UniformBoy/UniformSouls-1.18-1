package net.uniform.uniformsoulsmod.registry;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.*;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.uniform.uniformsoulsmod.UniformSoulsMod;
import net.uniform.uniformsoulsmod.items.*;
import net.uniform.uniformsoulsmod.materials.DragonArmorMaterial;
import net.uniform.uniformsoulsmod.materials.DragonToolMaterial;

public class ModItems {

    //Items

    //Soul Items
    public static final Item JUSTICE_SOUL = new JusticeSoul(new FabricItemSettings().group(UniformSoulsMod.SOULS).maxCount(1).fireproof());

    public static final Item KINDNESS_SOUL = new KindnessSoul(new FabricItemSettings().group(UniformSoulsMod.SOULS).maxCount(1).fireproof());

    public static final Item PERSEVERANCE_SOUL = new PerseveranceSoul(new FabricItemSettings().group(UniformSoulsMod.SOULS).maxCount(1).fireproof());

    public static final Item BRAVERY_SOUL = new BraverySoul(new FabricItemSettings().group(UniformSoulsMod.SOULS).maxCount(1).fireproof());

    public static final Item PATIENCE_SOUL = new PatienceSoul(new FabricItemSettings().group(UniformSoulsMod.SOULS).maxCount(1).fireproof());

    public static final Item INTEGRITY_SOUL = new IntegritySoul(new FabricItemSettings().group(UniformSoulsMod.SOULS).maxCount(1).fireproof());

    public static final Item DETERMINATION_SOUL = new DeterminationSoul(new FabricItemSettings().group(UniformSoulsMod.SOULS).maxCount(1).fireproof());

    public static final Item HATE_SOUL = new HateSoul(new FabricItemSettings().group(UniformSoulsMod.SOULS).maxCount(1).fireproof());

    public static final Item CORRUPTION_SOUL = new CorruptionSoul(new FabricItemSettings().group(UniformSoulsMod.SOULS).maxCount(1).fireproof());

    public static final Item MONSTER_SOUL = new MonsterSoul(new FabricItemSettings().group(UniformSoulsMod.SOULS).maxCount(1).fireproof());

    public static final Item ASRIEL_SOUL = new AsrielSoul(new FabricItemSettings().group(UniformSoulsMod.SOULS).maxCount(1).fireproof());

    public static final Item DESPAIR_SOUL = new DespairSoul(new FabricItemSettings().group(UniformSoulsMod.SOULS).maxCount(1).fireproof());

    public static final Item FEAR_SOUL = new FearSoul(new FabricItemSettings().group(UniformSoulsMod.SOULS).maxCount(1).fireproof());

    public static final Item IMMORALITY_SOUL = new ImmoralitySoul(new FabricItemSettings().group(UniformSoulsMod.SOULS).maxCount(1).fireproof());

    public static final Item WRATH_SOUL = new WrathSoul(new FabricItemSettings().group(UniformSoulsMod.SOULS).maxCount(1).fireproof());

    public static final Item RECKLESSNESS_SOUL = new RecklessnessSoul(new FabricItemSettings().group(UniformSoulsMod.SOULS).maxCount(1).fireproof());

    public static final Item DECEIT_SOUL = new DeceitSoul(new FabricItemSettings().group(UniformSoulsMod.SOULS).maxCount(1).fireproof());

    public static final Item APATHY_SOUL = new ApathySoul(new FabricItemSettings().group(UniformSoulsMod.SOULS).maxCount(1).fireproof());

    public static final Item CORRUPTED_MONSTER_SOUL = new CorruptedMonsterSoul(new FabricItemSettings().group(UniformSoulsMod.SOULS).maxCount(1).fireproof());

    public static final Item EMPTY_SOUL_CONTAINER = new Item(new FabricItemSettings().group(UniformSoulsMod.SOULS).maxCount(1).fireproof());

    //Block Items
    public static final BlockItem CORRUPTION = new BlockItem(ModBlocks.CORRUPTION, new Item.Settings().group(UniformSoulsMod.BLOCKS).fireproof());

    public static final BlockItem CORRUPTION_APATHY = new BlockItem(ModBlocks.CORRUPTION_APATHY, new Item.Settings().group(UniformSoulsMod.BLOCKS).fireproof());

    public static final BlockItem CORRUPTION_DECEIT = new BlockItem(ModBlocks.CORRUPTION_DECEIT, new Item.Settings().group(UniformSoulsMod.BLOCKS).fireproof());

    public static final BlockItem CORRUPTION_DESPAIR = new BlockItem(ModBlocks.CORRUPTION_DESPAIR, new Item.Settings().group(UniformSoulsMod.BLOCKS).fireproof());

    public static final BlockItem CORRUPTION_FEAR = new BlockItem(ModBlocks.CORRUPTION_FEAR, new Item.Settings().group(UniformSoulsMod.BLOCKS).fireproof());

    public static final BlockItem CORRUPTION_IMMORALITY = new BlockItem(ModBlocks.CORRUPTION_IMMORALITY, new Item.Settings().group(UniformSoulsMod.BLOCKS).fireproof());

    public static final BlockItem CORRUPTION_RECKLESSNESS = new BlockItem(ModBlocks.CORRUPTION_RECKLESSNESS, new Item.Settings().group(UniformSoulsMod.BLOCKS).fireproof());

    public static final BlockItem CORRUPTION_WRATH = new BlockItem(ModBlocks.CORRUPTION_WRATH, new Item.Settings().group(UniformSoulsMod.BLOCKS).fireproof());

    public static final BlockItem CORRUPTION_CORE_1 = new BlockItem(ModBlocks.CORRUPTION_CORE_1, new Item.Settings().group(UniformSoulsMod.BLOCKS).fireproof());

    public static final BlockItem DRAGON_BLOCK = new BlockItem(ModBlocks.DRAGON_BLOCK, new Item.Settings().group(UniformSoulsMod.BLOCKS).fireproof());

    public static final BlockItem MARBLE_BRICKS = new BlockItem(ModBlocks.MARBLE_BRICKS, new Item.Settings().group(UniformSoulsMod.BLOCKS));

    public static final BlockItem MARBLE_BRICK_STAIRS = new BlockItem(ModBlocks.MARBLE_BRICK_STAIRS, new Item.Settings().group(UniformSoulsMod.BLOCKS));

    public static final BlockItem MARBLE_BRICK_SLAB = new BlockItem(ModBlocks.MARBLE_BRICK_SLAB, new Item.Settings().group(UniformSoulsMod.BLOCKS));

    //Materials
    public static final Item DRAGON_SCALE = new Item(new FabricItemSettings().group(UniformSoulsMod.MATERIALS));

    public static final Item DRAGON_INGOT = new Item(new FabricItemSettings().group(UniformSoulsMod.MATERIALS));


    //Armor
    public static final ArmorItem DRAGON_HELMET = new ArmorItem(DragonArmorMaterial.INSTANCE, EquipmentSlot.HEAD, new Item.Settings().group(UniformSoulsMod.ARMOR).fireproof());

    public static final ArmorItem DRAGON_CHESTPLATE = new ArmorItem(DragonArmorMaterial.INSTANCE, EquipmentSlot.CHEST, new Item.Settings().group(UniformSoulsMod.ARMOR).fireproof());

    public static final ArmorItem DRAGON_LEGGINGS = new ArmorItem(DragonArmorMaterial.INSTANCE, EquipmentSlot.LEGS, new Item.Settings().group(UniformSoulsMod.ARMOR).fireproof());

    public static final ArmorItem DRAGON_BOOTS = new ArmorItem(DragonArmorMaterial.INSTANCE, EquipmentSlot.FEET, new Item.Settings().group(UniformSoulsMod.ARMOR).fireproof());



    //Combat
    public static final ToolItem DRAGON_SWORD = new DragonSword(DragonToolMaterial.INSTANCE, 3, -2.4F, new Item.Settings().group(UniformSoulsMod.COMBAT).fireproof());


    //Tools
    public static final ToolItem DRAGON_PICKAXE = new DragonPickaxe(DragonToolMaterial.INSTANCE, 1, -2.8F, new Item.Settings().group(UniformSoulsMod.TOOLS).fireproof());

    public static final ToolItem DRAGON_AXE = new DragonAxe(DragonToolMaterial.INSTANCE, 5, -3.2F, new Item.Settings().group(UniformSoulsMod.TOOLS).fireproof());

    public static final ToolItem DRAGON_SHOVEL = new DragonShovel(DragonToolMaterial.INSTANCE, 1, -3.0F, new Item.Settings().group(UniformSoulsMod.TOOLS).fireproof());

    public static final ToolItem DRAGON_HOE = new DragonHoe(DragonToolMaterial.INSTANCE, -4, 0.0F, new Item.Settings().group(UniformSoulsMod.TOOLS).fireproof());



    public  static  void registerModItems() {

        //Items

        //Soul Items
        Registry.register(Registry.ITEM, new Identifier(UniformSoulsMod.MOD_ID, "justice_soul"), JUSTICE_SOUL);
        Registry.register(Registry.ITEM, new Identifier(UniformSoulsMod.MOD_ID, "kindness_soul"), KINDNESS_SOUL);
        Registry.register(Registry.ITEM, new Identifier(UniformSoulsMod.MOD_ID, "patience_soul"), PATIENCE_SOUL);
        Registry.register(Registry.ITEM, new Identifier(UniformSoulsMod.MOD_ID, "perseverance_soul"), PERSEVERANCE_SOUL);
        Registry.register(Registry.ITEM, new Identifier(UniformSoulsMod.MOD_ID, "bravery_soul"), BRAVERY_SOUL);
        Registry.register(Registry.ITEM, new Identifier(UniformSoulsMod.MOD_ID, "integrity_soul"), INTEGRITY_SOUL);
        Registry.register(Registry.ITEM, new Identifier(UniformSoulsMod.MOD_ID, "determination_soul"), DETERMINATION_SOUL);
        Registry.register(Registry.ITEM, new Identifier(UniformSoulsMod.MOD_ID, "hate_soul"), HATE_SOUL);
        Registry.register(Registry.ITEM, new Identifier(UniformSoulsMod.MOD_ID, "corruption_soul"), CORRUPTION_SOUL);
        Registry.register(Registry.ITEM, new Identifier(UniformSoulsMod.MOD_ID, "monster_soul"), MONSTER_SOUL);
        Registry.register(Registry.ITEM, new Identifier(UniformSoulsMod.MOD_ID, "asriel_soul"), ASRIEL_SOUL);
        Registry.register(Registry.ITEM, new Identifier(UniformSoulsMod.MOD_ID, "despair_soul"), DESPAIR_SOUL);
        Registry.register(Registry.ITEM, new Identifier(UniformSoulsMod.MOD_ID, "fear_soul"), FEAR_SOUL);
        Registry.register(Registry.ITEM, new Identifier(UniformSoulsMod.MOD_ID, "immorality_soul"), IMMORALITY_SOUL);
        Registry.register(Registry.ITEM, new Identifier(UniformSoulsMod.MOD_ID, "wrath_soul"), WRATH_SOUL);
        Registry.register(Registry.ITEM, new Identifier(UniformSoulsMod.MOD_ID, "recklessness_soul"), RECKLESSNESS_SOUL);
        Registry.register(Registry.ITEM, new Identifier(UniformSoulsMod.MOD_ID, "deceit_soul"), DECEIT_SOUL);
        Registry.register(Registry.ITEM, new Identifier(UniformSoulsMod.MOD_ID, "apathy_soul"), APATHY_SOUL);
        Registry.register(Registry.ITEM, new Identifier(UniformSoulsMod.MOD_ID, "corrupted_monster_soul"), CORRUPTED_MONSTER_SOUL);
        Registry.register(Registry.ITEM, new Identifier(UniformSoulsMod.MOD_ID, "empty_soul_container"), EMPTY_SOUL_CONTAINER);

        //Block Items
        Registry.register(Registry.ITEM, new Identifier(UniformSoulsMod.MOD_ID, "corruption"), CORRUPTION);
        Registry.register(Registry.ITEM, new Identifier(UniformSoulsMod.MOD_ID, "corruption_apathy"), CORRUPTION_APATHY);
        Registry.register(Registry.ITEM, new Identifier(UniformSoulsMod.MOD_ID, "corruption_deceit"), CORRUPTION_DECEIT);
        Registry.register(Registry.ITEM, new Identifier(UniformSoulsMod.MOD_ID, "corruption_despair"), CORRUPTION_DESPAIR);
        Registry.register(Registry.ITEM, new Identifier(UniformSoulsMod.MOD_ID, "corruption_fear"), CORRUPTION_FEAR);
        Registry.register(Registry.ITEM, new Identifier(UniformSoulsMod.MOD_ID, "corruption_immorality"), CORRUPTION_IMMORALITY);
        Registry.register(Registry.ITEM, new Identifier(UniformSoulsMod.MOD_ID, "corruption_recklessness"), CORRUPTION_RECKLESSNESS);
        Registry.register(Registry.ITEM, new Identifier(UniformSoulsMod.MOD_ID, "corruption_wrath"), CORRUPTION_WRATH);
        Registry.register(Registry.ITEM, new Identifier(UniformSoulsMod.MOD_ID, "corruption_core_1"), CORRUPTION_CORE_1);
        Registry.register(Registry.ITEM, new Identifier(UniformSoulsMod.MOD_ID, "dragon_block"), DRAGON_BLOCK);
        Registry.register(Registry.ITEM, new Identifier(UniformSoulsMod.MOD_ID, "marble_bricks"), MARBLE_BRICKS);
        Registry.register(Registry.ITEM, new Identifier(UniformSoulsMod.MOD_ID, "marble_brick_stairs"), MARBLE_BRICK_STAIRS);
        Registry.register(Registry.ITEM, new Identifier(UniformSoulsMod.MOD_ID, "marble_brick_slab"), MARBLE_BRICK_SLAB);

        //Materials
        Registry.register(Registry.ITEM, new Identifier(UniformSoulsMod.MOD_ID, "dragon_scale"), DRAGON_SCALE);
        Registry.register(Registry.ITEM, new Identifier(UniformSoulsMod.MOD_ID, "dragon_ingot"), DRAGON_INGOT);


        //Armor
        Registry.register(Registry.ITEM, new Identifier(UniformSoulsMod.MOD_ID, "dragon_helmet"), DRAGON_HELMET);
        Registry.register(Registry.ITEM, new Identifier(UniformSoulsMod.MOD_ID, "dragon_chestplate"), DRAGON_CHESTPLATE);
        Registry.register(Registry.ITEM, new Identifier(UniformSoulsMod.MOD_ID, "dragon_leggings"), DRAGON_LEGGINGS);
        Registry.register(Registry.ITEM, new Identifier(UniformSoulsMod.MOD_ID, "dragon_boots"), DRAGON_BOOTS);


        //Combat
        Registry.register(Registry.ITEM, new Identifier(UniformSoulsMod.MOD_ID, "dragon_sword"), DRAGON_SWORD);


        //Tools
        Registry.register(Registry.ITEM, new Identifier(UniformSoulsMod.MOD_ID, "dragon_pickaxe"), DRAGON_PICKAXE);
        Registry.register(Registry.ITEM, new Identifier(UniformSoulsMod.MOD_ID, "dragon_axe"), DRAGON_AXE);
        Registry.register(Registry.ITEM, new Identifier(UniformSoulsMod.MOD_ID, "dragon_shovel"), DRAGON_SHOVEL);
        Registry.register(Registry.ITEM, new Identifier(UniformSoulsMod.MOD_ID, "dragon_hoe"), DRAGON_HOE);



    }

}
