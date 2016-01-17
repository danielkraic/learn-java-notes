boolean - false - 1bit
char    - '\u0000' - 16bit char: '\u0000' - '\uffff'

byte    - 0 - 8bit
short   - 0 - 16bit
int     - 0 - 32bit (26, 032, 0x1a, 0b1100)
long    - 0L - 64bit (10_129_000, 8_900)

float   - 0.0f - 32bit
double  - 0.0d - 64bit (123,4, 1.234e2)

String  - null (UTF-16, "\u00ED", "\u00F1")

int[] arr;
arr = new int[10]
arr[0] = 1;l

int[] arr2 = {1,2,3,4,5};
int len = arr.length;

Cl[] arr3 = new Cl[5];
arr3[0] = new Cl();

System.arraycopy(arr2, 0, arr, 0, arr2.length);
Arrays.fill(arr, 10);
Arrays.toString(arr);

boolean b1 = (obj1 instanceof Parent); //true
boolean b2 = (obj1 instanceof Child);  //true
boolean b3 = (obj1 instanceof Intrf);  //true

String s1, s2;
boolean sc1 = s1 == s2;      // same object
boolean sc2 = s1.equals(s2); // same chars

Operator Result
& Bitwise AND
| Bitwise OR
^ Bitwise exclusive OR
>> Shift right
>>> Unsigned shift right
<< Shift left
~ One’s complement (unary NOT)

class Cl {
	public static void main(String[] args) {
		System.out.println("Hey Ho, Lets Go!");
	}
}

public class Parent {
	public static final int MYCONST = 10;
	private int num;

	Parent(int num) { this.num = num; }
	public int getNum() { return this.num; }

	public static getStr() { return "STR"; }
}

public class Child extends Parent {
	Child() { super(10); }
	@override
	public int get() { return super.getNum() + Parent.MYCONST; };
}

interface Int {
	public getName();
}

class Der implements Int {
	public getName() {
		return "MyName";
	}
}
