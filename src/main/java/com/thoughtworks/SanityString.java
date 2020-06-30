package com.thoughtworks;

public class SanityString {
  public String getDayOfTheWeekBasedOnNumber(Integer number) {
    if(number == 1)
      return "Monday";
    else
      return "N/A";
  }
}
