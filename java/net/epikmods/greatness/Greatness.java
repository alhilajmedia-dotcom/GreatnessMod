package net.epikmods.greatness;

import net.epikmods.greatness.items.LongSword;
import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.component.type.AttributeModifierSlot;
import net.minecraft.component.type.AttributeModifiersComponent;
import net.minecraft.entity.attribute.EntityAttributeModifier;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.item.Items;
import net.minecraft.item.ToolMaterial;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.function.Function;

public class Greatness implements ModInitializer {

    public static final String MOD_ID = "greatness";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    //--------------------------------------------------------------
// LONG SWORDS (Range: +1.5)
//--------------------------------------------------------------
    public static final LongSword ITEM_LONG_SWORD_NETHERITE = (LongSword) registerItem("item_long_sword_netherite", LongSword::new, createSettings(ToolMaterial.NETHERITE, 8.0f, 1.0f, 1.5));
    public static final LongSword ITEM_LONG_SWORD_DIAMOND = (LongSword) registerItem("item_long_sword_diamond", LongSword::new, createSettings(ToolMaterial.DIAMOND, 7.0f, 0.9f, 1.5));
    public static final LongSword ITEM_LONG_SWORD_IRON = (LongSword) registerItem("item_long_sword_iron", LongSword::new, createSettings(ToolMaterial.IRON, 6.0f, 0.8f, 1.5));
    public static final LongSword ITEM_LONG_SWORD_COPPER = (LongSword) registerItem("item_long_sword_copper", LongSword::new, createSettings(ToolMaterial.COPPER, 5.0f, 0.6f, 1.5));
    public static final LongSword ITEM_LONG_SWORD_GOLD = (LongSword) registerItem("item_long_sword_gold", LongSword::new, createSettings(ToolMaterial.GOLD, 5.5f, 0.6f, 1.5));
    public static final LongSword ITEM_LONG_SWORD_STONE = (LongSword) registerItem("item_long_sword_stone", LongSword::new, createSettings(ToolMaterial.STONE, 5.0f, 0.6f, 1.5));
    public static final LongSword ITEM_LONG_SWORD_WOOD = (LongSword) registerItem("item_long_sword_wood", LongSword::new, createSettings(ToolMaterial.WOOD, 4.0f, 0.5f, 1.5));

    //--------------------------------------------------------------
// GREATAXES (Range: +2.0)
//--------------------------------------------------------------
    public static final LongSword ITEM_GREATAXE_NETHERITE = (LongSword) registerItem("item_greataxe_netherite", LongSword::new, createSettings(ToolMaterial.NETHERITE, 11.5f, 0.55f, 2.0));
    public static final LongSword ITEM_GREATAXE_DIAMOND = (LongSword) registerItem("item_greataxe_diamond", LongSword::new, createSettings(ToolMaterial.DIAMOND, 10.5f, 0.45f, 2.0));
    public static final LongSword ITEM_GREATAXE_IRON = (LongSword) registerItem("item_greataxe_iron", LongSword::new, createSettings(ToolMaterial.IRON, 9.5f, 0.35f, 2.0));
    public static final LongSword ITEM_GREATAXE_COPPER = (LongSword) registerItem("item_greataxe_copper", LongSword::new, createSettings(ToolMaterial.COPPER, 8.5f, 0.15f, 2.0));
    public static final LongSword ITEM_GREATAXE_GOLD = (LongSword) registerItem("item_greataxe_gold", LongSword::new, createSettings(ToolMaterial.GOLD, 9.0f, 0.15f, 2.0));
    public static final LongSword ITEM_GREATAXE_STONE = (LongSword) registerItem("item_greataxe_stone", LongSword::new, createSettings(ToolMaterial.STONE, 8.5f, 0.15f, 2.0));
    public static final LongSword ITEM_GREATAXE_WOOD = (LongSword) registerItem("item_greataxe_wood", LongSword::new, createSettings(ToolMaterial.WOOD, 7.5f, 0.1f, 2.0));

