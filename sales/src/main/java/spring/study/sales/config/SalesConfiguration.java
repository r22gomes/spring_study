package spring.study.sales.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SalesConfiguration {

    @Bean
    public String applicationName(){
        return "sales platform";
    }

}
