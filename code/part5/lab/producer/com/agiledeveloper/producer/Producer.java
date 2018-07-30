package com.agiledeveloper.producer;

import java.util.Random;
import com.agiledeveloper.proprietary.*;

public class Producer {
  public int produce() { return new Random().nextInt(1000); }
  
  public Generator getGenerator() {
    return new CustomGenerator();
  }
}