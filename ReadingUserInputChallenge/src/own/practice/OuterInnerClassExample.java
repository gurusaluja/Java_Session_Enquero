package own.practice;

class ABC{
	int a = 10;
	private void fun(){
		System.out.println("In private method of upper class");
	}
	void fun1(){
		System.out.println("In default method of upper class");
	}
	public void fun2(){
		System.out.println("In public method of upper class");
	}
	
	class XYZ{
		int b=189;
		private void funi(){
		System.out.println("In private method of inner class");
		}
		void funi1(){
			System.out.println("In default method of inner class");
			funi();
		}
		public void funi2(){
			System.out.println("In public method of inner class");
		}
	}
}

class OuterInnerClassExample{
	public static void main(String[] args){
		ABC obj=new ABC();
		System.out.println(obj.a);
		obj.fun1();
		ABC.XYZ o = obj.new XYZ();
		System.out.println(o.b);
		o.funi1();

		Runnable oldRunner = new Runnable() {
			@Override
			public void run() {
				System.out.println("I am running");
			}
		};
		Runnable java =()->{
			System.out.println("Running");
		};
		System.out.println(java);
	}
}
