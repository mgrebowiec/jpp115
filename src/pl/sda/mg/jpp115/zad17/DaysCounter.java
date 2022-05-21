package pl.sda.mg.jpp115.zad17;

import pl.sda.mg.jpp115.util.InputUtil;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class DaysCounter {
    public static void main(String[] args) {
        LocalDate userDate = InputUtil.getDateFromUser("Podaj date nastepnych zajec w formacie yyyy-MM-dd:");
        LocalDate now = LocalDate.now();

        System.out.println("Ilosc dni: " + Math.abs(ChronoUnit.DAYS.between(userDate, now)));
    }
}