    //--------------------------------------------------------------
// GREATSWORDS (Range: +2.5)
//--------------------------------------------------------------
    public static final LongSword ITEM_GREATSWORD_NETHERITE = (LongSword) registerItem("item_greatsword_netherite", LongSword::new, createSettings(ToolMaterial.NETHERITE, 10.0f, 0.65f, 2.5));
    public static final LongSword ITEM_GREATSWORD_DIAMOND = (LongSword) registerItem("item_greatsword_diamond", LongSword::new, createSettings(ToolMaterial.DIAMOND, 9.0f, 0.55f, 2.5));
    public static final LongSword ITEM_GREATSWORD_IRON = (LongSword) registerItem("item_greatsword_iron", LongSword::new, createSettings(ToolMaterial.IRON, 8.0f, 0.45f, 2.5));
    public static final LongSword ITEM_GREATSWORD_COPPER = (LongSword) registerItem("item_greatsword_copper", LongSword::new, createSettings(ToolMaterial.COPPER, 7.0f, 0.35f, 2.5));
    public static final LongSword ITEM_GREATSWORD_GOLD = (LongSword) registerItem("item_greatsword_gold", LongSword::new, createSettings(ToolMaterial.GOLD, 7.5f, 0.35f, 2.5));
    public static final LongSword ITEM_GREATSWORD_STONE = (LongSword) registerItem("item_greatsword_stone", LongSword::new, createSettings(ToolMaterial.STONE, 7.0f, 0.35f, 2.5));
    public static final LongSword ITEM_GREATSWORD_WOOD = (LongSword) registerItem("item_greatsword_wood", LongSword::new, createSettings(ToolMaterial.WOOD, 6.0f, 0.15f, 2.5));

    //--------------------------------------------------------------
// MACHETES (Range: +0.5)
//--------------------------------------------------------------
    public static final LongSword ITEM_MACHETE_NETHERITE = (LongSword) registerItem("item_machete_netherite", LongSword::new, createSettings(ToolMaterial.NETHERITE, 7.75f, 1.0f, 0.5));
    public static final LongSword ITEM_MACHETE_DIAMOND = (LongSword) registerItem("item_machete_diamond", LongSword::new, createSettings(ToolMaterial.DIAMOND, 6.75f, 0.9f, 0.5));
    public static final LongSword ITEM_MACHETE_IRON = (LongSword) registerItem("item_machete_iron", LongSword::new, createSettings(ToolMaterial.IRON, 5.75f, 0.8f, 0.5));
    public static final LongSword ITEM_MACHETE_COPPER = (LongSword) registerItem("item_machete_copper", LongSword::new, createSettings(ToolMaterial.COPPER, 4.75f, 0.6f, 0.5));
    public static final LongSword ITEM_MACHETE_GOLD = (LongSword) registerItem("item_machete_gold", LongSword::new, createSettings(ToolMaterial.GOLD, 5.25f, 0.6f, 0.5));
    public static final LongSword ITEM_MACHETE_STONE = (LongSword) registerItem("item_machete_stone", LongSword::new, createSettings(ToolMaterial.STONE, 4.75f, 0.6f, 0.5));
    public static final LongSword ITEM_MACHETE_WOOD = (LongSword) registerItem("item_machete_wood", LongSword::new, createSettings(ToolMaterial.WOOD, 3.75f, 0.5f, 0.5));

    //--------------------------------------------------------------
// KATANAS (Range: +1.0)
//--------------------------------------------------------------
    public static final LongSword ITEM_KATANA_NETHERITE = (LongSword) registerItem("item_katana_netherite", LongSword::new, createSettings(ToolMaterial.NETHERITE, 8.0f, 1.35f, 1.0));
    public static final LongSword ITEM_KATANA_DIAMOND = (LongSword) registerItem("item_katana_diamond", LongSword::new, createSettings(ToolMaterial.DIAMOND, 7.0f, 1.25f, 1.0));
    public static final LongSword ITEM_KATANA_IRON = (LongSword) registerItem("item_katana_iron", LongSword::new, createSettings(ToolMaterial.IRON, 6.0f, 1.15f, 1.0));
    public static final LongSword ITEM_KATANA_COPPER = (LongSword) registerItem("item_katana_copper", LongSword::new, createSettings(ToolMaterial.COPPER, 5.0f, 0.95f, 1.0));
    public static final LongSword ITEM_KATANA_GOLD = (LongSword) registerItem("item_katana_gold", LongSword::new, createSettings(ToolMaterial.GOLD, 4.0f, 0.95f, 1.0));
    public static final LongSword ITEM_KATANA_STONE = (LongSword) registerItem("item_katana_stone", LongSword::new, createSettings(ToolMaterial.STONE, 3.0f, 0.95f, 1.0));
    public static final LongSword ITEM_KATANA_WOOD = (LongSword) registerItem("item_katana_wood", LongSword::new, createSettings(ToolMaterial.WOOD, 2.0f, 0.85f, 1.0));

