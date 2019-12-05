import java.util.Scanner;
public class MainInterface {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a,b;
		a=sc.nextInt();
		b=sc.nextInt();
		sc.close();
		InheritedInterface obj=new InheritedInterface();
		obj.add(a,b);
		obj.sub(a,b);
		obj.mul(a,b);
		obj.div(a,b);
		
	}

}
