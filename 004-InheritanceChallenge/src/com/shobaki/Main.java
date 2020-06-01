package com.shobaki;

public class Main {

    public static void main(String[] args) {
        OutlanderTeacher outlander = new OutlanderTeacher(36);
        outlander.steer(45);
        outlander.accelerate(30);
        outlander.accelerate(20);
        outlander.accelerate(-42);
    }
}
