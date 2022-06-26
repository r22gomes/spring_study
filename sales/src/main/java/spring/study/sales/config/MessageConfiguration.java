package spring.study.sales.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MessageConfiguration {

    @Bean
    public String messageApp(){
        return "is up";
    }

}
