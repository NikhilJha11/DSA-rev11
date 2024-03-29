package array;

public class LSonString {
    public static int LinearsearchString(String menu[], String key){
        for(int i=0;i<menu.length;i++){
            if(menu[i].equals(key)){
                return i;
            }
        }
        return -1;

    }
    public static void main(String[] args) {
        String menu[] ={"dosa","idli","vadapav","littichoka","chole","chicken"};
        String key = "vadapav";

        int index=LinearsearchString(menu,key);
        if(index==-1){
            System.out.println("index not found");
        }else{
            System.out.println("index found at :"+ index);
        }


    }
}
