package com.h87.demoUSDT.domain.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.web3j.protocol.Web3j;
import org.web3j.protocol.http.HttpService;

@Configuration
public class Web3jConfig {

    @Bean
    public Web3j web3j() {
        String apiUrl = "https://mainnet.infura.io/v3/4eeb837d788241c38fded11954e5458b";
        return Web3j.build(new HttpService(apiUrl));
    }
}
