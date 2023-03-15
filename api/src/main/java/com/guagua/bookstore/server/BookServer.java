package com.guagua.bookstore.server;

import com.guagua.bookstore.service.BookService;
import io.grpc.Server;
import io.grpc.ServerBuilder;

import java.io.IOException;
import java.util.concurrent.CountDownLatch;

/**
 * @author guagua
 * @date 2023/3/15 13:19
 * @describe
 */
public class BookServer {

    public static void main(String[] args) throws IOException {
        Server server = ServerBuilder.forPort(8888)
                .addService(new BookService())
                .build()
                .start();

        try {
            new CountDownLatch(1).await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
