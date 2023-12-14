public class Algorithm {
    public void printElement(int[] ints){
        for (int i : ints){
            System.out.println(i);
        }
    }
    public void switchElements(int[] ints, int i_one, int i_two){
        int val_one = ints[i_one];
        ints[i_one] = ints[i_two];
        ints[i_two] = val_one;
        System.out.print("New Array: ");
        for (int i: ints){
            System.out.print(i);
        }
        System.out.println();
    }
    public int returnMax(int[] ints){
        int max = ints[0];
        for (int i : ints){
            if (i > max){
                max = i;
            }
        }
        return max;
    }
    public int returnMin(int[] ints){
        int min = ints[0];
        for (int i : ints){
            if (i < min){
                min = i;
            }
        }
        return min;
    }
    public String returnShortest(String[] strings){
        String shortest = strings[0];
        for (String str : strings){
            if (str.length() < shortest.length() && str.length() > 0){
                shortest = str;
            }
        }
        return shortest;
    }
    public String returnLongest(String[] strings){
        String longest = strings[0];
        for (String str : strings){
            if (str.length() > longest.length()){
                longest = str;
            }
        }
        return longest;
    }
}
