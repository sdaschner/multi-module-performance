package com.sebastian_daschner.maven_test.j;

import javax.ejb.Stateless;

@Stateless
public class JBeanImpl implements JBean {

    @Override
    public String get() {
        return "j";
    }

    @Override
    public J get(String id) {
        return new J(id);
    }

}
