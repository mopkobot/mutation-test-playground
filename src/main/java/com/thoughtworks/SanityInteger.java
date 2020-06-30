package com.thoughtworks;

public class SanityInteger {

  public Integer addNumbers(Integer a, Integer b) {
    if(a >= 0 && b >= 0)
      return a + b;
    return 0;
  }

}
