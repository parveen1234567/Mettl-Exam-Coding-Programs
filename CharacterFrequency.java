package Metal;
class charect{
	public void freq(String s) {
		for(int i =0;i<s.length();i++) {
			int count =1;
			for(int j =i+1;j<s.length();j++) {
				if(s.charAt(i) == s.charAt(j)) {
					count ++;
				}
			}
			if(s.indexOf(s.charAt(i)) == i)
                System.out.print(s.charAt(i) + "=" + count + " ");
		}
	}
}
public class CharacterFrequency {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "hello";
		charect ch = new charect();
		ch.freq(s);

	}

}
