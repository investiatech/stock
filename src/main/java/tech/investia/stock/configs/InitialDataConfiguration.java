package tech.investia.stock.configs;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import tech.investia.stock.services.HttpClientService;

@Configuration
public class InitialDataConfiguration {

    @Bean
    CommandLineRunner runner() {
        return args -> {
            System.out.println("CommandLineRunner running in the HttpClientService class...");
            HttpClientService.httpClientService();
        };
    }

}