public class RetArr{
    public static void main(String[] args) {
        int[] data = init();
        printArray(data);
    }
    public static void printArray(int[] temp){
        for(int i : temp){
            System.out.print(i+"、");
        }
    }
    public static int[] init(){
        return new int[]{1,3,5,7,9};
    }
}