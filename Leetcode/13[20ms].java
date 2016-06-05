public class Solution {
    public int romanToInt(String s) {
		Map<Character, Integer> rti = new HashMap<>();
		int len = s.length();
		int sum=0;
		rti.put('I', 1);
		rti.put('V', 5);
		rti.put('X', 10);
		rti.put('L', 50);
		rti.put('C', 100);
		rti.put('D', 500);
		rti.put('M', 1000);
		int i = 0;
		while (i < len) {
			if ((s.charAt(i) == 'I' || s.charAt(i) == 'X' || s.charAt(i) == 'C') && i + 1 < len
					&& rti.get(s.charAt(i)) < rti.get(s.charAt(i + 1))) {
				sum += rti.get(s.charAt(i + 1)) - rti.get(s.charAt(i));
				i += 2;
			} else {
				sum +=  rti.get(s.charAt(i));
				i++;
			}
		}
		return sum;
	}
}