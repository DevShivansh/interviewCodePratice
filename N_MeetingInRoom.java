package mustDo;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class N_MeetingInRoom {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = readInt(br.readLine());
		while(t-- > 0) {
			int n = readInt(br.readLine());
			String[] startArr = br.readLine().trim().split(" ");
			String[] endArr = br.readLine().trim().split(" ");
			int[] arr = new int[1000001];
			StringBuilder output = new StringBuilder();
			for(int i=0;i<n;i++) {
				int startIndex = readInt(startArr[i]);
				int endIndex = readInt(endArr[i]);
				if(checkRoomAvail(arr,startIndex, endIndex)) {
					bookSlot(arr,startIndex,endIndex);
					output.append((i + 1) + " ");
				}
			}
			System.out.println(output.toString().trim());
		}

	}

	private static void bookSlot(int[] arr, int startIndex, int endIndex) {
		for(int i = startIndex, j = endIndex; i<=j; i++,j--) {
			if(startIndex == endIndex) {
				arr[startIndex]++;
				break;
			}
			arr[startIndex]++;
			arr[endIndex]++;
		}
		
	}

	private static boolean checkRoomAvail(int[] arr, int startIndex, int endIndex) {
		
		for(int i = startIndex, j = endIndex; i<=j; i++,j--) {
			if(arr[i] != 0 || arr[j] != 0)
				return false;
		}
		return true;
	}

	public static int readInt(String input) {
		return Integer.parseInt(input.trim());
	}
}
