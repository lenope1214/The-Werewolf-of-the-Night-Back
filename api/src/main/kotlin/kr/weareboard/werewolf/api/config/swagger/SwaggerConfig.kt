package kr.weareboard.werewolf.api.config.swagger

import io.swagger.v3.oas.models.Components
import io.swagger.v3.oas.models.OpenAPI
import io.swagger.v3.oas.models.info.Contact
import io.swagger.v3.oas.models.info.Info
import io.swagger.v3.oas.models.info.License
import io.swagger.v3.oas.models.security.SecurityRequirement
import io.swagger.v3.oas.models.security.SecurityScheme
import io.swagger.v3.oas.models.servers.Server
import org.springdoc.core.GroupedOpenApi
import org.springframework.beans.factory.annotation.Value
import org.springframework.context.annotation.Bean
import org.springframework.stereotype.Component

@Component
class SwaggerConfig {

    @Bean
    fun openAPI(@Value("\${springdoc.version:0.0.0}") appVersion: String?): OpenAPI {
        val localServer = Server()
        localServer.url = "http://localhost:53101"
        localServer.description = "Server URL in Local environment"
        val prodServer = Server()
        prodServer.url = "http://52.69.157.151:53101/"
        prodServer.description = "Server URL in Production environment"
        val mitLicense = License()
            .name("MIT License")
            .url("https://choosealicense.com/licenses/mit/")
        val info = Info()
            .title("한밤의 늑대인간 API")
            .description("게임 - werewolf apidoc")
            .version("v0.0.1")
            .contact(Contact().name("개발자 이성복").url("https://game.weareboard.kr").email("dltjdqhr1000@gmail.com"))
            .termsOfService("https://my-awesome-api.com/terms")
            .license(mitLicense)

        val jwtScheme: SecurityScheme = SecurityScheme()
            .name("Authorization")
            .type(SecurityScheme.Type.HTTP)
            .`in`(SecurityScheme.In.HEADER)
            .bearerFormat("JWT")
            .scheme("bearer");

        return OpenAPI()
            .components(
                Components().addSecuritySchemes(
                    "Authorization", jwtScheme
                )
            )
            .info(info)
            .servers(
                listOf(
                    localServer, prodServer,
                )
            )
            .security(listOf(SecurityRequirement().addList("Authorization")))
    }

    @Bean
    fun userApi(): GroupedOpenApi {
        return GroupedOpenApi.builder()
            .group("v1 user")
            .pathsToMatch("/api/**")
            .pathsToExclude("/api/admin/**")
            .build()
    }

    @Bean
    fun adminApi(): GroupedOpenApi {
        return GroupedOpenApi.builder()
            .group("v1 admin")
            .pathsToMatch("/api/admin/**", "/api/auth/**")
            .build()
    }
}
