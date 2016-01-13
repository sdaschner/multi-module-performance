package com.sebastian_daschner.maven_test.p;

import javax.ejb.Stateless;

@Stateless
public class PBeanImpl implements PBean {

    @Override
    public String get() {
        return "p";
    }

    @Override
    public P get(String id) {
        return new P(id);
    }

}
