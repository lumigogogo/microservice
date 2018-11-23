package com.imooc;

import com.imooc.filter.CourceFilter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class ServiceApplication {

    public static void main(String args[]){
        SpringApplication.run(ServiceApplication.class, args);
    }

    @Bean
    public FilterRegistrationBean filterRegisterionBean() {
        FilterRegistrationBean filterRegistrationBean = new FilterRegistrationBean();
        CourceFilter courceFilter = new CourceFilter();
        filterRegistrationBean.setFilter(courceFilter);
        List<String> urlPatterns = new ArrayList<String>();
        urlPatterns.add("/*");
        filterRegistrationBean.setUrlPatterns(urlPatterns);
        return filterRegistrationBean;
    }
}
