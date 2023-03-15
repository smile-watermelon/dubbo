package com.guagua.bookstore.common;

import com.guagua.proto.bookstore.Book;
import junit.framework.TestCase;

public class GeneratorTest extends TestCase {

    public void testGetBook() {
        Book book = Generator.getBook();
        assertNotNull(book);
    }
}