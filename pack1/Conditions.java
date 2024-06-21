package pack1;


public class Conditions {
	private int n;
	//public Conditions() {
	//	this(5);
	//}
	public Conditions(int n) {
		this.n = n;
	}
	public boolean isA(int i,int j) {
		if(j==0 || j==n-1 || i==0 || i==n/2) return true;
		return false;
	}
	public  boolean isB(int i,int j) {
		if(j==0 || (i==0 && j!=n-1) || (i==n-1 && j!=n-1)|| (i==n/2 && j!=n-1) || (j==n-1 && i!=0 && i!=n-1 && i!=n/2)) return true;
		return false;
	}
	public  boolean isC(int i,int j) {
		if((j==0 && i!=0 && i!=n-1) || (i==0 && j!=0 && j!=n-1) || (i==n-1 && j!=0 && j!=n-1) || (j==n-1 && (i<n/4 || i>3*n/4))) return true;
		return false;
	}
	public boolean isD(int i,int j) {
		if(j==0 || (i==n-1 && j!=n-1) || (i==0 && j!=n-1) || (j==n-1 && i!=0 && i!=n-1)) return true;
		return false;
	}
	public boolean isE(int i,int j) {
		if(j==0 || i==0 || i==n-1 || (i==n/2 && j<n-2)) return true;
		return false;
	}	
	public boolean isF(int i,int j) {
		if(j==0 || i==0 || (i==n/2 && j<n-2)) return true;
		return false;
	}	
	public boolean isG(int i,int j) {
		if((j==0 && i!=0 && i!=n-1) || (i==0 && j!=0 && j!=n-1) || (i==n-1 && j!=0 && j!=n-1) || (i==n/2 && j>n/2) || (j==n-1 && (i<n/4 || i>n/2))) return true;
		return false;
	}	
	public boolean isH(int i,int j) {
		if(j==0 || j==n-1 || i==n/2) return true;
		return false;
	}	
	public boolean isI(int i,int j) {
		if(i==0 || i==n-1 || j==n/2) return true;
		return false;
	}	
	public boolean isJ(int i,int j) {
		if(i==0 || (j==0 && i>3*n/4 && i!=n-1) || (j==n/2 && i!=n-1) || (i==n-1 && j<n/2 && j!=0))return true;
		return false;
	}	
	public boolean isK(int i,int j) {
		if(j==0 ||(i+j==n-1 && j>n/4) || (i==j && i>n/2)) return true;
		return false;
	}	
	public boolean isL(int i,int j) {
		if(j==0 || i==n-1) return true;
		return false;
	}	
	public boolean isM(int i,int j) {
		if(j==0 || j==n-1 || (i==j && i<n/2) || (i+j==n-1 && i<=n/2)) return true;
		return false;
	}	
	public boolean isN(int i,int j) {
		if(j==0 || j==n-1 || i==j) return true;
		return false;
	}	
	public boolean isO(int i,int j) {
		if(((i==0 || i==n-1) && ( j!=0 && j!=n-1) ) || (j==0 || j==n-1) && ( i!=0 && i!=n-1) )return true;
		return false;
	}	
	public boolean isP(int i,int j) {
		if(j==0 ||  ((i==0 || i==n/2) && j<n-1) || (j==n-1 && i<n/2 && i!=0)) return true;
		return false;
	}	
	public boolean isQ(int i,int j) {
		if(((i==0 || i==n-1) && ( j!=0 && j!=n-1) ) || (j==0 || j==n-1) && ( i!=0 && i!=n-1) || (i==j && i>n/2))return true;
		return false;
	}	
	public boolean isR(int i,int j) {
		if(j==0 ||  ((i==0 || i==n/2) && j<n-1) || (j==n-1 && i<n/2 && i!=0) || (i==j && i>n/2)) return true;
		return false;
	}	
	public boolean isS(int i,int j) {
		if(((i==0 || i==n/2 || i==n-1) &&(j!=0 && j!=n-1 )) || (j==0 && i<n/2 && i!=0)||(j==0 && i>3*n/4 && i!=n-1) ||(j==n-1 && i>n/2 && i!=n-1) ||(j==n-1 && i<n/4 && i!=0) )return true;
		return false;
	}	
	public boolean isT(int i,int j) {
		if(i==0 || j==n/2) return true;
		return false;
	}	
	public boolean isU(int i,int j) {
		if((j==0 && i!=n-1) || (j==n-1 && i!=n-1) || (i==n-1 && j!=0 && j!=n-1)) return true;
		return false;
	}	
	public boolean isV(int i,int j) {
		if(((j==0 || j==n-1) && i<n/2) || (i-j == n/2) || (i+j==3*(n-1)/2))return true;
		return false;
	}	
	public boolean isW(int i,int j) {
		if(j==0 || j==n-1 || (i==j && j>n/2) || (i+j==n-1 && j<=n/2)) return true;
		return false;
	}	
	public boolean isX(int i,int j) {
		if(i==j || i+j==n-1)return true;
		return false;
	}	
	public boolean isY(int i,int j) {
		if(((i==j || i+j==n-1) && i<n/2) || (j==n/2 && i>=n/2))return true;
		return false;
	}
	public boolean isZ(int i,int j) {
		if(i==0 || i==n-1 || i+j==n-1)return true;
		return false;
	}
}
