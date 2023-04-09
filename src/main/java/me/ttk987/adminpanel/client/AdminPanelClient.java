package me.ttk987.adminpanel.client;

import net.fabricmc.api.ClientModInitializer;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.network.ClientPlayerEntity;
import net.minecraft.client.network.PlayerListEntry;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.io.*;
import java.util.Calendar;
import java.util.Collection;
import java.util.Objects;


public class AdminPanelClient implements ClientModInitializer {
    public JButton give;
    public JButton fly;
    public JButton time;
    public JButton gamemode;
    public JButton weather;
    public JButton op_stick;
    public JButton pardon;
    public JButton heal;
    public JButton godmode;
    public JButton tp;
    public JButton ban;
    public JButton kick;
    public JButton up_players;
    public JButton clear_log;
    public JButton save_log;
    public JButton illegalshulker;
    public JComboBox<String> players_give;
    public JComboBox<String> players_fly;
    public JComboBox<String> players_gamemode;
    public JComboBox<String> players_heal;
    public JComboBox<String> players_god;
    public JComboBox<String> players_tp1;
    public JComboBox<String> players_tp2;
    public JComboBox<String> players_kick;
    public JComboBox<String> players_ban;
    public JLabel log;
    public JLabel miscs;
    public JTextArea log_textarea;
    public JScrollPane scroll;
    public JTextArea time_textarea;
    public JTextArea quantity;
    public JTextArea reason;
    public JTextArea reason1;
    public JRadioButton time_set;
    public JRadioButton time_add;
    public JComboBox<String> weather_types;
    public JComboBox<String> gamemode_choose;
    public JComboBox<String> time_choose;
    public JComboBox<String> items;
    public JTextArea banned_players;


    @Override
    public void onInitializeClient() {
        // Call the recursive method to initialize GUI components
        initializeGui();


    }


