package pro;

public class Variables {
		int age = 5;//instance
		static int staticvar=40;//static
		public void myMethod () {
			int localvar = 4;//local
			System.out.println(localvar); 
		}
		public static void main(String[] args) {
			Variables obj = new Variables();
			obj.myMethod();
			System.out.println(staticvar);
			System.out.println(obj.age); 
			int year=2034;
			System.out.println(year);
			
	}

}

