public class Array{
    private int[] nums;
    private int count;

    public Array(int value){
        nums = new int[value];
        count = 0;
    }
    public void insertAtStart(int value){
        ensureCapacity();
        for(int i= count;i>0;i--){
            nums[i] = nums[i-1];
        }
        nums[0] = value;
        count ++;
    }

    public void insertAtIndex(int value, int index){
        if (index < 0 || index > nums.length) {
            System.out.println("Insertion not possible at "+index+" "+"of array");
        }
        ensureCapacity();
        for(int i= index; i>0; i--){
            nums[i] = nums[i-1];
        }
        count ++;
        nums[index] = value;
    }

    public void insetAtEnd(int value){
        ensureCapacity();
        nums[count] = value;
        count++;
    }

    public void print(){
        for(int i = 0; i<count;i++){
            System.out.println(nums[i]);
        }
    }

    public void ensureCapacity(){
        if(count == nums.length){
            int[] newNums = new int[nums.length*2];
            for(int i=0; i<nums.length;i++){
                newNums[i] = nums[i];
            }
            nums = newNums;
        }
    }

    public static void main(String[] args){
        Array arr = new Array(3);
        arr.insertAtIndex(10,0);
        arr.insertAtIndex(11,1);
        arr.insertAtStart(0);
        arr.insertAtStart(1);
        arr.print();
    }
}