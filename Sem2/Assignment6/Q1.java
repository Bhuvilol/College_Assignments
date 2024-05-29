import java.util.Scanner;

public class Q1 {
	static Scanner sc = new Scanner(System.in);
	public static int push(int s[],int top) {
		if (top==s.length-1) {
			System.out.println("Overflow");
		} else {
			top++;
			System.out.println("Enter item :");
			int item = sc.nextInt();
			s[top]=item;
			System.out.println("Pushed element "+item);
		}
		return top;
	}
	public static int pop(int s[],int top) {
		if (top == -1) {
			System.out.println("Cannot pop. Stack is empty");
			return top;
		}
		int pop = s[top--];
		System.out.println("Popped element: "+pop);
		return top;
	}
	public static void display(int[]s,int top) {
		if (top == -1) {
			System.out.println("Stack is empty.");
			return;
		}
		System.out.println("Stack elements :");
		for (int i = 0; i <= top; i++) {
			System.out.print(s[i]+" ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		int stack[] = new int[10];
		int top = -1;
		while (true) {
			System.out.println("Enter a choice : ");
			System.out.println("0: Exit\n1: Push\n2: Pop\n3: Display");
			int choice = sc.nextInt();
			switch (choice) {
			case 0:
				System.exit(0);
				break;
			case 1:
				top = push(stack, top);
				break;
			case 2:
				top = pop(stack, top);
				break;
			case 3:
				display(stack, top);
				break;
			default:
				System.out.println("Invalid choice");
				break;
			}
		}
	}

}
