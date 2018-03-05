/**
 * Write a description of class CodingbatArray2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CodingbatArray2
{
    public int countEvens(int[] nums) {
        int count = 0;// C1
        for (int i = 0; i < nums.length; i++){// C2 * n
            if (nums[i] % 2 == 0) { // C3 
                count++;//C4
            }
        }
        return count;//C5
    }

    public int bigDiff(int[] nums) {
        int max = nums[0];  //C1
        int min = nums[0];  //C2
        for (int i = 0; i < nums.length; i++) {   // C3 * n
            if (nums[i] > max) { // C4
                max = nums[i];  //C5
            }
            if (nums[i] <= min){ //C6
                min = nums[i]; //C7
            } 
        }
        return max - min; //C8
    }

    public int centeredAverage(int[] nums) {
        int max = nums[0]; // C1
        int min = nums[0]; // C2
        int sum = 0;
        for (int i = 0; i < nums.length; i++) { // C3 * n
            sum += nums[i];  //C4 
            if (nums[i] > max) { // C5
                max = nums[i]; //C6
            }
            if (nums[i] < min){//C7
                min = nums[i];//C8
            }
        }
        return (sum - (max + min)) / (nums.length - 2);//C9
    }

    public int sum13(int[] nums) {
        int total = 0;// C1
        for (int i = 0; i < nums.length; i++) { //C2 * n 
            if (nums[i] != 13){ //C3
                total += nums[i];//C4
            }else if (i <= nums.length - 1){//C5
                i++;//C6
            }
        }
        return total;//C7
    }

    public boolean lucky13(int[] nums) {
        for (int i = 0; i < nums.length; i++){//C1 * n
            if (nums[i] == 1 || nums[i] == 3) {// C2
                return false;//C3
            }
        }
        return true;//C4
    }

}
