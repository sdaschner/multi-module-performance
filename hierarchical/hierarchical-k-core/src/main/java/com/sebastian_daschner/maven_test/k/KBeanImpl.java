package com.sebastian_daschner.maven_test.k;

import javax.ejb.Stateless;

@Stateless
public class KBeanImpl implements KBean {

    @Override
    public String get() {
        return "k";
    }

    @Override
    public K get(String id) {
        return new K(id);
    }

}
