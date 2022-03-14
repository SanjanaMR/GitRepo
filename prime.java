class Prime{
public static void main(String args[]){
int n=13;int m=0;
for(int i=2;i<n-1;i++)
{
if(n%i==0)
{
m=m+1;
}}
if(m>0)
{
System.out.println("not prime ");
}
else
{
System.out.println("it is a prime number");
}}}