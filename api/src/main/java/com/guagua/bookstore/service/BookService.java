package com.guagua.bookstore.service;

import com.guagua.proto.bookstore.Book;
import com.guagua.proto.bookstore.BookServiceGrpc;
import com.guagua.proto.bookstore.CreateBookRequest;
import com.guagua.proto.bookstore.CreateBookResponse;
import com.sun.org.apache.bcel.internal.generic.NEW;
import io.grpc.stub.StreamObserver;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author guagua
 * @date 2023/3/15 19:02
 * @describe
 */
public class BookService extends BookServiceGrpc.BookServiceImplBase {

    ConcurrentHashMap<Integer, Book> map = new ConcurrentHashMap<>();

    @Override
    public void addBook(CreateBookRequest request, StreamObserver<CreateBookResponse> responseObserver) {
        System.out.println(request.getBook());
        int id = new Random().nextInt(10);

        if (map.containsKey(id)) {
            System.out.println("书籍以存在");
            return;
        }

        // 添加书籍
        addBookToMap(request, id);
        // 返回带id的结果
        responseObserver.onNext(
                CreateBookResponse.newBuilder()
                        .setBook(map.get(id))
                        .build()
        );
        responseObserver.onCompleted();
        // 打印数据
        printBooks();
    }

    private void printBooks() {
        Set<Map.Entry<Integer, Book>> entrySet = map.entrySet();
        Iterator<Map.Entry<Integer, Book>> iterator = entrySet.iterator();
        while (iterator.hasNext()) {
            Map.Entry<Integer, Book> next = iterator.next();
            Integer id = next.getKey();
            Book value = next.getValue();
            System.out.println(value);
        }
    }

    private void addBookToMap(CreateBookRequest request, int id) {
        Book book = request.getBook().toBuilder()
                .setId(id)
                .build();
        map.put(id, book);
    }
}
