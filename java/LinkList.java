import java.util.Scanner;
class LinkList
{
	Node head=null;
	static class Node
	{
		int data;
		Node next;
		Node(int d)
		{
			data=d;
			Node=null;
		}
	}
	public static void main(String args[]) 
	{
		Scanner sc=new Scanner(System.in);
		LinkList ls=new LinkList();
		int ch,x,loc;

		do
		{
			System.out.println();
			System.out.println("Press 1 For Insert First Node!");
			System.out.println("Press 2 For Insert Last Node!");
			System.out.println("Press 3 For Insert Between Node!");
			System.out.println("Press 4 For Delete Between Node!");
			System.out.println("Press 5 For Update Between Node!");
			System.out.println("Press 6 For Search Node!");
			System.out.println("Press 7 For Display Node!");
			System.out.println("Press 0 For Exit!");
			System.out.println();

			System.out.println("Enter the Choice : ");
			ch=sc.nextInt();
			switch(ch)
			{
				case 1:
					System.out.println("Enter the Value : ");
					x=sc.nextInt();
					ls=insert_first(ls,x);
					display(ls);
					break;
				case 2:
					System.out.println("Enter the Value : ");
					x=sc.nextInt();
					ls=insert_last(ls,x);
					display(ls);
					break;
				case 3:
					System.out.println("Enter the Position : ");
					loc=sc.nextInt();
					System.out.println("Enter the Value : ");
					x=sc.nextInt();
					ls=insert_between(loc,ls,x);
					display(ls);
					break;
				case 4:
					System.out.println("Enter the Position for delete node : ");
					loc=sc.nextInt();
					ls=delete(loc,ls);
					display(ls);
					break;
				case 5:
					System.out.println("Enter the Position for update node : ");
					loc=sc.nextInt();
					System.out.println("Enter the Value : ");
					x=sc.nextInt();
					ls=update(loc,ls,x);
					display(ls);
					break;
				case 6:
					System.out.println("Enter the Value to be search : ");
					x=sc.nextInt();
					search(ls,x);
					display(ls);
					break;
				case 7:
					display(ls);
					break;
				case 0:
					break;
				default:
					System.out.println("Wrong Choice!");
			}
		}while(ch!=0);
	}
	public static LinkList insert_first(LinkList ls,int x)
	{
		Node node=new Node(x);
		node.next=ls.head;
		ls.head=node;
		return ls;
	}
	public static LinkList insert_last(LinkList ls,int x)
	{
		Node node=new Node(x);
		if(ls.head==null)
		{
			ls.head=node;
		}
		else
		{
			Node temp=ls.head;
			while(temp.next!=null)
			{
				temp=temp.next;
			}
			temp.next=node;
		}
		return ls;
	}
	public static LinkList insert_between(LinkList ls, int x, int loc)
	{
		Node node=new Node(x);
		if(loc==1)
		{
			node.next=ls.head;
			ls.head=node;
			return ls;
		}
		else
		{
			Node temp=ls.head;
			int i=1;
			while(temp!=null)
			{
				if(i==loc-1)
				{
					node.next=temp.next;
					temp.next=node;
					return ls;
				}
				i++;
				temp=temp.next;
			}
			System.out.println("Location not Found!");
			return ls;
		}
	}
	public static void display(LinkList ls)
	{
		Node temp=ls.head;
		System.out.print();
		System.out.print(":: LinkList ::");
		while(temp!=null)
		{
			System.out.print(" "+temp.dada);
			temp=temp.next;
		}
		System.out.print();
	}
}