package com.example.async.asyncexample.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
@Slf4j
public class GithubService {

    @Autowired
    RestTemplate restTemplate;
        @Async("taskExecutorDefault")
        public void sendEmail() {
            try {
                Thread.sleep(10000);
                String result = restTemplate.getForObject("https://api.github.com/users/samsanimahesh", String.class);
                log.info("Obtained github user {}", result);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

        }
}
