package Basicprogram.LOOPS;

public class BreakContinue {
    public static void main(String[] args) {
        for(int i=1;i<=100;i++){
            System.out.println(i);

            if(i==50){
                continue;
            }
            if(i==50){
                break;
            }
            System.out.println("end");
        }
    }
}
