package com.it.deliver.util;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;


public class Util {

    public static LocalDate stringToLocalDate(String date){
        System.out.println(date);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate localDate = LocalDate.parse(date, formatter);
        return localDate;
    }
}
