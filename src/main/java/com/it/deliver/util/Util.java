package com.it.deliver.util;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;


public class Util {

    public static LocalDate stringToLocalDate(String date){
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate localDate = LocalDate.parse(date, formatter);
        return localDate;
    }
    public static String localDateToSring(LocalDate date){
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        return date.format(formatter);
    }
    public static Double truncateTo(Double value){
        String sValue = (String) String.format("%.2f", value);
        Double newValue = Double.parseDouble(sValue);
        return  newValue;
    }

}
