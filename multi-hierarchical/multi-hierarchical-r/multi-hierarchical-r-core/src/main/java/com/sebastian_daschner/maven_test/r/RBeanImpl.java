package com.sebastian_daschner.maven_test.r;

import javax.ejb.Stateless;

@Stateless
public class RBeanImpl implements RBean {

    @Override
    public String get() {
        return "r";
    }

    @Override
    public R get(String id) {
        return new R(id);
    }

}
