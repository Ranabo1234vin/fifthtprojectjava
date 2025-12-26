class Block
 {
 static int a=5;
 int b=20;
static {
a=a+5;
System.out.println("static block:"+a);
}
{
b=b+5;
System.out.println("instance block:"+b);
}
public static void main(String[] args)
{
new Block();
new Block();
}
}