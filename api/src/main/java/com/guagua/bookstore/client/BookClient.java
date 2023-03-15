package com.guagua.bookstore.client;

import com.guagua.bookstore.common.Generator;
import com.guagua.proto.bookstore.BookServiceGrpc;
import com.guagua.proto.bookstore.CreateBookResponse;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

/**
 * @author guagua
 * @date 2023/3/15 19:27
 * @describe
 */
public class BookClient {

    public static void main(String[] args) {
        ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 8888)
                .usePlaintext()
                .build();

        CreateBookResponse response = BookServiceGrpc.newBlockingStub(channel)
                .addBook(Generator.getCreateBookRequest());

        System.out.println(response.getBook());

    }
}
