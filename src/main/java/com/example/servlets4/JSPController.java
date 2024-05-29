package com.example.servlets4;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author ururu 29.05.2024
 */

@Slf4j
@RequiredArgsConstructor
@Controller
public class JSPController {

  @PostMapping("/jsp/result")
  public String calculate(Model model, @RequestParam double x, @RequestParam double y, @RequestParam double a, @RequestParam double b) {
    double sum = 0.0;
    for (int i = 1; i <= 30; i++) {
      double term = Math.pow(-1, i) * i * Math.pow((Math.tan(x) + Math.cos(a) - Math.tan(b * y)), i) / (i * x);
      sum += term;
    }

    model.addAttribute("result", sum);
    return "result";
  }

  @GetMapping("/jsp")
  public String form(Model model) {
    return "test";
  }

}