    //--------------------------------------------------------------
// DAGGERS (Range: -1.0)
//--------------------------------------------------------------
    public static final LongSword ITEM_DAGGER_NETHERITE = (LongSword) registerItem("item_dagger_netherite", LongSword::new, createSettings(ToolMaterial.NETHERITE, 7.0f, 1.35f, -1.0));
    public static final LongSword ITEM_DAGGER_DIAMOND = (LongSword) registerItem("item_dagger_diamond", LongSword::new, createSettings(ToolMaterial.DIAMOND, 6.0f, 1.25f, -1.0));
    public static final LongSword ITEM_DAGGER_IRON = (LongSword) registerItem("item_dagger_iron", LongSword::new, createSettings(ToolMaterial.IRON, 5.0f, 1.15f, -1.0));
    public static final LongSword ITEM_DAGGER_COPPER = (LongSword) registerItem("item_dagger_copper", LongSword::new, createSettings(ToolMaterial.COPPER, 4.0f, 0.95f, -1.0));
    public static final LongSword ITEM_DAGGER_GOLD = (LongSword) registerItem("item_dagger_gold", LongSword::new, createSettings(ToolMaterial.GOLD, 4.5f, 0.95f, -1.0));
    public static final LongSword ITEM_DAGGER_STONE = (LongSword) registerItem("item_dagger_stone", LongSword::new, createSettings(ToolMaterial.STONE, 4.0f, 0.95f, -1.0));
    public static final LongSword ITEM_DAGGER_WOOD = (LongSword) registerItem("item_dagger_wood", LongSword::new, createSettings(ToolMaterial.WOOD, 3.0f, 0.75f, -1.0));

    //--------------------------------------------------------------
// CLUBS (Range: +0.0 - Normal)
//--------------------------------------------------------------
    public static final LongSword ITEM_CLUB_NETHERITE = (LongSword) registerItem("item_club_netherite", LongSword::new, createSettings(ToolMaterial.NETHERITE, 7.0f, 1.0f, 0.0));
    public static final LongSword ITEM_CLUB_DIAMOND = (LongSword) registerItem("item_club_diamond", LongSword::new, createSettings(ToolMaterial.DIAMOND, 6.0f, 0.9f, 0.0));
    public static final LongSword ITEM_CLUB_IRON = (LongSword) registerItem("item_club_iron", LongSword::new, createSettings(ToolMaterial.IRON, 5.0f, 0.8f, 0.0));
    public static final LongSword ITEM_CLUB_COPPER = (LongSword) registerItem("item_club_copper", LongSword::new, createSettings(ToolMaterial.COPPER, 4.0f, 0.6f, 0.0));
    public static final LongSword ITEM_CLUB_GOLD = (LongSword) registerItem("item_club_gold", LongSword::new, createSettings(ToolMaterial.GOLD, 4.5f, 0.6f, 0.0));
    public static final LongSword ITEM_CLUB_STONE = (LongSword) registerItem("item_club_stone", LongSword::new, createSettings(ToolMaterial.STONE, 4.0f, 0.6f, 0.0));
    public static final LongSword ITEM_CLUB_WOOD = (LongSword) registerItem("item_club_wood", LongSword::new, createSettings(ToolMaterial.WOOD, 3.0f, 0.5f, 0.0));

    //--------------------------------------------------------------
// SCYTHES (Range: +3.0)
//--------------------------------------------------------------
    public static final LongSword ITEM_SCYTHE_NETHERITE = (LongSword) registerItem("item_scythe_netherite", LongSword::new, createSettings(ToolMaterial.NETHERITE, 13.0f, 0.2f, 3.0));
    public static final LongSword ITEM_SCYTHE_DIAMOND = (LongSword) registerItem("item_scythe_diamond", LongSword::new, createSettings(ToolMaterial.DIAMOND, 12.0f, 0.175f, 3.0));
    public static final LongSword ITEM_SCYTHE_IRON = (LongSword) registerItem("item_scythe_iron", LongSword::new, createSettings(ToolMaterial.IRON, 11.0f, 0.1f, 3.0));
    public static final LongSword ITEM_SCYTHE_COPPER = (LongSword) registerItem("item_scythe_copper", LongSword::new, createSettings(ToolMaterial.COPPER, 10.0f, 0.75f, 3.0));
    public static final LongSword ITEM_SCYTHE_GOLD = (LongSword) registerItem("item_scythe_gold", LongSword::new, createSettings(ToolMaterial.GOLD, 10.0f, 0.75f, 3.0));
    public static final LongSword ITEM_SCYTHE_STONE = (LongSword) registerItem("item_scythe_stone", LongSword::new, createSettings(ToolMaterial.STONE, 10.0f, 0.75f, 3.0));
    public static final LongSword ITEM_SCYTHE_WOOD = (LongSword) registerItem("item_scythe_wood", LongSword::new, createSettings(ToolMaterial.WOOD, 9.0f, 0.025f, 3.0));
    //--------------------------------------------------------------

