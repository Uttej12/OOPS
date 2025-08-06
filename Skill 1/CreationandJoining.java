package cse;

public class CreationandJoining {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a = "Hello";
        String b = "World";
        System.out.println(a.concat(" ").concat(b));
        String joined = String.join("-", "A", "B", "C");
        System.out.println(joined);
	}

}
