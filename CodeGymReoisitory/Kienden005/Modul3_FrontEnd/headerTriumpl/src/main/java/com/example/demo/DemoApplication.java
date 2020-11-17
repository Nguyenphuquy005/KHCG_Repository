package com.example.demo;

import org.apache.tomcat.util.http.LegacyCookieProcessor;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.embedded.tomcat.TomcatServletWebServerFactory;
import org.springframework.boot.web.server.WebServerFactoryCustomizer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

    @Configuration
    class MvcConfig implements WebMvcConfigurer {
        @Override
        public void addResourceHandlers(ResourceHandlerRegistry registry) {
            registry.addResourceHandler("/resources/css/**").addResourceLocations("classpath:/static/css/");
            registry.addResourceHandler("/resources/img/**").addResourceLocations("classpath:/static/img/");
            registry.addResourceHandler("/resources/jquery/**").addResourceLocations("classpath:/static/jquery/");
        }

        @Bean
        public WebServerFactoryCustomizer<TomcatServletWebServerFactory> cookieProcessorCustomizer() {
            return (serverFactory) -> serverFactory.addContextCustomizers(
                    (context) -> context.setCookieProcessor(new LegacyCookieProcessor()));
        }
    }
}
