package emp.api.config;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.models.ExternalDocumentation;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;

@Configuration
public class SwaggerConfig {

	@Bean
	OpenAPI apiInfo() {
		return new OpenAPI()
				.info(new Info().title("Scheduler").description("Sample spring boot service").version("1.1.1")
						.license(new License().name("Apach 2.0").url("http://springdoc.org"))
						.contact(new Contact().name("esayas").email("esagebre@gamil.com")))
				.externalDocs(new ExternalDocumentation().description("If any External doc... like local wiki").url("http://google.com"));

	}

}
