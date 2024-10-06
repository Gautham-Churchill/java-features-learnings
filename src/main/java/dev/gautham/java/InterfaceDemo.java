package dev.gautham.java;

interface Phone {
    void call();

    default void message() {
        System.out.println("Normal Message");
    }
}

class IPhone implements Phone {
    public void call() {
        System.out.println("Calling from iPhone");
    }

    public void message() {
        System.out.println("iMessage");
    }
}

class Android implements Phone {
    public void call() {
        System.out.println("Calling from Android");
    }
}

public class InterfaceDemo {
    public static void main(String[] args) {
        Phone iPhone = new IPhone();
        iPhone.call();
        iPhone.message();

        Phone android = new Android();
        android.call();
        android.message();
    }
}