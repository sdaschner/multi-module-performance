package com.sebastian_daschner.maven_test.y;

import javax.ejb.Stateless;

@Stateless
public class YBeanImpl implements YBean {

    @Override
    public String get() {
        return "y";
    }

    @Override
    public Y get(String id) {
        return new Y(id);
    }

}
