public class App {

	public static void main (String[] args) {
			
		String s1 = "hello";
		String s2 = "hello";

		/*
		We compare references here which are pointers actually and when we run it we notice that the references s1 and s2 point 
		to the same object in the heap. The jvm is clever enough to know that we try to save the same object in the heap and that's 
		why it just makes the s2 reference to point to the same object in the heap and doesn't waste memory from the heap to save the 
		same information again.
		*/
		if (s1 == s2) {
			print("They are the same objets.");
		}
		else{
			print("They are different objets.");
		}

		/*
		While here we notice that they are different objects despite the fact that the same information is saved in the heap. It means that
		here the jvm allocated memory to save again the same information and saved the memory location of the second object created to the 
		s4 reference in the stack. In the first case we had only one object in the heap and two references (s1 and s2) in the stack to point 
		to this single object and in this second case we have two different objects saved in the heap and two different references (s3 and s4) 
		saved in the stack to point to these different objects.
		*/
		String s3 = new Integer(5).toString();
		String s4 = "5";
		if (s3 == s4) {
			print("They are the same objets.");
		}
		else{
			print("They are different objets.");
		}

		/*
		If we want to reuse the object in case it is the same information to be saved many times (and not duplicates be created and waste 
		memory from the heap) we have to call the method intern(). Here we notice that the condition s5 == s6 is true and the first message 
		is printed in the screen declaring that the 2 references point to the same object in the heap.
		*/
		String s5 = new Integer(5).toString().intern();
		String s6 = "5";
		if (s5 == s6) {
			print("They are the same objets.");
		}
		else{
			print("They are different objets.");
		}

		/*
		If we want to compare the content of two strings then we have to use the equals() method. In this case we have only one object 
		saved in the heap but this is irrelevant. The equals() method will compare the contents of this one string as it was two different 
		strings saved in the heap.
		*/
		if (s1.equals(s2)){
                        print("The content of the two strings is the same.");
                }
                else{
                        print("The content of the two strings is different.");
                }
		if (s3.equals(s4)){
                        print("The content of the two strings is the same.");
                }
                else{
                        print("The content of the two strings is different.");
                }

	}

	public static void print (Object obj) {

		String className = obj.getClass().getName();
		//System.out.println(className);

		switch (className) {
			
			case "java.lang.Integer":
				System.out.println(obj);
				break;
			case "java.lang.Long":
				System.out.println(obj);
				break;
			case "java.lang.Float":
				System.out.println(obj);
				break;
			case "java.lang.Double":
				System.out.println(obj);
				break;
			case "java.lang.Boolean":
				System.out.println(obj);
				break;
			case "java.lang.Char":
				System.out.println(obj);
				break;
			case "java.lang.Byte":
				System.out.println(obj);
				break;
			case "java.lang.Short":
				System.out.println(obj);
				break;
			case "java.lang.String":
				System.out.println(obj);
				break;
			default:
				System.out.println("No primitive type or String given.\n");
				break;
		}	

	}

}
