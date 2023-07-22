package org.example.algorithm.practice;

public class WaysOfRunupStairsMain {

    public static void main(String[] args) {
       WaysOfRunupStairs ob = new WaysOfRunupStairs();
       ob.possibleWays();
       //This is for getting possible ways with text and count
        // here algorithm has a O(n*n*n) complexity since there are three for loops
        System.out.println("count how many possible ways the child can run up the stairs: "+WaysOfRunupStairs.count);
        System.out.println("count how many possible ways the child can run up the stairs using one unique scenario: "+WaysOfRunupStairs.oneWayOccurance);
        System.out.println("count how many possible ways the child can run up the stairs using two unique scenario: "+WaysOfRunupStairs.twoWayOccurances);
        System.out.println("count how many possible ways the child can run up the stairs using thee unique scenario: "+WaysOfRunupStairs.threeWayOccurances);

        //Mathematical formula for getting count
        // (ex: n=3 --> 3*1=3, 3*3=9, 9*3=27 here we have 27 ways to running up a
        // staircase with duplicating steps so we have to remove those duplications 27-6=21 (9-3=6)
        //here algorithm complexity is O(n) since we only have 1 for loop
        System.out.println("mathamatical formula for getting count how many possible ways the child can run up the stairs using thee unique scenario: "+ob.possibleWays(3));

    }



}