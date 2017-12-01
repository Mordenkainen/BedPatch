package com.mordenkainen.bedpatch;

import java.util.Map;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.relauncher.IFMLLoadingPlugin;
import net.minecraftforge.fml.relauncher.IFMLLoadingPlugin.MCVersion;
import net.minecraftforge.fml.relauncher.IFMLLoadingPlugin.TransformerExclusions;

@MCVersion("1.11.2")
@TransformerExclusions({"com.mordenkainen.bedpatch.asmhelper"})
@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.MOD_VERSION)
public class BedPatch implements IFMLLoadingPlugin {    
    public static Logger logger = LogManager.getLogger("BedPatch");
    
    @Instance(Reference.MOD_ID)
    public static BedPatch instance;

    @Override
    public String[] getASMTransformerClass() {
        return new String[] { BedPatchASM.class.getName() };
    }

    @Override
    public String getModContainerClass() {
        return null;
    }

    @Override
    public String getSetupClass() {
        return null;
    }

    @Override
    public void injectData(Map<String, Object> data) {}

    @Override
    public String getAccessTransformerClass() {
        return null;
    }
}
