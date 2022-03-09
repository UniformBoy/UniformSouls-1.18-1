package net.uniform.uniformsoulsmod;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.sound.SoundEvent;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.uniform.uniformsoulsmod.effects.*;
import net.uniform.uniformsoulsmod.registry.ModBlocks;
import net.uniform.uniformsoulsmod.registry.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class UniformSoulsMod implements ModInitializer {
	public static final String MOD_ID = "uniformsoulsmod";
	// This logger is used to write text to the console and the log file.
	// It is considered best practice to use your mod id as the logger's name.
	// That way, it's clear which mod wrote info, warnings, and errors.
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);


	//Souls Group

	public static final ItemGroup SOULS = FabricItemGroupBuilder.create(
					new Identifier(MOD_ID, "souls"))
			.icon(() -> new ItemStack(ModItems.JUSTICE_SOUL))
			.appendItems(stacks -> {
				stacks.add(new ItemStack(ModItems.JUSTICE_SOUL));
				stacks.add(new ItemStack(ModItems.KINDNESS_SOUL));
				stacks.add(new ItemStack(ModItems.BRAVERY_SOUL));
				stacks.add(new ItemStack(ModItems.PERSEVERANCE_SOUL));
				stacks.add(new ItemStack(ModItems.PATIENCE_SOUL));
				stacks.add(new ItemStack(ModItems.INTEGRITY_SOUL));
				stacks.add(new ItemStack(ModItems.DETERMINATION_SOUL));
				stacks.add(new ItemStack(ModItems.CORRUPTION_SOUL));
				stacks.add(new ItemStack(ModItems.HATE_SOUL));
				stacks.add(new ItemStack(ModItems.MONSTER_SOUL));
				stacks.add(new ItemStack(ModItems.ASRIEL_SOUL));
				stacks.add(new ItemStack(ModItems.IMMORALITY_SOUL));
				stacks.add(new ItemStack(ModItems.WRATH_SOUL));
				stacks.add(new ItemStack(ModItems.FEAR_SOUL));
				stacks.add(new ItemStack(ModItems.APATHY_SOUL));
				stacks.add(new ItemStack(ModItems.RECKLESSNESS_SOUL));
				stacks.add(new ItemStack(ModItems.DECEIT_SOUL));
				stacks.add(new ItemStack(ModItems.DESPAIR_SOUL));
				stacks.add(new ItemStack(ModItems.CORRUPTED_MONSTER_SOUL));
				stacks.add(new ItemStack(ModItems.EMPTY_SOUL_CONTAINER));
			})
			.build();

	public static final ItemGroup BLOCKS = FabricItemGroupBuilder.create(
					new Identifier(MOD_ID, "blocks"))
			.icon(() -> new ItemStack(ModItems.CORRUPTION))
			.appendItems(stacks -> {
				stacks.add(new ItemStack(ModItems.CORRUPTION));
				stacks.add(new ItemStack(ModItems.CORRUPTION_APATHY));
				stacks.add(new ItemStack(ModItems.CORRUPTION_DECEIT));
				stacks.add(new ItemStack(ModItems.CORRUPTION_DESPAIR));
				stacks.add(new ItemStack(ModItems.CORRUPTION_FEAR));
				stacks.add(new ItemStack(ModItems.CORRUPTION_IMMORALITY));
				stacks.add(new ItemStack(ModItems.CORRUPTION_RECKLESSNESS));
				stacks.add(new ItemStack(ModItems.CORRUPTION_WRATH));
				stacks.add(new ItemStack(ModItems.CORRUPTION_CORE_1));
			})
			.build();

	public static final ItemGroup MATERIALS = FabricItemGroupBuilder.create(
					new Identifier(MOD_ID, "materials"))
			.icon(() -> new ItemStack(ModItems.DRAGON_SCALE))
			.appendItems(stacks -> {
				stacks.add(new ItemStack(ModItems.DRAGON_SCALE));
				stacks.add(new ItemStack(ModItems.DRAGON_INGOT));
			})
			.build();

	public static final ItemGroup ARMOR = FabricItemGroupBuilder.create(
					new Identifier(MOD_ID, "armor"))
			.icon(() -> new ItemStack(ModItems.DRAGON_HELMET))
			.appendItems(stacks -> {
				stacks.add(new ItemStack(ModItems.DRAGON_HELMET));
				stacks.add(new ItemStack(ModItems.DRAGON_CHESTPLATE));
				stacks.add(new ItemStack(ModItems.DRAGON_LEGGINGS));
				stacks.add(new ItemStack(ModItems.DRAGON_BOOTS));
			})
			.build();

	public static final ItemGroup COMBAT = FabricItemGroupBuilder.create(
					new Identifier(MOD_ID, "combat"))
			.icon(() -> new ItemStack(ModItems.DRAGON_SWORD))
			.appendItems(stacks -> {
				stacks.add(new ItemStack(ModItems.DRAGON_SWORD));
			})
			.build();

	public static final ItemGroup TOOLS = FabricItemGroupBuilder.create(
					new Identifier(MOD_ID, "tools"))
			.icon(() -> new ItemStack(ModItems.DRAGON_PICKAXE))
			.appendItems(stacks -> {
				stacks.add(new ItemStack(ModItems.DRAGON_PICKAXE));
				stacks.add(new ItemStack(ModItems.DRAGON_AXE));
				stacks.add(new ItemStack(ModItems.DRAGON_SHOVEL));
				stacks.add(new ItemStack(ModItems.DRAGON_HOE));
			})
			.build();

	//Effects
	public static final StatusEffect DETERMINED = new DeterminedEffect();

	public static final StatusEffect NOGRAVITY = new NoGravityEffect();
	public static final StatusEffect GRAVITY = new GravityEffect();

	public static final StatusEffect JUSTICEEFFECT1 = new Justice1Effect();
	public static final StatusEffect INTEGRITYEFFECT1 = new Integrity1Effect();
	public static final StatusEffect PERSEVERANCEEFFECT1 = new Perseverance1Effect();
	public static final StatusEffect PATIENCEEFFECT1 = new Patience1Effect();
	public static final StatusEffect BRAVERYEFFECT1 = new Bravery1Effect();
	public static final StatusEffect KINDNESSEFFECT1 = new Kindness1Effect();
	public static final StatusEffect KINDNESSEFFECT2 = new Kindness2Effect();
	public static final StatusEffect DETERMINATIONEFFECT1 = new Determination1Effect();

	public static final StatusEffect JUSDEBUFFEFFECT1 = new JusDebuff1Effect();
	public static final StatusEffect INTDEBUFFEFFECT1 = new IntDebuff1Effect();
	public static final StatusEffect PERDEBUFFEFFECT1 = new PerDebuff1Effect();
	public static final StatusEffect PATDEBUFFEFFECT1 = new PatDebuff1Effect();
	public static final StatusEffect BRADEBUFFEFFECT1 = new BraDebuff1Effect();
	public static final StatusEffect KINDEBUFFEFFECT1 = new KinDebuff1Effect();
	public static final StatusEffect CORRUPTIONCORRUPTINGEFFECT1 = new CorruptionCorrupting1Effect();
	public static final StatusEffect DETDEBUFFEFFECT1 = new DetDebuff1Effect();

	//Sounds

	//Sounds Items

	public static final Identifier ASRIEL_SOUL_SOUND_1_ID = new Identifier("uniformsouls:asriel_soul_sound_1");
	public static SoundEvent ASRIEL_SOUL_SOUND_1_EVENT = new SoundEvent(ASRIEL_SOUL_SOUND_1_ID);

	@Override
	public void onInitialize() {
		// This code runs as soon as Minecraft is in a mod-load-ready state.
		// However, some things (like resources) may still be uninitialized.
		// Proceed with mild caution.

		ModItems.registerModItems();
		ModBlocks.registerModBlocks();

		//Effects

		Registry.register(Registry.STATUS_EFFECT, new Identifier(UniformSoulsMod.MOD_ID, "determined"), DETERMINED);

		Registry.register(Registry.STATUS_EFFECT, new Identifier(UniformSoulsMod.MOD_ID, "nogravity"), NOGRAVITY);
		Registry.register(Registry.STATUS_EFFECT, new Identifier(UniformSoulsMod.MOD_ID, "gravity"), GRAVITY);

		Registry.register(Registry.STATUS_EFFECT, new Identifier(UniformSoulsMod.MOD_ID, "justice1"), JUSTICEEFFECT1);
		Registry.register(Registry.STATUS_EFFECT, new Identifier(UniformSoulsMod.MOD_ID, "integrity1"), INTEGRITYEFFECT1);
		Registry.register(Registry.STATUS_EFFECT, new Identifier(UniformSoulsMod.MOD_ID, "perseverance1"), PERSEVERANCEEFFECT1);
		Registry.register(Registry.STATUS_EFFECT, new Identifier(UniformSoulsMod.MOD_ID, "patience1"), PATIENCEEFFECT1);
		Registry.register(Registry.STATUS_EFFECT, new Identifier(UniformSoulsMod.MOD_ID, "bravery1"), BRAVERYEFFECT1);
		Registry.register(Registry.STATUS_EFFECT, new Identifier(UniformSoulsMod.MOD_ID, "kindness1"), KINDNESSEFFECT1);
		Registry.register(Registry.STATUS_EFFECT, new Identifier(UniformSoulsMod.MOD_ID, "kindness2"), KINDNESSEFFECT2);
		Registry.register(Registry.STATUS_EFFECT, new Identifier(UniformSoulsMod.MOD_ID, "determination1"), DETERMINATIONEFFECT1);
		Registry.register(Registry.STATUS_EFFECT, new Identifier(UniformSoulsMod.MOD_ID, "jusdebuff1"), JUSDEBUFFEFFECT1);
		Registry.register(Registry.STATUS_EFFECT, new Identifier(UniformSoulsMod.MOD_ID, "intdebuff1"), INTDEBUFFEFFECT1);
		Registry.register(Registry.STATUS_EFFECT, new Identifier(UniformSoulsMod.MOD_ID, "perdebuff1"), PERDEBUFFEFFECT1);
		Registry.register(Registry.STATUS_EFFECT, new Identifier(UniformSoulsMod.MOD_ID, "patdebuff1"), PATDEBUFFEFFECT1);
		Registry.register(Registry.STATUS_EFFECT, new Identifier(UniformSoulsMod.MOD_ID, "bradebuff1"), BRADEBUFFEFFECT1);
		Registry.register(Registry.STATUS_EFFECT, new Identifier(UniformSoulsMod.MOD_ID, "kindebuff1"), KINDEBUFFEFFECT1);
		Registry.register(Registry.STATUS_EFFECT, new Identifier(UniformSoulsMod.MOD_ID, "corruptioncorrupting1"), CORRUPTIONCORRUPTINGEFFECT1);
		Registry.register(Registry.STATUS_EFFECT, new Identifier(UniformSoulsMod.MOD_ID, "detdebuff1"), DETDEBUFFEFFECT1);

		//Sounds Items

		Registry.register(Registry.SOUND_EVENT, ASRIEL_SOUL_SOUND_1_ID, ASRIEL_SOUL_SOUND_1_EVENT);

	}
}
