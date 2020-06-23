package com.shanghai.springbootasync.component;

import com.shanghai.springbootasync.bean.User;
import com.shanghai.springbootasync.service.GitHubLookupService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.concurrent.CompletableFuture;

/**
 * @author caizhengjun
 * @version 1.0
 * @date 2020/6/22 3:16 下午
 */
@Component
@Slf4j
public class AppRunner implements CommandLineRunner {

    private GitHubLookupService gitHubLookupService;

    @Autowired
    public AppRunner(GitHubLookupService gitHubLookupService) {
        this.gitHubLookupService = gitHubLookupService;
    }

    @Override //6285
    public void run(String... args) throws Exception {
        long start = System.currentTimeMillis();
        CompletableFuture<User> user1 = this.gitHubLookupService.findUserAsync("PivotalSoftware");
        CompletableFuture<User> user2 = this.gitHubLookupService.findUserAsync("CloudFoundry");
        CompletableFuture<User> user3 = this.gitHubLookupService.findUserAsync("Spring-Projects");
        CompletableFuture.allOf(user1, user2, user3).join();
        log.info("Elapsed time: " + (System.currentTimeMillis() - start));
        log.info("--> " + user1.get());
        log.info("--> " + user2.get());
        log.info("--> " + user3.get());
    }

    //@Override //19339
    public void run1(String... args) throws Exception {
        long start = System.currentTimeMillis();
        User user1 = this.gitHubLookupService.findUserSync("PivotalSoftware");
        User user2 = this.gitHubLookupService.findUserSync("CloudFoundry");
        User user3 = this.gitHubLookupService.findUserSync("Spring-Projects");
        log.info("Elapsed time: " + (System.currentTimeMillis() - start));
        log.info("--> " + user1);
        log.info("--> " + user2);
        log.info("--> " + user3);
    }
}
