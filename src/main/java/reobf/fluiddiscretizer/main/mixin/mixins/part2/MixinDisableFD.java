package reobf.fluiddiscretizer.main.mixin.mixins.part2;

import java.util.List;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

import com.glodblock.github.common.tile.TileFluidDiscretizer;
import com.google.common.collect.ImmutableList;

import appeng.api.storage.IMEInventoryHandler;
import appeng.api.storage.StorageChannel;

@Mixin(value=TileFluidDiscretizer.class,remap=false)
public class MixinDisableFD {
	@Inject(method="getCellArray", at = { @At("HEAD") },cancellable=true,require=1,expect=1)
	public void getCellArray(StorageChannel _,CallbackInfoReturnable<Object> ret) {
		ret.setReturnValue(ImmutableList.of());
	}
	@Inject(method="updateState", at = { @At("HEAD") },cancellable=true,require=1,expect=1)
	public void updateState(CallbackInfo ret) {
		ret.cancel();
	}
}
