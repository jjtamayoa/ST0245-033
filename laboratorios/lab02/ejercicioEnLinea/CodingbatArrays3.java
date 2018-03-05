public class CodingbatArrays3
{
    public int[] fix34(int[] nums) {
        for (int i = 0; i < nums.length; i++){ // C1 * n
            if (nums[i] == 3) {
                int temp = nums[i + 1]; //C2
                nums[i + 1] = 4; //C3
                for (int j = i + 2; j < nums.length; j++){// C4 * n
                    if (nums[j] == 4) { //C5 
                        nums[j] = temp; //C6
                    }
                }
            }
        }
        return nums; //C7
    }

    public int[] fix45(int[] nums) {
        for (int i = 0; i < nums.length; i++){// C1 * n
            if (nums[i] == 5 && i == 0 || nums[i] == 5 && nums[i - 1] != 4) { //C2
                int pos5 = i;   //C3
                for (int j = 0; j < nums.length; j++){  //C4 * n
                    if (nums[j] == 4 && nums[j + 1] != 5) {//C5
                        int temp = nums[j + 1]; //C6
                        nums[j + 1] = 5;//C7
                        nums[pos5] = temp;//C8
                        break;
                    }
                }

            }
        }
        return nums; //C9
    }

    public boolean canBalance(int[] nums) {
        for (int i = 0; i < nums.length; i++) { //C1
            int sum = 0;//C2
            for (int j = 0; j < i; j++){//C3 * n
                sum += nums[j];//C4
            }

            for (int j = i; j < nums.length; j++){//C5 * n
                sum -= nums[j]; //C6
                if (sum == 0){  //C7
                    return true;//C8
                }
            }
        }
        return false;//C9
    }

    public int maxSpan(int[] nums) {
        if (nums.length > 0) {//C1
            int maxSpan = 1;
            for (int i = 0; i < nums.length; i++){//C2 * n
                for (int j = nums.length - 1; j > i; j--){ //C3 * n
                    if (nums[j] == nums[i]) { //C4 
                        int count = (j - i) + 1; //C5
                        if (count > maxSpan) {//C6
                            maxSpan = count; //C7
                        }
                        break;
                    }
                }
            }
            return maxSpan;//C8
        } else {
            return 0; //C9
        }
    }

    public boolean linearIn(int[] outer, int[] inner) {
        int indexInner = 0;
        int indexOuter = 0;
        while (indexInner < inner.length && indexOuter < outer.length) {// C1 * n
            if (outer[indexOuter] == inner[indexInner]) { //C2
                indexOuter++; // C3
                indexInner++; // C4
            } else {
                indexOuter++; //C5
            }
        }
        return (indexInner == inner.length); // C6
    }
}
