package com.foozey.gems.init;

import com.foozey.gems.Gems;
import com.foozey.gems.items.ModTab;
import com.foozey.gems.items.amulets.*;
import com.foozey.gems.items.armor.*;
import com.foozey.gems.items.bows.*;
import com.foozey.gems.items.crossbows.*;
import com.foozey.gems.items.horse.*;
import com.foozey.gems.items.rings.*;
import com.foozey.gems.items.shields.*;
import com.foozey.gems.items.tools.*;
import com.foozey.gems.util.tiers.ModArmorMaterial;
import com.foozey.gems.util.tiers.ModItemTier;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.*;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModItems {

    // Item Additions
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Gems.MOD_ID);

    // Item Replacements
    public static final DeferredRegister<Item> REPLACE = DeferredRegister.create(ForgeRegistries.ITEMS, "minecraft");



    // Items
    ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    // Topaz
    public static final RegistryObject<Item> TOPAZ = ITEMS.register("topaz", ModItemBase::new);

    // Topaz Shards
    public static final RegistryObject<Item> TOPAZ_SHARDS = ITEMS.register("topaz_shards", ModItemBase::new);

    // Sapphire
    public static final RegistryObject<Item> SAPPHIRE = ITEMS.register("sapphire", ModItemBase::new);

    // Sapphire Shards
    public static final RegistryObject<Item> SAPPHIRE_SHARDS = ITEMS.register("sapphire_shards", ModItemBase::new);

    // Ruby
    public static final RegistryObject<Item> RUBY = ITEMS.register("ruby", ModItemBase::new);

    // Ruby Shards
    public static final RegistryObject<Item> RUBY_SHARDS = ITEMS.register("ruby_shards", ModItemBase::new);

    // Gemspark
    public static final RegistryObject<Item> GEMSPARK = ITEMS.register("gemspark", ModItemBase::new);

    // Onyx
    public static final RegistryObject<Item> ONYX = ITEMS.register("onyx", ModItemBase::new);

    // Onyx Shards
    public static final RegistryObject<Item> ONYX_SHARDS = ITEMS.register("onyx_shards", ModItemBase::new);

    // Infused Onyx Ingot
    public static final RegistryObject<Item> INFUSED_ONYX_INGOT = ITEMS.register("infused_onyx_ingot", ModItemBase::new);

    // Ender Bones
    public static final RegistryObject<Item> ENDER_BONES = ITEMS.register("ender_bones", ModItemBase::new);

    // Ender Scales
    public static final RegistryObject<Item> ENDER_SCALES = ITEMS.register("ender_scales", ModItemBase::new);

    // Infused Ender Scales
    public static final RegistryObject<Item> INFUSED_ENDER_SCALES = ITEMS.register("infused_ender_scales", ModItemBase::new);

    // Chainmail
    public static final RegistryObject<Item> CHAINMAIL = ITEMS.register("chainmail", ModItemBase::new);



    // Block Items
    ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    // Topaz Block
    public static final RegistryObject<Item> TOPAZ_BLOCK_ITEM = ITEMS.register("topaz_block", () ->
            new ModBlockBase(ModBlocks.TOPAZ_BLOCK.get()));

    // Topaz Ore
    public static final RegistryObject<Item> TOPAZ_ORE_ITEM = ITEMS.register("topaz_ore", () ->
            new ModBlockBase(ModBlocks.TOPAZ_ORE.get()));

    // Sapphire Block
    public static final RegistryObject<Item> SAPPHIRE_BLOCK_ITEM = ITEMS.register("sapphire_block", () ->
            new ModBlockBase(ModBlocks.SAPPHIRE_BLOCK.get()));

    // Sapphire Ore
    public static final RegistryObject<Item> SAPPHIRE_ORE_ITEM = ITEMS.register("sapphire_ore", () ->
            new ModBlockBase(ModBlocks.SAPPHIRE_ORE.get()));

    // Ruby Block
    public static final RegistryObject<Item> RUBY_BLOCK_ITEM = ITEMS.register("ruby_block", () ->
            new ModBlockBase(ModBlocks.RUBY_BLOCK.get()));

    // Ruby Ore
    public static final RegistryObject<Item> RUBY_ORE_ITEM = ITEMS.register("ruby_ore", () ->
            new ModBlockBase(ModBlocks.RUBY_ORE.get()));

    // Gemspark Block
    public static final RegistryObject<Item> GEMSPARK_BLOCK_ITEM = ITEMS.register("gemspark_block", () ->
            new ModBlockBase(ModBlocks.GEMSPARK_BLOCK.get()));

    // Gemspark Ore
    public static final RegistryObject<Item> GEMSPARK_ORE_ITEM = ITEMS.register("gemspark_ore", () ->
            new ModBlockBase(ModBlocks.GEMSPARK_ORE.get()));

    // Onyx Block
    public static final RegistryObject<Item> ONYX_BLOCK_ITEM = ITEMS.register("onyx_block", () ->
            new ModBlockBase(ModBlocks.ONYX_BLOCK.get()));

    // Onyx Ore
    public static final RegistryObject<Item> ONYX_ORE_ITEM = ITEMS.register("onyx_ore", () ->
            new ModBlockBase(ModBlocks.ONYX_ORE.get()));

    // Experience Ore
    public static final RegistryObject<Item> EXPERIENCE_ORE_ITEM = ITEMS.register("experience_ore", () ->
            new ModBlockBase(ModBlocks.EXPERIENCE_ORE.get()));

    // Nether Experience Ore
    public static final RegistryObject<Item> NETHER_EXPERIENCE_ORE_ITEM = ITEMS.register("nether_experience_ore", () ->
            new ModBlockBase(ModBlocks.NETHER_EXPERIENCE_ORE.get()));

    // End Experience Ore
    public static final RegistryObject<Item> END_EXPERIENCE_ORE_ITEM = ITEMS.register("end_experience_ore", () ->
            new ModBlockBase(ModBlocks.END_EXPERIENCE_ORE.get()));

    // Bone Fossil
    public static final RegistryObject<Item> BONE_FOSSIL_ITEM = ITEMS.register("bone_fossil", () ->
            new ModBlockBase(ModBlocks.BONE_FOSSIL.get()));

    // Nether Bone Fossil
    public static final RegistryObject<Item> NETHER_BONE_FOSSIL_ITEM = ITEMS.register("nether_bone_fossil", () ->
            new ModBlockBase(ModBlocks.NETHER_BONE_FOSSIL.get()));

    // Rib Fossil
    public static final RegistryObject<Item> RIB_FOSSIL_ITEM = ITEMS.register("rib_fossil", () ->
            new ModBlockBase(ModBlocks.RIB_FOSSIL.get()));

    // Nether Rib Fossil
    public static final RegistryObject<Item> NETHER_RIB_FOSSIL_ITEM = ITEMS.register("nether_rib_fossil", () ->
            new ModBlockBase(ModBlocks.NETHER_RIB_FOSSIL.get()));

    // Skull Fossil
    public static final RegistryObject<Item> SKULL_FOSSIL_ITEM = ITEMS.register("skull_fossil", () ->
            new ModBlockBase(ModBlocks.SKULL_FOSSIL.get()));

    // Nether Skull Fossil
    public static final RegistryObject<Item> NETHER_SKULL_FOSSIL_ITEM = ITEMS.register("nether_skull_fossil", () ->
            new ModBlockBase(ModBlocks.NETHER_SKULL_FOSSIL.get()));

    // Fish Fossil
    public static final RegistryObject<Item> FISH_FOSSIL_ITEM = ITEMS.register("fish_fossil", () ->
            new ModBlockBase(ModBlocks.FISH_FOSSIL.get()));

    // Nether Fish Fossil
    public static final RegistryObject<Item> NETHER_FISH_FOSSIL_ITEM = ITEMS.register("nether_fish_fossil", () ->
            new ModBlockBase(ModBlocks.NETHER_FISH_FOSSIL.get()));

    // Shell Fossil
    public static final RegistryObject<Item> SHELL_FOSSIL_ITEM = ITEMS.register("shell_fossil", () ->
            new ModBlockBase(ModBlocks.SHELL_FOSSIL.get()));

    // Nether Shell Fossil
    public static final RegistryObject<Item> NETHER_SHELL_FOSSIL_ITEM = ITEMS.register("nether_shell_fossil", () ->
            new ModBlockBase(ModBlocks.NETHER_SHELL_FOSSIL.get()));



    // Tools
    ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    // Topaz Sword
    public static final RegistryObject<SwordItem>TOPAZ_SWORD = ITEMS.register("topaz_sword", () ->
            new TopazSword(ModItemTier.TOPAZ, 7, -2.4F, new Item.Properties()
                    .fireResistant()
                    .tab(ModTab.TAB_GEMS)));

    // Topaz Pickaxe
    public static final RegistryObject<PickaxeItem>TOPAZ_PICKAXE = ITEMS.register("topaz_pickaxe", () ->
            new TopazPickaxe(ModItemTier.TOPAZ, 5, -2.8F, new Item.Properties()
                    .fireResistant()
                    .tab(ModTab.TAB_GEMS)));

    // Topaz Axe
    public static final RegistryObject<AxeItem>TOPAZ_AXE = ITEMS.register("topaz_axe", () ->
            new TopazAxe(ModItemTier.TOPAZ, 9, -3.0F, new Item.Properties()
                    .fireResistant()
                    .tab(ModTab.TAB_GEMS)));

    // Topaz Shovel
    public static final RegistryObject<ShovelItem>TOPAZ_SHOVEL = ITEMS.register("topaz_shovel", () ->
            new TopazShovel(ModItemTier.TOPAZ, 5.5F, -3.0F, new Item.Properties()
                    .fireResistant()
                    .tab(ModTab.TAB_GEMS)));

    // Topaz Hoe
    public static final RegistryObject<HoeItem>TOPAZ_HOE = ITEMS.register("topaz_hoe", () ->
            new TopazHoe(ModItemTier.TOPAZ, 0, 0.0F, new Item.Properties()
                    .fireResistant()
                    .tab(ModTab.TAB_GEMS)));

    // Sapphire Sword
    public static final RegistryObject<SwordItem>SAPPHIRE_SWORD = ITEMS.register("sapphire_sword", () ->
            new SapphireSword(ModItemTier.SAPPHIRE, 7, -2.4F, new Item.Properties()
                    .fireResistant()
                    .tab(ModTab.TAB_GEMS)));

    // Sapphire Pickaxe
    public static final RegistryObject<PickaxeItem>SAPPHIRE_PICKAXE = ITEMS.register("sapphire_pickaxe", () ->
            new SapphirePickaxe(ModItemTier.SAPPHIRE, 5, -2.8F, new Item.Properties()
                    .fireResistant()
                    .tab(ModTab.TAB_GEMS)));

    // Sapphire Axe
    public static final RegistryObject<AxeItem>SAPPHIRE_AXE = ITEMS.register("sapphire_axe", () ->
            new SapphireAxe(ModItemTier.SAPPHIRE, 9, -3.0F, new Item.Properties()
                    .fireResistant()
                    .tab(ModTab.TAB_GEMS)));

    // Sapphire Shovel
    public static final RegistryObject<ShovelItem>SAPPHIRE_SHOVEL = ITEMS.register("sapphire_shovel", () ->
            new SapphireShovel(ModItemTier.SAPPHIRE, 5.5F, -3.0F, new Item.Properties()
                    .fireResistant()
                    .tab(ModTab.TAB_GEMS)));

    // Sapphire Hoe
    public static final RegistryObject<HoeItem>SAPPHIRE_HOE = ITEMS.register("sapphire_hoe", () ->
            new SapphireHoe(ModItemTier.SAPPHIRE, 0, 0.0F, new Item.Properties()
                    .fireResistant()
                    .tab(ModTab.TAB_GEMS)));

    // Ruby Sword
    public static final RegistryObject<SwordItem>RUBY_SWORD = ITEMS.register("ruby_sword", () ->
            new RubySword(ModItemTier.RUBY, 7, -2.4F, new Item.Properties()
                    .fireResistant()
                    .tab(ModTab.TAB_GEMS)));

    // Ruby Pickaxe
    public static final RegistryObject<PickaxeItem>RUBY_PICKAXE = ITEMS.register("ruby_pickaxe", () ->
            new RubyPickaxe(ModItemTier.RUBY, 5, -2.8F, new Item.Properties()
                    .fireResistant()
                    .tab(ModTab.TAB_GEMS)));

    // Ruby Axe
    public static final RegistryObject<AxeItem>RUBY_AXE = ITEMS.register("ruby_axe", () ->
            new RubyAxe(ModItemTier.RUBY, 9, -3.0F, new Item.Properties()
                    .fireResistant()
                    .tab(ModTab.TAB_GEMS)));

    // Ruby Shovel
    public static final RegistryObject<ShovelItem>RUBY_SHOVEL = ITEMS.register("ruby_shovel", () ->
            new RubyShovel(ModItemTier.RUBY, 5.5F, -3.0F, new Item.Properties()
                    .fireResistant()
                    .tab(ModTab.TAB_GEMS)));

    // Ruby Hoe
    public static final RegistryObject<HoeItem>RUBY_HOE = ITEMS.register("ruby_hoe", () ->
            new RubyHoe(ModItemTier.RUBY, 0, 0.0F, new Item.Properties()
                    .fireResistant()
                    .tab(ModTab.TAB_GEMS)));

    // Infused Onyx Sword
    public static final RegistryObject<SwordItem>INFUSED_ONYX_SWORD = ITEMS.register("infused_onyx_sword", () ->
            new InfusedOnyxSword(ModItemTier.INFUSED_ONYX, 7, -2.4F, new Item.Properties()
                    .fireResistant()
                    .tab(ModTab.TAB_GEMS)));

    // Infused Onyx Pickaxe
    public static final RegistryObject<PickaxeItem>INFUSED_ONYX_PICKAXE = ITEMS.register("infused_onyx_pickaxe", () ->
            new InfusedOnyxPickaxe(ModItemTier.INFUSED_ONYX, 5, -2.8F, new Item.Properties()
                    .fireResistant()
                    .tab(ModTab.TAB_GEMS)));

    // Infused Onyx Axe
    public static final RegistryObject<AxeItem>INFUSED_ONYX_AXE = ITEMS.register("infused_onyx_axe", () ->
            new InfusedOnyxAxe(ModItemTier.INFUSED_ONYX, 9, -3.0F, new Item.Properties()
                    .fireResistant()
                    .tab(ModTab.TAB_GEMS)));

    // Infused Onyx Shovel
    public static final RegistryObject<ShovelItem>INFUSED_ONYX_SHOVEL = ITEMS.register("infused_onyx_shovel", () ->
            new InfusedOnyxShovel(ModItemTier.INFUSED_ONYX, 5.5F, -3.0F, new Item.Properties()
                    .fireResistant()
                    .tab(ModTab.TAB_GEMS)));

    // Infused Onyx Hoe
    public static final RegistryObject<HoeItem>INFUSED_ONYX_HOE = ITEMS.register("infused_onyx_hoe", () ->
            new InfusedOnyxHoe(ModItemTier.INFUSED_ONYX, 0, 0.0F, new Item.Properties()
                    .fireResistant()
                    .tab(ModTab.TAB_GEMS)));

    // Emerald Sword
    public static final RegistryObject<SwordItem>EMERALD_SWORD = ITEMS.register("emerald_sword", () ->
            new EmeraldSword(ModItemTier.EMERALD, 5, -2.4F, new Item.Properties()
                    .fireResistant()
                    .tab(ModTab.TAB_GEMS)));

    // Emerald Pickaxe
    public static final RegistryObject<PickaxeItem>EMERALD_PICKAXE = ITEMS.register("emerald_pickaxe", () ->
            new EmeraldPickaxe(ModItemTier.EMERALD, 3, -2.8F, new Item.Properties()
                    .fireResistant()
                    .tab(ModTab.TAB_GEMS)));

    // Emerald Axe
    public static final RegistryObject<AxeItem>EMERALD_AXE = ITEMS.register("emerald_axe", () ->
            new EmeraldAxe(ModItemTier.EMERALD, 5, -3.0F, new Item.Properties()
                    .fireResistant()
                    .tab(ModTab.TAB_GEMS)));

    // Emerald Shovel
    public static final RegistryObject<ShovelItem>EMERALD_SHOVEL = ITEMS.register("emerald_shovel", () ->
            new EmeraldShovel(ModItemTier.EMERALD, 3.5F, -3.0F, new Item.Properties()
                    .fireResistant()
                    .tab(ModTab.TAB_GEMS)));

    // Emerald Hoe
    public static final RegistryObject<HoeItem>EMERALD_HOE = ITEMS.register("emerald_hoe", () ->
            new EmeraldHoe(ModItemTier.EMERALD, 0, -1.0F, new Item.Properties()
                    .fireResistant()
                    .tab(ModTab.TAB_GEMS)));



    // Armor
    ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    // Topaz Helmet
    public static final RegistryObject<ArmorItem> TOPAZ_HELMET = ITEMS.register("topaz_helmet", () ->
            new TopazArmor(ModArmorMaterial.TOPAZ, EquipmentSlotType.HEAD, new Item.Properties()
                    .fireResistant()
                    .tab(ModTab.TAB_GEMS)));

    // Topaz Chestplate
    public static final RegistryObject<ArmorItem> TOPAZ_CHESTPLATE = ITEMS.register("topaz_chestplate", () ->
            new TopazArmor(ModArmorMaterial.TOPAZ, EquipmentSlotType.CHEST, new Item.Properties()
                    .fireResistant()
                    .tab(ModTab.TAB_GEMS)));

    // Topaz Leggings
    public static final RegistryObject<ArmorItem> TOPAZ_LEGGINGS = ITEMS.register("topaz_leggings", () ->
            new TopazArmor(ModArmorMaterial.TOPAZ, EquipmentSlotType.LEGS, new Item.Properties()
                    .fireResistant()
                    .tab(ModTab.TAB_GEMS)));

    // Topaz Boots
    public static final RegistryObject<ArmorItem> TOPAZ_BOOTS = ITEMS.register("topaz_boots", () ->
            new TopazArmor(ModArmorMaterial.TOPAZ, EquipmentSlotType.FEET, new Item.Properties()
                    .fireResistant()
                    .tab(ModTab.TAB_GEMS)));

    // Sapphire Helmet
    public static final RegistryObject<ArmorItem> SAPPHIRE_HELMET = ITEMS.register("sapphire_helmet", () ->
            new SapphireArmor(ModArmorMaterial.SAPPHIRE, EquipmentSlotType.HEAD, new Item.Properties()
                    .fireResistant()
                    .tab(ModTab.TAB_GEMS)));

    // Sapphire Chestplate
    public static final RegistryObject<ArmorItem> SAPPHIRE_CHESTPLATE = ITEMS.register("sapphire_chestplate", () ->
            new SapphireArmor(ModArmorMaterial.SAPPHIRE, EquipmentSlotType.CHEST, new Item.Properties()
                    .fireResistant()
                    .tab(ModTab.TAB_GEMS)));

    // Sapphire Leggings
    public static final RegistryObject<ArmorItem> SAPPHIRE_LEGGINGS = ITEMS.register("sapphire_leggings", () ->
            new SapphireArmor(ModArmorMaterial.SAPPHIRE, EquipmentSlotType.LEGS, new Item.Properties()
                    .fireResistant()
                    .tab(ModTab.TAB_GEMS)));

    // Sapphire Boots
    public static final RegistryObject<ArmorItem> SAPPHIRE_BOOTS = ITEMS.register("sapphire_boots", () ->
            new SapphireArmor(ModArmorMaterial.SAPPHIRE, EquipmentSlotType.FEET, new Item.Properties()
                    .fireResistant()
                    .tab(ModTab.TAB_GEMS)));

    // Ruby Helmet
    public static final RegistryObject<ArmorItem> RUBY_HELMET = ITEMS.register("ruby_helmet", () ->
            new RubyArmor(ModArmorMaterial.RUBY, EquipmentSlotType.HEAD, new Item.Properties()
                    .fireResistant()
                    .tab(ModTab.TAB_GEMS)));

    // Ruby Chestplate
    public static final RegistryObject<ArmorItem> RUBY_CHESTPLATE = ITEMS.register("ruby_chestplate", () ->
            new RubyArmor(ModArmorMaterial.RUBY, EquipmentSlotType.CHEST, new Item.Properties()
                    .fireResistant()
                    .tab(ModTab.TAB_GEMS)));

    // Ruby Leggings
    public static final RegistryObject<ArmorItem> RUBY_LEGGINGS = ITEMS.register("ruby_leggings", () ->
            new RubyArmor(ModArmorMaterial.RUBY, EquipmentSlotType.LEGS, new Item.Properties()
                    .fireResistant()
                    .tab(ModTab.TAB_GEMS)));

    // Ruby Boots
    public static final RegistryObject<ArmorItem> RUBY_BOOTS = ITEMS.register("ruby_boots", () ->
            new RubyArmor(ModArmorMaterial.RUBY, EquipmentSlotType.FEET, new Item.Properties()
                    .fireResistant()
                    .tab(ModTab.TAB_GEMS)));

    // Infused Onyx Helmet
    public static final RegistryObject<ArmorItem> INFUSED_ONYX_HELMET = ITEMS.register("infused_onyx_helmet", () ->
            new InfusedOnyxArmor(ModArmorMaterial.INFUSED_ONYX, EquipmentSlotType.HEAD, new Item.Properties()
                    .fireResistant()
                    .tab(ModTab.TAB_GEMS)));

    // Infused Onyx Chestplate
    public static final RegistryObject<ArmorItem> INFUSED_ONYX_CHESTPLATE = ITEMS.register("infused_onyx_chestplate", () ->
            new InfusedOnyxArmor(ModArmorMaterial.INFUSED_ONYX, EquipmentSlotType.CHEST, new Item.Properties()
                    .fireResistant()
                    .tab(ModTab.TAB_GEMS)));

    // Infused Onyx Leggings
    public static final RegistryObject<ArmorItem> INFUSED_ONYX_LEGGINGS = ITEMS.register("infused_onyx_leggings", () ->
            new InfusedOnyxArmor(ModArmorMaterial.INFUSED_ONYX, EquipmentSlotType.LEGS, new Item.Properties()
                    .fireResistant()
                    .tab(ModTab.TAB_GEMS)));

    // Infused Onyx Boots
    public static final RegistryObject<ArmorItem> INFUSED_ONYX_BOOTS = ITEMS.register("infused_onyx_boots", () ->
            new InfusedOnyxArmor(ModArmorMaterial.INFUSED_ONYX, EquipmentSlotType.FEET, new Item.Properties()
                    .fireResistant()
                    .tab(ModTab.TAB_GEMS)));

    // Emerald Helmet
    public static final RegistryObject<ArmorItem> EMERALD_HELMET = ITEMS.register("emerald_helmet", () ->
            new ArmorItem(ModArmorMaterial.EMERALD, EquipmentSlotType.HEAD, new Item.Properties()
                    .fireResistant()
                    .tab(ModTab.TAB_GEMS)));

    // Emerald Chestplate
    public static final RegistryObject<ArmorItem> EMERALD_CHESTPLATE = ITEMS.register("emerald_chestplate", () ->
            new ArmorItem(ModArmorMaterial.EMERALD, EquipmentSlotType.CHEST, new Item.Properties()
                    .fireResistant()
                    .tab(ModTab.TAB_GEMS)));

    // Emerald Leggings
    public static final RegistryObject<ArmorItem> EMERALD_LEGGINGS = ITEMS.register("emerald_leggings", () ->
            new ArmorItem(ModArmorMaterial.EMERALD, EquipmentSlotType.LEGS, new Item.Properties()
                    .fireResistant()
                    .tab(ModTab.TAB_GEMS)));

    // Emerald Boots
    public static final RegistryObject<ArmorItem> EMERALD_BOOTS = ITEMS.register("emerald_boots", () ->
            new ArmorItem(ModArmorMaterial.EMERALD, EquipmentSlotType.FEET, new Item.Properties()
                    .fireResistant()
                    .tab(ModTab.TAB_GEMS)));



    // Bows
    ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    // Wooden Bow
    public static final RegistryObject<Item> BOW = REPLACE.register("bow", () ->
            new WoodenBow(new Item.Properties()));

    // Iron Bow
    public static final RegistryObject<Item> IRON_BOW = ITEMS.register("iron_bow", () ->
            new IronBow(new Item.Properties()));

    // Golden Bow
    public static final RegistryObject<Item> GOLDEN_BOW = ITEMS.register("golden_bow", () ->
            new GoldenBow(new Item.Properties()));

    // Diamond Bow
    public static final RegistryObject<Item> DIAMOND_BOW = ITEMS.register("diamond_bow", () ->
            new DiamondBow(new Item.Properties()));

    // Netherite Bow
    public static final RegistryObject<Item> NETHERITE_BOW = ITEMS.register("netherite_bow", () ->
            new NetheriteBow(new Item.Properties()));

    // Topaz Bow
    public static final RegistryObject<Item> TOPAZ_BOW = ITEMS.register("topaz_bow", () ->
            new TopazBow(new Item.Properties()));

    // Sapphire Bow
    public static final RegistryObject<Item> SAPPHIRE_BOW = ITEMS.register("sapphire_bow", () ->
            new SapphireBow(new Item.Properties()));

    // Ruby Bow
    public static final RegistryObject<Item> RUBY_BOW = ITEMS.register("ruby_bow", () ->
            new RubyBow(new Item.Properties()));

    // Infused Onyx Bow
    public static final RegistryObject<Item> INFUSED_ONYX_BOW = ITEMS.register("infused_onyx_bow", () ->
            new InfusedOnyxBow(new Item.Properties()));

    // Emerald Bow
    public static final RegistryObject<Item> EMERALD_BOW = ITEMS.register("emerald_bow", () ->
            new EmeraldBow(new Item.Properties()));



    // Crossbows
    ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    // Wooden Crossbow
    public static final RegistryObject<Item> CROSSBOW = REPLACE.register("crossbow", () ->
            new WoodenCrossbow(new Item.Properties()));

    // Iron Crossbow
    public static final RegistryObject<Item> IRON_CROSSBOW = ITEMS.register("iron_crossbow", () ->
            new IronCrossbow(new Item.Properties()));

    // Golden Crossbow
    public static final RegistryObject<Item> GOLDEN_CROSSBOW = ITEMS.register("golden_crossbow", () ->
            new GoldenCrossbow(new Item.Properties()));

    // Diamond Crossbow
    public static final RegistryObject<Item> DIAMOND_CROSSBOW = ITEMS.register("diamond_crossbow", () ->
            new DiamondCrossbow(new Item.Properties()));

    // Netherite Crossbow
    public static final RegistryObject<Item> NETHERITE_CROSSBOW = ITEMS.register("netherite_crossbow", () ->
            new NetheriteCrossbow(new Item.Properties()));

    // Topaz Crossbow
    public static final RegistryObject<Item> TOPAZ_CROSSBOW = ITEMS.register("topaz_crossbow", () ->
            new TopazCrossbow(new Item.Properties()));

    // Sapphire Crossbow
    public static final RegistryObject<Item> SAPPHIRE_CROSSBOW = ITEMS.register("sapphire_crossbow", () ->
            new SapphireCrossbow(new Item.Properties()));

    // Ruby Crossbow
    public static final RegistryObject<Item> RUBY_CROSSBOW = ITEMS.register("ruby_crossbow", () ->
            new RubyCrossbow(new Item.Properties()));

    // Infused Onyx Crossbow
    public static final RegistryObject<Item> INFUSED_ONYX_CROSSBOW = ITEMS.register("infused_onyx_crossbow", () ->
            new InfusedOnyxCrossbow(new Item.Properties()));

    // Emerald Crossbow
    public static final RegistryObject<Item> EMERALD_CROSSBOW = ITEMS.register("emerald_crossbow", () ->
            new EmeraldCrossbow(new Item.Properties()));



    // Shields
    ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    // Wooden Shield
    public static final RegistryObject<Item> SHIELD = REPLACE.register("shield", () ->
            new WoodenShield(new Item.Properties()));

    // Iron Shield
    public static final RegistryObject<Item> IRON_SHIELD = ITEMS.register("iron_shield", () ->
            new IronShield(new Item.Properties()));

    // Golden Shield
    public static final RegistryObject<Item> GOLDEN_SHIELD = ITEMS.register("golden_shield", () ->
            new GoldenShield(new Item.Properties()));

    // Diamond Shield
    public static final RegistryObject<Item> DIAMOND_SHIELD = ITEMS.register("diamond_shield", () ->
            new DiamondShield(new Item.Properties()));

    // Netherite Shield
    public static final RegistryObject<Item> NETHERITE_SHIELD = ITEMS.register("netherite_shield", () ->
            new NetheriteShield(new Item.Properties()));

    // Topaz Shield
    public static final RegistryObject<Item> TOPAZ_SHIELD = ITEMS.register("topaz_shield", () ->
            new TopazShield(new Item.Properties()));

    // Sapphire Shield
    public static final RegistryObject<Item> SAPPHIRE_SHIELD = ITEMS.register("sapphire_shield", () ->
            new SapphireShield(new Item.Properties()));

    // Ruby Shield
    public static final RegistryObject<Item> RUBY_SHIELD = ITEMS.register("ruby_shield", () ->
            new RubyShield(new Item.Properties()));

    // Infused Onyx Shield
    public static final RegistryObject<Item> INFUSED_ONYX_SHIELD = ITEMS.register("infused_onyx_shield", () ->
            new InfusedOnyxShield(new Item.Properties()));

    // Emerald Shield
    public static final RegistryObject<Item> EMERALD_SHIELD = ITEMS.register("emerald_shield", () ->
            new EmeraldShield(new Item.Properties()));



    // Horse Armor
    ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    // Chainmail Horse Armor
    public static final RegistryObject<Item> CHAINMAIL_HORSE_ARMOR = ITEMS.register("chainmail_horse_armor", () ->
            new ChainmailHorseArmor(new Item.Properties()));

    // Netherite Horse Armor
    public static final RegistryObject<Item> NETHERITE_HORSE_ARMOR = ITEMS.register("netherite_horse_armor", () ->
            new NetheriteHorseArmor(new Item.Properties()));

    // Topaz Horse Armor
    public static final RegistryObject<Item> TOPAZ_HORSE_ARMOR = ITEMS.register("topaz_horse_armor", () ->
            new TopazHorseArmor(new Item.Properties()));

    // Sapphire Horse Armor
    public static final RegistryObject<Item> SAPPHIRE_HORSE_ARMOR = ITEMS.register("sapphire_horse_armor", () ->
            new SapphireHorseArmor(new Item.Properties()));

    // Ruby Horse Armor
    public static final RegistryObject<Item> RUBY_HORSE_ARMOR = ITEMS.register("ruby_horse_armor", () ->
            new RubyHorseArmor(new Item.Properties()));

    // Infused Onyx Horse Armor
    public static final RegistryObject<Item> INFUSED_ONYX_HORSE_ARMOR = ITEMS.register("infused_onyx_horse_armor", () ->
            new InfusedOnyxHorseArmor(new Item.Properties()));

    // Emerald Horse Armor
    public static final RegistryObject<Item> EMERALD_HORSE_ARMOR = ITEMS.register("emerald_horse_armor", () ->
            new EmeraldHorseArmor(new Item.Properties()));



    // Amulets
    ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    // Golden Amulet
    public static final RegistryObject<Item> GOLDEN_AMULET = ITEMS.register("golden_amulet", () ->
            new GoldenAmulet(new Item.Properties()));

    // Gemspark Amulet
    public static final RegistryObject<Item> GEMSPARK_AMULET = ITEMS.register("gemspark_amulet", () ->
            new GemsparkAmulet(new Item.Properties()));

    // Topaz Amulet
    public static final RegistryObject<Item> TOPAZ_AMULET = ITEMS.register("topaz_amulet", () ->
            new TopazAmulet(new Item.Properties()));

    // Sapphire Amulet
    public static final RegistryObject<Item> SAPPHIRE_AMULET = ITEMS.register("sapphire_amulet", () ->
            new SapphireAmulet(new Item.Properties()));

    // Ruby Amulet
    public static final RegistryObject<Item> RUBY_AMULET = ITEMS.register("ruby_amulet", () ->
            new RubyAmulet(new Item.Properties()));



    // Rings
    ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    // Golden Ring
    public static final RegistryObject<Item> GOLDEN_RING = ITEMS.register("golden_ring", () ->
            new GoldenRing(new Item.Properties()));

    // Gemspark Ring
    public static final RegistryObject<Item> GEMSPARK_RING = ITEMS.register("gemspark_ring", () ->
            new GemsparkRing(new Item.Properties()));

    // Topaz Ring
    public static final RegistryObject<Item> TOPAZ_RING = ITEMS.register("topaz_ring", () ->
            new TopazRing(new Item.Properties()));

    // Sapphire Ring
    public static final RegistryObject<Item> SAPPHIRE_RING = ITEMS.register("sapphire_ring", () ->
            new SapphireRing(new Item.Properties()));

    // Ruby Ring
    public static final RegistryObject<Item> RUBY_RING = ITEMS.register("ruby_ring", () ->
            new RubyRing(new Item.Properties()));

}
