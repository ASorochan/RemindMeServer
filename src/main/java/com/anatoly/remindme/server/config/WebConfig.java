package com.anatoly.remindme.server.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * Created by anatoly on 01.10.16.
 */

@Configuration
@EnableWebMvc
@ComponentScan("com.anatoly.remindme.server")
public class WebConfig extends WebMvcConfigurerAdapter {
}
