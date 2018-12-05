public class DouArr{

public static void main(String[] args) {
    int[] data = new int[]{1,2,3};
    modify(data);
    for(int i : data ){
        System.out.print(i+"、");
    }
}
public static void modify(int[] temp){
    for(int i = 0; i < temp.length ; i++ ){
        temp[i] *= 2;
    }
}
}