package learning;

import java.util.LinkedList;

public class test {
	public LinkedList innList;
	
	public void check (LinkedList list) {
		this.innList = list;
		this.innList.addFirst("1");
	}
	
	public void check2 (LinkedList list) {
		LinkedList list2 = list;
		list2.add("2");	
		LinkedList list3 = new LinkedList();
		this.innList=list3;
		this.innList.addFirst("1");
		System.out.println(this.innList);

		this.innList = list;
		this.innList.addFirst("1");

		System.out.println(this.innList);
	}

}
