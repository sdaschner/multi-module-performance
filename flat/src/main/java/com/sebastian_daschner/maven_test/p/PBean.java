package com.sebastian_daschner.maven_test.p;

import javax.ejb.Local;

@Local
public interface PBean {

    String get();

    P get(String id);

}

