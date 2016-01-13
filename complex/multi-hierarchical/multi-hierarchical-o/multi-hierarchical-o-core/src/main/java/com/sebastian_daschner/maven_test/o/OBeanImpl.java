package com.sebastian_daschner.maven_test.o;

import javax.ejb.Stateless;

@Stateless
public class OBeanImpl implements OBean {

    @Override
    public String get() {
        return "o";
    }

    @Override
    public O get(String id) {
        return new O(id);
    }

}
