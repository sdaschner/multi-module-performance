package com.sebastian_daschner.maven_test.x;

import javax.ejb.Stateless;

@Stateless
public class XBeanImpl implements XBean {

    @Override
    public String get() {
        return "x";
    }

    @Override
    public X get(String id) {
        return new X(id);
    }

}
