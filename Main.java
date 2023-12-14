public class Main {
    public static void main(String [] args){
        Algorithm a = new Algorithm();
        a.printElement(new int[]{1, 2, 3});
        a.printElement(new int[]{2, 3, 4});
        a.printElement(new int[]{5, 6, 7});
        a.switchElements(new int[]{1,2,3,4}, 1,2);
        a.switchElements(new int[]{5,6,7,8}, 0, 3);
        a.switchElements(new int[]{9,10,11,12,13},2,4);
        System.out.println(a.returnMax(new int[]{3,2,1}));
        System.out.println(a.returnMin(new int[]{3,2,1}));
        System.out.println(a.returnLongest(new String[]{"hello,","world","!"}));
        System.out.println(a.returnShortest(new String[]{"hello,","world","!"}));
    }
}
