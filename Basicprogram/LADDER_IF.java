package Basicprogram;

public class LADDER_IF {
    public static void main(String[] args) {
        int n=20;
        if(n>90){
            System.out.println("grade A");
        }
        else if(n>80 && n<=90){
            System.out.println("grade B");
        }
        else{
            System.out.println("fail");
        }
    }
}
