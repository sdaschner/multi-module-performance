package com.sebastian_daschner.maven_test.v;

import javax.ejb.Local;

@Local
public interface VBean {

    String get();

    V get(String id);

}

