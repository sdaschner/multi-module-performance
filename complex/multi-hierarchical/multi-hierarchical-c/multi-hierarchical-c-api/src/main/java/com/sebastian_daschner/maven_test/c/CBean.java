package com.sebastian_daschner.maven_test.c;

import javax.ejb.Local;

@Local
public interface CBean {

    String get();

    C get(String id);

}

