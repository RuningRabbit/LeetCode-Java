/**
 * Definition for an interval.
 * public class Interval {
 *     int start;
 *     int end;
 *     Interval() { start = 0; end = 0; }
 *     Interval(int s, int e) { start = s; end = e; }
 * }
 */
public class Solution {
    class Cmp implements Comparator<Interval> {

		public int compare(Interval o1, Interval o2) {
			if(o1.start==o2.start) return o1.end-o2.end;
			else return o1.start-o2.start;

		}

	}	 
	
	public List<Interval> merge(List<Interval> intervals) {
		if (intervals.size() <= 1 || intervals == null)
			return intervals;
		Collections.sort(intervals,new Cmp());
		List<Interval> L = new ArrayList<Interval>();

		int end = intervals.get(0).end;
		L.add(intervals.get(0));
		int i = 1;

		while (i < intervals.size()) {
			if (end < intervals.get(i).start) {
				L.add(intervals.get(i));
				end=intervals.get(i).end;
				i++;
			} else {
				int ends = end;
				while (i < intervals.size() && intervals.get(i).start <= end) {
					ends=Math.max(ends,intervals.get(i).end);					
					i++;
				}
				L.get(L.size()-1).end=ends;
				end=ends;
			}
		}

		return L;
	}
	
}
