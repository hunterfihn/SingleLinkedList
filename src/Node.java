public class Node 
{
	public int data;
	public Node nextNode;
	
	public Node(int data)
	{
		this.data = data;
		this.nextNode = null;
	}
	
	public void setNextNode(Node nextNode)
	{
		this.nextNode = nextNode;
	}
	
	@Override
	public String toString()
	{
		String result = "";
		result += this.data;
		if(this.nextNode == null)
		{
			result += "No following node";
		}
		else 
		{
			result += "Next node is at " + this.nextNode;
		}
		
		return result;
	}

}