package Greedy;

import java.util.*;

public class BusyMan {
    static class Pair {
        int startTime;
        int endTime;
        Pair(int startTime, int endTime) {
            this.endTime = endTime;
            this.startTime = startTime;
        }

        @Override
        public String toString() {
            return this.startTime + " " + this.endTime;
        }


    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        List<Pair> list = new ArrayList<>();

        while (n-- != 0) {
            int startTime = scan.nextInt();
            int endTime = scan.nextInt();

            Pair p = new Pair(startTime,endTime);

            list.add(p);
        }

        System.out.println(list.toString());


        Collections.sort(list, new Comparator<Pair>() {
            @Override
            public int compare(Pair o1, Pair o2) {
                return o1.endTime - o2.endTime;
            }
        });

        System.out.println(list.toString());

        int time = list.get(0).endTime;
        int activityCount = 1;

        for (int i = 1; i < list.size(); i++) {
            if(list.get(i).startTime >= time) {
                activityCount++;
                time = list.get(i).endTime;
            }

        }
        System.out.println(activityCount);

    }
}
