class fact{
public static void main(string args[]){

int n = integer.parseInt(args[0]);

int f=1;
for(int i=1;i<=n;i++){
f=f*i;
}
System.out.println("factorial value of "+n+" is : "+f);
}