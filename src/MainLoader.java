public class MainLoader{
	
	// we cerate all the class instances here
	
	public static void main(String args[]) {
		
		LinkedList lnew = new LinkedList();
		lnew.insertatSart(34);
		lnew.insertatSart(45);
		lnew.insertatSart(12);
		lnew.insertatEnd(18);
		lnew.insertatEnd(56);
	
		
		lnew.showList();
		System.out.print("no. of items in the list are " + lnew.listlength() + "\n");
		lnew.nodeisPresent(1);
		lnew.getnth(2);
		
		
		
	}
	
}


