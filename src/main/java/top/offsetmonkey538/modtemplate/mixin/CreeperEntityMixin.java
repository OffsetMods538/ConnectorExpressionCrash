package top.offsetmonkey538.modtemplate.mixin;

import com.llamalad7.mixinextras.expression.Definition;
import com.llamalad7.mixinextras.expression.Expression;
import com.llamalad7.mixinextras.injector.ModifyExpressionValue;
import net.minecraft.entity.mob.CreeperEntity;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;

@Mixin(CreeperEntity.class)
public abstract class CreeperEntityMixin {

    @Definition(id = "explosionRadius", field = "Lnet/minecraft/entity/mob/CreeperEntity;explosionRadius:I")
    @Expression("(float) this.explosionRadius")
    @ModifyExpressionValue(
            method = "explode",
            at = @At(
                    "MIXINEXTRAS:EXPRESSION"
            )
    )
    private float tiny_terrors$setBabyExplosionRadius(float original) {
        return 1.5f;
    }
}
