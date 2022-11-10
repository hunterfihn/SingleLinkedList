
public class SinglyLinkedList 
{
	public Node header;
	private int count;
	
	public SinglyLinkedList()
	{
		this.header = null;
		this.count = 0;
	}
	
	public SinglyLinkedList(int initialData)
	{
		this.header = new Node(initialData);
		this.count = 1;
	}
	
	public void append(int value)
	{
		Node newNode = new Node(value);
		
		if(this.header == null)
		{
			this.header = newNode;
		}
		else
		{
			Node currNode = this.header;
			while(currNode.nextNode != null)
			{
				currNode = currNode.nextNode;
			}
		}
	}
	public void prepend(int value)
	{
		Node newNode = new Node(value);
		if(this.header == null)
		{
			this.header = newNode;
		}
		else
		{
			newNode.nextNode = this.header;
			this.header = newNode;
		}
	}
	public void insertAt(int data, int position)
	{
		if(position == 0)
		{
			this.prepend(data);
		}
		else
		{
			Node preNode = this.header;
			Node currNode = this.header.nextNode;
			int counter = 1;
			while(preNode.nextNode != null || position == counter)
			{
				Node newNode = new Node(data);
				if(currNode.nextNode == null)
				{
					preNode.nextNode = newNode;
				}
				else
				{
					preNode.nextNode = newNode;
					newNode.nextNode = currNode;
				}
			}
		}
	}
	public boolean removeAt(int position)
	{
		if(position > this.count)
		{
			return false;
		}
		else
		{
			Node prenode = null;
			Node currNode = null;
			for(int i = 0; i <= position; i++)
			{
				if(i == 0)
				{
					prenode = null;
					currNode = this.header;
					if(position == 0)
					{
						this.header = currNode.nextNode;
						currNode.nextNode = null;
						this.count--;
						return true;
					}
				}
				else
				{
					prenode = currNode;
					currNode = prenode.nextNode;
					if(position == 1)
					{
						prenode.nextNode = null;
						this.count--;
						return true;
					}
				}
			}
		}
		return false;
	}
	public int indexOf(int input)
	{
		int counter = 0;
		if(this.header == null)
		{
			return -1;
		}
		else 
		{
			Node currNode = this.header;
			while(currNode != null && currNode.data != input)
			{
				counter++;
				currNode = currNode.nextNode;
			}
		}
		return counter;
	}
	
	public int length()
	{
		return this.count;
	}
	
	public void sort()
	{
		
	}

}
