package home.amit.java8.enhancements.lambdas;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;

public class ThirdThursdayOfYearAndMonth {

    private final LocalDate ldate;

    public ThirdThursdayOfYearAndMonth(LocalDate localDate) {
        this.ldate = localDate;
    }

    private int getThirdThursdayOfYearAndMonth() {
        LocalDate ldate = this.ldate
                .with(TemporalAdjusters.nextOrSame(DayOfWeek.THURSDAY))
                .with(TemporalAdjusters.next(DayOfWeek.THURSDAY))
                .with(TemporalAdjusters.next(DayOfWeek.THURSDAY));
        int day = ldate.getDayOfMonth();
        return day;
    }

    public static void main(String[] args) {
        ThirdThursdayOfYearAndMonth thirdThursdayOfYearAndMonth = new ThirdThursdayOfYearAndMonth(LocalDate.now());
        System.out.println(" " + thirdThursdayOfYearAndMonth.getThirdThursdayOfYearAndMonth());

    }

}
