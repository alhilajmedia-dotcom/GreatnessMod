package com.pmabid.greatness.themoddings;

import com.google.common.collect.ImmutableMultimap;
import com.google.common.collect.Multimap;
import com.pmabid.greatness.Greatness;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.EquipmentSlotGroup;
import net.minecraft.world.entity.ai.attributes.Attribute;
import net.minecraft.world.entity.ai.attributes.AttributeModifier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ToolMaterial;
import net.minecraft.world.item.component.ItemAttributeModifiers;
import net.minecraftforge.common.ForgeMod;
import net.minecraftforge.eventbus.api.bus.BusGroup;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.UUID;
import java.util.function.Supplier;

public class ModItems {

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Greatness.MODID);

    //--------------------------------------------------------------
// LONG SWORDS (Range: +1.5)
//--------------------------------------------------------------
    public static final RegistryObject<Item> ITEM_LONG_SWORD_NETHERITE = registerWeapon("item_long_sword_netherite", 8.0f, 1.0f, 1.5f);
    public static final RegistryObject<Item> ITEM_LONG_SWORD_DIAMOND = registerWeapon("item_long_sword_diamond", 7.0f, 0.9f, 1.5f);
    public static final RegistryObject<Item> ITEM_LONG_SWORD_IRON = registerWeapon("item_long_sword_iron", 6.0f, 0.8f, 1.5f);
    public static final RegistryObject<Item> ITEM_LONG_SWORD_COPPER = registerWeapon("item_long_sword_copper", 5.0f, 0.6f, 1.5f);
    public static final RegistryObject<Item> ITEM_LONG_SWORD_GOLD = registerWeapon("item_long_sword_gold", 5.5f, 0.6f, 1.5f);
    public static final RegistryObject<Item> ITEM_LONG_SWORD_STONE = registerWeapon("item_long_sword_stone", 5.0f, 0.6f, 1.5f);
    public static final RegistryObject<Item> ITEM_LONG_SWORD_WOOD = registerWeapon("item_long_sword_wood", 4.0f, 0.5f, 1.5f);
    //-----static final ---------------------------------------------------------
// GREATAXEstatic final S (Range: +2.0)
//---------static final -----------------------------------------------------
    public static final RegistryObject<Item> ITEM_GREATAXE_NETHERITE = registerWeapon("item_greataxe_netherite", 11.5f, 0.55f, 2.0f);
    public static final RegistryObject<Item> ITEM_GREATAXE_DIAMOND = registerWeapon("item_greataxe_diamond", 10.5f, 0.45f, 2.0f);
    public static final RegistryObject<Item> ITEM_GREATAXE_IRON = registerWeapon("item_greataxe_iron", 9.5f, 0.35f, 2.0f);
    public static final RegistryObject<Item> ITEM_GREATAXE_COPPER = registerWeapon("item_greataxe_copper", 8.5f, 0.15f, 2.0f);
    public static final RegistryObject<Item> ITEM_GREATAXE_GOLD = registerWeapon("item_greataxe_gold", 9.0f, 0.15f, 2.0f);
    public static final RegistryObject<Item> ITEM_GREATAXE_STONE = registerWeapon("item_greataxe_stone", 8.5f, 0.15f, 2.0f);
    public static final RegistryObject<Item> ITEM_GREATAXE_WOOD = registerWeapon("item_greataxe_wood", 7.5f, 0.1f, 2.0f);
    //-----static final ---------------------------------------------------------
// GREATSWOstatic final RDS (Range: +2.5)
//---------static final -----------------------------------------------------
    public static final RegistryObject<Item> ITEM_GREATSWORD_NETHERITE = registerWeapon("item_greatsword_netherite", 10.0f, 0.65f, 2.5f);
    public static final RegistryObject<Item> ITEM_GREATSWORD_DIAMOND = registerWeapon("item_greatsword_diamond", 9.0f, 0.55f, 2.5f);
    public static final RegistryObject<Item> ITEM_GREATSWORD_IRON = registerWeapon("item_greatsword_iron", 8.0f, 0.45f, 2.5f);
    public static final RegistryObject<Item> ITEM_GREATSWORD_COPPER = registerWeapon("item_greatsword_copper", 7.0f, 0.35f, 2.5f);
    public static final RegistryObject<Item> ITEM_GREATSWORD_GOLD = registerWeapon("item_greatsword_gold", 7.5f, 0.35f, 2.5f);
    public static final RegistryObject<Item> ITEM_GREATSWORD_STONE = registerWeapon("item_greatsword_stone", 7.0f, 0.35f, 2.5f);
    public static final RegistryObject<Item> ITEM_GREATSWORD_WOOD = registerWeapon("item_greatsword_wood", 6.0f, 0.15f, 2.5f);
    //-----static final ---------------------------------------------------------
