package com.sebastian_daschner.maven_test.b;

import javax.ejb.Local;

@Local
public interface BBean {

    String get();

    B get(String id);

}