    public static Item registerItem(String path, Function<Item.Settings, Item> factory, Item.Settings settings) {
        final RegistryKey<Item> registryKey = RegistryKey.of(RegistryKeys.ITEM,
                Identifier.of(MOD_ID, path));
        return Items.register(registryKey, factory, settings);
    }

    public void onInitialize() {
        Greatness.initialize();
    }

    public static void initialize() {
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.COMBAT)
                .register((itemGroup) -> itemGroup.add(Greatness.ITEM_LONG_SWORD_NETHERITE));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.COMBAT)
                .register((itemGroup) -> itemGroup.add(Greatness.ITEM_LONG_SWORD_DIAMOND));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.COMBAT)
                .register((itemGroup) -> itemGroup.add(Greatness.ITEM_LONG_SWORD_IRON));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.COMBAT)
                .register((itemGroup) -> itemGroup.add(Greatness.ITEM_LONG_SWORD_COPPER));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.COMBAT)
                .register((itemGroup) -> itemGroup.add(Greatness.ITEM_LONG_SWORD_STONE));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.COMBAT)
                .register((itemGroup) -> itemGroup.add(Greatness.ITEM_LONG_SWORD_WOOD));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.COMBAT)
                .register((itemGroup) -> itemGroup.add(Greatness.ITEM_LONG_SWORD_GOLD));

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.COMBAT)
                .register((itemGroup) -> itemGroup.add(Greatness.ITEM_GREATAXE_NETHERITE));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.COMBAT)
                .register((itemGroup) -> itemGroup.add(Greatness.ITEM_GREATAXE_DIAMOND));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.COMBAT)
                .register((itemGroup) -> itemGroup.add(Greatness.ITEM_GREATAXE_IRON));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.COMBAT)
                .register((itemGroup) -> itemGroup.add(Greatness.ITEM_GREATAXE_COPPER));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.COMBAT)
                .register((itemGroup) -> itemGroup.add(Greatness.ITEM_GREATAXE_STONE));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.COMBAT)
                .register((itemGroup) -> itemGroup.add(Greatness.ITEM_GREATAXE_WOOD));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.COMBAT)
                .register((itemGroup) -> itemGroup.add(Greatness.ITEM_GREATAXE_GOLD));

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.COMBAT)
                .register((itemGroup) -> itemGroup.add(Greatness.ITEM_GREATSWORD_NETHERITE));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.COMBAT)
                .register((itemGroup) -> itemGroup.add(Greatness.ITEM_GREATSWORD_DIAMOND));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.COMBAT)
                .register((itemGroup) -> itemGroup.add(Greatness.ITEM_GREATSWORD_IRON));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.COMBAT)
                .register((itemGroup) -> itemGroup.add(Greatness.ITEM_GREATSWORD_COPPER));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.COMBAT)
                .register((itemGroup) -> itemGroup.add(Greatness.ITEM_GREATSWORD_STONE));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.COMBAT)
                .register((itemGroup) -> itemGroup.add(Greatness.ITEM_GREATSWORD_WOOD));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.COMBAT)
                .register((itemGroup) -> itemGroup.add(Greatness.ITEM_GREATSWORD_GOLD));

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.COMBAT)
                .register((itemGroup) -> itemGroup.add(Greatness.ITEM_MACHETE_NETHERITE));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.COMBAT)
                .register((itemGroup) -> itemGroup.add(Greatness.ITEM_MACHETE_DIAMOND));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.COMBAT)
                .register((itemGroup) -> itemGroup.add(Greatness.ITEM_MACHETE_IRON));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.COMBAT)
                .register((itemGroup) -> itemGroup.add(Greatness.ITEM_MACHETE_COPPER));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.COMBAT)
                .register((itemGroup) -> itemGroup.add(Greatness.ITEM_MACHETE_STONE));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.COMBAT)
                .register((itemGroup) -> itemGroup.add(Greatness.ITEM_MACHETE_WOOD));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.COMBAT)
                .register((itemGroup) -> itemGroup.add(Greatness.ITEM_MACHETE_GOLD));

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.COMBAT)
                .register((itemGroup) -> itemGroup.add(Greatness.ITEM_KATANA_NETHERITE));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.COMBAT)
                .register((itemGroup) -> itemGroup.add(Greatness.ITEM_KATANA_DIAMOND));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.COMBAT)
                .register((itemGroup) -> itemGroup.add(Greatness.ITEM_KATANA_IRON));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.COMBAT)
                .register((itemGroup) -> itemGroup.add(Greatness.ITEM_KATANA_COPPER));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.COMBAT)
                .register((itemGroup) -> itemGroup.add(Greatness.ITEM_KATANA_STONE));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.COMBAT)
                .register((itemGroup) -> itemGroup.add(Greatness.ITEM_KATANA_WOOD));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.COMBAT)
                .register((itemGroup) -> itemGroup.add(Greatness.ITEM_KATANA_GOLD));

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.COMBAT)
                .register((itemGroup) -> itemGroup.add(Greatness.ITEM_DAGGER_NETHERITE));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.COMBAT)
                .register((itemGroup) -> itemGroup.add(Greatness.ITEM_DAGGER_DIAMOND));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.COMBAT)
                .register((itemGroup) -> itemGroup.add(Greatness.ITEM_DAGGER_IRON));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.COMBAT)
                .register((itemGroup) -> itemGroup.add(Greatness.ITEM_DAGGER_COPPER));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.COMBAT)
                .register((itemGroup) -> itemGroup.add(Greatness.ITEM_DAGGER_STONE));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.COMBAT)
                .register((itemGroup) -> itemGroup.add(Greatness.ITEM_DAGGER_WOOD));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.COMBAT)
                .register((itemGroup) -> itemGroup.add(Greatness.ITEM_DAGGER_GOLD));

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.COMBAT)
                .register((itemGroup) -> itemGroup.add(Greatness.ITEM_CLUB_NETHERITE));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.COMBAT)
                .register((itemGroup) -> itemGroup.add(Greatness.ITEM_CLUB_DIAMOND));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.COMBAT)
                .register((itemGroup) -> itemGroup.add(Greatness.ITEM_CLUB_IRON));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.COMBAT)
                .register((itemGroup) -> itemGroup.add(Greatness.ITEM_CLUB_COPPER));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.COMBAT)
                .register((itemGroup) -> itemGroup.add(Greatness.ITEM_CLUB_STONE));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.COMBAT)
                .register((itemGroup) -> itemGroup.add(Greatness.ITEM_CLUB_WOOD));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.COMBAT)
                .register((itemGroup) -> itemGroup.add(Greatness.ITEM_CLUB_GOLD));

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.COMBAT)
                .register((itemGroup) -> itemGroup.add(Greatness.ITEM_SCYTHE_NETHERITE));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.COMBAT)
                .register((itemGroup) -> itemGroup.add(Greatness.ITEM_SCYTHE_DIAMOND));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.COMBAT)
                .register((itemGroup) -> itemGroup.add(Greatness.ITEM_SCYTHE_IRON));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.COMBAT)
                .register((itemGroup) -> itemGroup.add(Greatness.ITEM_SCYTHE_COPPER));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.COMBAT)
                .register((itemGroup) -> itemGroup.add(Greatness.ITEM_SCYTHE_STONE));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.COMBAT)
                .register((itemGroup) -> itemGroup.add(Greatness.ITEM_SCYTHE_WOOD));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.COMBAT)
                .register((itemGroup) -> itemGroup.add(Greatness.ITEM_SCYTHE_GOLD));
    }

    private static Item.Settings createSettings(ToolMaterial material, float dmg, float speed, double rangeBonus) {
        float damageModifier = dmg - 1.0f;
        float speedModifier = speed - 4.0f;

        return new Item.Settings().maxCount(1).attributeModifiers(
                AttributeModifiersComponent.builder()
                        .add(EntityAttributes.ATTACK_DAMAGE,
                                new EntityAttributeModifier(Item.BASE_ATTACK_DAMAGE_MODIFIER_ID, damageModifier, EntityAttributeModifier.Operation.ADD_VALUE), AttributeModifierSlot.MAINHAND)
                        .add(EntityAttributes.ATTACK_SPEED,
                                new EntityAttributeModifier(Item.BASE_ATTACK_SPEED_MODIFIER_ID, speedModifier, EntityAttributeModifier.Operation.ADD_VALUE), AttributeModifierSlot.MAINHAND)
                        .add(EntityAttributes.ENTITY_INTERACTION_RANGE,
                                new EntityAttributeModifier(Identifier.of("greatness", "weapon_range"), rangeBonus, EntityAttributeModifier.Operation.ADD_VALUE), AttributeModifierSlot.MAINHAND)
                        .build()
        );
    }

}