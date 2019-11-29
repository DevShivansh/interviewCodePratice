package mustDo;

import java.util.HashSet;
import java.util.Set;

public class WordBoggle {

	static final String dictionary[] = { "GEEKS", "FOR", "QUIZ", "GUQ", "EE" };
	static final int n = dictionary.length;
	static final int M = 3, N = 3;

	static Set<String> dict = new HashSet<String>();

	static {
		for (String word : dictionary)
			dict.add(word);
	}

	static boolean isWord(String str) {
		if (dict.contains(str))
			return true;
		return false;
	}

	public static void findWords(char[][] boogle) {

		int[][] visited = new int[M][M];

		StringBuilder str = new StringBuilder();

		for (int i = 0; i < M; i++)
			for (int j = 0; j < N; j++)
				findWordsUtils(boogle, i, j, visited, str);

	}

	private static void findWordsUtils(char[][] boogle, int i, int j, int[][] visited, StringBuilder str) {

		visited[i][j] = 1;

		str.append(boogle[i][j]);

		if (isWord(str.toString()))
			System.out.println(str.toString());

		for (int row = i - 1; row < i + 1 && row < M; row++)
			for (int col = j - 1; col < i + 1 && col < N; col++)
				if (row >= 0 && col >= 0 && visited[row][col] != 1)
					findWordsUtils(boogle, row, col, visited, str);

		visited[i][j] = 0;
		str.deleteCharAt(str.length() - 1);

	}

	public static void main(String[] args) {
		char boggle[][] = { { 'G', 'I', 'Z' }, { 'U', 'E', 'K' }, { 'Q', 'S', 'E' } };

		System.out.println("Following words of dictionary are present");
		findWords(boggle);

	}

}
