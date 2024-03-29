package array;

public class ReverseArr {
    public static void Reverse(int numbers[]) {           // reverse naam ka function banaya hai jisme number naam ka array pass kiya h
        int first=0,last= numbers.length-1;               //fist and last ko declare kiya kyuki swap use krna h
        while(first<last){                                //agar <= rehta toh middle term jiska pair nhi banata vo 2 baar likhna pdega
            int temp=numbers[last];                       // 3 bucket wala concept se first ko last bucket mai shift kiya
            numbers[last]=numbers[first];
            numbers[first]=temp;
            first++;
            last--;
        }


    }
    public static void main(String[] args) {                      ///main fn
        int numbers[]={1,2,3,4,5,6,7,8};                    // int naam ka array liya h
        Reverse(numbers);                                   //reverse function ko call kiya
        for(int i=0;i< numbers.length;i++){                 //for loop lagaya to traverse the array
            System.out.print(numbers[i]+"" );               // aur jo bhi swap hota gya usse ek ek krke final print
        }
        System.out.println();                               

    }
}
