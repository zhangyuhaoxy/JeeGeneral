package com.yuhao;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

@Service
public class ThreadService {
    @Async
    public void sendEmail(final String email) {
        System.out.println("send ok " + email);
    }
}
