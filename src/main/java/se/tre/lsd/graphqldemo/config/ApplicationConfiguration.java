package se.tre.lsd.graphqldemo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import se.tre.lsd.graphqldemo.api.resolver.StuffQueryService;

@Configuration
public class ApplicationConfiguration {

    @Bean
    public StuffQueryService stuffQueryService() {
        return new StuffQueryService();
    }

}
