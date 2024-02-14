package dev.gautham.java8;

interface Parser {
    String parse(String s);
}

class StringParser {
    public static String convert(String s) {
        return (s.length() > 5)?s.toUpperCase():s.toLowerCase();
    }
}

class MyPrinter {
    public void print(String s, Parser p) {
        s = p.parse(s);
        System.out.println(s);
    }
}

public class MethodReferenceDemo {
    public static void main(String[] args) {
        String name = "Suvi";
        MyPrinter printer = new MyPrinter();
        /*printer.print(name, new Parser() {
            @Override
            public String parse(String s) {
                return StringParser.convert(s);
            }
        });*/
        // Above commented boilerplate code is converted to below method reference code
        // 1st step in the conversion process
        /*printer.print(name, (String s) -> {
                return StringParser.convert(s);
        });*/
        printer.print(name, StringParser::convert);
    }
}
