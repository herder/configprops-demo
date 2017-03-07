package com.example

import org.junit.Test
import org.junit.runner.RunWith
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.context.junit4.SpringRunner
import org.springframework.util.Assert
import java.text.Normalizer

@RunWith(SpringRunner::class)
@SpringBootTest
class ConfigpropsDemoApplicationTestsJava {

    @Autowired
    lateinit var slugServicePropertiesJava: SlugServicePropertiesJava

    @Autowired
    lateinit var slugServicePropertiesKotlin: SlugServicePropertiesKotlin

    @Test
    fun testDefaultPropsJava() {
        Assert.isTrue(slugServicePropertiesJava.slugSize >= 10, "slugSize was not >= 10")
        Assert.isTrue(slugServicePropertiesJava.normalizerForm == Normalizer.Form.NFD, "normalizerForm was not NFD")
    }


    @Test
    fun testDefaultPropsKotlin() {
        Assert.isTrue(slugServicePropertiesKotlin.slugSize >= 10, "slugSize was not >= 10")
        Assert.isTrue(slugServicePropertiesKotlin.normalizerForm == Normalizer.Form.NFD, "normalizerForm was not NFD")
    }

}
