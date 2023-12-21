public class Main {
    public static void main(String [] args){
        Algorithm a = new Algorithm();
        a.printElement(new int[]{1, 2, 3}); //provided case
        a.printElement(new int[]{2, 3, 4});
        a.printElement(new int[]{5, 6, 7});
        a.switchElements(new int[]{1,2,3,4}, 1,2); //provided case
        a.switchElements(new int[]{5,6,7,8}, 0, 3);
        a.switchElements(new int[]{9,10,11,12,13},2,4);
        System.out.println(a.returnMax(new int[]{3,2,1})); //provided case
        System.out.println(a.returnMax(new int[]{1,2,1,8,2,10}));
        System.out.println(a.returnMax(new int[]{3,2,1,9,11,12}));
        System.out.println(a.returnMin(new int[]{3,2,1})); //provided case
        System.out.println(a.returnMin(new int[]{14,10,7}));
        System.out.println(a.returnMin(new int[]{6,8,11}));
        System.out.println(a.returnShortest(new String[]{"hello,","world","!"})); //provided case
        System.out.println(a.returnShortest(new String[]{"hello,","anger","word"}));
        System.out.println(a.returnShortest(new String[]{"follow","leaders","for"}));
        System.out.println(a.returnLongest(new String[]{"hello,","world","!"})); //provided case
        System.out.println(a.returnLongest(new String[]{"giraffe,","world","yes"}));
        System.out.println(a.returnLongest(new String[]{"never,","extravagant","no"}));
        System.out.println(a.largestAbsDifference(new int[]{2,3,4}, new int[]{-1,-2,-3})); //provided case
        System.out.println(a.largestAbsDifference(new int[]{1,3,4}, new int[]{-12,-2,-3}));
        System.out.println(a.largestAbsDifference(new int[]{2,5,12}, new int[]{4,-6,-8}));
        System.out.println(a.mean(new double[]{2.0,3.0,4.0,5.0})); //provided case
        System.out.println(a.mean(new double[]{1.0,3.0,4.0,7.0,9.0}));
        System.out.println(a.mean(new double[]{2.0,2.0,4.0,4.0,6.0,6.0}));
        int[] case1 = {1,2,3}; //provided case
        int[] case2 = {5,6,7,7,9,10};
        int[] case3 = {10,9,8,7,5};
        int[] case4 = {1,2,3,3,4}; //provided case
        int[] case5 = {11,12,13,14};
        int[] case6 = {-1,-2,-3,-3};
        a.reverse(case1); //provided case
        a.reverse(case2);
        a.reverse(case3);
        System.out.println(a.haveConsecutive(case4)); //provided case
        System.out.println(a.haveConsecutive(case5));
        System.out.println(a.haveConsecutive(case6));
        System.out.println(a.firstNegative(new int[]{1,0,-1})); //provided case
        System.out.println(a.firstNegative(new int[]{1,-2,-1}));
        System.out.println(a.firstNegative(new int[]{-6,0,-1}));
        System.out.println(a.equivalentValues(new int[]{1,2,3,2})); //provided case
        System.out.println(a.equivalentValues(new int[]{1,2,3,4}));
        System.out.println(a.equivalentValues(new int[]{6,6,3,3}));
        System.out.println(a.longestStreak(new int[]{1,2,1,1,1},1)); //provided case
        System.out.println(a.longestStreak(new int[]{1,2,2,1,2,4},2));
        System.out.println(a.longestStreak(new int[]{1,1,1,3,2,5,5,2,},5));
        System.out.println(a.lastAlphabetically(new String[]{"zebra", "alpha"})); //provided case
        System.out.println(a.lastAlphabetically(new String[]{"basket", "alpha","car"}));
        System.out.println(a.lastAlphabetically(new String[]{"football", "hat", "yellow"}));
    }
}
