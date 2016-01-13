package com.sebastian_daschner.maven_test.d;

import javax.ejb.Local;

@Local
public interface DBean {

    String get();

    D get(String id);

}

