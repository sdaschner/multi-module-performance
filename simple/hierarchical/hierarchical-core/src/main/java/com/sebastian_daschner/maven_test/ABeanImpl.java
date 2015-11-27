package com.sebastian_daschner.maven_test;

import javax.ejb.Stateless;

@Stateless
public class ABeanImpl implements ABean {

    @Override
    public String get() {
        return "a";
    }

}
