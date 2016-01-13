package com.sebastian_daschner.maven_test.z;

import javax.ejb.Stateless;

@Stateless
public class ZBeanImpl implements ZBean {

    @Override
    public String get() {
        return "z";
    }

    @Override
    public Z get(String id) {
        return new Z(id);
    }

}
