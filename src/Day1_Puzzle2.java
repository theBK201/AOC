import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

public class Day1_Puzzle2 {
    public static void main(String[] args) {
        int increasedCount = 0;
        int groupA=0;
        int groupB=0;

        try(BufferedReader br = new BufferedReader(new FileReader("/home/bk201/Coding/blobs/src/adventInput.txt"))){
            String line;
            ArrayList<Integer> inputs = new ArrayList<Integer>();
            while (inputs.size() < 3 &&(line=br.readLine()) != null ){
                int numInput = Integer.parseInt(line);
                inputs.add(numInput);
            }
            while ((line=br.readLine()) != null){
                System.out.println(inputs.toString());
                int numInput = Integer.parseInt(line);
                groupA = inputs.get(0) + inputs.get(1) + inputs.get(2);
                groupB = inputs.get(1) + inputs.get(2) + numInput;
                if(groupA < groupB){
                    increasedCount++;
                }
                inputs.remove(0);
                inputs.add(numInput);
            }
            System.out.println(increasedCount);
        }catch (Exception e){
            System.out.println(e);
        }
    }
}
