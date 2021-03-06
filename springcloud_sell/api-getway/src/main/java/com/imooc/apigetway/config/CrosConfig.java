// package com.imooc.apigetway.config;
//
// import org.springframework.context.annotation.Bean;
// import org.springframework.context.annotation.Configuration;
// import org.springframework.web.cors.CorsConfiguration;
// import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
// import org.springframework.web.filter.CorsFilter;
//
// import java.util.Arrays;
//
// /**
//  * Zuul实现跨域配置
//  * @author ：menglc
//  * @date ：Created in 2020/1/4 13:43
//  */
// @Configuration
// public class CrosConfig {
//
//     @Bean
//     public CorsFilter corsFilter () {
//         final UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
//         final CorsConfiguration config = new CorsConfiguration();
//
//         config.setAllowCredentials(true);
//         config.setAllowedOrigins(Arrays.asList("*"));
//         config.setAllowedHeaders(Arrays.asList("*"));
//         config.setAllowedMethods(Arrays.asList("*"));
//         config.setMaxAge(300L);
//         source.registerCorsConfiguration("/**",config);
//         return new CorsFilter(source);
//     }
// }
