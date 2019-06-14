package com.example.DemoGraphQL.Core;

import graphql.servlet.GraphQLErrorHandler;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @author wq
 * @date 2019/6/14
 */

@Configuration
@ServletComponentScan
@EnableScheduling
@EnableJpaAuditing
@PropertySource("file:conf/app.properties")
@EnableTransactionManagement
public class AppConfig implements WebMvcConfigurer {
}
