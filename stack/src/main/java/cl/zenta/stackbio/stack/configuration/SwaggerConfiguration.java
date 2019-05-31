package cl.zenta.stackbio.stack.configuration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.fasterxml.classmate.TypeResolver;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/* The Class SwaggerConfiguration.
 *
 * This class configure swagger in project
 */
@EnableSwagger2
@Configuration
public class SwaggerConfiguration {
	
	 @Autowired
	    private TypeResolver resolver;

	    /**
	     * Microservice api.
	     *
	     * This defined all route to show in swagger UI
	     *
	     * @return the docket
	     */
	    @Bean
	    public Docket microserviceApi() {
	        return new Docket(DocumentationType.SWAGGER_2).apiInfo(microserviceApiInfo())
	                .select()
	                .paths(PathSelectors.any())
	                .apis(RequestHandlerSelectors.any())
	                .build()
	                .useDefaultResponseMessages(false) ;
	    }



	    /**
	     * Microservice api info.
	     *
	     * This show info of proyect in swagger UI
	     *
	     * @return the api info
	     */
	    private ApiInfo microserviceApiInfo() {
	        return new ApiInfoBuilder().title("STACK").version("1.0")
	                .license("Apache License Version 2.0").description("Documentacion Microservicio STACKBIO").build();
	    }

}
