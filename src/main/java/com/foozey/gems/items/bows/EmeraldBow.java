package com.foozey.gems.items.bows;

import com.foozey.gems.init.ModAttributes;
import com.foozey.gems.init.ModItems;
import com.foozey.gems.items.ModTab;
import com.google.common.collect.ImmutableMultimap;
import com.google.common.collect.Multimap;
import net.minecraft.world.entity.ai.attributes.Attribute;
import net.minecraft.world.entity.ai.attributes.AttributeModifier;
import net.minecraft.world.entity.projectile.AbstractArrow;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.BowItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import java.util.UUID;

public class EmeraldBow extends BowItem {

    public EmeraldBow(Properties properties) {
        super(properties
                .stacksTo(1)
                .durability(250)
                .tab(ModTab.TAB_GEMS));
    }

    @Override
    public boolean isValidRepairItem(ItemStack toRepair, ItemStack repairWith) {
        return repairWith.getItem() == Items.EMERALD.asItem() || super.isValidRepairItem(toRepair, repairWith);
    }

    @Override
    public AbstractArrow customArrow(AbstractArrow arrow) {
        arrow.setBaseDamage(arrow.getBaseDamage() * 1.0F);
        return arrow;
    }

    @Override
    public int getEnchantmentValue() {
        return 30;
    }

    public static final UUID BOW_BONUS_XP_UUID = UUID.fromString("8107a4db-5582-44e6-b5ec-5036ed721fa1");

    @Override
    public Multimap<Attribute, AttributeModifier> getAttributeModifiers(EquipmentSlot equipmentSlot, ItemStack stack) {
        Multimap<Attribute, AttributeModifier> modifiers = super.getAttributeModifiers(equipmentSlot, stack);
        ImmutableMultimap.Builder<Attribute, AttributeModifier> builder = ImmutableMultimap.builder();
        builder.putAll(modifiers);
        Item item = stack.getItem();
        if (item == ModItems.EMERALD_BOW.get() && equipmentSlot == EquipmentSlot.MAINHAND) {
            builder.put(ModAttributes.BONUS_XP.get(), new AttributeModifier(BOW_BONUS_XP_UUID, "Bonus XP", 1.00, AttributeModifier.Operation.MULTIPLY_TOTAL));
        }
        return builder.build();
    }

}
