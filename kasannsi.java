
public class kasannsi {

	public static void main(String[] args) {
		//前置加算子
		int a = 10;
		System.out.println(++a);
		System.out.println(++a);
		System.out.println(++a);
		System.out.println(++a);
		
		//後置加算子
		int b = 10;
		System.out.println(b++);
		System.out.println(b++);
		System.out.println(b++);
		System.out.println(b++);
		
		//前置減算子
		int c = 10;
		System.out.println(--c);
		System.out.println(--c);
		System.out.println(--c);
		System.out.println(--c);
		
		//後置減算子 aを表示させた後1を引く
		int d = 10;
		System.out.println(d--);
		System.out.println(d--);
		System.out.println(d--);
		System.out.println(d--);
	}

}
