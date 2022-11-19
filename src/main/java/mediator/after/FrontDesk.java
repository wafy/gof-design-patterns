package mediator.after;

import java.time.LocalDateTime;

public class FrontDesk {

    private CleaningService cleaningService;

    private Restaurant restaurant = new Restaurant();

    public void getTowers(Guest guest, int numberLOfTowers) {
        cleaningService.getTowers(guest.getId(), numberLOfTowers);

    }

    public String getRoomNUmberFor(Integer guestId) {
        return "1111";
    }

    public void dinner(Guest guest, LocalDateTime dateTime) {
        restaurant.dinner(guest.getId(), dateTime);
    }
}
