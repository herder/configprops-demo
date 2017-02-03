package com.example

import org.springframework.boot.context.properties.ConfigurationProperties
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.context.annotation.Profile
import org.springframework.util.Assert
import org.springframework.validation.annotation.Validated
import java.text.Normalizer
import javax.validation.constraints.Min

@Validated
open class SlugServicePropertiesKotlin(@Min(10) var slugSize: Int = 70,
                                       var normalizerForm: Normalizer.Form = Normalizer.Form.NFD)

@Configuration
@Profile("java")
open class SlugServiceConfigurationKotlin {


    @Bean
    @ConfigurationProperties(prefix = "slugservice.articles", exceptionIfInvalid = true)
    open fun slugServiceProperties() = SlugServicePropertiesJava()


    @Bean
    open fun getProps(slugServiceProperties: SlugServicePropertiesJava): String {
        Assert.isTrue(slugServiceProperties.slugSize >= 10, "slugSize was not >= 10")
        Assert.isTrue(slugServiceProperties.normalizerForm == Normalizer.Form.NFD, "normalizerForm was not NFD")
        return "Ok"
    }
}


@Configuration
@Profile("kotlin")
open class SlugServiceConfigurationJava {


    @Bean
    @ConfigurationProperties(prefix = "slugservice.articles", exceptionIfInvalid = true)
    open fun slugServiceProperties() = SlugServicePropertiesKotlin()


    @Bean
    open fun getProps(slugServiceProperties: SlugServicePropertiesKotlin): String {
        Assert.isTrue(slugServiceProperties.slugSize >= 10, "slugSize was not >= 10")
        Assert.isTrue(slugServiceProperties.normalizerForm == Normalizer.Form.NFD, "normalizerForm was not NFD")
        return "Ok"
    }
}
