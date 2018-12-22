
class Color {
private String title ;
public static final int RED_FLAG = 1 ;
public static final int GREEN_FLAG = 2 ;
public static final int BLUE_FLAG = 3 ;
private static final Color RED = new Color("RED") ;
private static final Color GREEN = new Color("GREEN") ;
private static final Color BLUE = new Color("BLUE") ;
private Color(String title) {
this.title = title ;
}
public static Color getInstance(int ch){
switch (ch) {
case RED_FLAG :
return RED ;
case GREEN_FLAG :
return GREEN ;
case BLUE_FLAG :
return BLUE ;
default:
return null ;
}
}
}
public class Test7{
public static void main(String[] args) {
System.out.println(Color.getInstance(Color.BLUE_FLAG));
}
}
