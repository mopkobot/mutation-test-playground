package com.thoughtworks;


import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SanityIntegerTest {

  @Test
  public void shouldAddTwoPositiveNumbers() {
    int result = new SanityInteger().addNumbers(1, 3);

    assertEquals(4, result);
  }

  @Test
  public void shouldReturnSecondNumberIfTheFirstNumberIsZero() {
    int result = new SanityInteger().addNumbers(0, 1);

    assertEquals(1, result);
  }

  @Test
  public void shouldReturnFirstNumberIfTheSecondNumberIsZero() {
    int result = new SanityInteger().addNumbers(1, 0);

    assertEquals(1, result);
  }

  @Test
  public void shouldReturnZeroIfBothNumbersAreZero() {
    int result = new SanityInteger().addNumbers(0, 0);

    assertEquals(0, result);
  }

  @Test
  public void shouldReturnZeroIfTheFirstNumberIsNegative() {
    int result = new SanityInteger().addNumbers(-1, 3);

    assertEquals(0, result);
  }

  @Test
  public void shouldReturnZeroIfTheSecondNumberIsNegative() {
    int result = new SanityInteger().addNumbers(1, -3);

    assertEquals(0, result);
  }

  @Test
  public void shouldReturnZeroIfBothNumbersAreNegative() {
    int result = new SanityInteger().addNumbers(-1, -3);

    assertEquals(0, result);
  }

}