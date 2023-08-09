package com.loonycorn;

public class EntryPoint {

    private String mode;

    public EntryPoint(String mode) {
        this.mode = mode;
    }

    public void printMode() {
        System.out.println("App is running in " + this.mode + " mode.\n");
    }

    public static void main(String[] args) {

        EntryPoint ep = new EntryPoint("DEV");

        ep.printMode();

        Employee admin = new Employee("admin", 0, "admin");

        System.out.println("New admin user created from EntryPoint");

    }
}

// Apache POM Reference
// https://maven.apache.org/pom.html