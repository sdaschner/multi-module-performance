package com.sebastian_daschner.maven_test.w;

import javax.ejb.Local;

@Local
public interface WBean {

    String get();

    W get(String id);

}

