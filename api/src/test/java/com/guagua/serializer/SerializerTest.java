package com.guagua.serializer;

import com.google.protobuf.Message;
import com.guagua.bookstore.common.Generator;
import com.guagua.proto.bookstore.Book;
import junit.framework.TestCase;

import java.io.IOException;

public class SerializerTest extends TestCase {
    public static String path = "data/book.bin";

    public void testWriteBinarySerializer() throws IOException {
        Book book = Generator.getBook();
        Serializer serializer = new Serializer();

        serializer.writeBinarySerializer(book, path);

        Book book1 = serializer.readBinarySerializer(path);
        assertEquals(book, book1);
    }

    public void testJsonSerializer() throws Exception {
        Serializer serializer = new Serializer();
        Book book = Generator.getBook();
        String path1 = "data/book.json";
        serializer.writeJsonSerializer(book, path1);

        Message message = serializer.readJsonSerializer(Serializer.getJsonFromPath(path1), Book.newBuilder());
        Book book1 = (Book) message.toBuilder().build();

        assertEquals(book, book1);
    }

    public void testGetJsonFromPath() {

        try {
            Serializer.getJsonFromPath(null);
        } catch (Exception e) {
            assertTrue(true);
        }

    }


}