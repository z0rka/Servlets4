package com.example.servlets4;

import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;

/**
 * @author ururu 29.05.2024
 */

@AllArgsConstructor
public class LinearCongurentialGenerator {
  private static final long MULTIPLIER = 1664525; // константа множення
  private static final long INCREMENT = 1013904223; // константа додавання
  private static final long MODULUS = (long) Math.pow(2, 32); // просте число (2^32)

  private  long seed; // початкове значення seed

  public long nextRandom() {
    seed = (MULTIPLIER * seed + INCREMENT) % MODULUS;
    return seed;
  }
}