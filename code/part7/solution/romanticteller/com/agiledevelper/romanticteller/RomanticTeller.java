package com.agiledeveloper.romanticteller;

import com.agiledeveloper.fortuneteller.FortuneTeller;
import com.agiledeveloper.fortuneteller.GoodFortuneOnly;

@GoodFortuneOnly
public class RomanticTeller implements FortuneTeller {
  public String tellFortune() {
    return "You will fall in love with coding";
  }
}