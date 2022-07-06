package com.example.CurrencyServiceApplication.service;

import com.example.CurrencyServiceApplication.domain.CurrencyService;
import com.example.CurrencyServiceApplication.entity.Currency;
import com.example.CurrencyServiceApplication.entity.CurrencyRequest;
import com.example.CurrencyServiceApplication.entity.CurrencyResponse;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class CurrencyServiceTest {

    @Test
    void get_updated_currency() {

        final CurrencyService currencyService = new CurrencyService();

        final CurrencyResponse currencyResponse = currencyService.getUpdatedCurrency(getCurrencyRequest());

        assertThat(currencyResponse.getUpdatedCurrency()).isEqualTo(Currency.USD);
        assertThat(currencyResponse.getUpdatedPrice()).isEqualTo(110);
    }

    private CurrencyRequest getCurrencyRequest() {

        return new CurrencyRequest()
                .setId(1)
                .setWantedCurrency(Currency.USD)
                .setTotalPrice(100);
    }
}
