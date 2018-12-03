public class Ex2{
    public static void main(String[] args){
        char ex = 'A';
        int num = ex + 32;//char+int=int 
        char x = (char)num;//int转char需要强转

        System.out.println(x);
    }
}