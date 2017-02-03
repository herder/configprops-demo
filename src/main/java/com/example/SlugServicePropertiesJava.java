package com.example;

import org.springframework.validation.annotation.Validated;

import java.text.Normalizer;

@Validated
public class SlugServicePropertiesJava {

    private int slugSize = 70;
    private Normalizer.Form normalizerForm = Normalizer.Form.NFD;

    public int getSlugSize() {
        return slugSize;
    }

    public void setSlugSize(final int slugSize) {
        this.slugSize = slugSize;
    }

    public Normalizer.Form getNormalizerForm() {
        return normalizerForm;
    }

    public void setNormalizerForm(final Normalizer.Form normalizerForm) {
        this.normalizerForm = normalizerForm;
    }
}
