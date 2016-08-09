import java.io*;
class count
{
public static void main(String[] args);
{
Scanner s=new Scanner(System.in);
int n=s.nextInt();
int n1;
int count=0;
while(n>0)
{
n1=n%10;
count++;
n=n/10;
}
}
}
