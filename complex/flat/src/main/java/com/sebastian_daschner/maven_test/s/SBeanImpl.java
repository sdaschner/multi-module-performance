package com.sebastian_daschner.maven_test.s;

import javax.ejb.Stateless;

@Stateless
public class SBeanImpl implements SBean {

    @Override
    public String get() {
        return "s";
    }

    @Override
    public S get(String id) {
        return new S(id);
    }

}
