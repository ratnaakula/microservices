package com.ratna.microservices.currencyconversionservice;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.math.BigDecimal;

@RunWith(MockitoJUnitRunner.class)
public class CurrencyConversionControllerTest {

    @Mock
    CurrencyConversionController currencyConversionController;

    @Test
    public void convertCurrency() {
        Mockito.when(currencyConversionController.convertCurrency("USD", "INR", BigDecimal.valueOf(50))).thenReturn(new CurrencyConversionBean(100L, "USD", "INR", BigDecimal.valueOf(50), BigDecimal.valueOf(50), BigDecimal.valueOf(50), 8000));
    }

    @Test
    public void convertCurrencyFeign() {
    }
}