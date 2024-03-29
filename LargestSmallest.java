package array;

public class LargestSmallest {
    public static int LargestNo(int numbers[]){  //ek function jisme largest naam ka variable banaya h
        int largest=Integer.MIN_VALUE;           // lrgest variable store krega value starting from - infinity

        for(int i=0;i<numbers.length;i++){      //pure array ko traverse kiya
            if(largest<numbers[i]){             // agar array ka value bada h toh vo value lrgest variable mai store hojayega
                largest=numbers[i];              // then smalleer number ko larger number compare krke replace krdega
            }
        }
        return largest;                          //last mai sabse largest value hume miljayega usko return krvlena h
    }

    public static int SmallestNo(int numbers[]) {
        int smallest=Integer.MAX_VALUE;
        for(int i =0;i<numbers.length;i++){
            if(smallest>numbers[i]){
                smallest=numbers[i];
            }
        }
        return smallest;
    }
    public static void main(String[] args) {    // main function bnaya
        int numbers[]={1,2,3,6,5,10,0};              // khuda integer banaya

        System.out.println("largest value is :" +LargestNo(numbers));
        System.out.println("Smallest value is :"+ SmallestNo(numbers));

    }
}
