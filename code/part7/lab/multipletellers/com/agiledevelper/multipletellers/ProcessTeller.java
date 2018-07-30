package com.agiledeveloper.multipletellers;

import com.agiledeveloper.fortuneteller.FortuneTeller;
import com.agiledeveloper.fortuneteller.GoodFortuneOnly;

public class ProcessTeller implements FortuneTeller {
  public String tellFortune() {
    return "Your morning will be filled with rituals";
  }
}
