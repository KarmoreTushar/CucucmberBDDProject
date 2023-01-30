package SystemClassPrograms;

class M_Array3 {
	public static void main(String[] args) {
		// declaring a source array
		char[] copyFrom = { 'd', 'e', 'c', 'a', 'f', 'f', 'e', 'i', 'n', 'a', 't', 'e', 'd' };
		// declaring a destination array
		char[] copyTo = new char[7];
		// copying array using System.arraycopy() method
						//src, indextocopy, dest, indextostart,indextoend
		System.arraycopy(copyFrom, 2, copyTo, 0, copyTo.length);
		for(int i=0;i<copyTo.length;i++) {
			System.out.print(copyTo[i]);
		}
		System.out.println();
		char[] copyTo1 = new char[7];
		System.arraycopy(copyFrom, 2, copyTo1, 0, 5);// here two index are blank bcz value of character is blank
		for(int i=0;i<copyTo1.length;i++) {
			System.out.print(copyTo1[i]);
		}}}
	

