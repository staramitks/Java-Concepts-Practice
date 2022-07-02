package home.amit.java.algorithm.arrays;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Interval {
    int start;
    int end;
    Interval() {
        start = 0;
        end = 0;
    }
    Interval(int s, int e) {
        start = s;
        end = e;
    }
}
public class MergeIntervals {
    public List<Interval> merge(ArrayList<Interval> intervals) {
        if (intervals == null || intervals.size() <= 1)
            return intervals;

        Collections.sort(intervals, new IntervalComparator());
        List<Interval> result = new ArrayList<Interval>();
        Interval prev = intervals.get(0);
        for (int i = 1; i < intervals.size(); i++) {
            Interval curr = intervals.get(i);
            if (prev.end >= curr.start) {
             Interval merged = new Interval(prev.start, Math.max(prev.end, curr.end));
                prev = merged;
            } else {
                result.add(prev);
                prev = curr;
            }
        }
        result.add(prev);
        return result;
    }

    public static void main(String[] args) {

    }
}
class IntervalComparator implements Comparator<Interval> {
    public int compare(Interval i1, Interval i2) {
        return i1.start - i2.start;
    }
}
