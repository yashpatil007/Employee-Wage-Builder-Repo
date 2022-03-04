package com.infogalaxy;

import java.util.Random;

public class Employeewagebuilder {
    public static void main(String[] args) {
        System.out.println("Welcome to Employee wage builder Programme Developed By Yash");
        Random random=new Random();
        int empAttendance= random.nextInt()%2;
        System.out.println(empAttendance);
        if(empAttendance == 0){
            System.out.println("Employee Is Absent");
        } else {
            System.out.println("Employee is Present");
        }
    }
}
