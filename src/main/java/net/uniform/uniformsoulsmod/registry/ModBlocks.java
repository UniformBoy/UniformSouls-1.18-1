package net.uniform.uniformsoulsmod.registry;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.fabricmc.fabric.api.tool.attribute.v1.FabricToolTags;
import net.minecraft.block.*;
import net.minecraft.entity.EntityType;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.registry.Registry;
import net.minecraft.world.BlockView;
import net.uniform.uniformsoulsmod.UniformSoulsMod;
import net.uniform.uniformsoulsmod.blocks.*;

public class ModBlocks {

    public static Boolean never(BlockState state, BlockView world, BlockPos pos, EntityType<?> type) {
    return false;
}

    public static Boolean always(BlockState state, BlockView world, BlockPos pos, EntityType<?> type) {
        return true;
    }

    public static boolean always(BlockState state, BlockView world, BlockPos pos) {
        return true;
    }

    public static boolean never(BlockState state, BlockView world, BlockPos pos) {
        return false;
    }

    public static final Block CORRUPTION = new CorruptionBlock(FabricBlockSettings
            .of(Material.STONE)
            .breakByTool(FabricToolTags.PICKAXES, 3)
            .requiresTool()
            .ticksRandomly()
            .strength(55.0F, 6000.0F)
            .sounds(BlockSoundGroup.WART_BLOCK)
            .luminance(10)) {

    };

    public static final Block CORRUPTION_APATHY = new CorruptionApathyBlock(FabricBlockSettings
            .of(Material.STONE)
            .breakByTool(FabricToolTags.PICKAXES, 3)
            .requiresTool()
            .ticksRandomly()
            .strength(55.0F, 6000.0F)
            .sounds(BlockSoundGroup.WART_BLOCK)
            .luminance(10)) {

    };

    public static final Block CORRUPTION_DECEIT = new CorruptionDeceitBlock(FabricBlockSettings
            .of(Material.STONE)
            .breakByTool(FabricToolTags.PICKAXES, 3)
            .requiresTool()
            .ticksRandomly()
            .strength(55.0F, 6000.0F)
            .sounds(BlockSoundGroup.WART_BLOCK)
            .luminance(10)) {

    };

    public static final Block CORRUPTION_DESPAIR = new CorruptionDespairBlock(FabricBlockSettings
            .of(Material.STONE)
            .breakByTool(FabricToolTags.PICKAXES, 3)
            .requiresTool()
            .ticksRandomly()
            .strength(55.0F, 6000.0F)
            .sounds(BlockSoundGroup.WART_BLOCK)
            .luminance(10)) {

    };

    public static final Block CORRUPTION_FEAR = new CorruptionFearBlock(FabricBlockSettings
            .of(Material.STONE)
            .breakByTool(FabricToolTags.PICKAXES, 3)
            .requiresTool()
            .ticksRandomly()
            .strength(55.0F, 6000.0F)
            .sounds(BlockSoundGroup.WART_BLOCK)
            .luminance(10)) {

    };

    public static final Block CORRUPTION_IMMORALITY = new CorruptionImmoralityBlock(FabricBlockSettings
            .of(Material.STONE)
            .breakByTool(FabricToolTags.PICKAXES, 3)
            .requiresTool()
            .ticksRandomly()
            .strength(55.0F, 6000.0F)
            .sounds(BlockSoundGroup.WART_BLOCK)
            .luminance(10)) {

    };

    public static final Block CORRUPTION_RECKLESSNESS = new CorruptionRecklessnessBlock(FabricBlockSettings
            .of(Material.STONE)
            .breakByTool(FabricToolTags.PICKAXES, 3)
            .requiresTool()
            .ticksRandomly()
            .strength(55.0F, 6000.0F)
            .sounds(BlockSoundGroup.WART_BLOCK)
            .luminance(10)) {

    };

