package com.tsystems.ecrono.configuration;

import static springfox.documentation.builders.PathSelectors.regex;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.ResponseEntity;

import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration // Le dice a Spring que es una clase de configuración y que debe
	       // ejecutar esto cuando se esté
// configurando el mismo y no en tiempo de ejecucion
@EnableSwagger2
public class SwaggerConfiguration {

    public static final String DEFAULT_INCLUDE_PATTERN = "/.*";

    @Bean
    public Docket createDocketForGroup() {
	Docket docket = new Docket(DocumentationType.SWAGGER_2)// .apiInfo(apiInfo)//
		.genericModelSubstitutes(ResponseEntity.class).ignoredParameterTypes(java.sql.Date.class)
		.directModelSubstitute(java.time.LocalDate.class, java.sql.Date.class)//
		.select().paths(regex(DEFAULT_INCLUDE_PATTERN))//
		.build();
	return docket;
    }
}
