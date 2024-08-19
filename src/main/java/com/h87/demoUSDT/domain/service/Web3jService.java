package com.h87.demoUSDT.domain.service;

import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Service;
import org.web3j.protocol.Web3j;
import org.web3j.protocol.core.methods.response.EthBlockNumber;

@Service
@RequiredArgsConstructor
public class Web3jService implements CommandLineRunner {
    private final Web3j web3j;

    private void printLatestBlockNumber() {
        try {
            EthBlockNumber ethBlockNumber = web3j.ethBlockNumber().send();
            System.out.println("Latest block number: " + ethBlockNumber.getBlockNumber());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void run(String... args) throws Exception {
        printLatestBlockNumber();
    }
}
