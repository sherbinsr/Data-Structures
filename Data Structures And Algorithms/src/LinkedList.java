import java.util.List;

public class LinkedList {

	private ListNode head;
	
  private static class ListNode{
		
    	
	   private int data;
	   private ListNode next;
		
	   private ListNode(int data) {
			
			this.data=data;
			this.next=null;
			
		}
		
	}
  public void insertfirst(int value) {
		
		ListNode newnode = new ListNode(value);
		newnode.next=head;
    	head=newnode;
		
		
		
	}
  public void insertlast(int value) {
	  
	  ListNode  newnode = new ListNode(value);
	  if(head==null) {
		  
		  newnode=head;
	  }else {
		  
		  ListNode current =head;
		  while(current.next != null) {
			  
			  current=current.next;
		  }
		  current.next= newnode;
	  }
	 
	
  }
	public ListNode removeNthFromEnd(ListNode head, int n) {

		ListNode current = head;
		int totalNodes = 0;
		while(current != null){
			totalNodes++;
			current = current.next;
		}

		int count = totalNodes - n;
		if(count == 0)
		{
			return head.next;
		}

		current = head;
		int counter=count-1;
		while(counter > 0){
			current = current.next;
			counter--;

		}
		current.next = current.next.next;
		return head;
	}
	
  public void deleteposition(int position) {
	  
	  if(head==null) {
		  
		 head=head.next;
	  }
	  else{
      ListNode previous = head;
	  int count =1;
	  while(count<position-1) {
		  
		  previous =previous.next;
		  count++;
		  
	  }
	  ListNode current =previous.next;
	  previous.next=current.next;
	  }
  }
		

	public int length() {

	 ListNode current = head;

	 int count=0;
	 while(current!=null) {
		 
		current=current.next;
		count++;
	 }
	return count;
		
	}
	public int pairSum(ListNode head) {

	  int max=0;

	  int[] nodes= new int[length()];

	  int index=0;
	  ListNode current =head;

	  while (current!=null)
	  {
		  nodes[index]=current.data;
		  index++;
		  current=current.next;
	  }

	  int n= nodes.length;

	  for(int i=0; i< n; i++)
	  {
		  int sum=nodes[i]+nodes[n-1-i];
		  max=Math.max(max,sum);
	  }

	  return max;
	}
	
	public ListNode middlenode() {
		
		ListNode fstptr=head;
		ListNode slwptr=head;
		while(fstptr!=null && fstptr.next!=null) {
			
			slwptr=slwptr.next;
			fstptr=fstptr.next.next;
		}
		return slwptr;
		
		
	}
	public void printFromMiddleElement()
	{
		ListNode fstptr=head;
		ListNode slwptr=head;
		while(fstptr!=null && fstptr.next!=null) {

			slwptr=slwptr.next;
			fstptr=fstptr.next.next;
		}
		while (slwptr!=null)
		{
			System.out.println(slwptr.data);
			slwptr=slwptr.next;

		}

	}
	public void dupicateelement() {
		
		ListNode current =head;
		while(current!=null &&current.next!=null) {
			
			if(current.data == current.next.data ) {
				current.next=current.next.next;
			}
			else {
				
				current =current.next;
			}
		}
		
	}
	public ListNode deleteDuplicates(){

		ListNode current =head;
		while(current!=null &&current.next!=null) {

			if(current.data == current.next.data ) {
				current.next=current.next.next;
			}
			else {

				current =current.next;
			}
		}
		return head;
	}
	public void insertpost(int posititon ,int value)
	{
		ListNode newnode = new ListNode(value);
		if(posititon ==1) {
			newnode.next=head;
			head=newnode;
			
		}
		else {
		ListNode previous =head;
		int count =1;
		while(count < posititon -1)
		{
			
		 previous =previous.next;
		 count++;
		}
		
		ListNode current =previous.next;
		newnode.next=current;
		previous.next=newnode;
	}}
	public  void checknode(int searchnode) {
		
		ListNode current =head;
		
		while(current!=null) 
		{
			
			if(current.data==searchnode) {
				
				System.out.println(current.data);
			}	current=current.next;
		}
		
	}
	public  ListNode deleteElement(int match)
	{

		while (head!=null && head.data==match)
		{
			head=head.next;
		}
		ListNode current =head;

		while (current!=null && current.next!=null) {

			if (current.next.data == match)
			{
				current.next=current.next.next;
			}
			else
			{
			current= current.next;
		    }
		}
		return head;
	}
	public void display()
	{

	ListNode current = head;
	
	while(current!=null) {
		
		System.out.print(current.data+"-->");
		current =current.next;
	}
	System.out.println("Null");
		
	}
   public ListNode reverse(ListNode head)
   {
	   ListNode current =head;
	   ListNode previous =null;
	   ListNode next=null;
	   while(current!=null) {
		   
		   next=current.next;
		   current.next=previous;
		   previous=current;
		   current=next;
		   
	   }return previous;
   }
	public int getDecimalValue(ListNode head) {

	  int res=head.data;

	  while (head.next!=null)
	  {
		  res =res*2+head.next.data;
		  head=head.next;
	  }

	  return res;
	}

	public boolean isPalindrome(ListNode head) {
		if (head == null || head.next == null) {
			return true;
		}
		ListNode slow = head;
		ListNode fast = head;
		while (fast.next != null && fast.next.next != null) {
			slow = slow.next;
			fast = fast.next.next;
		}
		ListNode secondHalf = reverse(slow.next);
		ListNode firstHalf = head;
		while (secondHalf != null) {
			if (firstHalf.data != secondHalf.data) {
				return false;
			}
			firstHalf = firstHalf.next;
			secondHalf = secondHalf.next;
		}

		return true;
	}

	public static void main(String[] args) {
		
		LinkedList ls = new LinkedList();
		LinkedList lss = new LinkedList();
		lss.head = new ListNode(1);
		ListNode sode = new ListNode(2);
		ListNode tode = new ListNode(3);
		ListNode fode = new ListNode(4);
		
		lss.head.next=sode;
		sode.next=tode;
		tode.next=fode;
		
		ls.head= new ListNode(1);
		ListNode secondnode = new ListNode(2);
		ListNode thirdnode = new ListNode(3);
		ListNode fourthnode = new ListNode(4);
		
		ls.head.next=secondnode;
		secondnode.next=thirdnode;
		thirdnode.next=fourthnode;
				
		
		
	//	ls.insertfirst(1);
	  // ls.dupicateelement();	
	    //ls.insertlast(70);
	   //ls.insertpost(1, 50);
	  // ls.insertpost(4, 80);
	  //System.out.println(ls.middlenode().data);
		//ls.checknode(5);
		//ls.reverse(fourthnode);
		//ls.deleteposition(1);
		//ls.deleteElement(1);
		 ls.removeNthFromEnd(ls.head ,2);
		//ls.printFromMiddleElement();
		 ls.display();
		//ls.length();

		
		//lss.display();
		//lss.length();
		
	}
	
	
}
