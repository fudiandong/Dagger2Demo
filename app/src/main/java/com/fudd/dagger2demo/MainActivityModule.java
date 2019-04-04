package com.fudd.dagger2demo;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;

/**
 * 作者: 付殿东
 * 时间: 2019/4/4
 * 描述：
 */
@Module
abstract class MainActivityModule {
    //    @Binds
//    @IntoMap
//    @ClassKey(MainActivity.class)
//    abstract AndroidInjector.Factory<?> bindMainActivityInjectorFactory(MainActivitySubcomponent.Factory factory);
//    @ActivityScope
    @ContributesAndroidInjector
    abstract MainActivity contributeMainActivityInjector();
}
