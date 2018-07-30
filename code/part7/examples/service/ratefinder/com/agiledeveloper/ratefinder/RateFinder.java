package com.agiledeveloper.ratefinder;

import java.util.ServiceLoader;
import com.agiledeveloper.rates.Vendor;

public class RateFinder {
  public static void main(String[] args) {
    queryVendors();
  }                
  
  public static void queryVendors() {
    System.out.println("Let's use ServiceLoader to query all vendors");
    
    System.out.println("Iterarting over Vendors:");                
    ServiceLoader<Vendor> vendors = ServiceLoader.load(Vendor.class);
    
    for(Vendor vendor : vendors) {
      System.out.println(vendor);
      System.out.println(vendor.getName());
    }

    //...reaload vendor
    vendors.reload();

    System.out.println("again...");
    for(Vendor vendor : vendors) {
      System.out.println(vendor);
      System.out.println(vendor.getName());
    }
    
    
    System.out.println("Iterating over Providers:");
    ServiceLoader.load(Vendor.class)
      .stream()
      .filter(provider ->
        provider.type().getSimpleName().contains("Two"))
      .map(provider -> provider.get())
      .peek(vendor -> System.out.println(vendor))
      .map(vendor -> vendor.getName())
      .forEach(System.out::println);
  }
}