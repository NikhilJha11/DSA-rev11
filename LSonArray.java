package array;

public class LSonArray {
    public static int LinearSearch(int[] numbers, int key) { // linear search search naam ka function banaya uske andr numbers naam ka array aur key pass kiya
      for(int i=0;i<numbers.length;i++){   // for loop chalaya to traverse the array from 0 position to the end of the array
          if(numbers[i]==key){          // if numbers array mai i position mai key mila toh
              return i;                 // return i , mtlb return the position value i
          }
      }
      return -1;                       // static void mai return 0 krte hai int mai -1

    }
    public static void main(String[] args) {
        int[] numbers ={1,2,3,4,5,6,7,8,9,0};    // numbers naam ka array banaya
        int key =4;                              //key value allot kiya

        int index = LinearSearch(numbers,key);   // passing linearsearch function in int index
        if(index==-1){                           // if else condition laga kr sout output
            System.out.println("not found");
        }
        else{
            System.out.println("key is at index " + index);
        }
    }
}
