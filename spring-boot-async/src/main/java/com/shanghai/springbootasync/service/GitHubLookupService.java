package com.shanghai.springbootasync.service;

import com.shanghai.springbootasync.bean.User;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.concurrent.CompletableFuture;

/**
 * @author caizhengjun
 * @version 1.0
 * @date 2020/6/22 3:05 下午
 */
@Service
@Slf4j
public class GitHubLookupService {
    private final RestTemplate restTemplate;

    public GitHubLookupService(RestTemplateBuilder restTemplateBuilder) {
        this.restTemplate = restTemplateBuilder.build();
    }

    @Async
    public CompletableFuture<User> findUserAsync(String user) throws InterruptedException {
        log.info("Looking up " + user);
        String url = String.format("https://api.github.com/users/%s", user);
        User result = this.restTemplate.getForObject(url, User.class);
        Thread.sleep(5000L);
        return CompletableFuture.completedFuture(result);
    }

    public User findUserSync(String user) throws InterruptedException {
        log.info("Looking up " + user);
        String url = String.format("https://api.github.com/users/%s", user);
        User result = this.restTemplate.getForObject(url, User.class);
        Thread.sleep(5000L);
        return result;
    }
}
