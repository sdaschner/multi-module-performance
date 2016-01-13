package com.sebastian_daschner.maven_test.o;

import javax.ejb.Local;

@Local
public interface OBean {

    String get();

    O get(String id);

}

