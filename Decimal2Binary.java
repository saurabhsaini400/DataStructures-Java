class Solution{
    String s=""; // we can replace String with int as well, but in that case we have to do (s = s*10+n%2)
    public String fun(int n){
        if(n==0)return "";
        
        fun(n/2);
        s = s + n%2;
        return s;
    }
	void toBinary(int N) {
		//Write your code here
		System.out.print(fun(N));
	}
}
