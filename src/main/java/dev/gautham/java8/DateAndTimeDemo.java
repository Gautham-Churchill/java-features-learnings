package dev.gautham.java8;

import java.time.*;

public class DateAndTimeDemo {
    public static void main(String[] args) {

        System.out.println("Local Date & Time: " + LocalDateTime.now());
        System.out.println("Local Date: " + LocalDate.now());
        System.out.println("Local Time: " + LocalTime.now());
        System.out.println("Local time in Dubai: " + LocalDateTime.now(ZoneId.of("Asia/Dubai")));
        System.out.println("Current time in UTC: " + Instant.now());

        // Check for available Zones
        //System.out.println(ZoneId.getAvailableZoneIds());
    }
}
