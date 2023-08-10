package com.loonycorn;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

public class EntryPoint {

    private String mode;
    private static Logger logger;

    public EntryPoint(String mode) {
        this.mode = mode;

        System.setProperty("log4j.configurationFile",
                "/Users/juan/code/skillsoft/java-novice-to-javanista/track-2-java-apprentice/java-archive-jar-packaging-java-apps-using-maven/resources/log4j2.properties");
        this.logger = LogManager.getLogger(EntryPoint.class);

    }

    public void printMode() {
        logger.info("App is running in " + this.mode + " mode.\n");
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

// Invalidating the IntelliJ cache
// File -> Invalidate Caches / Restart