package com.example.servlets4;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author ururu 29.05.2024
 */

@Controller
public class HelloController {

  @GetMapping("/lab1")
  public String getPage(Model model, @RequestParam(defaultValue = "bot") String name){
    model.addAttribute("name",name);
    return "name";
  }

}
