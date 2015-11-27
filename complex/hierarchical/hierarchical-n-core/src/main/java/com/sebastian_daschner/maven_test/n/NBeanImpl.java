package com.sebastian_daschner.maven_test.n;

import javax.ejb.Stateless;

@Stateless
public class NBeanImpl implements NBean {

    @Override
    public String get() {
        return "n";
    }

    @Override
    public N get(String id) {
        return new N(id);
    }

}
