package com.sebastian_daschner.maven_test.q;

import javax.ejb.Stateless;

@Stateless
public class QBeanImpl implements QBean {

    @Override
    public String get() {
        return "q";
    }

    @Override
    public Q get(String id) {
        return new Q(id);
    }

}
