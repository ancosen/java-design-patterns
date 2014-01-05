package com.github.ancosen.nullobject;

import java.io.OutputStream;

public class NormalOutputStream extends OutputStream {
    public void write(int b) {
        System.err.println("writing");
    }
}