// MACHETESstatic final  (Range: +0.5)
//---------static final -----------------------------------------------------
    public static final RegistryObject<Item> ITEM_MACHETE_NETHERITE = registerWeapon("item_machete_netherite", 7.75f, 1.0f, 0.5f);
    public static final RegistryObject<Item> ITEM_MACHETE_DIAMOND = registerWeapon("item_machete_diamond", 6.75f, 0.9f, 0.5f);
    public static final RegistryObject<Item> ITEM_MACHETE_IRON = registerWeapon("item_machete_iron", 5.75f, 0.8f, 0.5f);
    public static final RegistryObject<Item> ITEM_MACHETE_COPPER = registerWeapon("item_machete_copper", 4.75f, 0.6f, 0.5f);
    public static final RegistryObject<Item> ITEM_MACHETE_GOLD = registerWeapon("item_machete_gold", 5.25f, 0.6f, 0.5f);
    public static final RegistryObject<Item> ITEM_MACHETE_STONE = registerWeapon("item_machete_stone", 4.75f, 0.6f, 0.5f);
    public static final RegistryObject<Item> ITEM_MACHETE_WOOD = registerWeapon("item_machete_wood", 3.75f, 0.5f, 0.5f);
    //-----static final ---------------------------------------------------------
// KATANAS static final (Range: +1.0)
//---------static final -----------------------------------------------------
    public static final RegistryObject<Item> ITEM_KATANA_NETHERITE = registerWeapon("item_katana_netherite", 8.0f, 1.35f, 1.0f);
    public static final RegistryObject<Item> ITEM_KATANA_DIAMOND = registerWeapon("item_katana_diamond", 7.0f, 1.25f, 1.0f);
    public static final RegistryObject<Item> ITEM_KATANA_IRON = registerWeapon("item_katana_iron", 6.0f, 1.15f, 1.0f);
    public static final RegistryObject<Item> ITEM_KATANA_COPPER = registerWeapon("item_katana_copper", 5.0f, 0.95f, 1.0f);
    public static final RegistryObject<Item> ITEM_KATANA_GOLD = registerWeapon("item_katana_gold", 4.0f, 0.95f, 1.0f);
    public static final RegistryObject<Item> ITEM_KATANA_STONE = registerWeapon("item_katana_stone", 3.0f, 0.95f, 1.0f);
    public static final RegistryObject<Item> ITEM_KATANA_WOOD = registerWeapon("item_katana_wood", 2.0f, 0.85f, 1.0f);
    //-----static final ---------------------------------------------------------
// DAGGERS static final (Range: -1.0)
//---------static final -----------------------------------------------------
    public static final RegistryObject<Item> ITEM_DAGGER_NETHERITE = registerWeapon("item_dagger_netherite", 7.0f, 1.35f, -1.0f);
    public static final RegistryObject<Item> ITEM_DAGGER_DIAMOND = registerWeapon("item_dagger_diamond", 6.0f, 1.25f, -1.0f);
    public static final RegistryObject<Item> ITEM_DAGGER_IRON = registerWeapon("item_dagger_iron", 5.0f, 1.15f, -1.0f);
    public static final RegistryObject<Item> ITEM_DAGGER_COPPER = registerWeapon("item_dagger_copper", 4.0f, 0.95f, -1.0f);
    public static final RegistryObject<Item> ITEM_DAGGER_GOLD = registerWeapon("item_dagger_gold", 4.5f, 0.95f, -1.0f);
    public static final RegistryObject<Item> ITEM_DAGGER_STONE = registerWeapon("item_dagger_stone", 4.0f, 0.95f, -1.0f);
    public static final RegistryObject<Item> ITEM_DAGGER_WOOD = registerWeapon("item_dagger_wood", 3.0f, 0.75f, -1.0f);
    //-----static final ---------------------------------------------------------
