package com.example.servlets4;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;

@SpringBootApplication
@Slf4j
public class Servlets4Application {

  LehmerRandom lehmerRandom = new LehmerRandom(System.currentTimeMillis());
  LinearCongurentialGenerator linearCongurentialGenerator = new LinearCongurentialGenerator(System.currentTimeMillis());

  public static void main(String[] args) {
    SpringApplication.run(Servlets4Application.class, args);
  }

  @EventListener(ApplicationReadyEvent.class)
  public void start() {

    System.out.println("Lehmer");
    // Генеруємо і виводимо 10 випадкових чисел
    for (int i = 0; i < 10; i++) {
      System.out.println(i+ ":"+ lehmerRandom.nextRandom());
    }
    System.out.println("Linear");
    // Генеруємо і виводимо 10 випадкових чисел
    for (int i = 0; i < 10; i++) {
      System.out.println(i+ ":"+linearCongurentialGenerator.nextRandom());
    }
  }
}
