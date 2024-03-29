package array;

public class BinarySearch {
    public static int BinarySc(int[] numbers, int key) {    // binarysc naam ka ek function banaya uske andr int numbers and key pss kr diya
        int start = 0, end = numbers.length - 1;            // array ka start and end declare kiya
        while (start <= end) {                              // ye wala condition  to check array mai bas ek element hai kya
            int mid = ((start + end) / 2);                  // mid find kiya uska

            if (numbers[mid] == key) {                      // if else condition lagaya
                return mid;
            }
            if (numbers[mid] < key) {                       // agar key bada h mtlb mid ke right side toh naya start will be mid+1
                start = mid + 1;
            }
            else {                                         // agar key is small mtlb value is on left side toh mid will be mid - 1
                end = mid - 1;
            }
        }
        return -1;                                        // -1 isliye kyuki int main liya tha


    }
    public static void main(String[] args) {
        int[] numbers ={1,2,3,4,5,7,9,11};
        int key=3;

        System.out.println("index for key is :" + BinarySc(numbers,key));          /// sout for output
    }
}
