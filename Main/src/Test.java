
public class Test {
	/*static String s = "non-static";
	String s1 = "static";
	static {
		System.out.println(s1);
	}*/
	public static void main(String []args) {
		int a=010,b=07,c=0010,d=98,e=0b1100,f=0x36;
		char g = (char)d;
		System.out.print(a+" "+b+" "+c+" "+d+" "+e+" "+f+" "+g);
		/*float arr[]= {11.22F,22.33F,33.44F,44.55F};
		int index=0;
		boolean data=false;
		float key = 33.44F;
		while(index<=3) {
			if(key==arr[index])
				index++;
				data=true;
				break;
		}
		/*Assessment1 as = new Assessment1();
		Assessment2 as1 = new Assessment2();
		System.out.println(as.x+" "+as.y);
		System.out.println(as1.x1+" "+as1.y1);
		//a[3]=a[5];
		//a[5]=55;
		
		/*char a='a';
		a++;
		System.out.println(a+" ");
		a++;
		System.out.println(a+" ");
		/*Mul b = new Mul(2,2,3);
		System.out.println(b.getVolume());*/
	}
}
/*final class Mul{
	private int volume;
	Mul(int length, int width, int height){
		this.volume=length*width*height;
	}
	public int getVolume() {
		return volume;
	}
}*/
class Assessment1{
	static int x,y;
	public int x1,y1;
}
class Assessment2{
	static int x,y;
	public int x1,y1;
}