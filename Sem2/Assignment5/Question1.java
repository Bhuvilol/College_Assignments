import java.util.Scanner;

class Node{
	
	protected int regd_no;
	protected float mark;
	protected Node next;
	protected Node prev;
	Node(int regd_no, float mark) {
		this.regd_no = regd_no;
		this.mark = mark;
		this.next = null;
		this.prev = null;
	}
}
public class Question1 {
	static Scanner sc = new Scanner(System.in);
	public static Node create(Node start,Node end) {
		if (start != null) {
			System.out.println("List already exist .");
			return start;
		} else {
			System.out.println("Enter registration number :");
			int regd = sc.nextInt();
			System.out.println("Enter marks :");
			float marks = sc.nextFloat();
		
			Node newNode = new Node(regd, marks);
			start = end = newNode;
			System.out.println("List successfully created.");
			return start;
		}
	}
	//a-(i)-Insert At Beginning
	public static Node insBeg(Node start, Node end) {
		System.out.println("Enter registration number :");
		int regd = sc.nextInt();
		System.out.println("Enter marks :");
		float marks = sc.nextFloat();
		
		Node newNode = new Node(regd,marks);
		
		if (start == null) {
			start = end = newNode;
			return start;
		}
		newNode.next=start;
		start.prev=newNode;
		
		start = newNode;
		System.out.println("Node with regd no. "+regd+" marks "+ marks+ " succesfully added at beginning.");
		return start;
	}
	//a-(i)-Insert At the End
	public static Node insEnd(Node start,Node end) {
		System.out.println("Enter registration number :");
		int regd = sc.nextInt();
		System.out.println("Enter marks :");
		float marks = sc.nextFloat();
		
		Node newNode = new Node(regd, marks);
		
		if (start == null) {
			start=end=newNode;
			return end;
		}
		end.next=newNode;
		newNode.prev = end;
		end = newNode;
		System.out.println("Node with regd no. "+regd+" marks "+ marks+ " succesfully added in the end.");
		return end;
	}
	//a-(i)-Insert At Position In The List
	public static Node insAny(Node start,Node end) {
        System.out.println("Enter registration number: ");
        int regd = sc.nextInt();
        System.out.println("Enter mark: ");
        float marks = sc.nextFloat();
        System.out.println("Enter position: ");
        int pos = sc.nextInt();

        if (pos == 1) {
            return insBeg(start, end);
        }

        Node newNode = new Node(regd, marks);
        Node curr = start;
        for (int i = 1; i < pos - 1 && curr != null; i++) {
            curr = curr.next;
        }
        if (curr == null || curr.next == null && pos != 2) {
            System.out.println("Invalid position.");
            return start;
        }

        newNode.next = curr.next;
        if (curr.next != null) {
            curr.next.prev = newNode;
        } else {
            end = newNode;
        }
        curr.next = newNode;
        newNode.prev = curr;
        System.out.println("Node with regd no. "+regd+" marks "+ marks+ " succesfully added at position "+pos);
        return start;
	}
//	(b)-i-deletion from beginning
	public static Node DelBeg(Node start, Node end) {
		if (start==null) {
			System.out.println("Linked List is empty");
			return start;
		}
		start = start.next;
		start.prev=null;
		System.out.println("First node successfully deleted.");
		return start;
	}
//	(b)-ii-deletion from end
	public static Node DelEnd(Node start, Node end) {
		if (start == null || start.next == null) {
			start=end=null;
			return start;
		}
		Node last = end;
		end = last.prev;
		last.prev=null;
		end.next=null;
		System.out.println("End node successfully deleted");
		return end;
	}
//	(b)-iii-deletion from any position
	public static Node DelAny(Node start, Node end) {
		if (start==null) {
			System.out.println("Linked List is empty");
			return null;
		}
		System.out.println("Enter the position where you want to delete :");
		int pos = sc.nextInt();
		if (pos==1) {
			return DelBeg(start, end);
		}
		Node cur = start.next;
		for(int i = 1; i < pos-2 ; i++) {
			cur=cur.next;					
		}
		if (cur==null||cur.next==null) {
			System.out.println("Invalid position");
			return start;
		} if (cur.next == end) {
			end = cur;
			System.out.println(pos+"th node successfully deleted");
			return start;
		} else {
			Node front = cur.next;
			cur.next=front.next;
			front.next.prev=cur;
			
			front.prev=null;
			front.next=null;
			System.out.println(pos+"th node successfully deleted");
			return start;
		}
	}
	// c - search a node
	public static void search(Node start) {
		System.out.println("Enter registration number :");
		int regd = sc.nextInt();
		Node temp = start;
		while (temp!=null) {
			if (temp.regd_no==regd) {
				System.out.println("Enter new mark :");
				temp.mark=sc.nextFloat();
				System.out.println("Mark updated successfully");
				return;
			}
			temp = temp.next;
		}
	}
	// d- display All The Nodes In The List
	public static void display(Node start, Node end) {
		Node cur = start;
		if (cur == null) {
			System.out.println("Empty Linked List");
			return;
		}
		while (cur!=null) {
			System.out.println("Regd No : "+cur.regd_no+", Mark : "+cur.mark);
			cur=cur.next;
		}
		return;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Node start = null,end = null;
		for (;;) {
			System.out.println("DROP DOWN MENU LIST:");
			System.out.println("0 : Exit\n1 : Creation\n2 : Insert at beginning\n3 : Insert at end\n4 : Insert at any position");
			System.out.println("5 : Delete from beginning\n6 : Delete from End\n7 : Delete from any position\n8 : Search and update mark");
			System.out.println("9 : Display");
			
			System.out.println("Enter your choice");
			int choice = sc.nextInt();
			
			switch (choice) {
			case 0:
				System.out.println("Exiting the program");
				System.exit(0);
				break;
			case 1:
				start = end = create(start,end);
				break;
			case 2:
				start = insBeg(start,end);
				break;
			case 3:
				end = insEnd(start,end);
				break;
			case 4:
				start = insAny(start,end);
				break;
			case 5:
				start = DelBeg(start,end);
				break;
			case 6:
				end = DelEnd(start,end);
				break;
			case 7:
				start = DelAny(start,end);
				break;
			case 8:
				search(start);
				break;
			case 9:
				display(start,end);
				break;
			default:
				System.out.println("Invalid choice");
				break;
			}
		}
	}

}
