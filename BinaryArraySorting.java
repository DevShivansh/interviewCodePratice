package mustDo;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BinaryArraySorting {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = readInt(br.readLine());
		while(t-- > 0) {
			int n = readInt(br.readLine());
			String[] inputs = br.readLine().trim().split(" ");
			int index = 0;
			int[] arr = new int[n];
			for(int i=0;i<n;i++) {
				if(inputs[i].equals("0")) {
					arr[index++] = 0;
				}
			}
			
			for(int i = index; i<n;i++) {
				arr[i] = 1;
			}
			StringBuilder output = new StringBuilder();
			for(int i=0;i<n;i++)
				output.append(arr[i] + " ");
			System.out.println(output.toString().trim());
		}

	}
	
	public static int readInt(String input) {
		return Integer.parseInt(input.trim());
	}

}
