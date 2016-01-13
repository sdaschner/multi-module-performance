package com.sebastian_daschner.maven_test.w;

import javax.ejb.Stateless;

@Stateless
public class WBeanImpl implements WBean {

    @Override
    public String get() {
        return "w";
    }

    @Override
    public W get(String id) {
        return new W(id);
    }

}
