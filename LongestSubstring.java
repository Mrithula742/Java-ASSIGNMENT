public class LongestSubstring {
    public static void main(String[] args) {
        String s = "abcabcbb";
        int max = 0;
        for(int i = 0; i < s.length(); i++)
        {
            boolean[] visited = new boolean[256];
            int length = 0;
            for (int j = i; j < s.length(); j++) 
            {
                if (visited[s.charAt(j)]) break;
                visited[s.charAt(j)] = true;
                length++;
            }
            if (length > max)
                max = length;
        }
        System.out.println(max);
    }
}