    public void initializeGui() {
        if (!GraphicsEnvironment.isHeadless()) {
            String[] itemsItems = {"acacia_boat", "acacia_button", "acacia_chest_boat", "acacia_door", "acacia_fence", "acacia_fence_gate", "acacia_leaves", "acacia_log", "acacia_planks", "acacia_pressure_plate", "acacia_sapling", "acacia_sign", "acacia_slab", "acacia_stairs", "acacia_trapdoor", "acacia_wood", "activator_rail", "allay_spawn_egg", "allium", "amethyst_block", "amethyst_cluster", "amethyst_shard", "ancient_debris", "andesite", "andesite_slab", "andesite_stairs", "andesite_wall", "anvil", "apple", "armor_stand", "arrow", "axolotl_bucket", "axolotl_spawn_egg", "azalea", "azalea_leaves", "azure_bluet", "baked_potato", "bamboo", "barrel", "barrier", "basalt", "bat_spawn_egg", "beacon", "bedrock", "bee_nest", "bee_spawn_egg", "beef", "beehive", "beetroot", "beetroot_seeds", "beetroot_soup", "bell", "big_dripleaf", "birch_boat", "birch_button", "birch_chest_boat", "birch_door", "birch_fence", "birch_fence_gate", "birch_leaves", "birch_log", "birch_planks", "birch_pressure_plate", "birch_sapling", "birch_sign", "birch_slab", "birch_stairs", "birch_trapdoor", "birch_wood", "black_banner", "black_bed", "black_candle", "black_carpet", "black_concrete", "black_concrete_powder", "black_dye", "black_glazed_terracotta", "black_shulker_box", "black_stained_glass", "black_stained_glass_pane", "black_terracotta", "black_wool", "blackstone", "blackstone_slab", "blackstone_stairs", "blackstone_wall", "blast_furnace", "blaze_powder", "blaze_rod", "blaze_spawn_egg", "blue_banner", "blue_bed", "blue_candle", "blue_carpet", "blue_concrete", "blue_concrete_powder", "blue_dye", "blue_glazed_terracotta", "blue_ice", "blue_orchid", "blue_shulker_box", "blue_stained_glass", "blue_stained_glass_pane", "blue_terracotta", "blue_wool", "bone", "bone_block", "bone_meal", "book", "bookshelf", "bow", "bowl", "brain_coral", "brain_coral_block", "brain_coral_fan", "bread", "brewing_stand", "brick", "brick_slab", "brick_stairs", "brick_wall", "bricks", "brown_banner", "brown_bed", "brown_candle", "brown_carpet", "brown_concrete", "brown_concrete_powder", "brown_dye", "brown_glazed_terracotta", "brown_mushroom", "brown_mushroom_block", "brown_shulker_box", "brown_stained_glass", "brown_stained_glass_pane", "brown_terracotta", "brown_wool", "bubble_coral", "bubble_coral_block", "bubble_coral_fan", "bucket", "budding_amethyst", "bundle", "cactus", "cake", "calcite", "campfire", "candle", "carrot", "carrot_on_a_stick", "cartography_table", "carved_pumpkin", "cat_spawn_egg", "cauldron", "cave_spider_spawn_egg", "chain", "chain_command_block", "chainmail_boots", "chainmail_chestplate", "chainmail_helmet", "chainmail_leggings", "charcoal", "chest", "chest_minecart", "chicken", "chicken_spawn_egg", "chipped_anvil", "chiseled_deepslate", "chiseled_nether_bricks", "chiseled_polished_blackstone", "chiseled_quartz_block", "chiseled_red_sandstone", "chiseled_sandstone", "chiseled_stone_bricks", "chorus_flower", "chorus_fruit", "chorus_plant", "clay", "clay_ball", "clock", "coal", "coal_block", "coal_ore", "coarse_dirt", "cobbled_deepslate", "cobbled_deepslate_slab", "cobbled_deepslate_stairs", "cobbled_deepslate_wall", "cobblestone", "cobblestone_slab", "cobblestone_stairs", "cobblestone_wall", "cobweb", "cocoa_beans", "cod", "cod_bucket", "cod_spawn_egg", "command_block", "command_block_minecart", "comparator", "compass", "composter", "conduit", "cooked_beef", "cooked_chicken", "cooked_cod", "cooked_mutton", "cooked_porkchop", "cooked_rabbit", "cooked_salmon", "cookie", "copper_block", "copper_ingot", "copper_ore", "cornflower", "cow_spawn_egg", "cracked_deepslate_bricks", "cracked_deepslate_tiles", "cracked_nether_bricks", "cracked_polished_blackstone_bricks", "cracked_stone_bricks", "crafting_table", "creeper_banner_pattern", "creeper_head", "creeper_spawn_egg", "crimson_button", "crimson_door", "crimson_fence", "crimson_fence_gate", "crimson_fungus", "crimson_hyphae", "crimson_nylium", "crimson_planks", "crimson_pressure_plate", "crimson_roots", "crimson_sign", "crimson_slab", "crimson_stairs", "crimson_stem", "crimson_trapdoor", "crossbow", "crying_obsidian", "cut_copper", "cut_copper_slab", "cut_copper_stairs", "cut_red_sandstone", "cut_red_sandstone_slab", "cut_sandstone", "cut_sandstone_slab", "cyan_banner", "cyan_bed", "cyan_candle", "cyan_carpet", "cyan_concrete", "cyan_concrete_powder", "cyan_dye", "cyan_glazed_terracotta", "cyan_shulker_box", "cyan_stained_glass", "cyan_stained_glass_pane", "cyan_terracotta", "cyan_wool", "damaged_anvil", "dandelion", "dark_oak_boat", "dark_oak_button", "dark_oak_chest_boat", "dark_oak_door", "dark_oak_fence", "dark_oak_fence_gate", "dark_oak_leaves", "dark_oak_log", "dark_oak_planks", "dark_oak_pressure_plate", "dark_oak_sapling", "dark_oak_sign", "dark_oak_slab", "dark_oak_stairs", "dark_oak_trapdoor", "dark_oak_wood", "dark_prismarine", "dark_prismarine_slab", "dark_prismarine_stairs", "daylight_detector", "dead_brain_coral", "dead_brain_coral_block", "dead_brain_coral_fan", "dead_bubble_coral", "dead_bubble_coral_block", "dead_bubble_coral_fan", "dead_bush", "dead_fire_coral", "dead_fire_coral_block", "dead_fire_coral_fan", "dead_horn_coral", "dead_horn_coral_block", "dead_horn_coral_fan", "dead_tube_coral", "dead_tube_coral_block", "dead_tube_coral_fan", "debug_stick", "deepslate", "deepslate_brick_slab", "deepslate_brick_stairs", "deepslate_brick_wall", "deepslate_bricks", "deepslate_coal_ore", "deepslate_copper_ore", "deepslate_diamond_ore", "deepslate_emerald_ore", "deepslate_gold_ore", "deepslate_iron_ore", "deepslate_lapis_ore", "deepslate_redstone_ore", "deepslate_tile_slab", "deepslate_tile_stairs", "deepslate_tile_wall", "deepslate_tiles", "detector_rail", "diamond", "diamond_axe", "diamond_block", "diamond_boots", "diamond_chestplate", "diamond_helmet", "diamond_hoe", "diamond_horse_armor", "diamond_leggings", "diamond_ore", "diamond_pickaxe", "diamond_shovel", "diamond_sword", "diorite", "diorite_slab", "diorite_stairs", "diorite_wall", "dirt", "dirt_path", "disc_fragment_5", "dispenser", "dolphin_spawn_egg", "donkey_spawn_egg", "dragon_breath", "dragon_egg", "dragon_head", "dried_kelp", "dried_kelp_block", "dripstone_block", "dropper", "drowned_spawn_egg", "echo_shard", "egg", "elder_guardian_spawn_egg", "elytra", "emerald", "emerald_block", "emerald_ore", "enchanted_book", "enchanted_golden_apple", "enchanting_table", "end_crystal", "end_portal_frame", "end_rod", "end_stone", "end_stone_brick_slab", "end_stone_brick_stairs", "end_stone_brick_wall", "end_stone_bricks", "ender_chest", "ender_eye", "ender_pearl", "enderman_spawn_egg", "endermite_spawn_egg", "evoker_spawn_egg", "experience_bottle", "exposed_copper", "exposed_cut_copper", "exposed_cut_copper_slab", "exposed_cut_copper_stairs", "farmland", "feather", "fermented_spider_eye", "fern", "filled_map", "fire_charge", "fire_coral", "fire_coral_block", "fire_coral_fan", "firework_rocket", "firework_star", "fishing_rod", "fletching_table", "flint", "flint_and_steel", "flower_banner_pattern", "flower_pot", "flowering_azalea", "flowering_azalea_leaves", "fox_spawn_egg", "frog_spawn_egg", "frogspawn", "furnace", "furnace_minecart", "ghast_spawn_egg", "ghast_tear", "gilded_blackstone", "glass", "glass_bottle", "glass_pane", "glistering_melon_slice", "globe_banner_pattern", "glow_berries", "glow_ink_sac", "glow_item_frame", "glow_lichen", "glow_squid_spawn_egg", "glowstone", "glowstone_dust", "goat_horn", "goat_spawn_egg", "gold_block", "gold_ingot", "gold_nugget", "gold_ore", "golden_apple", "golden_axe", "golden_boots", "golden_carrot", "golden_chestplate", "golden_helmet", "golden_hoe", "golden_horse_armor", "golden_leggings", "golden_pickaxe", "golden_shovel", "golden_sword", "granite", "granite_slab", "granite_stairs", "granite_wall", "grass", "grass_block", "gravel", "gray_banner", "gray_bed", "gray_candle", "gray_carpet", "gray_concrete", "gray_concrete_powder", "gray_dye", "gray_glazed_terracotta", "gray_shulker_box", "gray_stained_glass", "gray_stained_glass_pane", "gray_terracotta", "gray_wool", "green_banner", "green_bed", "green_candle", "green_carpet", "green_concrete", "green_concrete_powder", "green_dye", "green_glazed_terracotta", "green_shulker_box", "green_stained_glass", "green_stained_glass_pane", "green_terracotta", "green_wool", "grindstone", "guardian_spawn_egg", "gunpowder", "hanging_roots", "hay_block", "heart_of_the_sea", "heavy_weighted_pressure_plate", "hoglin_spawn_egg", "honey_block", "honey_bottle", "honeycomb", "honeycomb_block", "hopper", "hopper_minecart", "horn_coral", "horn_coral_block", "horn_coral_fan", "horse_spawn_egg", "husk_spawn_egg", "ice", "infested_chiseled_stone_bricks", "infested_cobblestone", "infested_cracked_stone_bricks", "infested_deepslate", "infested_mossy_stone_bricks", "infested_stone", "infested_stone_bricks", "ink_sac", "iron_axe", "iron_bars", "iron_block", "iron_boots", "iron_chestplate", "iron_door", "iron_helmet", "iron_hoe", "iron_horse_armor", "iron_ingot", "iron_leggings", "iron_nugget", "iron_ore", "iron_pickaxe", "iron_shovel", "iron_sword", "iron_trapdoor", "item_frame", "jack_o_lantern", "jigsaw", "jukebox", "jungle_boat", "jungle_button", "jungle_chest_boat", "jungle_door", "jungle_fence", "jungle_fence_gate", "jungle_leaves", "jungle_log", "jungle_planks", "jungle_pressure_plate", "jungle_sapling", "jungle_sign", "jungle_slab", "jungle_stairs", "jungle_trapdoor", "jungle_wood", "kelp", "knowledge_book", "ladder", "lantern", "lapis_block", "lapis_lazuli", "lapis_ore", "large_amethyst_bud", "large_fern", "lava_bucket", "lead", "leather", "leather_boots", "leather_chestplate", "leather_helmet", "leather_horse_armor", "leather_leggings", "lectern", "lever", "light", "light_blue_banner", "light_blue_bed", "light_blue_candle", "light_blue_carpet", "light_blue_concrete", "light_blue_concrete_powder", "light_blue_dye", "light_blue_glazed_terracotta", "light_blue_shulker_box", "light_blue_stained_glass", "light_blue_stained_glass_pane", "light_blue_terracotta", "light_blue_wool", "light_gray_banner", "light_gray_bed", "light_gray_candle", "light_gray_carpet", "light_gray_concrete", "light_gray_concrete_powder", "light_gray_dye", "light_gray_glazed_terracotta", "light_gray_shulker_box", "light_gray_stained_glass", "light_gray_stained_glass_pane", "light_gray_terracotta", "light_gray_wool", "light_weighted_pressure_plate", "lightning_rod", "lilac", "lily_of_the_valley", "lily_pad", "lime_banner", "lime_bed", "lime_candle", "lime_carpet", "lime_concrete", "lime_concrete_powder", "lime_dye", "lime_glazed_terracotta", "lime_shulker_box", "lime_stained_glass", "lime_stained_glass_pane", "lime_terracotta", "lime_wool", "lingering_potion", "llama_spawn_egg", "lodestone", "loom", "magenta_banner", "magenta_bed", "magenta_candle", "magenta_carpet", "magenta_concrete", "magenta_concrete_powder", "magenta_dye", "magenta_glazed_terracotta", "magenta_shulker_box", "magenta_stained_glass", "magenta_stained_glass_pane", "magenta_terracotta", "magenta_wool", "magma_block", "magma_cream", "magma_cube_spawn_egg", "mangrove_boat", "mangrove_button", "mangrove_chest_boat", "mangrove_door", "mangrove_fence", "mangrove_fence_gate", "mangrove_leaves", "mangrove_log", "mangrove_planks", "mangrove_pressure_plate", "mangrove_propagule", "mangrove_roots", "mangrove_sign", "mangrove_slab", "mangrove_stairs", "mangrove_trapdoor", "mangrove_wood", "map", "medium_amethyst_bud", "melon", "melon_seeds", "melon_slice", "milk_bucket", "minecart", "mojang_banner_pattern", "mooshroom_spawn_egg", "moss_block", "moss_carpet", "mossy_cobblestone", "mossy_cobblestone_slab", "mossy_cobblestone_stairs", "mossy_cobblestone_wall", "mossy_stone_brick_slab", "mossy_stone_brick_stairs", "mossy_stone_brick_wall", "mossy_stone_bricks", "mud", "mud_brick_slab", "mud_brick_stairs", "mud_brick_wall", "mud_bricks", "muddy_mangrove_roots", "mule_spawn_egg", "mushroom_stem", "mushroom_stew", "music_disc_11", "music_disc_13", "music_disc_5", "music_disc_blocks", "music_disc_cat", "music_disc_chirp", "music_disc_far", "music_disc_mall", "music_disc_mellohi", "music_disc_otherside", "music_disc_pigstep", "music_disc_stal", "music_disc_strad", "music_disc_wait", "music_disc_ward", "mutton", "mycelium", "name_tag", "nautilus_shell", "nether_brick", "nether_brick_fence", "nether_brick_slab", "nether_brick_stairs", "nether_brick_wall", "nether_bricks", "nether_gold_ore", "nether_quartz_ore", "nether_sprouts", "nether_star", "nether_wart", "nether_wart_block", "netherite_axe", "netherite_block", "netherite_boots", "netherite_chestplate", "netherite_helmet", "netherite_hoe", "netherite_ingot", "netherite_leggings", "netherite_pickaxe", "netherite_scrap", "netherite_shovel", "netherite_sword", "netherrack", "note_block", "oak_boat", "oak_button", "oak_chest_boat", "oak_door", "oak_fence", "oak_fence_gate", "oak_leaves", "oak_log", "oak_planks", "oak_pressure_plate", "oak_sapling", "oak_sign", "oak_slab", "oak_stairs", "oak_trapdoor", "oak_wood", "observer", "obsidian", "ocelot_spawn_egg", "ochre_froglight", "orange_banner", "orange_bed", "orange_candle", "orange_carpet", "orange_concrete", "orange_concrete_powder", "orange_dye", "orange_glazed_terracotta", "orange_shulker_box", "orange_stained_glass", "orange_stained_glass_pane", "orange_terracotta", "orange_tulip", "orange_wool", "oxeye_daisy", "oxidized_copper", "oxidized_cut_copper", "oxidized_cut_copper_slab", "oxidized_cut_copper_stairs", "packed_ice", "packed_mud", "painting", "panda_spawn_egg", "paper", "parrot_spawn_egg", "pearlescent_froglight", "peony", "petrified_oak_slab", "phantom_membrane", "phantom_spawn_egg", "pig_spawn_egg", "piglin_banner_pattern", "piglin_brute_spawn_egg", "piglin_spawn_egg", "pillager_spawn_egg", "pink_banner", "pink_bed", "pink_candle", "pink_carpet", "pink_concrete", "pink_concrete_powder", "pink_dye", "pink_glazed_terracotta", "pink_shulker_box", "pink_stained_glass", "pink_stained_glass_pane", "pink_terracotta", "pink_tulip", "pink_wool", "piston", "player_head", "podzol", "pointed_dripstone", "poisonous_potato", "polar_bear_spawn_egg", "polished_andesite", "polished_andesite_slab", "polished_andesite_stairs", "polished_basalt", "polished_blackstone", "polished_blackstone_brick_slab", "polished_blackstone_brick_stairs", "polished_blackstone_brick_wall", "polished_blackstone_bricks", "polished_blackstone_button", "polished_blackstone_pressure_plate", "polished_blackstone_slab", "polished_blackstone_stairs", "polished_blackstone_wall", "polished_deepslate", "polished_deepslate_slab", "polished_deepslate_stairs", "polished_deepslate_wall", "polished_diorite", "polished_diorite_slab", "polished_diorite_stairs", "polished_granite", "polished_granite_slab", "polished_granite_stairs", "popped_chorus_fruit", "poppy", "porkchop", "potato", "potion", "powder_snow_bucket", "powered_rail", "prismarine", "prismarine_brick_slab", "prismarine_brick_stairs", "prismarine_bricks", "prismarine_crystals", "prismarine_shard", "prismarine_slab", "prismarine_stairs", "prismarine_wall", "pufferfish", "pufferfish_bucket", "pufferfish_spawn_egg", "pumpkin", "pumpkin_pie", "pumpkin_seeds", "purple_banner", "purple_bed", "purple_candle", "purple_carpet", "purple_concrete", "purple_concrete_powder", "purple_dye", "purple_glazed_terracotta", "purple_shulker_box", "purple_stained_glass", "purple_stained_glass_pane", "purple_terracotta", "purple_wool", "purpur_block", "purpur_pillar", "purpur_slab", "purpur_stairs", "quartz", "quartz_block", "quartz_bricks", "quartz_pillar", "quartz_slab", "quartz_stairs", "rabbit", "rabbit_foot", "rabbit_hide", "rabbit_spawn_egg", "rabbit_stew", "rail", "ravager_spawn_egg", "raw_copper", "raw_copper_block", "raw_gold", "raw_gold_block", "raw_iron", "raw_iron_block", "recovery_compass", "red_banner", "red_bed", "red_candle", "red_carpet", "red_concrete", "red_concrete_powder", "red_dye", "red_glazed_terracotta", "red_mushroom", "red_mushroom_block", "red_nether_brick_slab", "red_nether_brick_stairs", "red_nether_brick_wall", "red_nether_bricks", "red_sand", "red_sandstone", "red_sandstone_slab", "red_sandstone_stairs", "red_sandstone_wall", "red_shulker_box", "red_stained_glass", "red_stained_glass_pane", "red_terracotta", "red_tulip", "red_wool", "redstone", "redstone_block", "redstone_lamp", "redstone_ore", "redstone_torch", "reinforced_deepslate", "repeater", "repeating_command_block", "respawn_anchor", "rooted_dirt", "rose_bush", "rotten_flesh", "saddle", "salmon", "salmon_bucket", "salmon_spawn_egg", "sand", "sandstone", "sandstone_slab", "sandstone_stairs", "sandstone_wall", "scaffolding", "sculk", "sculk_catalyst", "sculk_sensor", "sculk_shrieker", "sculk_vein", "scute", "sea_lantern", "sea_pickle", "seagrass", "shears", "sheep_spawn_egg", "shield", "shroomlight", "shulker_box", "shulker_shell", "shulker_spawn_egg", "silverfish_spawn_egg", "skeleton_horse_spawn_egg", "skeleton_skull", "skeleton_spawn_egg", "skull_banner_pattern", "slime_ball", "slime_block", "slime_spawn_egg", "small_amethyst_bud", "small_dripleaf", "smithing_table", "smoker", "smooth_basalt", "smooth_quartz", "smooth_quartz_slab", "smooth_quartz_stairs", "smooth_red_sandstone", "smooth_red_sandstone_slab", "smooth_red_sandstone_stairs", "smooth_sandstone", "smooth_sandstone_slab", "smooth_sandstone_stairs", "smooth_stone", "smooth_stone_slab", "snow", "snow_block", "snowball", "soul_campfire", "soul_lantern", "soul_sand", "soul_soil", "soul_torch", "spawner", "spectral_arrow", "spider_eye", "spider_spawn_egg", "splash_potion", "sponge", "spore_blossom", "spruce_boat", "spruce_button", "spruce_chest_boat", "spruce_door", "spruce_fence", "spruce_fence_gate", "spruce_leaves", "spruce_log", "spruce_planks", "spruce_pressure_plate", "spruce_sapling", "spruce_sign", "spruce_slab", "spruce_stairs", "spruce_trapdoor", "spruce_wood", "spyglass", "squid_spawn_egg", "stick", "sticky_piston", "stone", "stone_axe", "stone_brick_slab", "stone_brick_stairs", "stone_brick_wall", "stone_bricks", "stone_button", "stone_hoe", "stone_pickaxe", "stone_pressure_plate", "stone_shovel", "stone_slab", "stone_stairs", "stone_sword", "stonecutter", "stray_spawn_egg", "strider_spawn_egg", "string", "stripped_acacia_log", "stripped_acacia_wood", "stripped_birch_log", "stripped_birch_wood", "stripped_crimson_hyphae", "stripped_crimson_stem", "stripped_dark_oak_log", "stripped_dark_oak_wood", "stripped_jungle_log", "stripped_jungle_wood", "stripped_mangrove_log", "stripped_mangrove_wood", "stripped_oak_log", "stripped_oak_wood", "stripped_spruce_log", "stripped_spruce_wood", "stripped_warped_hyphae", "stripped_warped_stem", "structure_block", "structure_void", "sugar", "sugar_cane", "sunflower", "suspicious_stew", "sweet_berries", "tadpole_bucket", "tadpole_spawn_egg", "tall_grass", "target", "terracotta", "tinted_glass", "tipped_arrow", "tnt", "tnt_minecart", "torch", "totem_of_undying", "trader_llama_spawn_egg", "trapped_chest", "trident", "tripwire_hook", "tropical_fish", "tropical_fish_bucket", "tropical_fish_spawn_egg", "tube_coral", "tube_coral_block", "tube_coral_fan", "tuff", "turtle_egg", "turtle_helmet", "turtle_spawn_egg", "twisting_vines", "verdant_froglight", "vex_spawn_egg", "villager_spawn_egg", "vindicator_spawn_egg", "vine", "wandering_trader_spawn_egg", "warden_spawn_egg", "warped_button", "warped_door", "warped_fence", "warped_fence_gate", "warped_fungus", "warped_fungus_on_a_stick", "warped_hyphae", "warped_nylium", "warped_planks", "warped_pressure_plate", "warped_roots", "warped_sign", "warped_slab", "warped_stairs", "warped_stem", "warped_trapdoor", "warped_wart_block", "water_bucket", "waxed_copper_block", "waxed_cut_copper", "waxed_cut_copper_slab", "waxed_cut_copper_stairs", "waxed_exposed_copper", "waxed_exposed_cut_copper", "waxed_exposed_cut_copper_slab", "waxed_exposed_cut_copper_stairs", "waxed_oxidized_copper", "waxed_oxidized_cut_copper", "waxed_oxidized_cut_copper_slab", "waxed_oxidized_cut_copper_stairs", "waxed_weathered_copper", "waxed_weathered_cut_copper", "waxed_weathered_cut_copper_slab", "waxed_weathered_cut_copper_stairs", "weathered_copper", "weathered_cut_copper", "weathered_cut_copper_slab", "weathered_cut_copper_stairs", "weeping_vines", "wet_sponge", "wheat", "wheat_seeds", "white_banner", "white_bed", "white_candle", "white_carpet", "white_concrete", "white_concrete_powder", "white_dye", "white_glazed_terracotta", "white_shulker_box", "white_stained_glass", "white_stained_glass_pane", "white_terracotta", "white_tulip", "white_wool", "witch_spawn_egg", "wither_rose", "wither_skeleton_skull", "wither_skeleton_spawn_egg", "wolf_spawn_egg", "wooden_axe", "wooden_hoe", "wooden_pickaxe", "wooden_shovel", "wooden_sword", "writable_book", "written_book", "yellow_banner", "yellow_bed", "yellow_candle", "yellow_carpet", "yellow_concrete", "yellow_concrete_powder", "yellow_dye", "yellow_glazed_terracotta", "yellow_shulker_box", "yellow_stained_glass", "yellow_stained_glass_pane", "yellow_terracotta", "yellow_wool", "zoglin_spawn_egg", "zombie_head", "zombie_horse_spawn_egg", "zombie_spawn_egg", "zombie_villager_spawn_egg", "zombified_piglin_spawn_egg"};
            String[] weather_typesItems = {"clear", "rain", "thunder"};
            String[] gamemode_chooseItems = {"survival", "creative", "adventure", "spectator"};
            String[] time_chooseItems = {"day", "night"};


            give = new JButton("Give");
            fly = new JButton("Fly");
            time = new JButton("Time");
            gamemode = new JButton("Gamemode");
            weather = new JButton("Weather");
            op_stick = new JButton("OP stick");
            illegalshulker = new JButton("Illegal shulkerbox");
            pardon = new JButton("Unban");
            heal = new JButton("Heal");
            godmode = new JButton("God");
            tp = new JButton("Teleport");
            ban = new JButton("Ban");
            kick = new JButton("Kick");
            up_players = new JButton("Uptade player list");
            clear_log = new JButton("Clear");
            save_log = new JButton("Save");


            weather_types = new JComboBox<>(weather_typesItems);
            gamemode_choose = new JComboBox<>(gamemode_chooseItems);
            time_choose = new JComboBox<>(time_chooseItems);
            items = new JComboBox<>(itemsItems);

            time_set = new JRadioButton("set");
            time_add = new JRadioButton("add");

            log_textarea = new JTextArea();
            log_textarea.setEditable(false);
            log_textarea.setColumns(1000);
            log_textarea.setRows(1000);
            scroll = new JScrollPane(log_textarea);
            scroll.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
            scroll.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);

            banned_players = new JTextArea();
            banned_players.setEditable(true);
            banned_players.setLineWrap(true);
            banned_players.setColumns(100);
            banned_players.setRows(3);

            time_textarea = new JTextArea();
            time_textarea.setEditable(true);
            time_textarea.setColumns(100);
            time_textarea.setLineWrap(true);
            time_textarea.setRows(100);

            quantity = new JTextArea();
            quantity.setEditable(true);
            quantity.setColumns(2);

            reason = new JTextArea();
            reason.setEditable(true);
            reason.setLineWrap(true);
            reason.setRows(3);

            reason1 = new JTextArea();
            reason1.setEditable(true);
            reason1.setLineWrap(true);
            reason1.setRows(3);


            players_give = new JComboBox<>();
            players_fly = new JComboBox<>();
            players_gamemode = new JComboBox<>();
            players_heal = new JComboBox<>();
            players_god = new JComboBox<>();
            players_tp1 = new JComboBox<>();
            players_tp2 = new JComboBox<>();
            players_kick = new JComboBox<>();
            players_ban = new JComboBox<>();


            log = new JLabel("Log and errors:");
            miscs = new JLabel("Miscs:");


            quantity.setToolTipText("Quantity:");
            give.setBounds(20, 25, 100, 25);
            fly.setBounds(20, 65, 100, 25);
            time.setBounds(20, 105, 100, 25);
            gamemode.setBounds(20, 145, 100, 25);
            weather.setBounds(20, 185, 100, 25);
            players_give.setBounds(145, 25, 100, 25);
            items.setBounds(270, 25, 270, 25);
            op_stick.setBounds(665, 485, 100, 25);
            illegalshulker.setBounds(780,485, 125, 25);
            weather_types.setBounds(145, 185, 100, 25);
            gamemode_choose.setBounds(265, 145, 100, 25);
            time_set.setBounds(145, 105, 50, 25);
            time_add.setBounds(195, 105, 50, 25);
            time_choose.setBounds(265, 105, 100, 25);
            time_textarea.setBounds(385, 105, 100, 25);
            log_textarea.setBounds(675, 120, 220, 305);
            scroll.setBounds(675, 120, 220, 305);
            log.setBounds(735, 90, 90, 25);
            quantity.setBounds(560, 25, 100, 25);
            players_gamemode.setBounds(145, 145, 100, 25);
            players_fly.setBounds(145, 65, 100, 25);
            players_heal.setBounds(145, 230, 100, 25);
            heal.setBounds(20, 230, 100, 25);
            godmode.setBounds(20, 270, 100, 25);
            players_god.setBounds(145, 270, 100, 25);
            tp.setBounds(20, 310, 100, 25);
            players_tp1.setBounds(145, 310, 100, 25);
            players_tp2.setBounds(265, 310, 100, 25);
            kick.setBounds(20, 350, 100, 25);
            players_kick.setBounds(145, 350, 100, 25);
            reason.setBounds(265, 350, 385, 55);
            ban.setBounds(20, 420, 100, 25);
            players_ban.setBounds(145, 420, 100, 25);
            reason1.setBounds(265, 420, 385, 55);
            pardon.setBounds(20, 485, 100, 25);
            banned_players.setBounds(145, 485, 100, 25);
            miscs.setBounds(745, 460, 100, 25);
            up_players.setBounds(700, 10, 160, 65);
            clear_log.setBounds(830, 425, 65, 25);
            save_log.setBounds(765, 425, 65, 25);


            JFrame frame = new JFrame("Admin Panel (by TTK987)");
            frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            frame.pack();
            frame.setSize(new Dimension(950, 575));
            frame.setResizable(false);
            frame.setLocationRelativeTo(null);
            frame.setLayout(null);
            frame.add(give);
            frame.add(fly);
            frame.add(time);
            frame.add(gamemode);
            frame.add(weather);
            frame.add(players_give);
            frame.add(items);
            frame.add(op_stick);
            frame.add(illegalshulker);
            frame.add(weather_types);
            frame.add(gamemode_choose);
            frame.add(time_set);
            frame.add(time_add);
            frame.add(time_choose);
            frame.add(time_textarea);
            frame.add(scroll);
            frame.add(log);
            frame.add(quantity);
            frame.add(players_gamemode);
            frame.add(players_fly);
            frame.add(players_heal);
            frame.add(heal);
            frame.add(godmode);
            frame.add(players_god);
            frame.add(tp);
            frame.add(players_tp1);
            frame.add(players_tp2);
            frame.add(kick);
            frame.add(players_kick);
            frame.add(reason);
            frame.add(ban);
            frame.add(players_ban);
            frame.add(reason1);
            frame.add(pardon);
            frame.add(banned_players);
            frame.add(miscs);
            frame.add(up_players);
            frame.add(clear_log);
            frame.add(save_log);
            frame.setVisible(true);
            time.addActionListener(this::actionPerformed);
            give.addActionListener(this::actionPerformed);
            fly.addActionListener(this::actionPerformed);
            gamemode.addActionListener(this::actionPerformed);
            weather.addActionListener(this::actionPerformed);
            op_stick.addActionListener(this::actionPerformed);
            heal.addActionListener(this::actionPerformed);
            godmode.addActionListener(this::actionPerformed);
            tp.addActionListener(this::actionPerformed);
            kick.addActionListener(this::actionPerformed);
            ban.addActionListener(this::actionPerformed);
            pardon.addActionListener(this::actionPerformed);
            up_players.addActionListener(this::actionPerformed);
            clear_log.addActionListener(this::actionPerformed);
            save_log.addActionListener(this::actionPerformed);
            time_set.addActionListener(this::actionPerformed);
            time_add.addActionListener(this::actionPerformed);
            illegalshulker.addActionListener(this::actionPerformed);
        }


    }


    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == up_players) {
            if (MinecraftClient.getInstance().player == null) {
                log_textarea.setText(log_textarea.getText() + "[" + Calendar.getInstance().get(Calendar.HOUR) + ":"+ Calendar.getInstance().get(Calendar.MINUTE)+ ":"+ Calendar.getInstance().get(Calendar.SECOND) + "]" + "Error: Join a server before updating the player list\n");
                return;
            }

            try {
                players_give.removeAllItems();
                players_fly.removeAllItems();
                players_gamemode.removeAllItems();
                players_heal.removeAllItems();
                players_god.removeAllItems();
                players_tp1.removeAllItems();
                players_tp2.removeAllItems();
                players_kick.removeAllItems();
                players_ban.removeAllItems();
                Collection<PlayerListEntry> playerEntries = Objects.requireNonNull(MinecraftClient.getInstance().getNetworkHandler()).getPlayerList().stream().toList();
                for (PlayerListEntry playerEntry : playerEntries) {
                    String playerName = playerEntry.getProfile().getName();
                    players_give.addItem(playerName);
                    players_fly.addItem(playerName);
                    players_gamemode.addItem(playerName);
                    players_heal.addItem(playerName);
                    players_god.addItem(playerName);
                    players_tp1.addItem(playerName);
                    players_tp2.addItem(playerName);
                    players_kick.addItem(playerName);
                    players_ban.addItem(playerName);
                }
                log_textarea.setText(log_textarea.getText() + "[" + Calendar.getInstance().get(Calendar.HOUR) + ":"+ Calendar.getInstance().get(Calendar.MINUTE)+ ":"+ Calendar.getInstance().get(Calendar.SECOND) + "]" + "Player list updated!\n");
            } catch (Exception ex) {
                StringWriter sw = new StringWriter();
                PrintWriter pw = new PrintWriter(sw);
                ex.printStackTrace(pw);
                String sStackTrace = sw.toString();
                log_textarea.setText(log_textarea.getText() + "[" + Calendar.getInstance().get(Calendar.HOUR) + ":"+ Calendar.getInstance().get(Calendar.MINUTE)+ ":"+ Calendar.getInstance().get(Calendar.SECOND) + "]" + "Error: " + sStackTrace + "\n");
            }

        } else if (e.getSource() == clear_log) {
            log_textarea.setText("[" + Calendar.getInstance().get(Calendar.HOUR) + ":"+ Calendar.getInstance().get(Calendar.MINUTE)+ ":"+ Calendar.getInstance().get(Calendar.SECOND) + "]" + "Log cleared\n");
        } else if (e.getSource() == save_log) {
            JFileChooser fileChooser = new JFileChooser();
            int userSelection = fileChooser.showSaveDialog(null);
            if (userSelection == JFileChooser.APPROVE_OPTION) {
                File fileToSave = fileChooser.getSelectedFile();
                try {
                    FileWriter writer = new FileWriter(fileToSave);
                    writer.write(log_textarea.getText());
                    writer.close();
                    JOptionPane.showMessageDialog(null, "File saved successfully");
                    log_textarea.setText("[" + Calendar.getInstance().get(Calendar.HOUR) + ":"+ Calendar.getInstance().get(Calendar.MINUTE)+ ":"+ Calendar.getInstance().get(Calendar.SECOND) + "]" + "Log saved");
                } catch (IOException ep) {
                    ep.printStackTrace();
                }

            }
        }else if (e.getSource() == give) {
            if (MinecraftClient.getInstance().player == null) {
                log_textarea.setText(log_textarea.getText() + "[" + Calendar.getInstance().get(Calendar.HOUR)+ ":" + Calendar.getInstance().get(Calendar.MINUTE)+ ":"+ Calendar.getInstance().get(Calendar.SECOND)+ "]" + "Error: Join a server\n");
                return;
            }
            executeCommand(MinecraftClient.getInstance().player, "give " + players_fly.getSelectedItem() +" " + items.getSelectedItem()+" "+quantity.getText());
            log_textarea.setText(log_textarea.getText() + "[" + Calendar.getInstance().get(Calendar.HOUR) + ":"+ Calendar.getInstance().get(Calendar.MINUTE)+ ":"+ Calendar.getInstance().get(Calendar.SECOND) + "]" + players_fly.getSelectedItem()  + " given " + Objects.requireNonNull(items.getSelectedItem()) + ".Quantity: " + Objects.requireNonNull(quantity.getText()) + "\n");

        } else if (e.getSource() == fly) {
            if (MinecraftClient.getInstance().player != null) {
                executeCommand(MinecraftClient.getInstance().player, "fly "+ players_gamemode.getSelectedItem());
                log_textarea.setText(log_textarea.getText() + "[" + Calendar.getInstance().get(Calendar.HOUR) + ":"+ Calendar.getInstance().get(Calendar.MINUTE)+ ":"+ Calendar.getInstance().get(Calendar.SECOND) + "]" + "fly permission has been given to "+ players_gamemode.getSelectedItem() + "\n");
            } else {
                log_textarea.setText(log_textarea.getText() + "[" + Calendar.getInstance().get(Calendar.HOUR)+ ":" + Calendar.getInstance().get(Calendar.MINUTE)+ ":"+ Calendar.getInstance().get(Calendar.SECOND)+ "]" + "Error: Join a server\n");
            }

        } else if (e.getSource() == time_set) {
            if (time_set.isSelected()) {
                time_add.setSelected(false);
            }
        } else if (e.getSource() == time_add) {
            if (time_add.isSelected()) {
                time_set.setSelected(false);
            }
        } else if (e.getSource() == time) {
            if (String.valueOf(MinecraftClient.getInstance().player) == null) {
                log_textarea.setText(log_textarea.getText() +"[" + Calendar.getInstance().get(Calendar.HOUR)+ ":" + Calendar.getInstance().get(Calendar.MINUTE)+ ":"+ Calendar.getInstance().get(Calendar.SECOND)+ "]" + "Error: Join a server before updating the time\n");
            }
            if (time_set.isSelected() && MinecraftClient.getInstance().player != null) {
                executeCommand(MinecraftClient.getInstance().player, "time set " + time_choose.getSelectedItem());
            } else if (time_add.isSelected() && !time_textarea.getText().equals("") && MinecraftClient.getInstance().player != null) {
                executeCommand(MinecraftClient.getInstance().player, "time add " + time_textarea.getText());
            } else {
                log_textarea.setText(log_textarea.getText() + "[" + Calendar.getInstance().get(Calendar.HOUR)+ ":" + Calendar.getInstance().get(Calendar.MINUTE)+ ":"+ Calendar.getInstance().get(Calendar.SECOND)+ "]" + "Error: Please select a time or write a number in the time field\n");
            }
        } else if (e.getSource() == gamemode) {
            if (MinecraftClient.getInstance().player == null) {
                log_textarea.setText(log_textarea.getText() + "[" + Calendar.getInstance().get(Calendar.HOUR) + ":"+ Calendar.getInstance().get(Calendar.MINUTE)+ ":"+ Calendar.getInstance().get(Calendar.SECOND) + "]" + "Error: Join a server\n");
                return;
            }
            executeCommand(MinecraftClient.getInstance().player, "gamemode " + players_gamemode.getSelectedItem()+ " " + gamemode_choose.getSelectedItem());
            log_textarea.setText(log_textarea.getText() + "[" + Calendar.getInstance().get(Calendar.HOUR) + ":"+ Calendar.getInstance().get(Calendar.MINUTE)+ ":"+ Calendar.getInstance().get(Calendar.SECOND) + "]" + "Gamemode has been set to " + gamemode_choose.getSelectedItem() + " for "+ players_gamemode.getSelectedItem() + "\n");

        } else if (e.getSource() == weather) {
            if (MinecraftClient.getInstance().player == null) {
                log_textarea.setText(log_textarea.getText() + "[" + Calendar.getInstance().get(Calendar.HOUR) + ":"+ Calendar.getInstance().get(Calendar.MINUTE)+ ":"+ Calendar.getInstance().get(Calendar.SECOND) + "]" + "Error: Join a server\n");
                return;
            }
            executeCommand(MinecraftClient.getInstance().player, "weather " + weather_types.getSelectedItem());
            log_textarea.setText(log_textarea.getText() + "[" + Calendar.getInstance().get(Calendar.HOUR) + ":"+ Calendar.getInstance().get(Calendar.MINUTE)+ ":"+ Calendar.getInstance().get(Calendar.SECOND) + "]" + "weather has been set to " + weather_types.getSelectedItem() + "\n");

        } else if (e.getSource() == op_stick) {
            if (MinecraftClient.getInstance().player == null) {
                log_textarea.setText(log_textarea.getText() + "[" + Calendar.getInstance().get(Calendar.HOUR) + ":"+ Calendar.getInstance().get(Calendar.MINUTE)+ ":"+ Calendar.getInstance().get(Calendar.SECOND) + "]" + "Error: Join a server\n");
                return;
            }
            executeCommand(MinecraftClient.getInstance().player, "give @s minecraft:stick{AttributeModifiers:[{AttributeName:\"generic.max_health\",Amount:1024,UUID:[I;-12339,23398,201033,-46796]},{AttributeName:\"generic.attack_damage\",Amount:2048,UUID:[I;-12339,23498,201033,-46996]}]} 1");
            log_textarea.setText(log_textarea.getText() + "[" +Calendar.getInstance().get(Calendar.HOUR) + ":"+ Calendar.getInstance().get(Calendar.MINUTE)+ ":"+ Calendar.getInstance().get(Calendar.SECOND) + "]" +"Op stick has been given to you\n");

        } else if (e.getSource() == pardon) {
            if (MinecraftClient.getInstance().player == null) {
                log_textarea.setText(log_textarea.getText() + "[" + Calendar.getInstance().get(Calendar.HOUR) + ":"+ Calendar.getInstance().get(Calendar.MINUTE)+ ":"+ Calendar.getInstance().get(Calendar.SECOND) + "]" + "Error: Join a server\n");
                return;
            }
            executeCommand(MinecraftClient.getInstance().player, "pardon " + Objects.requireNonNull(pardon.getText()));
            log_textarea.setText(log_textarea.getText() + "[" +Calendar.getInstance().get(Calendar.HOUR) + ":"+ Calendar.getInstance().get(Calendar.MINUTE)+ ":"+ Calendar.getInstance().get(Calendar.SECOND) + "]" + pardon.getText() + " Unbanned\n");

        } else if (e.getSource() == heal) {
            if (MinecraftClient.getInstance().player == null) {
                log_textarea.setText(log_textarea.getText() + "[" + Calendar.getInstance().get(Calendar.HOUR) + ":"+ Calendar.getInstance().get(Calendar.MINUTE)+ ":"+ Calendar.getInstance().get(Calendar.SECOND) + "]" + "Error: Join a server\n");
                return;
            }
            executeCommand(MinecraftClient.getInstance().player, "heal " + players_heal.getSelectedItem());
            log_textarea.setText(log_textarea.getText() + "[" +Calendar.getInstance().get(Calendar.HOUR) + ":"+ Calendar.getInstance().get(Calendar.MINUTE)+ ":"+ Calendar.getInstance().get(Calendar.SECOND) + "]" + players_heal.getSelectedItem() + " healed\n");
        } else if (e.getSource() == godmode) {
            if (MinecraftClient.getInstance().player == null) {
                log_textarea.setText(log_textarea.getText() + "[" + Calendar.getInstance().get(Calendar.HOUR) + ":"+ Calendar.getInstance().get(Calendar.MINUTE)+ ":"+ Calendar.getInstance().get(Calendar.SECOND) + "]" + "Error: Join a server\n");
                return;
            }
            executeCommand(MinecraftClient.getInstance().player, "godmode "+ players_god.getSelectedItem());
            log_textarea.setText(log_textarea.getText() + "[" +Calendar.getInstance().get(Calendar.HOUR) + ":"+ Calendar.getInstance().get(Calendar.MINUTE)+ ":"+ Calendar.getInstance().get(Calendar.SECOND) + "]" + players_god.getSelectedItem() + " Godmode has been set to "+ players_god.getSelectedItem() + "\n");

        } else if (e.getSource() == tp) {
            if (MinecraftClient.getInstance().player == null) {
                log_textarea.setText(log_textarea.getText() + "[" + Calendar.getInstance().get(Calendar.HOUR) + ":"+ Calendar.getInstance().get(Calendar.MINUTE)+ ":"+ Calendar.getInstance().get(Calendar.SECOND) + "]" + "Error: Join a server\n");
                return;
            }
            executeCommand(MinecraftClient.getInstance().player, "tp " + players_tp1.getSelectedItem()+" " + players_tp2.getSelectedItem());
            log_textarea.setText(log_textarea.getText() + "[" +Calendar.getInstance().get(Calendar.HOUR) + ":"+ Calendar.getInstance().get(Calendar.MINUTE)+ ":"+ Calendar.getInstance().get(Calendar.SECOND) + "]" + players_tp1.getSelectedItem() + " teleported to "+ players_tp2.getSelectedItem() + "\n");

        } else if (e.getSource() == ban) {
            if (MinecraftClient.getInstance().player == null) {
                log_textarea.setText(log_textarea.getText() + "[" + Calendar.getInstance().get(Calendar.HOUR) + ":"+ Calendar.getInstance().get(Calendar.MINUTE)+ ":"+ Calendar.getInstance().get(Calendar.SECOND) + "]" + "Error: Join a server\n");
                return;
            }
            executeCommand(MinecraftClient.getInstance().player, "ban " + players_ban.getSelectedItem()+ " " + reason1.getText());
            log_textarea.setText(log_textarea.getText() + "[" +Calendar.getInstance().get(Calendar.HOUR) + ":"+ Calendar.getInstance().get(Calendar.MINUTE)+ ":"+ Calendar.getInstance().get(Calendar.SECOND) + "]" + players_ban.getSelectedItem() + " banned. Reason: "+reason1.getText() +"\n");
        } else if (e.getSource() == kick) {
            if (MinecraftClient.getInstance().player == null) {
                log_textarea.setText(log_textarea.getText() + "[" + Calendar.getInstance().get(Calendar.HOUR) + ":"+ Calendar.getInstance().get(Calendar.MINUTE)+ ":"+ Calendar.getInstance().get(Calendar.SECOND) + "]" + "Error: Join a server\n");
                return;
            }
            executeCommand(MinecraftClient.getInstance().player, "kick " + players_kick.getSelectedItem() + " " + reason.getText());
            log_textarea.setText(log_textarea.getText() + "[" +Calendar.getInstance().get(Calendar.HOUR) + ":"+ Calendar.getInstance().get(Calendar.MINUTE)+ ":"+ Calendar.getInstance().get(Calendar.SECOND) + "]" + players_fly.getSelectedItem() + " kicked.Reason: "+reason.getText()+"\n");

        } else if (e.getSource() == illegalshulker) {
            if (MinecraftClient.getInstance().player == null) {
                log_textarea.setText(log_textarea.getText() + "[" + Calendar.getInstance().get(Calendar.HOUR) + ":"+ Calendar.getInstance().get(Calendar.MINUTE)+ ":"+ Calendar.getInstance().get(Calendar.SECOND) + "]" + "Error: Join a server\n");
                return;
            }
            executeCommand(MinecraftClient.getInstance().player, "give @s shulker_box{BlockEntityTag:{Items:[{Slot:0,id:shulker_box,Count:64},{Slot:1,id:shulker_box,Count:64},{Slot:2,id:shulker_box,Count:64},{Slot:3,id:shulker_box,Count:64},{Slot:4,id:shulker_box,Count:64},{Slot:5,id:shulker_box,Count:64}]}}");
            log_textarea.setText(log_textarea.getText() + "[" +Calendar.getInstance().get(Calendar.HOUR) + ":"+ Calendar.getInstance().get(Calendar.MINUTE)+ ":"+ Calendar.getInstance().get(Calendar.SECOND) + "]" +"Illegal shulker has been given to you\n");

        } else log_textarea.setText(log_textarea.getText() + "[" +Calendar.getInstance().get(Calendar.HOUR)+ ":" + Calendar.getInstance().get(Calendar.MINUTE)+ ":"+ Calendar.getInstance().get(Calendar.SECOND) +"]"+ "HOW?????");


    }

    public static void executeCommand(ClientPlayerEntity player, String command) {
        player.networkHandler.sendChatCommand(command);
    }
}

