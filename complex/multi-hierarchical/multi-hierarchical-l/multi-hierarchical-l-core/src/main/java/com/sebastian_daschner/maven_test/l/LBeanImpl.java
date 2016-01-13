package com.sebastian_daschner.maven_test.l;

import javax.ejb.Stateless;

@Stateless
public class LBeanImpl implements LBean {

    @Override
    public String get() {
        return "l";
    }

    @Override
    public L get(String id) {
        return new L(id);
    }

}
