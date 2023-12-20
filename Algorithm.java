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
    public int largestAbsDifference(int[] setOne, int[] setTwo){
        int largest = Math.abs(setOne[0] - setTwo[0]);
        for (int i = 1; i <setOne.length;i++){
            if (Math.abs(setOne[i] - setTwo[i]) > largest){
                largest = Math.abs(setOne[i] - setTwo[i]);
            }
        }
        return largest;
    }
    public double mean(double[] array){
        double total = 0;
        for (double i: array){
            total += i;
        }
        return total / array.length;
    }
    public void reverse(int[] numSet){
        for (int i = 0;i<numSet.length/2;i++){
            int temp = numSet[i];
            numSet[i] = numSet[numSet.length - 1 - i];
            numSet[numSet.length - 1 -i] = temp;
        }
    }
    public boolean haveConsecutive(int[] numSet){
        int first = 0;
        int second = 0;
        for (int i = 0; i < numSet.length - 2;i++){
            first = numSet[i];
            second = numSet[i+1];
            if (first == second) return true;
        }
        return false;
    }
    public int firstNegative(int[] numSet){
        int index = 0;
        for (int i = 0; i < numSet.length;i++){
            if (numSet[i] < 0){
                return index;
            }
            index++;
        }
        return -1;
    }
    public boolean equivalentValues(int[] numSet){
        for (int i = 0; i < numSet.length;i++){
            int temp = numSet[i];
            for (int x = i + 1; x < numSet.length;i++){
                if (numSet[x]==temp){
                    return true;
                }
            }
        }
        return false;
    }
    public int longestStreak(int[] numSet, int target){ // Finish This At Home
        int longStreak = 0;
        int streak = 0;
        for (int i = 0;i<numSet.length;i++){
            while (numSet[i]== target && numSet[i+1]==target){
                streak++;
            }
        }
        return longStreak;
    }
    public String lastAlphabetically(String[] words){
        String last = "";
        return last;
    }
}
