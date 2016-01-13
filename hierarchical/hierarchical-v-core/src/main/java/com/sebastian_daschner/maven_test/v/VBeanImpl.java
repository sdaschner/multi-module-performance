package com.sebastian_daschner.maven_test.v;

import javax.ejb.Stateless;

@Stateless
public class VBeanImpl implements VBean {

    @Override
    public String get() {
        return "v";
    }

    @Override
    public V get(String id) {
        return new V(id);
    }

}
