import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Arrays;

public class Day2_Puzzle2 {
    public static void main(String[] args) {
        int hPos = 0;
        int depth = 0;
        int aim = 0;
        int multiplication = 0;

        try(BufferedReader br = new BufferedReader(new FileReader("/home/bk201/Coding/blobs/src/adventInput.txt"))){
            String line;
            while ((line=br.readLine()) != null){
                String[] result = line.split(" ");
                if(result[0].equals("forward")){
                    hPos  += Integer.parseInt(result[1]);
                    depth += aim * Integer.parseInt(result[1]);
                }
                if(result[0].equals("down")){
                    aim += Integer.parseInt(result[1]);
                }
                if(result[0].equals("up")){
                    aim -= Integer.parseInt(result[1]);
                }
            }
            System.out.println(multiplication = hPos * depth);
        }catch (Exception e){
            System.out.println(e);
        }
    }
}
