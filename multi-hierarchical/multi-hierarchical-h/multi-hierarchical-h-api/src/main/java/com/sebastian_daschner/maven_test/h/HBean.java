package com.sebastian_daschner.maven_test.h;

import javax.ejb.Local;

@Local
public interface HBean {

    String get();

    H get(String id);

}

