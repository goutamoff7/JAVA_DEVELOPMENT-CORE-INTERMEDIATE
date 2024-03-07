package linkedList;
//DOUBLY LINKED LIST

import java.util.Scanner;

class LinkedList
{
	Scanner read=new Scanner(System.in);
	class Node
	{
		int data;
		Node next,prev;
		Node(int data)
		{
			this.data=data;
			this.prev=null;
			this.next=null;
		}
	}

	Node head=null,ne=null;

	Node create(int data)
	{
		return new Node(data);
	}
	
	void insert()
	{
		System.out.print("\nInsert Data in the Linked List:");
		int data=read.nextInt();
		if(head==null)
		{
			head=ne=create(data);			
		}
		else
		{
			for(ne=head;ne.next!=null;ne=ne.next);
			Node ob =create(data);
			ne.next=ob;
			ob.prev=ne;
			ne=ne.next;
		}
	}

	void display()
	{
		Node temp=head;
		if(head == null)
		{
			System.out.println("\nList is Empty");
		}
		else
		{
			System.out.println("\nData in the Linked List are: ");
			while(temp!=null)
			{
				System.out.print(temp.data+" ");
				temp=temp.next;
			}
		}
		System.out.println();
	}

	void delete()
	{
		Node temp=head;
		if(head == null)
		{
			System.out.println("\nList is Empty");
		}
		else if(head.next==null)
			headDelete();
		else
		{
			for(;temp.next.next!=null;temp=temp.next);
			int tempData=temp.next.data;
			temp.next.prev=null;
			temp.next=null;
			System.out.println("\nDeleted Data= "+tempData);
		}
	}
	

	void headInsert()
	{
		if(head == null)
		{
			insert();
		}
		else
		{
			System.out.print("\nEnter data to Insert as head node: ");
			int data=read.nextInt();
			Node ob=create(data);
			head.prev=ob;
			ob.next=head;
			head=ob;
		}
	}


	void headDelete()
	{
		int temp;
		if(head==null)
			System.out.println("\nList is Empty");
		else if(head.next==null)
		{
			temp=head.data;
			head=null;
			System.out.println("\nDeleted data: "+temp);
			System.out.println("List is Empty");
		}
		else
		{
			temp=head.data;
			head=head.next;
			head.prev=null;
			System.out.println("\nDeleted data: "+temp);
		}
			
	}
	
	
	void posInsert()
	{
		int c=0,nodeCount=0;
		System.out.print("\nEnter position to add data:");
		int pos=read.nextInt();		
		if(head!=null)
			for(Node temp=head; temp!=null;temp=temp.next,nodeCount++);
		if(pos==1)
			headInsert();
		else if(pos==nodeCount+1)
			insert();
		else if(pos>1 && pos<=nodeCount)
		{
			System.out.print("\nEnter data to add in position "+pos+" :");
			int data=read.nextInt();
			for(Node temp=head;temp!=null;temp=temp.next)
			{
				c++;
				if(c==pos-1)
				{
					Node ob=create(data);
					ob.next=temp.next;
					ob.prev=temp;
					temp.next=ob;
					ob.next.prev=ob;
				}				
			}
		}
		else
		{
			System.out.println("\nEnter correct node number to insert data \nTotal Node Count= "+nodeCount);
			System.out.println("You can Enter from 1 to "+(nodeCount+1)+" to Insert Data");
		}
	}

	void posDelete()
	{
		int c=0,nodeCount=0;
		if(head==null)
			System.out.println("\nList is Empty");
		else
		{
			System.out.print("\nEnter position to Delete data:");
			int pos=read.nextInt();
			for(Node temp=head; temp!=null;temp=temp.next,nodeCount++);
			if(pos==1)
				headDelete();
			else if(pos==nodeCount)
				delete();
			else if(pos>1 && pos<nodeCount)
			{
				for(Node temp=head;temp!=null;temp=temp.next)
				{
					c++;
					if(c==pos)
					{	int tempData=temp.data;
						temp.prev.next=temp.next;
						temp.next.prev=temp.prev;
						System.out.println("Deleted Data: "+tempData);
					}				
				}
			}
			else
			{
				System.out.println("\nEnter correct node number to Delete data \nTotal Node Count= "+nodeCount);
				System.out.println("You can Enter from 1 to "+nodeCount+" to Delete Data");
			}
		}
	}

	
	void reversePrint()
	{
		Node temp=head;
		for(;temp.next!=null;temp=temp.next);
		for(;temp!=null;temp=temp.prev)
			System.out.print(temp.data+" ");
	}


	void sort() // using selection sort
	{
		for(Node i=head;i.next!=null;i=i.next)
		{
			Node pos=i;
			int small=i.data;
			for(Node j=i.next;j!=null;j=j.next)
			{
				if(small>j.data)
				{
					small=j.data;
					pos=j;
				}	
			}
			pos.data=i.data;
			i.data=small;
		}
		System.out.println("Data Sorted in Ascending Order");
	}

	
}


class DoublyLinkedList
{
	public static void main(String[] args)
	{
		LinkedList list=new LinkedList();
		Scanner read = new Scanner(System.in);		
		while(true)
		{
			System.out.println("\nPress 1 for Insert Data");
			System.out.println("Press 2 for Display Data");
			System.out.println("Press 3 for Delete Data");
			System.out.println("Press 4 for Head Insert");
			System.out.println("Press 5 for Head Delete");
			System.out.println("Press 6 for Positional Insert");
			System.out.println("Press 7 for Positional Delete");
			System.out.println("Press 8 for Reverse Print");
			System.out.println("Press 9 for Sorting");
			System.out.println("Press 10 for exit");
			System.out.print("Enter your choice:");
			int ch=read.nextInt();
			switch(ch)
			{
				case 1:	list.insert();
						break;
				case 2:	list.display();
						break;
				case 3:	list.delete();
						break;
				case 4:	list.headInsert();
						break;
				case 5:	list.headDelete();
						break;
				case 6:	list.posInsert();
						break;
				case 7:	list.posDelete();
						break;
				case 8:	list.reversePrint();
						break;
				case 9:	list.sort();
						break;
				case 10:	System.exit(0);
				default:	System.out.println("Enter correct choice");
	
			}
		}
	}
}


	

