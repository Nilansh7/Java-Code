public class Stringbuilder
{
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder("Nilansh");
		System.out.println(sb);
		
		System.out.println(sb.charAt(0));
		
		sb.setCharAt(0,'K');
		System.out.println(sb);
		
		sb.insert(0,'N');
		System.out.println(sb);
		
		sb.delete(1,2);
		System.out.println(sb);
		
		sb.append("S");
		sb.append("i");
		sb.append("n");
		sb.append("g");
		sb.append("h");
		System.out.println(sb);
		System.out.println(sb.length());
	}
}