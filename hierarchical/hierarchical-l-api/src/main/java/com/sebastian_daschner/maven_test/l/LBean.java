package com.sebastian_daschner.maven_test.l;

import javax.ejb.Local;

@Local
public interface LBean {

    String get();

    L get(String id);

}

