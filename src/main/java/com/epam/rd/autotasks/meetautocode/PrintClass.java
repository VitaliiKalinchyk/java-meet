package com.epam.rd.autotasks.meetautocode;

import java.io.BufferedOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class PrintClass {

    private final String toPrint;

    public PrintClass(String toPrint) {
        this.toPrint = toPrint;
    }

    public void consolePrint() {
        BufferedOutputStream output = new BufferedOutputStream(System.out);
        try {
            output.write(toPrint.getBytes(StandardCharsets.US_ASCII));
            output.flush();
            output.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
