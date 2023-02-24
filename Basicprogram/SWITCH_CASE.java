package Basicprogram;

public class SWITCH_CASE {
    public static void main(String[] args) {
        String day ="Monday";

        switch (day){

            case "Monday":
                System.out.println("Monday");
                break;
            case "Tusday":
                System.out.println("Tusday");
                break;
            case "Wednsday":
                System.out.println("Wednsday");
                break;
            default:
                System.out.println("invalid day");
                break;
        }

    }
}
