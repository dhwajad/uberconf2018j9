module com.agiledeveloper.romanticteller {
  requires com.agiledeveloper.fortuneteller;
                                                 
  provides com.agiledeveloper.fortuneteller.FortuneTeller with
    com.agiledeveloper.romanticteller.RomanticTeller;
}