package linkedList;
//SINGLE LINKED LIST


import java.util.Scanner;


class LinkedListDemo {
	Scanner read = new Scanner(System.in);

	class Node {
		int data;
		Node next;

		Node(int data) {
			this.data = data;
			this.next = null;
		}
	}

	Node head = null, ne = null;
	
	Node create(int data) {
		return new Node(data);
	}

	void insert() {
		System.out.print("\nInsert Data in the Linked List:");
		int data = read.nextInt();
		if (head == null) {
			head = create(data);
		} else {
			for (ne = head; ne.next != null; ne = ne.next);
			ne = ne.next = create(data);
		}
	}

	void display() {
		Node temp = head;
		if (head == null) {
			System.out.println("\nList is Empty");
		} else {
			System.out.println("\nData in the Linked List are: ");
			while (temp != null) {
				System.out.print(temp.data + " ");
				temp = temp.next;
			}
		}
		System.out.println();
	}

	void delete() {
		Node temp = head;
		if (head == null) {
			System.out.println("\nList is Empty");
		} else if (head.next == null)
			headDelete();
		else {
			for (; temp.next.next != null; temp = temp.next);
			int tempData = temp.next.data;
			temp.next = null;
			System.out.println("\nDeleted Data= " + tempData);
		}
	}

	void headInsert() {
		if (head == null) {
			insert();
		} else {
			System.out.print("\nEnter data to Insert as head node: ");
			int data = read.nextInt();
			Node ob = create(data);
			ob.next = head;
			head = ob;
		}
	}

	void headDelete() {
		int temp;
		if (head == null)
			System.out.println("\nList is Empty");
		else if (head.next == null) {
			temp = head.data;
			head = null;
			System.out.println("\nDeleted data: " + temp);
			System.out.println("List is Empty");
		} else {
			temp = head.data;
			head = head.next;
			System.out.println("\nDeleted data: " + temp);
		}

	}

	void posInsert() 
	{
		int c = 0, nodeCount = 0;
		System.out.print("\nEnter position to add data:");
		int pos = read.nextInt();
		if (head != null)
			for (Node temp = head; temp != null; temp = temp.next, nodeCount++);
		if (pos == 1)
			headInsert();
		else if (pos == nodeCount + 1)
			insert();
		else if (pos > 1 && pos <= nodeCount) {
			System.out.print("\nEnter data to add in position " + pos + " :");
			int data = read.nextInt();
			for (Node temp = head; temp != null; temp = temp.next) {
				c++;
				if (c == pos - 1) {
					Node ob = create(data);
					ob.next = temp.next;
					temp.next = ob;
				}
			}
		} else {
			System.out.println("\nEnter correct node number to insert data \nTotal Node Count= " + nodeCount);
			System.out.println("You can Enter from 1 to " + (nodeCount + 1) + " to Insert Data");
		}
	}

	void posDelete()
	{
		int c = 0, nodeCount = 0;
		if (head == null)
			System.out.println("\nList is Empty");
		else {
			System.out.print("\nEnter position to Delete data:");
			int pos = read.nextInt();
			for (Node temp = head; temp != null; temp = temp.next, nodeCount++)
				;
			if (pos == 1)
				headDelete();
			else if (pos == nodeCount)
				delete();
			else if (pos > 1 && pos < nodeCount) {
				for (Node temp = head; temp != null; temp = temp.next) {
					c++;
					if (c == pos - 1) {
						int tempData = temp.next.data;
						temp.next = temp.next.next;
						System.out.println("Deleted Data: " + tempData);
					}
				}
			} else {
				System.out.println("\nEnter correct node number to Delete data \nTotal Node Count= " + nodeCount);
				System.out.println("You can Enter from 1 to " + nodeCount + " to Delete Data");
			}
		}
	}

	void reversePrint(Node revrs)
	{
		if(revrs!=null)
			reversePrint(revrs.next);
		else
			return;
		System.out.print(revrs.data+" ");
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

	void largest3rd()
	{
		int large1=head.data,large2=0,large3=0;
		Node pos1=head,pos2=null,pos3=null;
		for(Node n=head.next;n!=null;n=n.next)
		{
			if(large1<n.data)
			{
				large3=large2;pos3=pos2;
				large2=large1;pos2=pos1;
				large1=n.data;pos1=n;
			}
			else if(n.data>large2 && n.data<large1)
			{
				large3=large2;pos3=pos2;				
				large2=n.data;pos2=n;
			}
			else if(n.data>large3 && n.data<large2)
			{
				large3=n.data;pos3=n;
			}
		}
		System.out.println("Third Largest Number: "+large3);
		int c=1;
		for(Node n=head;n!=pos3;n=n.next)
			c++;
		System.out.println("Third Largest Position: "+c);
	}

	void insertFromArray(int ar[]) {
		for(int i=0;i<ar.length;i++)
		{
			if(head==null)
				head=create(ar[i]);
			else
			{
				for(ne=head;ne.next!=null;ne = ne.next);
				ne=ne.next=create(ar[i]);
			}
		}
		sort();
		System.out.print("\nInserting Data in the Linked List from an Array has been successfully done");
	}

}

class SingleLinkedListDemo
{

	public static void main(String[] args) 
	{
		LinkedListDemo list = new LinkedListDemo();
		Scanner read = new Scanner(System.in);
		while (true) {
			System.out.println("\nPress 1 for Insert Data");
			System.out.println("Press 2 for Display Data");
			System.out.println("Press 3 for Delete Data");
			System.out.println("Press 4 for Head Insert");
			System.out.println("Press 5 for Head Delete");
			System.out.println("Press 6 for Positional Insert");
			System.out.println("Press 7 for Positional Delete");
			System.out.println("Press 8 for Reverse Print");
			System.out.println("Press 9 for sorting");
			System.out.println("Press 10 to find Third Largest Number");
			System.out.println("Press 11 to insert Elements from an Array");
			System.out.println("Press 12 for exit");
			System.out.print("Enter your choice:");
			int ch = read.nextInt();
			switch (ch) {
				case 1:
					list.insert();
					break;
				case 2:
					list.display();
					break;
				case 3:
					list.delete();
					break;
				case 4:
					list.headInsert();
					break;
				case 5:
					list.headDelete();
					break;
				case 6:
					list.posInsert();
					break;
				case 7:
					list.posDelete();
					break;
				case 8:
					list.reversePrint(list.head);
					break;
				case 9:
					list.sort();
					break;
				case 10:
					list.largest3rd();
					break;
				case 11:
					System.out.println("Enter the Size of array");
					int size=read.nextInt();
					int ar[]=new int[size];
					System.out.println("Enter "+size+" Element into the array");
					for(int i=0;i<size;i++)
						ar[i]=read.nextInt();
					list.insertFromArray(ar);
					break;
				case 12:
					System.exit(0);
				default:
					System.out.println("Enter correct choice");

			}
		}
	}
}
