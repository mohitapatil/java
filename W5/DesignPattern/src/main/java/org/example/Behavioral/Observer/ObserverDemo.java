package org.example.Behavioral.Observer;

public class ObserverDemo {

	public static void main(String[] args) {
		Content content = new Content();

		MySubscriber s1= new MySubscriber(content,"s1");
		MySubscriber s2= new MySubscriber(content,"s2");
		MySubscriber s3= new MySubscriber(content,"s3");

		System.out.println("first change");
		content.setState(222);
		System.out.println("Second change");
		content.setState(1);
	}
}
