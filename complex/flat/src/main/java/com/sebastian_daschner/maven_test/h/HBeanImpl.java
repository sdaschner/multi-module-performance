package com.sebastian_daschner.maven_test.h;

import javax.ejb.Stateless;

@Stateless
public class HBeanImpl implements HBean {

    @Override
    public String get() {
        return "h";
    }

    @Override
    public H get(String id) {
        return new H(id);
    }

}
