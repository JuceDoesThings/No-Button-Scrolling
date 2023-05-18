package com.jucedoesthings.no_button_scrolling.mixin;

import net.minecraft.client.gui.widget.ClickableWidget;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.ModifyVariable;

@Mixin(ClickableWidget.class)
public abstract class NoTextScrollingMixin {
	@ModifyVariable( method = "drawScrollableText(Lnet/minecraft/client/util/math/MatrixStack;Lnet/minecraft/client/font/TextRenderer;Lnet/minecraft/text/Text;IIIII)V", at = @At("STORE"),ordinal = 7)
	private static int noScrolling(int k) {
		return 2147483647;
	}
}
