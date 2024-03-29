//pass value by call by reference in arrays
package array;


public class ArrOp {
    public static void update(int[] marks) {
        for(int i=0;i<marks.length;i++){
            marks[i] = marks[i]+1;
            
        }

    }
    public static void main(String[] args) {
        int[] marks = {97,98,99};  //array input format
        update(marks);
        // to print our marks
        for (int mark : marks) {
            System.out.println(String.valueOf(mark));
        }
        System.out.println();

    }

}
