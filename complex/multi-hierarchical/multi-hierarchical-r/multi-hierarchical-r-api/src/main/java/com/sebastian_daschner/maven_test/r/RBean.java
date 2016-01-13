package com.sebastian_daschner.maven_test.r;

import javax.ejb.Local;

@Local
public interface RBean {

    String get();

    R get(String id);

}

