package ClubDeFutbol;


public interface PressConference {

    public void givePressConference();

    public default void reviewConferenceWithPR(String msg) {
        System.out.println("Eric: Hi! I'm from the PR team. Let me review what you're going to say in the conference...");
        System.out.println("*Eric takes a look at your notes*");
        if (msg.length() > 10){
            System.out.println("Eric: You're telling to much to the press, please be more brief.");
        } else {
            System.out.println("Eric: This sounds good to me, go ahead!");
        }
    }

}
