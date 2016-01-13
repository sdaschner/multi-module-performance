package com.sebastian_daschner.maven_test.g;

import javax.ejb.Stateless;

@Stateless
public class GBeanImpl implements GBean {

    @Override
    public String get() {
        return "g";
    }

    @Override
    public G get(String id) {
        return new G(id);
    }

}
