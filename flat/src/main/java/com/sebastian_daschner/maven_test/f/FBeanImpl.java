package com.sebastian_daschner.maven_test.f;

import javax.ejb.Stateless;

@Stateless
public class FBeanImpl implements FBean {

    @Override
    public String get() {
        return "f";
    }

    @Override
    public F get(String id) {
        return new F(id);
    }

}
