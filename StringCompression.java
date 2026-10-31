package Metal;
class Comp{
	public void str(String s) {
		for(int i =0;i<s.length();i++) {
			int count = 1;
			for(int j = i +1;j<s.length();j++) {
				if(s.charAt(i) == s.charAt(j)) {
					count ++;
				}
				else {
                    break;
                }
			}
		System.out.print("" + s.charAt(i) + count);

        i = i + count - 1;
		}
	}
}
public class StringCompression {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Comp cm = new Comp();
		cm.str("aabbaaaaabyyyyfffs");

	}

}
