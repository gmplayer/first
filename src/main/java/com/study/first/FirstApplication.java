package com.study.first;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.boot.builder.SpringApplicationBuilder;

@SpringBootApplication
public class FirstApplication extends SpringBootServletInitializer {

    public static void main(String[] args) {
        SpringApplication.run(FirstApplication.class, args);
    }

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        // 注意这里要指向原先用main方法执行的Application启动类
        return builder.sources(FirstApplication.class);

        //hotfix 分支ß

        //hotfix  fix bug
    }
}
