package com.sebastian_daschner.maven_test.c;

import javax.ejb.Stateless;

@Stateless
public class CBeanImpl implements CBean {

    @Override
    public String get() {
        return "c";
    }

    @Override
    public C get(String id) {
        return new C(id);
    }

}
