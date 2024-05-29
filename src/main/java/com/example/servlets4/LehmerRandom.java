package com.example.servlets4;

import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;

/**
 * @author ururu 29.05.2024
 */

@AllArgsConstructor
public class LehmerRandom {
  private static final long MULTIPLIER = 16807; // константа множення
  private static final long MODULUS = 2147483647; // просте число
  private static final long MASK = 123459876L; // додаткова константа для змішування бітів

  private  long seed;

  public long nextRandom() {
     seed = (MULTIPLIER * seed) % MODULUS;
    return seed ^ MASK; // обернене перетворення
  }
}
