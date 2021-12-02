import java.io.BufferedReader;
import java.io.FileReader;

public class Day1 {
    public static void main(String[] args) {
        int increasedCount = 0;
        int countedNum = 0;

        try(BufferedReader br = new BufferedReader(new FileReader("/home/bk201/Coding/blobs/src/adventInput.txt"))){
            String line;
            while ((line=br.readLine()) != null){
               int numInput = Integer.parseInt(line);

                if(numInput > countedNum && countedNum != 0){
                    increasedCount ++;
                }
                countedNum = numInput;
            }
            System.out.println(increasedCount);
        }catch (Exception e){
            System.out.println(e);
        }
    }
}
