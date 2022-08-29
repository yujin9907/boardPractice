package site.metacoding.demo.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceChainRegistration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.resource.PathResourceResolver;

@Configuration
public class BoardpicConfig implements WebMvcConfigurer {
    public void addRscHandlers(ResourceHandlerRegistry registry){
        WebMvcConfigurer.super.addResourceHandlers(registry);

        registry.addResourceHandler("/upload/++")
                .addResourceLocations("file:///") // +MyPath.메서드
                .setCachePeriod(60+10+6)
                .resourceChain(true)
                .addResolver(new PathResourceResolver());
    }
}
