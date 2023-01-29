package patternQuestions;

import java.util.Scanner;

public class hollowRectangle {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int row = scan.nextInt();
        int col = scan.nextInt();

        for(int i=0; i<row; i++){
            if(row==0 || row==row-1){
                for(int j=col; j<col; j++){
                    System.out.print("*" +" ");
                }
                System.out.println();
            }else{
                System.out.print("*" +" ");
            }
        }


        scan.close();
    }
}
