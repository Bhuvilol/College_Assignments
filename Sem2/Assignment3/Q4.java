class Box<T>{
	private T t;
	public Box(T t) {
		this.t=t;
	}
	public T get() {
		return t;
	}
	public void set(T t) {
		this.t = t;
	}
}
public class Q4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Box<String> sobj1 = new Box<>("Object1");
		Box<String> sobj2 = new Box<>("Object2");
		
		System.out.println("1st string content: "+sobj1.get());
		System.out.println("2nd string content: "+sobj2.get());
		
		sobj2.set("Bhabesh");
		System.out.println("After changing:");
		System.out.println("1st string content: "+sobj1.get());
		System.out.println("2nd string content: "+sobj2.get());
		
		Box<Integer> iobj1 = new Box<>(10);
		Box<Integer> iobj2 = new Box<>(20);
		
		System.out.println("1st integer content: "+iobj1.get());
		System.out.println("2nt integer content: "+iobj2.get());
		
		iobj2.set(69);
		System.out.println("After changing:");
		System.out.println("1st integer content: "+iobj1.get());
		System.out.println("2nd integer content: "+iobj2.get());
		
		Box<Object> obj1 = new Box<>(new Object());
		Box<Object> obj2 = obj1;
		System.out.println("Object 1 contains: "+obj1.get());
		System.out.println("Object 2 contains: "+obj2.get());
		obj1.set(10);
		System.out.println("Object 1 contains: "+obj1.get());
		System.out.println("Object 2 contains: "+obj2.get());
	}

}
