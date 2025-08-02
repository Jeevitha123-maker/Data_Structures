package linear;
class SNode{
	int data;
	SNode next;
	public SNode(int data) {
		this.data=data;
	}
}

public class StackImp {
	static SNode top,bottom;
	static int count=-1;
	public static void pop() {
		if(count==-1) {
			System.out.println("Stack is Empty");
			return;
			}
		if(count==0){
			System.out.println("popped data:"+top.data);
			count--;
			return;
		}
		SNode temp=bottom;
		while(temp.next.next!=null) {
		temp=temp.next;
		}System.out.println("popped Data:"+ top.data);
		top=temp;  
		temp.next=null;
		count--;
		return;
	}
	public static void push(int data){
		SNode node=new SNode(data);
		if(top==null){
			top=node;
			System.out.print(top.data+" ");
			return;
		}else{
			top.next=node;
			top=node;
			System.out.print(top.data);
		}
}
		public static void main(String[] args) {
			push(10);
			push(6);
		
		}
	}
 	


