package mustDo;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class TransposeMatrix {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = readInt(br.readLine());
		while(t-- > 0) {
			int n = readInt(br.readLine());
			String[] inputs = br.readLine().trim().split(" ");
			int[][] arr = new int[n][n];
			int counter = 0;
			for(int i=0;i<n;i++)
				for(int j=0;j<n;j++)
					arr[j][i] = readInt(inputs[counter++]);
			StringBuilder output = new StringBuilder();
			for(int i=0;i<n;i++)
				for(int j=0;j<n;j++)
					output.append(arr[i][j] + " ");
			System.out.println(output.toString().trim());
			
		}

	}

	public static int readInt(String input) {
		return Integer.parseInt(input.trim());
	}
}
/**
2
4
1 1 1 1 2 2 2 2 3 3 3 3 4 4 4 4
2
1 2 -9 -2

Output:
1 2 3 4 1 2 3 4 1 2 3 4 1 2 3 4
1 -9 2 -2

*/