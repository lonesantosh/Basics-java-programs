package collections;

import java.util.Iterator;
import java.util.Stack;

public class DStack {

	public static void main(String[] args) {
	
	// don't use same class name as Stack 
	Stack<Integer> st=new Stack<>();
	//peek return top of the stack value it mean last added element
	//push=insert pop=delete top element/last inserted
	st.push(55);
	st.add(12);
	st.add(null);
	st.add(23);
	st.add(12);// null & duplicate allowed
	st.add(5);
	
	System.out.println("pop valued is "+st);
	System.out.println(st);
	
	/*
	
	//System.out.println(st.pop(12));
	Iterator<Integer> it=st.iterator();
	while(it.hasNext()) {
		System.out.println(it.next());
	}
	int popped=st.pop();
	System.out.println(popped);
	System.out.println("peek value "+st.peek());
	System.out.println("pop valued is "+st); */
	}

}
