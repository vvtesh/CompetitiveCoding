package util;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class GraphUtil {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void updateFloydShortestDistance(int[][] matrix)
    {
        //Updates the matrix with the shortest distance between each node to every other node.
        //Problem: Negative cycles can be detected when self loops have negative value.
        int length = matrix.length;
        for(int i = 0; i<length ; i++){
            for(int j = 0; j<length ; j++){
                if(j!=i)
                    for(int k = 0; k<length ; k++){
                        if(k!=i)
                            if(matrix[j][k]>(matrix[j][i]+matrix[i][k])){
                                matrix[j][k]=matrix[j][i]+matrix[i][k];
                            }
                    }
            }
        }
    }

    /**
     * Sample Input.
     *
     * Line 1: Number of nodes.
     * Line 2: For ith node, the connected nodes.
     *
     * 6
     * 3
     * 5
     * 1 4
     * 3 5 6
     * 2 4 6
     * 4 5
     *
     * @param br
     * @return
     * @throws IOException
     */
    public static int[][] takeInput(BufferedReader br) throws IOException {

        //Number of lines to read
        int val = Integer.parseInt(br.readLine());

        //Adjacency matrix
        int arr[][] = new int[val][val];

        //Initialize matrix
        for(int ars[] : arr) Arrays.fill(ars,(int)100);

        for(int i = 0 ; i < val ; i++){
            for(String k : br.readLine().split(" ")){
                //Edge present. So, 1.
                arr[i][Integer.parseInt(k)-1]=1;
            }
            //No edge. So, 0.
            arr[i][i]=0;
        }

        //The adj matrix from input
        return arr;
    }

}