    public static final Block CORRUPTION_WRATH = new CorruptionWrathBlock(FabricBlockSettings
            .of(Material.STONE)
            .breakByTool(FabricToolTags.PICKAXES, 3)
            .requiresTool()
            .ticksRandomly()
            .strength(55.0F, 6000.0F)
            .sounds(BlockSoundGroup.WART_BLOCK)
            .luminance(10)) {

    };

    public static final Block CORRUPTION_CORE_1 = new CorruptionCore1Block(FabricBlockSettings
            .of(Material.STONE)
            .breakByTool(FabricToolTags.PICKAXES, 3)
            .requiresTool()
            .ticksRandomly()
            .strength(999999.0F, 8000.0F)
            .sounds(BlockSoundGroup.WART_BLOCK)
            .luminance(15)) {

    };

    public static final Block DRAGON_BLOCK = new Block(FabricBlockSettings
            .of(Material.STONE)
            .breakByTool(FabricToolTags.PICKAXES, 4)
            .requiresTool()
            .strength(60.0F, 1500.0F)
            .sounds(BlockSoundGroup.NETHERITE)) {

    };

    public static final Block MARBLE_BRICKS = new Block(FabricBlockSettings
            .of(Material.STONE)
            .breakByTool(FabricToolTags.PICKAXES, 1)
            .requiresTool()
            .strength(1.5F, 6.0F)
            .sounds(BlockSoundGroup.STONE)) {

    };

    public static final Block MARBLE_BRICK_SLAB = new UniSlabBlock(FabricBlockSettings
            .of(Material.STONE)
            .breakByTool(FabricToolTags.PICKAXES, 1)
            .requiresTool()
            .strength(1.5F, 6.0F)
            .sounds(BlockSoundGroup.STONE)) {

    };

    public static final Block MARBLE_BRICK_STAIRS = new UniStairsBlock(MARBLE_BRICKS
            .getDefaultState(), FabricBlockSettings.copy(MARBLE_BRICKS));


    public static void registerModBlocks() {
        Registry.register(Registry.BLOCK, new Identifier(UniformSoulsMod.MOD_ID, "corruption"), CORRUPTION);
        Registry.register(Registry.BLOCK, new Identifier(UniformSoulsMod.MOD_ID, "corruption_apathy"), CORRUPTION_APATHY);
        Registry.register(Registry.BLOCK, new Identifier(UniformSoulsMod.MOD_ID, "corruption_deceit"), CORRUPTION_DECEIT);
        Registry.register(Registry.BLOCK, new Identifier(UniformSoulsMod.MOD_ID, "corruption_despair"), CORRUPTION_DESPAIR);
        Registry.register(Registry.BLOCK, new Identifier(UniformSoulsMod.MOD_ID, "corruption_fear"), CORRUPTION_FEAR);
        Registry.register(Registry.BLOCK, new Identifier(UniformSoulsMod.MOD_ID, "corruption_immorality"), CORRUPTION_IMMORALITY);
        Registry.register(Registry.BLOCK, new Identifier(UniformSoulsMod.MOD_ID, "corruption_recklessness"), CORRUPTION_RECKLESSNESS);
        Registry.register(Registry.BLOCK, new Identifier(UniformSoulsMod.MOD_ID, "corruption_wrath"), CORRUPTION_WRATH);
        Registry.register(Registry.BLOCK, new Identifier(UniformSoulsMod.MOD_ID, "corruption_core_1"), CORRUPTION_CORE_1);

        Registry.register(Registry.BLOCK, new Identifier(UniformSoulsMod.MOD_ID, "dragon_block"), DRAGON_BLOCK);

        Registry.register(Registry.BLOCK, new Identifier(UniformSoulsMod.MOD_ID, "marble_bricks"), MARBLE_BRICKS);
        Registry.register(Registry.BLOCK, new Identifier(UniformSoulsMod.MOD_ID, "marble_brick_slab"), MARBLE_BRICK_SLAB);
        Registry.register(Registry.BLOCK, new Identifier(UniformSoulsMod.MOD_ID, "marble_brick_stairs"), MARBLE_BRICK_STAIRS);


    }
}
