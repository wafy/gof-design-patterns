package mediator.after;

public class CleaningService {

    private FrontDesk frontDesk = new FrontDesk();

    public void getTowers(Integer guestId, int numberLOfTowers) {
        String roomNumbers = this.frontDesk.getRoomNUmberFor(guestId);
        System.out.println("provide = " + numberLOfTowers + " to " + roomNumbers);

    }
}
