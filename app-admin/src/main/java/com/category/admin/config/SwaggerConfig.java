//package com.category.admin.config;
//
//import io.swagger.v3.oas.annotations.enums.SecuritySchemeType;
//import io.swagger.v3.oas.annotations.security.SecurityScheme;
//import io.swagger.v3.oas.models.OpenAPI;
//import io.swagger.v3.oas.models.info.Info;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//
//@Configuration
//@SecurityScheme(
//        name = "bearerAuth",
//        type = SecuritySchemeType.HTTP,
//        bearerFormat = "JWT",
//        scheme = "bearer"
//)
//public class SwaggerConfig {
//    @Bean
//    public OpenAPI openAPI() {
//        return new OpenAPI()
//                .info(new Info()
//                        .title("로그인 서비스 API")
//                        .version("v1.0.0")
//                        .description("로그인 서비스 API 명세서입니다. "));
//    }
//
//}
