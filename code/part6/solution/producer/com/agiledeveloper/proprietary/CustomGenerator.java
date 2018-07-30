package com.agiledeveloper.proprietary;

import com.agiledeveloper.producer.Generator;
import java.util.stream.IntStream;
import java.util.Random;

public class CustomGenerator implements Generator {
  public IntStream generate() {
    return generateSequence();
  }                           
  
  public IntStream generateSequence() {
    return new Random().ints();
  }
}