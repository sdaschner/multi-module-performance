package com.sebastian_daschner.maven_test.t;

import javax.ejb.Stateless;

@Stateless
public class TBeanImpl implements TBean {

    @Override
    public String get() {
        return "t";
    }

    @Override
    public T get(String id) {
        return new T(id);
    }

}
