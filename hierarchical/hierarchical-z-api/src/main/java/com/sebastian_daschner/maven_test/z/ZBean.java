package com.sebastian_daschner.maven_test.z;

import javax.ejb.Local;

@Local
public interface ZBean {

    String get();

    Z get(String id);

}

