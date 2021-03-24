package domino.edu.school;

public enum DominoDigits {
	ZERO(0, "   ", "   ", "   "),
	ONE (1, "   ", " * ", "   "),
	TWO(2 ,"*  ","   ","  *"),
	THREE(3,"*  "," * ","  *"),
	FOUR(4,"* *","   ","* *"),
	FIVE(5,"* *"," * ","* *"),
	SIX(6,"* *","* *","* *")
	;
	private final String[] rows;
	private final int value;

	private DominoDigits(int _value, String row0, String row1, String row2)
	{
		this.value = _value;
		this.rows =  new String[3];
		this.rows[0] = row0;
		this.rows[1] = row1;
		this.rows[2] = row2;
	}
	
	public static DominoDigits Get(int i)
	{
		switch(i)
		{
		case 0:return ZERO;
		case 1:return ONE;
		case 2:return TWO;
		case 3:return THREE;
		case 4:return FOUR;
		case 5:return FIVE;
		case 6:return SIX;
		default: throw new IllegalArgumentException("value not in range 0..6");
		}
	}
	
	public String GetRow(int i)
	{
		return rows[i];
	}
}
