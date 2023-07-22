package org.example.algorithm.practice;

public class WaysOfRunupStairs {

    static final String $1STEP = "1STEP";
    static final String $2STEP = "2STEP";
    static final String $3STEP = "3STEP";

    static int count;
    static int oneWayOccurance;
    static int twoWayOccurances;
    static int threeWayOccurances;

    public void possibleWays(){
        String[] a1 = {$1STEP,$2STEP,$3STEP};
        String[] b1 = {$1STEP,$2STEP,$3STEP};
        String[] c1 = {$1STEP,$2STEP,$3STEP};

        for(int a=0 ; a<a1.length;a++) {
                System.out.println(a1[a]);
                count++;
                oneWayOccurance++;
            for (int b = 0; b < b1.length; b++) {
                if(!a1[a].equals(b1[b])) {
                    System.out.println(a1[a] + "" + b1[b]);
                    count++;
                    twoWayOccurances++;
                    for (int c = 0; c < c1.length; c++) {
                        if (!b1[b].equals(c1[c])) {
                            System.out.println(a1[a] + "" + b1[b] + "" + c1[c]);
                            count++;
                            threeWayOccurances++;
                        }

                    }
                }
            }
        }
    }

    public int possibleWays(int ways){
        //if n = 3, 3 * 3 * 3 = 27
        //removing duplicates, 3*1(3),3*3(9),9*3(27) , since 27 duplicating 3 and 9 we will remove 27-6=21

        int total=0;
        int uniqueWays=ways;

        //O(n) complexity for below algorithm
        for(int i =1 ; i<=ways; i++){
            if(i==1) {
                total = (ways * i) + total;
            }
            else{
                total= (total*ways);
                uniqueWays=total-uniqueWays;
            }
        }

                System.out.println("unique:" + uniqueWays);
                return uniqueWays;
        }

}
