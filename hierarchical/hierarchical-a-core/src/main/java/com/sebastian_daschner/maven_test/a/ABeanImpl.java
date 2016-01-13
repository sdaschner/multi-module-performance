package com.sebastian_daschner.maven_test.a;

import javax.ejb.Stateless;

@Stateless
public class ABeanImpl implements ABean {

    @Override
    public String get() {
        return "a";
    }

    @Override
    public A get(String id) {
        return new A(id);
    }

}
