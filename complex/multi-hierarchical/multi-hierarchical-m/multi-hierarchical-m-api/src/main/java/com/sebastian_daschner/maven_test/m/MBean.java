package com.sebastian_daschner.maven_test.m;

import javax.ejb.Local;

@Local
public interface MBean {

    String get();

    M get(String id);

}

