package StackIntro;

import java.util.*;

public class LIntro {
public static void main(String[] args) {
	Stack s = new Stack();
	s.push(90);
	s.push("Sai");
	s.push(90.90);
	s.push(true);
	s.push("Sai");
	System.out.println(s+"--->before pop");
	s.pop();
	System.out.println(s+"--->after pop");
	System.out.println(s.peek());
}
}
