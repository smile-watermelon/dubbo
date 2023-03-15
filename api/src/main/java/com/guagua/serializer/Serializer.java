package com.guagua.serializer;

import com.google.protobuf.Message;
import com.google.protobuf.util.JsonFormat;
import com.guagua.proto.bookstore.Book;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;

/**
 * @author guagua
 * @date 2023/3/15 02:55
 * @describe
 */
public class Serializer {

    public void writeBinarySerializer(Book book, String path) throws IOException {
        FileOutputStream out = new FileOutputStream(path);
        book.writeTo(out);
        out.close();
    }

    public Book readBinarySerializer(String path) throws IOException {
        FileInputStream in = new FileInputStream(path);
        Book book = Book.parseFrom(in);
        in.close();

        return book;
    }

    public void writeJsonSerializer(Book book, String path) throws IOException {
        JsonFormat.Printer printer = JsonFormat.printer()
                .includingDefaultValueFields()
                .preservingProtoFieldNames();

        String str = printer.print(book);

        FileOutputStream out = new FileOutputStream(path);
        out.write(str.getBytes(StandardCharsets.UTF_8));

        out.close();
    }

    public Message readJsonSerializer(String json, Message.Builder builder) throws IOException {
        JsonFormat.parser()
                .ignoringUnknownFields()
                .merge(json, builder);

        return builder.build();
    }


    public static String getJsonFromPath(String path) throws Exception {
        if (null == path) {
            throw new Exception("path must not null");
        }
        byte[] bytes = Files.readAllBytes(Paths.get(path));
        return new String(bytes);
    }

}
