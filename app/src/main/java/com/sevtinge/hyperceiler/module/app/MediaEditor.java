package com.sevtinge.hyperceiler.module.app;

import com.sevtinge.hyperceiler.module.base.BaseModule;
import com.sevtinge.hyperceiler.module.base.CloseHostDir;
import com.sevtinge.hyperceiler.module.base.LoadHostDir;
import com.sevtinge.hyperceiler.module.hook.mediaeditor.FilterManagerAll;
import com.sevtinge.hyperceiler.module.hook.mediaeditor.UnlockCustomPhotoFrames;
import com.sevtinge.hyperceiler.module.hook.mediaeditor.UnlockMinimumCropLimitNew;

public class MediaEditor extends BaseModule {

    @Override
    public void handleLoadPackage() {
        // dexKit load
        initHook(LoadHostDir.INSTANCE);
        initHook(UnlockMinimumCropLimitNew.INSTANCE, mPrefsMap.getBoolean("mediaeditor_unlock_minimum_crop_limit"));
        initHook(FilterManagerAll.INSTANCE, mPrefsMap.getBoolean("mediaeditor_filter_manager"));
        initHook(UnlockCustomPhotoFrames.INSTANCE, mPrefsMap.getStringAsInt("mediaeditor_unlock_custom_photo_frames", 0) != 0);
        // dexKit finish
        initHook(CloseHostDir.INSTANCE);
    }

}


