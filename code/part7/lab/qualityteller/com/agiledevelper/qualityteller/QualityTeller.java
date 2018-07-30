package com.agiledeveloper.qualityteller;

import com.agiledeveloper.fortuneteller.FortuneTeller;
import com.agiledeveloper.fortuneteller.GoodFortuneOnly;

@GoodFortuneOnly
public class QualityTeller implements FortuneTeller {
  public String tellFortune() {
    return "Your code will shine with quality";
  }
}