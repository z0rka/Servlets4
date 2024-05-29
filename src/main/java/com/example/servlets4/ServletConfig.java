package com.example.servlets4;

import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author ururu 29.05.2024
 */
@Configuration
public class ServletConfig {
  @Bean
  public ServletRegistrationBean customServletBean() {
    return new ServletRegistrationBean(new CustomServlet(), "");
  }
}