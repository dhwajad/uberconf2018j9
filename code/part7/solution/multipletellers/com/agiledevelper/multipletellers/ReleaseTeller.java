package com.agiledeveloper.multipletellers;

import com.agiledeveloper.fortuneteller.FortuneTeller;
import com.agiledeveloper.fortuneteller.GoodFortuneOnly;

@GoodFortuneOnly
public class ReleaseTeller implements FortuneTeller {
  public String tellFortune() {
    return "Your next project release will change the world";
  }
}
