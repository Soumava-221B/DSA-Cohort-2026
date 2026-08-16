class Solution {
    public String reverseWords(String s) {
        char[] chars = s.trim().toCharArray();
        reverse(chars, 0, chars.length - 1);
        int n = chars.length;
        int start = 0, end = 0;
        StringBuilder sb = new StringBuilder();
        
        while (start < n) {
            while (end < n && chars[end] != ' ') end++;
            reverse(chars, start, end - 1);
            sb.append(chars, start, end - start).append(" ");
            while (end < n && chars[end] == ' ') end++;
            start = end;
        }
        
        return sb.toString().trim();
    }
    
    private void reverse(char[] arr, int left, int right) {
        while (left < right) {
            char temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
    }
}
