package com.agiledeveloper.producer;

import java.util.stream.IntStream;

public interface Generator {
  IntStream generate();
}