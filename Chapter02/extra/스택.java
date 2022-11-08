package extra;

import java.util.Stack;

public class 스택 {

	public static void main(String[] args) {
		Stack<Integer>s= new Stack();
		
		s.push(5);
		s.push(2);
		s.push(3);
		s.push(7);
		s.pop();
		s.push(1);
		s.push(4);
		s.pop();
		
		while(!s.empty()) {
			System.out.println(s.peek() + " "); //먼저 들어온 원소부터 추출
			s.pop();
		}
	}

}
