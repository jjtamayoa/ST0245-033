
public class Sumagrupo{
    public boolean sumaGrupo( int[] nums, int target) { 
    return sumaGrupo(0,nums,target);    
    }
        
        
     public boolean sumaGrupo(int start, int[] nums, int target) {  
            if (start == nums.length){ 
                return target == 0;
            }else{
                return sumaGrupo(start+1, nums, target - nums[start])        
                ||sumaGrupo(start+1, nums, target);
        }
    }
}
