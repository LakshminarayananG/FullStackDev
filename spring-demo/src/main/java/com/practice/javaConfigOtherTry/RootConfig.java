package com.practice.javaConfigOtherTry;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import({ AppConfig.class, SpringConfig.class })
public class RootConfig {

}
