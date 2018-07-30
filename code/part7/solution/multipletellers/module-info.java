module com.agiledeveloper.multipletellers {
  requires com.agiledeveloper.fortuneteller;
  
  provides com.agiledeveloper.fortuneteller.FortuneTeller with
     com.agiledeveloper.multipletellers.ReleaseTeller, 
        com.agiledeveloper.multipletellers.ProcessTeller;  
}