import java.util.Random;
import java.math.BigInteger;
public class SumArr
{

    BigInteger a = BigInteger.ZERO;
    //metodo que genera el arreglo aleatorio
    public static BigInteger[] f(int size) {
        BigInteger [] arr = new BigInteger[size];
        for (int i = 0; i < size ; i++){
            arr[i] = BigInteger.valueOf((int)(Math.random() * 5) + 1);
        }
        return arr;
    }

    public static BigInteger groupArr2() {
        return groupArr2(f(100000),BigInteger.ZERO,0);
    }


    public static BigInteger groupArr(BigInteger[] nums) {
        return groupArr2(nums,BigInteger.ZERO,0);
    }

    private static BigInteger groupArr2( BigInteger [] nums,BigInteger suma,int i) {
        if (i == nums.length){ 
            return suma;
        }else{
            suma = suma.add(nums[i]);
            return groupArr2(nums,suma,i+1);
        }
    } 
}
