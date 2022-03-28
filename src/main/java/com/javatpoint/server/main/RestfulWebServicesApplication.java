package com.javatpoint.server.main;
import java.io.FileReader;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

/*import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;*/

@SpringBootApplication
/* @EnableSwagger2 */
public class RestfulWebServicesApplication {

	public static void main(String[] args) {
		SpringApplication.run(RestfulWebServicesApplication.class, args);
	}
	/*
	 * @Bean public Docket swaggerConfiguration() { // Return a prepared Docket
	 * instance return new Docket(DocumentationType.SWAGGER_2)
	 * .select().paths(PathSelectors.ant("/api/*"))
	 * .apis(RequestHandlerSelectors.basePackage("com.javatpoint.server"))
	 * .build().apiInfo(apiInfo()); } private ApiInfo apiInfo() { return new
	 * ApiInfoBuilder().title("devops-demo") .description("Helloo World Example")
	 * .termsOfServiceUrl("http://nous.com") .license("NousInfo License")
	 * .licenseUrl("http://niweditar@nousinfo.com") .version("1.0.0") .build(); }
	 */
}
	