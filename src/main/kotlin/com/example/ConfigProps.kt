package com.example

import org.springframework.boot.context.properties.ConfigurationProperties
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.validation.annotation.Validated
import java.text.Normalizer
import javax.validation.constraints.Min

@Validated
open class SlugServicePropertiesKotlin(@Min(10) var slugSize: Int = 70,
                                       var normalizerForm: Normalizer.Form = Normalizer.Form.NFD)

@Configuration
open class SlugServiceConfiguration {


    @Bean
    @ConfigurationProperties(prefix = "slugservice.articles", exceptionIfInvalid = true)
    open fun slugServicePropertiesJava() = SlugServicePropertiesJava()

    @Bean
    @ConfigurationProperties(prefix = "slugservice.articles", exceptionIfInvalid = true)
    open fun slugServicePropertiesKotlin() = SlugServicePropertiesKotlin()

}
