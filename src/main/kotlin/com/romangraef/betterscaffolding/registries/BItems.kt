package com.romangraef.betterscaffolding.registries

import com.romangraef.betterscaffolding.BetterScaffolding
import com.romangraef.betterscaffolding.items.PoleItem
import net.minecraft.item.Item
import net.minecraft.util.registry.Registry

object BItems : DefaultDelayedRegistry<Item>(Registry.ITEM, BetterScaffolding.modid) {
    val DEFAULT_SETTINGS get(): Item.Settings = Item.Settings().group(BetterScaffolding.itemGroup)
    val pole by "pole" {
        PoleItem(DEFAULT_SETTINGS)
    }
}