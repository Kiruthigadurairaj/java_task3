package pro;

public class Variables {
//      what is variables : vriables are container that holds data during the execution of the program  where variable has name, identifier, data type, values. 
//		type of variable local , instance ,static variable
//		local variable declare inside the method we can declare inside main also it can be run 
//		instance variable declare inside class but outside the method we want to call by the object
//		static variable it also called class variable declare with static keyword shared across all  instance of class. no need call object  for static
		int age = 5;//instance
		static int staticvar=40;//static
		public void myMethod () {
			int localvar = 4;//local
			System.out.println(localvar); 
		}
		public static void main(String[] args) {
			Variables obj = new Variables();// classname objectname = new classname 
			// new it is used to call n number of object
			obj.myMethod();
			System.out.println(staticvar);
			System.out.println(obj.age); 
			int year=2034;
			System.out.println(year);
			
	}

}
