package linear;
class CirNode{
	int data;
	CirNode next;
	public CirNode(int data) {
		this.data=data;
		next=null;
	}
}
class CirMethods{
	static CirNode head,tail;
	static int count=0;
	public static void insertAtBeg(int data) {
		CirNode newnode=new CirNode(data);
		if(head==null ) {
			tail=newnode;
			head=newnode;
			newnode.next=head;
		}else {
		    newnode.next=head;
			head=newnode;
			tail.next=head;
		}count++;
	}
	public static void insertAtEnd(int data) {
		CirNode newnode=new CirNode(data);
		if(head==null ) {
			insertAtBeg(data);
		}else {
			tail.next=newnode;
			newnode.next=head;
			tail=newnode;
		}count++;
	}public static void insertAtpos(int data,int pos) {
		CirNode newnode=new CirNode(data);
		if(pos==0) {
			insertAtBeg(data);
		}else {
			CirNode temp=head;
			for(int i=1;i<pos;i++) {
				temp=temp.next;
			}
			newnode.next=temp.next;
			temp.next=newnode;
		}count++;
    }public static void deletionAtBeg() {
    	CirNode temp=head;
		if(head==null && tail==null) {
			System.out.print("The list is Empty");
		}else {
			tail.next=head.next;
			head=head.next;
			temp.next=null;
		}count--;
	}public static void deletionAtEnd() {
    	CirNode temp=head;
		if(head==null && tail==null) {
			System.out.print("The list is Empty");
		}else {
			tail.next=head.next;
			head=head.next;
			temp.next=null;
		}count--;
	}public static void display() {
		CirNode temp=head;
		do {
			System.out.print(temp.data+" ");
			temp=temp.next;
		}
		while(temp!=head);
		System.out.println();
		System.out.print("The length of the list: "+count);
	}
}
public class CircularSinglyList extends CirMethods{
	public static void main(String[] args) {
	insertAtBeg(5);
	insertAtBeg(6);
	insertAtBeg(9);
	insertAtEnd(7);
	insertAtEnd(10);
	insertAtBeg(2);
	insertAtpos(3,3);
	deletionAtBeg();
	display();
	}

}
