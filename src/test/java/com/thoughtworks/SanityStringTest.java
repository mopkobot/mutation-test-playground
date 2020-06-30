package com.thoughtworks;

import org.junit.Test;

import static org.junit.Assert.*;

public class SanityStringTest {

  @Test
  public void shouldReturnMondayIfWePassOne() {
    String result = new SanityString().getDayOfTheWeekBasedOnNumber(1);

    assertEquals("Monday", result);
  }

}