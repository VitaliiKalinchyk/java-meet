package com.epam.rd.autotasks.meetautocode;

import static com.epam.rd.autotasks.meetautocode.constants.Constants.*;

public class HelloJava {

    public static void main(String[] args) {
        PrintClass printClass = new PrintClass(GREETING);
        printClass.consolePrint();
    }
}