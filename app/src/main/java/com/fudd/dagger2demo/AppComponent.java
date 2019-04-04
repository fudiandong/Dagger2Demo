package com.fudd.dagger2demo;

import dagger.Component;

/**
 * 作者: 付殿东
 * 时间: 2019/4/4
 * 描述：
 */
@Component(modules = MainActivityModule.class)
public interface AppComponent{

    void inject(App app);
}
