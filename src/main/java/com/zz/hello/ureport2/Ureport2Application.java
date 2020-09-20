package com.zz.hello.ureport2;

import com.bstek.ureport.console.UReportServlet;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ImportResource;

import javax.servlet.Servlet;
import javax.servlet.ServletRegistration;

@ImportResource("classpath:context.xml")
@SpringBootApplication
public class Ureport2Application {

    public static void main(String[] args) {
        SpringApplication.run(Ureport2Application.class,args);
    }

    @Bean
    public ServletRegistrationBean buildUReport2Servlet(){
        return new  ServletRegistrationBean(new UReportServlet(),"/ureport/*");
    }
}
