package patternQuestions;

public class solidRectangle {
    public static void main(String[] args) {
        int row = 3;
        int col = 5;

        for(int i=0; i<row; i++){
            for(int j=0 ; j<col; j++){
                System.out.print("*" + " ");
            }
            System.out.println();
        }
    }
}
