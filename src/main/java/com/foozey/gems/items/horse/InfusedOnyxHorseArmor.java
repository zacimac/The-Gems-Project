package com.foozey.gems.items.horse;

import com.foozey.gems.Gems;
import com.foozey.gems.items.ModTab;
import net.minecraft.world.item.HorseArmorItem;
import net.minecraft.resources.ResourceLocation;

public class InfusedOnyxHorseArmor extends HorseArmorItem {

    public InfusedOnyxHorseArmor(Properties properties) {
        super(20, new ResourceLocation(Gems.MOD_ID, "textures/entity/horse/armor/horse_armor_infused_onyx.png"), (properties
                .stacksTo(1)
                .fireResistant()
                .tab(ModTab.TAB_GEMS)));
    }

    @Override
    public int getProtection() {
        return 20;
    }

}
