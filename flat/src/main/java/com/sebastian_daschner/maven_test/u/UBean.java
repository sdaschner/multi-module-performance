package com.sebastian_daschner.maven_test.u;

import javax.ejb.Local;

@Local
public interface UBean {

    String get();

    U get(String id);

}

