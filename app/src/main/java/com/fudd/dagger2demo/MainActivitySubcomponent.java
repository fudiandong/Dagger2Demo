package com.fudd.dagger2demo;

import dagger.Subcomponent;
import dagger.android.AndroidInjector;

/**
 * 作者: 付殿东
 * 时间: 2019/4/4
 * 描述：
 */
@Subcomponent
public interface MainActivitySubcomponent extends AndroidInjector<MainActivity> {
    @Subcomponent.Factory
    public interface Factory extends AndroidInjector.Factory<MainActivity> {
    }
}
