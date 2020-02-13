import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class FrequencyQueriesOriginalSolution {

    static List freqQuery(List<Integer[]> queries) {
        List ans = new ArrayList();
        final int INSERT = 1;
        final int REMOVE = 2;
        final int QUERY = 3;

        Map value2count = new HashMap();
        Map count2countOccurance = new HashMap();

        for (Integer[] q : queries) {
            int type = q[0];
            int value = q[1];

            if (type == INSERT) {
                if (value2count.containsKey(value)) {
                    int oldCount = (int)value2count.get(value);
                    int newCount = oldCount + 1;

                    value2count.put(value, newCount);

                    int dec=(int)count2countOccurance.get(oldCount)-1;

                    count2countOccurance.put(oldCount, dec);

                    if (!count2countOccurance.containsKey(newCount)) {
                        count2countOccurance.put(newCount, 0);
                    }
                    int inc = (int)count2countOccurance.get(newCount) +1;

                    count2countOccurance.put(newCount, inc);
                } else {
                    value2count.put(value, 1);
                    if (!count2countOccurance.containsKey(1)) {
                        count2countOccurance.put(1, 0);
                    }
                    count2countOccurance.put(1, (int)count2countOccurance.get(1) + 1);
                }
            } else if (type == REMOVE) {
                if (value2count.containsKey(value)) {
                    int oldCount = (int)value2count.get(value);
                    int newCount = Math.max(oldCount - 1, 0);

                    value2count.put(value, newCount);

                    count2countOccurance.put(oldCount, (int)count2countOccurance.get(oldCount) - 1);

                    if (!count2countOccurance.containsKey(newCount)) {
                        count2countOccurance.put(newCount, 0);
                    }
                    count2countOccurance.put(newCount, (int)count2countOccurance.get(newCount) + 1);
                }
            } else if (type == QUERY) {
                if (count2countOccurance.containsKey(value) && (int)count2countOccurance.get(value) > 0) {
                    ans.add(1);
                } else {
                    ans.add(0);
                }
            }
        }

        return ans;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int q = Integer.parseInt(bufferedReader.readLine().trim());

        List queries = new ArrayList();

        for (int i = 0; i < q; i++) {
            String[] queriesRowTempItems = bufferedReader.readLine().replaceAll("s+$","").split( "");

            Integer[] queriesRowItems = new Integer[2];
            queriesRowItems[0] = Integer.parseInt(queriesRowTempItems[0]);
            queriesRowItems[1] = Integer.parseInt(queriesRowTempItems[1]);
            queries.add(queriesRowItems);
        }

        List ans = freqQuery(queries);

        for (int i = 0; i < ans.size(); i++) {
            bufferedWriter.write(String.valueOf(ans.get(i)));

            if (i != ans.size() - 1) {
                bufferedWriter.write("\n");
            }
        }

        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}