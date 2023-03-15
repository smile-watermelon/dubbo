package com.guagua.bookstore.common;


import com.guagua.proto.bookstore.AuthorMessage;
import com.guagua.proto.bookstore.Book;
import com.guagua.proto.bookstore.CreateBookRequest;
import com.guagua.proto.bookstore.CreateBookRequestOrBuilder;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.*;

/**
 * @author guagua
 * @date 2023/3/15 02:17
 * @describe
 */
public class Generator {

    public static void main(String[] args) {
        double d = new BigDecimal("1.245").setScale(2, RoundingMode.HALF_UP).doubleValue();
        System.out.println(d);
    }

    public static CreateBookRequest getCreateBookRequest() {
        return CreateBookRequest.newBuilder()
                .setBook(getBook())
                .build();
    }
    public static Book getBook() {
        return Book.newBuilder()
                .setAuthor(getAuthor())
                .setName(randBookName())
                .setSellingPrice(randomSellingPrice())
                .setPublisher(randomPublisher())
                .build();
    }

    public static AuthorMessage.Author getAuthor() {
        return AuthorMessage.Author.newBuilder()
                .setName(randomAuthorName())
                .build();
    }

    public static String randomPublisher() {
        String[] publishers = new String[]{"中信出版社", "清华出版社"};
        int index = new Random().nextInt(publishers.length);
        return publishers[index];
    }

    public static double randomSellingPrice() {
        double d = new Random().nextDouble() * 10 + 100;
        d = new BigDecimal(d).setScale(2, RoundingMode.HALF_UP).doubleValue();
        return d;
    }

    public static String randBookName() {
        List<String> bookNames = new ArrayList<>(Arrays.asList("西游记", "狂飙", "effactive java"));
        int index = new Random().nextInt(bookNames.size());
        return bookNames.get(index);
    }

    public static String randomAuthorName() {
        List<String> authors = new ArrayList<>(Arrays.asList("guagua", "dudu", "haha"));
        int index = new Random().nextInt(authors.size());

        return authors.get(index);
    }
}
