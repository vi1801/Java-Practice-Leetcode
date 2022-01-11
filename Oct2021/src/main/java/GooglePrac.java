import java.util.Scanner;
import java.util.stream.Stream;
import java.util.*;

public class GooglePrac{

        static int solution(Integer[] A) {
            // Your solution goes here.
            int i = 0;
            int n = A.length;
            List<Integer> rows = new ArrayList<Integer>();
            while( i < n) {
                boolean standingInARow = false;
                for(int j=0;j<rows.size();j++){
                    if(rows.get(j) > A[i]){
                        rows.set(j, A[i]);
                        standingInARow = true;
                        break;
                    }
                }
                if(!standingInARow)
                    rows.add(A[i]);

                // System.out.println(i+" "+rows);
                i++;
            }

            return rows.size();
        }
    /*return 0;
  }*/

        public static void main(String[] args) {
            // Read from stdin, solve the problem, write answer to stdout.
            Scanner in = new Scanner(System.in);
            Integer[] A = getIntegerArray(in.next());

            System.out.print(solution(A));
        }

        private static Integer[] getIntegerArray(String str) {
            return Stream.of(str.split("\\,"))
                    .map(Integer::valueOf)
                    .toArray(Integer[]::new);
        }
}