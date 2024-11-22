package com.onsemi.cabl.restconsumer;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.ConfigurableEnvironment;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@SpringBootApplication
public class SpringCablConsumerApplication {
	
	
	@Autowired
    public static ConfigurableEnvironment myEnv;
	
	public static void main(String[] args) {
		SpringApplication.run(SpringCablConsumerApplication.class, args);
	}
	
	@Bean
	public RestTemplate restTemplate(){
		return new RestTemplate();
	}
	
    @Configuration
    public class WebConfig implements WebMvcConfigurer {      
        @Override
        public void addResourceHandlers(ResourceHandlerRegistry registry) {
            registry.addResourceHandler("/**")
            .addResourceLocations("classpath:/static/","classpath:/images/")
            .setCachePeriod(0);
        }
    }
	
}
