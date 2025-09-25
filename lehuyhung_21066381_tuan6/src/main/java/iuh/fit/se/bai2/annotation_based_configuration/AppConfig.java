package iuh.fit.se.bai2.annotation_based_configuration;


import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "iuh.fit.se.bai2.annotation_based_configuration.model")
public class AppConfig {
}
