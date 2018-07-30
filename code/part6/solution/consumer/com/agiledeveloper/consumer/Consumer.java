package com.agiledeveloper.consumer;

import com.agiledeveloper.producer.Generator;
import com.agiledeveloper.producer.Producer;
import java.lang.reflect.Method;
import java.util.stream.IntStream;

public class Consumer {  
  public static void main(String[] args) {
    Producer producer = new Producer();
    
    System.out.println(producer.produce());
    
    Generator generator = producer.getGenerator();
    
    System.out.println(generator);
    
    generator.generate()
      .limit(1)
      .forEach(System.out::println);
                                      
    //If we uncomment the following line, the compilation should fail
    //com.agiledeveloper.proprietary.CustomGenerator customGenerator = (com.agiledeveloper.proprietary.CustomGenerator) generator;
                               
    try {
      Method method = generator.getClass().getMethod("generateSequence");
      IntStream stream = (IntStream) method.invoke(generator);
      
      stream.limit(1)
      .forEach(System.out::println);      
    } catch(Exception ex) {
      System.out.println(ex.getMessage());
    }
  }
}