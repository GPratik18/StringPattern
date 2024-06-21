package pack1;

public class Trial {
	private int n;
	private Conditions c;
	public Trial(int n) {
		this.n=n;
		c = new Conditions(n);
	}
	
	public boolean getCondition(char ch, int i,int j) {
		switch(ch) {
			case 'A': return c.isA(i, j); 
			case 'B': return c.isB(i, j);
			case 'C': return c.isC(i, j);
			case 'D': return c.isD(i, j);
			case 'E': return c.isE(i, j);
			case 'F': return c.isF(i, j);
			case 'G': return c.isG(i, j);
			case 'H': return c.isH(i, j);
			case 'I': return c.isI(i, j);
			case 'J': return c.isJ(i, j);
			case 'K': return c.isK(i, j);
			case 'L': return c.isL(i, j);
			case 'M': return c.isM(i, j);
			case 'N': return c.isN(i, j);
			case 'O': return c.isO(i, j);
			case 'P': return c.isP(i, j);
			case 'Q': return c.isQ(i, j);
			case 'R': return c.isR(i, j);
			case 'S': return c.isS(i, j);
			case 'T': return c.isT(i, j);
			case 'U': return c.isU(i, j);
			case 'V': return c.isV(i, j);
			case 'W': return c.isW(i, j);
			case 'X': return c.isX(i, j);
			case 'Y': return c.isY(i, j);
			case 'Z': return c.isZ(i, j);
			default : return true;
				
		}
		//if(ch=='A') return c.isA(i, j);
		//return false;
	}
}
