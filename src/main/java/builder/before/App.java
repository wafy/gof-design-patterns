package builder.before;

import java.time.LocalDate;

public class App {

    public static void main(String[] args) {
        TourPlan shortTrip = new TourPlan();
        shortTrip.setTitle("오래곤 롱비치 여행");
        shortTrip.setStartDate(LocalDate.of(2022, 11, 20));

        TourPlan tourPlan = new TourPlan();
        tourPlan.setTitle("태국 여행");
        tourPlan.setNights(2);
        tourPlan.setDays(3);
        tourPlan.setStartDate(LocalDate.now());
        tourPlan.setWhereToStay("리조트");
        tourPlan.addPlan(0, "체크인 이후 잠들기");
        tourPlan.addPlan(0, "저녁 식사");
        tourPlan.addPlan(1, "조식 부페에서 식사");
        tourPlan.addPlan(1, "해변가 산책");
        tourPlan.addPlan(2, "조식 부페에서 식사");
        tourPlan.addPlan(2, "체크 아웃");
    }
}
