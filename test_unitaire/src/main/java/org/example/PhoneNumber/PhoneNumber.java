package org.example.PhoneNumber;

import java.util.Objects;

public class PhoneNumber {
    private final String area;
    private final String major;
    private final String minor;

    private PhoneNumber(String area, String major, String minor) {
        this.area = area;
        this.major = major;
        this.minor = minor;
    }

    public static PhoneNumber parse(String number) {
        Objects.requireNonNull(number, "Phone number cannot be null.");

        if (number.trim().isEmpty())
            throw new IllegalArgumentException("Phone number cannot be blank.");

        if (number.length() != 10)
            throw new IllegalArgumentException("Phone number should be 10 digits long.");

        String area = number.substring(0, 3);
        String major = number.substring(3, 6);
        String minor = number.substring(6);

        return new PhoneNumber(area, major, minor);
    }

    @Override
    public String toString() {
        return String.format("(%s)%s-%s", area, major, minor);
    }
}
