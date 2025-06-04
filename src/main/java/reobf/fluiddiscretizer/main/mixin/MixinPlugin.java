package reobf.fluiddiscretizer.main.mixin;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import org.spongepowered.asm.lib.tree.ClassNode;
import org.spongepowered.asm.mixin.extensibility.IMixinConfigPlugin;
import org.spongepowered.asm.mixin.extensibility.IMixinInfo;

public class MixinPlugin implements IMixinConfigPlugin {

	public MixinPlugin() {

	}

	@Override
	public void onLoad(String mixinPackage) {

	}

	@Override
	public String getRefMapperConfig() {

		return null;
	}

	@Override
	public boolean shouldApplyMixin(String targetClassName, String mixinClassName) {

		return true;
	}

	@Override
	public void acceptTargets(Set<String> myTargets, Set<String> otherTargets) {

	}

	static public ArrayList<String> retLate = new ArrayList<>();


	@Override
	public List<String> getMixins() {

		retLate.add("part2.MixinCountPassthrough");
		ArrayList a = new ArrayList<>();
		retLate.add("part2.MixinDisableFD");
		return a;

	}

	@Override
	public void preApply(String targetClassName, ClassNode targetClass, String mixinClassName, IMixinInfo mixinInfo) {

	}

	@Override
	public void postApply(String targetClassName, ClassNode targetClass, String mixinClassName, IMixinInfo mixinInfo) {

	}

}
