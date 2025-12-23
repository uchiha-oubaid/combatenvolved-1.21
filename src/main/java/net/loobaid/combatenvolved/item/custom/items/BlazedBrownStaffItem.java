package net.loobaid.combatenvolved.item.custom.items;

import net.minecraft.entity.EntityType;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.projectile.SmallFireballEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.tooltip.TooltipType;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvents;
import net.minecraft.text.Text;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;
import java.util.List;

public class BlazedBrownStaffItem extends Item {
    public BlazedBrownStaffItem(Settings settings) {
        super(settings);
    }

    private static final int COOLDOWN_TICKS = 60; // 3 seconds
    private static final float FIREBALL_SPEED = 1.5f;

    @Override
    public TypedActionResult<ItemStack> use(World world, PlayerEntity user, Hand hand) {
        ItemStack itemStack = user.getStackInHand(hand);

        if (user.getItemCooldownManager().isCoolingDown(this)) {
            return TypedActionResult.fail(itemStack);
        }

        if (!world.isClient) {

            // spawn the fireball
            launchFireBall(world, user);
            // apply the cooldown
            user.getItemCooldownManager().set(this, COOLDOWN_TICKS);

            world.playSound(null, user.getX(), user.getY(), user.getZ(), SoundEvents.ENTITY_BLAZE_SHOOT,
                    SoundCategory.PLAYERS, 0.8f, 1.2f);
        }
        else {
            user.swingHand(hand);
        }

        return TypedActionResult.success(itemStack, world.isClient);
    }

    private void launchFireBall(World world, PlayerEntity player) {
        // the fireball class
        SmallFireballEntity fireball = new SmallFireballEntity(EntityType.SMALL_FIREBALL, world);

        Vec3d lookVec = player.getRotationVec(1.0f);

        System.out.println("[DEBUG] position of the look"+lookVec);

        double x = player.getX() + lookVec.x * 1.5;
        double y = player.getY() + lookVec.y * 1.5;
        double z = player.getZ() + lookVec.z * 1.5 + 0.5;

        System.out.println("[DEBUG] Fireball spawn position: " + x + ", " + y + ", " + z);

        fireball.setPosition(x, y, z);

        // the fireball properties
        fireball.setOwner(player);
        fireball.setVelocity(lookVec.x * FIREBALL_SPEED,
                lookVec.y * FIREBALL_SPEED, lookVec.z * FIREBALL_SPEED);

        world.spawnEntity(fireball);
    }

    @Override
    public void appendTooltip(ItemStack stack, TooltipContext context, List<Text> tooltip, TooltipType type) {
        tooltip.add(Text.literal("§dRight click to unleash the fire ball and destroy your enemies§r"));
    }
}
