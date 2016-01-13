package com.sebastian_daschner.maven_test.d;

import javax.ejb.Stateless;

@Stateless
public class DBeanImpl implements DBean {

    @Override
    public String get() {
        return "d";
    }

    @Override
    public D get(String id) {
        return new D(id);
    }

}
