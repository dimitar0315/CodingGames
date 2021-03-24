package domino.edu.school;

public class DominoTile {
	
	DominoDigits rightHalf;
	DominoDigits leftHalf;
	
	public DominoTile()
	{
		rightHalf = DominoDigits.ZERO;
		leftHalf = DominoDigits.ZERO;
	}
	
	
	public DominoTile(DominoDigits _leftHalf, DominoDigits _rightHalf)
	{
		this.rightHalf = _rightHalf;
		
		this.leftHalf = _leftHalf;
	}


	public void setRightHalf(DominoDigits _rightHalf) 
	{
			this.rightHalf = _rightHalf;
		
	}
	
	public DominoDigits getRightHalf() 
	{
		return rightHalf;
	}


	public void setLeftHalf(DominoDigits _leftHalf) 
	{
			this.leftHalf = _leftHalf;
		
	}
	
	public DominoDigits getLeftHalf() 
	{
		return leftHalf;
	}
	
	
	public void swap()
	{
		DominoDigits half = this.rightHalf;
		this.rightHalf = this.leftHalf;
		this.leftHalf = half;
	}
	
	
	public boolean equals(DominoTile tile2)
	{
		if(this.leftHalf == tile2.leftHalf && this.rightHalf == tile2.rightHalf)
		{
			return true;
		}
		else if(this.leftHalf == tile2.rightHalf && this.rightHalf == tile2.leftHalf)
		{
			return true;
		}
		else {
			return false;
		}
	}
	
	public String toString() {
		String res = "";
		for (int i = 0; i < 3; ++i)
			res = res + leftHalf.GetRow(i) + " " + rightHalf.GetRow(i) + "\n"; 
		return res;
		
	}
	
	
	
	
	
	
}
