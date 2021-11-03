package Week7;

public class AdvancedArrays {
    // Given an Array return true if 9 appears as first or last element 
    // of the array
    // EX. frontEnd([1,3,4,9]) -> true
    // nums[5,6,7,8] = 4 index
    // nums[0,1,2,3]
    public static boolean frontEnd(int[] nums){
        // if(nums[0] == 9 || nums[nums.length - 1] == 9){
        //     return true;
        // }
        // else(){
        //     return false;
        // }
        // if you have a boolean statement you can put the if statement in the return. 
        return nums[0] == 9 || nums[nums.length - 1] == 9;

    }
    // Given an int array if there is a 9 follwed by a 1 and then a 1 return 
    // The police are on their way 
    // [2,1,3,9,1,2,3,4]
    // [0,1,2,3,4,5,6,7]
    public static void Call911(int[] nums){
        for(int i = 0; i < nums.length-1; i++){
            if(nums[i] == 9 && nums[i+1] == 1){
                if(nums[i+2] == 1){
                    System.out.println("The Police are on their way"); 
                }else if(nums[i+2] != 1){
                    System.out.println("Dialing the number");
                }
                break;
            }
        }
        
    }


    public static void main(String[] args) {
        int [] x = {0,2,3,1};
        System.out.println(frontEnd(x));
        int[] phoneNumber = {2,1,3,9,1,1,3,4};
        Call911(phoneNumber);
        
        
    }
}
