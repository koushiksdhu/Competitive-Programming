//{ Driver Code Starts
#include <iostream>
using namespace std;


// } Driver Code Ends

class Solution{
    public:
    string roundToNearest(string S) 
    { 
        // Complete the function
        int n=S.size();
        if(n==1){
            if(S[n-1]-'0' <=5)return "0";
            else return "10";
        }
        if(S[n-1]-'0' <= 5){
            S[n-1]='0';
            return S;
        }
        S[n-1]='0';
        int carry=1;
        for(int i=n-2;i>=0;i--){
            
            if(S[i]-'0' + carry >= 10){
                S[i]='0';
            }
            else{
                int num=(S[i]-'0')+carry;
                char character = '0'+num;
                S[i]=character;
                carry=0;
                break;
            }
        }
        if(carry==1)return "1"+S;
        return S;
        
    }  

};

//{ Driver Code Starts.

int main() {
    
    int t;cin>>t;
    while(t--)
    {
        string s;
        cin>>s;
        Solution ob;
        cout << ob.roundToNearest(s) << endl;
    }
    
	return 0;
}
// } Driver Code Ends