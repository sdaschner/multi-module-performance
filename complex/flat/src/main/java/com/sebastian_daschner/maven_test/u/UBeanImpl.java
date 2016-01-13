package com.sebastian_daschner.maven_test.u;

import javax.ejb.Stateless;

@Stateless
public class UBeanImpl implements UBean {

    @Override
    public String get() {
        return "u";
    }

    @Override
    public U get(String id) {
        return new U(id);
    }

}
