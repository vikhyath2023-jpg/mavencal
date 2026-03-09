package com.example;
public class App {
    public String getGrade(int marks) {
        if (marks >= 80) return "A";
        else if (marks >= 60) return "B";
        else if (marks >= 40) return "C";
        else return "D";
    }
}

