package com.sebastian_daschner.maven_test.e;

import javax.ejb.Stateless;

@Stateless
public class EBeanImpl implements EBean {

    @Override
    public String get() {
        return "e";
    }

    @Override
    public E get(String id) {
        return new E(id);
    }

}
