module com.agiledeveloper.qualityteller {
  requires com.agiledeveloper.fortuneteller;
                                                 
  provides com.agiledeveloper.fortuneteller.FortuneTeller with
    com.agiledeveloper.qualityteller.QualityTeller;
    
}