package com.agiledeveloper.client;

import java.util.ServiceLoader;
import com.agiledeveloper.fortuneteller.FortuneTeller;
import com.agiledeveloper.fortuneteller.GoodFortuneOnly;

public class Client {
  public static void main(String[] args) {
    System.out.println("Let's read some good fortune");
    
    ServiceLoader<FortuneTeller> fortuneTellers = ServiceLoader.load(FortuneTeller.class);
    
    fortuneTellers.stream()
      .filter(provider -> provider.type().isAnnotationPresent(GoodFortuneOnly.class))
      .map(provider -> provider.get())                         
      .map(FortuneTeller::tellFortune)
      .forEach(System.out::println);
  }
}