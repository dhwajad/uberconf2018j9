package com.agiledeveloper.user.another;

import com.agiledeveloper.user.FirstUser;

public class SecondUser {
  public static void main(String[] args) {
    FirstUser firstUser = new FirstUser();
    
    System.out.println(firstUser);
    
    System.out.println(firstUser.handover());

    com.agiledeveloper.util.Fibonacci fibonacci = firstUser.handover();
    System.out.println(fibonacci.fib(5));
  }
}
