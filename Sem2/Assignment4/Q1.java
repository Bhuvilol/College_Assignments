import java.util.Scanner;

class Node{
	protected int regd_no;
	protected float mark;
	protected Node next;
	public Node (int a,float b) {
		this.regd_no=a;
		this.mark=b;
		this.next=null;
	}
}

public class Q1 {
	public static void create (Node start) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter registration number : ");
	int r = sc.nextInt();
	System.out.println("Enter marks :");
	float m = sc.nextFloat();
	start.regd_no=r;
	start.mark=m;
	start.next=null;
	}
//	(a)-i-insert at begin
	public static Node InsBeg(Node start) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter registration number : ");
		int r = sc.nextInt();
		System.out.println("Enter marks :");
		float m = sc.nextFloat();
		Node newNode = new Node(r,m);
		newNode.next=start;
		return newNode;
	}
//	(a)-ii-insert at end
	public static Node InsEnd(Node start) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter registration number : ");
		int r = sc.nextInt();
		System.out.println("Enter marks :");
		float m = sc.nextFloat();
		Node cur = start;
		if (cur == null) {
			return new Node(r,m);
		}
		Node newNode = new Node(r,m);
		while (cur.next!=null) {
			cur = cur.next;
		}
		cur.next=newNode;
		return start;
	}
//	(a)-iii-insert at any position
	public static Node InsAny(Node start) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter registration number : ");
		int r = sc.nextInt();
		System.out.println("Enter marks :");
		float m = sc.nextFloat();
		
		Node newNode = new Node(r,m);
		
		System.out.println("Enter the position where you want to insert :");
		int pos = sc.nextInt();
		if (pos==1) {
			newNode.next=start;
			return newNode;
		}
		int cnt =0;
		
		Node cur = start;
		if (cur == null) {
			System.out.println("Not possible to insert.");
		}
		while (cur!=null) {
			cnt++;
			if (cnt == pos-1) {
				break;
			}
			cur=cur.next;
		}
		newNode.next = cur.next;
		cur.next=newNode;
		return start;
	}
//	(b)-i-deletion from beginning
	public static Node DelBeg(Node start) {
		if (start==null) {
			System.out.println("Linked List is empty");
			return null;
		}
		return start.next;
	}
//	(b)-ii-deletion from end
	public static Node DelEnd(Node start) {
		if (start == null || start.next == null) {
			return null;
		}
		Node cur = start;
		while (cur.next.next!=null) {
			cur = cur.next;
		}
		cur.next=null;
		return start;
	}
//	(b)-iii-deletion from any position
	public static Node DelAny(Node start) {
		if (start==null) {
			System.out.println("Linked List is empty");
			return null;
		}
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the position where you want to delete :");
		int pos = sc.nextInt();
		if (pos==1) {
			return start.next;
		}
		int cnt =0;
		
		Node cur = start;
		while (cur.next.next!=null) {
			cnt++;
			if (cnt == pos-1) {
				cur.next=cur.next.next;
				return start;
			}
			cur=cur.next;
		}
		System.out.println("Out of bounds");
		return start;
	}
//	(b)-iv-deletion of node based on info
	public static Node DelByInfo(Node start) {
		if (start==null) {
			System.out.println("Linked List is empty");
			return null;
		}
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Regd no. you want to delete :");
		int regd = sc.nextInt();
		
		Node cur = start;
		while (cur.next.next!=null) {
			if (cur.next.regd_no==regd) {
				cur.next=cur.next.next;
				return start;
			}
			cur=cur.next;
		}
		System.out.println("Specific node is not present");		
		return start;
	}
//	(c)-updation of specific regd no.
	public static void search(Node start) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the registration number to search :");
		int regd = sc.nextInt();
		System.out.println("Enters the marks to update :");
		int newMarks = sc.nextInt();
		
		if (start == null) {
			System.out.println("List is empty");
		}
		boolean found = false;
		Node cur = start;
		while (cur!=null) {
			if (cur.regd_no==regd) {
				cur.mark=newMarks;
				System.out.println("Marks updated");
				found = true;
				break;
			}
			cur = cur.next;
		}
		if (found == false) {
			System.out.println("Node not found");
		}
	}
//	(d)-Sorting the list(Highest to lowest)
	public static void sort(Node start) {
		if (start == null || start.next == null) {
			return ;
		}
		Node cur = start;
		while (cur!=null) {
			Node in = cur.next;
			while (in!=null) {
				if (cur.mark<in.mark) {
					int tempR = cur.regd_no;
					float tempM = cur.mark;
					
					cur.regd_no=in.regd_no;
					cur.mark=in.mark;
					
					in.regd_no=tempR;
					in.mark=tempM;
				}
				in = in.next;
			}
			cur = cur.next;
		}
		System.out.println("The list is sorted.");
	}
//	(e)-Counting the number of nodes
	public static int count(Node start) {
		int cnt =0;
		Node cur = start;
		while (cur!=null) {
			cnt++;
			cur = cur.next;
		}
		return cnt;
	}
//	(f)-i--Reversing the list (ITERATIVE METHOD)
	public static Node reverseI(Node start) {
		Node pre = null;
		Node cur = start;
		while (cur!=null) {
			Node front = cur.next;
			cur.next=pre;
			pre = cur;
			cur = front;
		}
		return pre;
	}
//	(f)-ii--Reversing the list(RECURSSIVE METHOD)
	public static Node reverseR(Node start) {
		if (start == null || start.next==null) {
			return start;
		}
		Node newHead = reverseR(start.next);
		Node front = start.next;
		front.next=start;
		start.next=null;
		return newHead;
	}
//	(g)-display
	public static void display(Node start) {
		Node cur = start;
		if (cur == null) {
			System.out.println("Empty Linked List");
		}
		while (cur != null) {
			System.out.println("Regd No : "+cur.regd_no+", Mark : "+cur.mark);
			cur=cur.next;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Node start = null;
		for (;;) {
			System.out.println("DROP DOWN MENU LIST:");
			System.out.println("0 : Exit\n1 : Creation\n2 : Insert at beginning\n3 : Insert at end\n4 : Insert at any position");
			System.out.println("5 : Delete from beginning\n6 : Delete from End\n7 : Delete from any position\n8 : Delete by registration number");
			System.out.println("9 : Updation\n10 : Descending Sorting\n11 : Count number of nodes\n12 : Reverse(Iterative)\n13 : Reverse(recurssive)\n14 : Display");
			
			System.out.println("Enter your choice");
			int choice = sc.nextInt();
			
			switch (choice) {
			case 0:
				System.out.println("Exiting the program");
				System.exit(0);
				break;
			case 1:
				if (start == null) {
					start = new Node(0,0);
					create(start);
				} else {
					System.out.println("List already exist");
				}
				break;
			case 2:
				start = InsBeg(start);
				break;
			case 3:
				start = InsEnd(start);
				break;
			case 4:
				start = InsAny(start);
				break;
			case 5:
				start = DelBeg(start);
				break;
			case 6:
				start = DelEnd(start);
				break;
			case 7:
				start = DelAny(start);
				break;
			case 8:
				start = DelByInfo(start);
				break;
			case 9:
				search(start);
				break;
			case 10:
				sort(start);
				break;
			case 11:
				System.out.println("Number of nodes present in list is : "+count(start));
				break;
			case 12:
				start = reverseI(start);
				System.out.println("List is reversed");
				break;
			case 13:
				start = reverseR(start);
				System.out.println("List is reversed");
				break;
			case 14:
				display(start);
				break;
			default:
				System.out.println("Invalid choice");
				break;
			}
		}
		
	}

}
