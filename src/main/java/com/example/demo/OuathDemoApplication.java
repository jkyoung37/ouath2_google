package com.example.demo;

import java.util.List;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.method.support.HandlerMethodArgumentResolver;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;
import com.example.demo.resolver.UserArgumentResolver;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@SpringBootApplication
public class OuathDemoApplication extends WebMvcConfigurationSupport {
  private final UserArgumentResolver userArgumentResolver;

  public static void main(String[] args) {
    SpringApplication.run(OuathDemoApplication.class, args);
  }

  @Override
  protected void addArgumentResolvers(List<HandlerMethodArgumentResolver> argumentResolvers) {
    super.addArgumentResolvers(argumentResolvers);
    argumentResolvers.add(userArgumentResolver);
  }

}
