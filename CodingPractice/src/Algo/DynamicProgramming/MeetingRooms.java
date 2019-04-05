package Algo.DynamicProgramming;

import java.util.Arrays;
import java.util.Comparator;

class Interval {
	int start;
	int end;
	Interval() { start = 0; end = 0; }
	Interval(int s, int e) { start = s; end = e; }
}
public class MeetingRooms {
	 public int minMeetingRooms(Interval[] intervals) {
		 Arrays.sort(intervals, new sortByEndTime());
		 Arrays.sort(intervals, Comparator.comparingInt(a->a.end));
		 int j = 2126753390;
		 
	        return 0;
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

class sortByEndTime implements Comparator<Interval>{
    
	@Override
	public int compare(Interval o1, Interval o2) {
		return Integer.compare(o1.end, o2.end);
	}
}