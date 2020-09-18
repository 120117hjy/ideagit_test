package com.hjy.testspringboot.config;

import com.hjy.testspringboot.service.HelloService;
import com.hjy.testspringboot.servlet.MyFilter;
import com.hjy.testspringboot.servlet.MyServlet;
import org.springframework.boot.web.server.ConfigurableWebServerFactory;
import org.springframework.boot.web.server.WebServerFactoryCustomizer;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;

import java.util.Arrays;

@org.springframework.context.annotation.Configuration
public class Configuration {

   @Bean
    public HelloService helloService(){
       return new HelloService();
   }

    @Bean
    public WebServerFactoryCustomizer<ConfigurableWebServerFactory> webServerFactoryWebServerFactoryCustomizer(){
        return new WebServerFactoryCustomizer<ConfigurableWebServerFactory>() {
            @Override
            public void customize(ConfigurableWebServerFactory factory) {
                factory.setPort(8002);
            }
        };
    }

    @Bean
    public ServletRegistrationBean myServlet(){
        ServletRegistrationBean registrationBean = new ServletRegistrationBean(new
                MyServlet(),"/myServlet");
        return registrationBean;
    }

    @Bean
    public FilterRegistrationBean myFilter(){
       FilterRegistrationBean registrationBean = new FilterRegistrationBean();
       registrationBean.setFilter(new MyFilter());
       registrationBean.setUrlPatterns(Arrays.asList("/hello","/myServlet")); return registrationBean; }
}
