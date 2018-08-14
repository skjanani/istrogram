package janani;
import java.util.Scanner;
public class Isogram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String str;
int count=0,i,j;
System.out.println("enter the String");
Scanner ja=new Scanner(System.in);
str=ja.next();
int l=str.length();
char []a=str.toCharArray();
for(i=0;i<l;i++){
	for(j=i+1;j<l;j++){
		if(a[i]==a[j]){
			count++;
		}
	}
}
	if(count==0){
		System.out.println("yes");
	}
	else{
		System.out.println("no");
	}
}

}
