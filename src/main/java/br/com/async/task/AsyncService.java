package br.com.async.task;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

/**
 *
 * @author Enilson Filho
 */
@Service
public class AsyncService {

    @Async
    public void hello() throws InterruptedException {
        Thread.sleep(10000);

        System.out.println("Hello Async!");
    }

}
