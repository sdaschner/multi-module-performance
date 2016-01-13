package com.sebastian_daschner.maven_test.b;

import javax.ejb.Stateless;

@Stateless
public class BBeanImpl implements BBean {

    @Override
    public String get() {
        return "b";
    }

    @Override
    public B get(String id) {
        return new B(id);
    }

}
