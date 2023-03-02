package problem;

import util.GraphUtil;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class LOKBIL {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    /**
     * Sample Input:
     *
     * 1
     * 6
     * 3
     * 5
     * 1 4
     * 3 5 6
     * 2 4 6
     * 4 5
     *
     * Sample Output:
     * 4 1.166667
     *
     * @param args
     * @throws java.lang.Exception
     */
    public static void main (String[] args) throws java.lang.Exception
    {
        int val = Integer.parseInt(br.readLine());
        while(val-->0)
            dos();
    }

    public static void dos()throws Exception{

        int[][] arr = GraphUtil.takeInput(br);
        GraphUtil.updateFloydShortestDistance(arr);

        int val = arr.length;
        int ind = -1;
        Double min = Double.MAX_VALUE;
        for(int i = 0 ; i < val ; i++)
        {
            int sum=0;
            for(int j : arr[i]){
                sum+=j;
            }

            if((double)sum/val<min){
                min=(double)sum/val;
                ind=i;
            }
        }
        System.out.println((ind+1)+" "+(String.format("%.6f",min)));
    }
}