// CLUBS (Rstatic final ange: +0.0 - Normal)
//---------static final -----------------------------------------------------
    public static final RegistryObject<Item> ITEM_CLUB_NETHERITE = registerWeapon("item_club_netherite", 7.0f, 1.0f, 0.0f);
    public static final RegistryObject<Item> ITEM_CLUB_DIAMOND = registerWeapon("item_club_diamond", 6.0f, 0.9f, 0.0f);
    public static final RegistryObject<Item> ITEM_CLUB_IRON = registerWeapon("item_club_iron", 5.0f, 0.8f, 0.0f);
    public static final RegistryObject<Item> ITEM_CLUB_COPPER = registerWeapon("item_club_copper", 4.0f, 0.6f, 0.0f);
    public static final RegistryObject<Item> ITEM_CLUB_GOLD = registerWeapon("item_club_gold", 4.5f, 0.6f, 0.0f);
    public static final RegistryObject<Item> ITEM_CLUB_STONE = registerWeapon("item_club_stone", 4.0f, 0.6f, 0.0f);
    public static final RegistryObject<Item> ITEM_CLUB_WOOD = registerWeapon("item_club_wood", 3.0f, 0.5f, 0.0f);
    //-----static final ---------------------------------------------------------
// SCYTHES static final (Range: +3.0)
//---------static final -----------------------------------------------------
    public static final RegistryObject<Item> ITEM_SCYTHE_NETHERITE = registerWeapon("item_scythe_netherite", 13.0f, 0.2f, 3.0f);
    public static final RegistryObject<Item> ITEM_SCYTHE_DIAMOND = registerWeapon("item_scythe_diamond", 12.0f, 0.175f, 3.0f);
    public static final RegistryObject<Item> ITEM_SCYTHE_IRON = registerWeapon("item_scythe_iron", 11.0f, 0.1f, 3.0f);
    public static final RegistryObject<Item> ITEM_SCYTHE_COPPER = registerWeapon("item_scythe_copper", 10.0f, 0.75f, 3.0f);
    public static final RegistryObject<Item> ITEM_SCYTHE_GOLD = registerWeapon("item_scythe_gold", 10.0f, 0.75f, 3.0f);
    public static final RegistryObject<Item> ITEM_SCYTHE_STONE = registerWeapon("item_scythe_stone", 10.0f, 0.75f, 3.0f);
    public static final RegistryObject<Item> ITEM_SCYTHE_WOOD = registerWeapon("item_scythe_wood", 9.0f, 0.025f, 3.0f);

    private ModItems() {
    }

    public static void register(BusGroup group) {
        ITEMS.register(group);
    }

    private static RegistryObject<Item> registerWeapon(String name, float dmg, float speed, float rangeBonus) {
        float damageModifier = dmg - 1.0f;
        float speedModifier = speed - 4.0f;

        return ITEMS.register(name,
                () -> new Item(new Item.Properties()
                        .setId(ResourceKey.create(Registries.ITEM,
                                Identifier.fromNamespaceAndPath(Greatness.MODID, name)))
                        .stacksTo(1)
                        .attributes(ItemAttributeModifiers.builder()
                                .add(
                                        Attributes.ATTACK_DAMAGE,
                                        new AttributeModifier(Item.BASE_ATTACK_DAMAGE_ID, damageModifier, AttributeModifier.Operation.ADD_VALUE),
                                        EquipmentSlotGroup.MAINHAND
                                )
                                .add(
                                        Attributes.ATTACK_SPEED,
                                        new AttributeModifier(Item.BASE_ATTACK_SPEED_ID, speedModifier, AttributeModifier.Operation.ADD_VALUE),
                                        EquipmentSlotGroup.MAINHAND
                                )
                                .add(
                                        Attributes.ENTITY_INTERACTION_RANGE,
                                        new AttributeModifier(Identifier.fromNamespaceAndPath(Greatness.MODID, "weapon_range"), rangeBonus, AttributeModifier.Operation.ADD_VALUE),
                                        EquipmentSlotGroup.MAINHAND
                                )
                                .build()
                        )));
    }

}
