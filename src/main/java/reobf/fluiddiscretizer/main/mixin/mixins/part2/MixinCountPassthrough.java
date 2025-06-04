package reobf.fluiddiscretizer.main.mixin.mixins.part2;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

import appeng.api.storage.data.IItemList;
import appeng.me.storage.MEMonitorPassThrough;

import reobf.fluiddiscretizer.ae.part2.ICacheFD;

@Mixin(remap = false, value = MEMonitorPassThrough.class)
public class MixinCountPassthrough {

	@Inject(method = "getAvailableItems", at = { @At("HEAD") },require=1,expect=1)
	public void getAvailableItemsH(final IItemList out, int iterator, CallbackInfoReturnable _) {
		ICacheFD.CacheFD.count++;
	}

	@Inject(method = "getAvailableItems", at = { @At("RETURN") },require=1,expect=1)
	public void getAvailableItemsR(final IItemList out, int iterator, CallbackInfoReturnable _) {
		ICacheFD.CacheFD.count--;
	}

}
