package com.ordana.spelunkers_delight.items;

import com.ordana.spelunkery.utils.LevelHelper;
import net.minecraft.advancements.CriteriaTriggers;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.stats.Stats;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.HoneyBottleItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.ItemUtils;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.Level;
import org.jetbrains.annotations.NotNull;

public class PortalStewItem extends HoneyBottleItem {
    public PortalStewItem(Properties properties) {
        super(properties);
    }

    @Override
    @NotNull
    public ItemStack finishUsingItem(@NotNull ItemStack stack, @NotNull Level level, @NotNull LivingEntity livingEntity) {
        if (livingEntity instanceof Player player) {
            ItemStack itemStack2 = ItemUtils.createFilledResult(stack, player, Items.BOWL.getDefaultInstance());
            player.setItemInHand(player.getUsedItemHand(), itemStack2);

        }
        if (livingEntity instanceof ServerPlayer serverPlayer) {
            CriteriaTriggers.CONSUME_ITEM.trigger(serverPlayer, stack);
            serverPlayer.awardStat(Stats.ITEM_USED.get(this));
            LevelHelper.teleportToSpawnPosition(serverPlayer);
        }
        return stack;
    }

}
