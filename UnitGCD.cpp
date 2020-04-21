//https://www.codechef.com/APRIL20B/problems/UNITGCD/
#include <bits/stdc++.h>
using namespace std;
 
#define IO ios_base::sync_with_stdio(false);cin.tie(NULL);
typedef long long int ll;
int main()
{
	IO;
	int t;
	cin>>t;
	while(t--)
	{
		  ll n;
		 cin>>n;
		 if(n<4)
		 {
		 	if(n==1){
		 		cout<<"1"<<"\n";
		 		cout<<"1 1"<<"\n";}
		 	else if(n==2){
		 		cout<<"1"<<"\n";
		 		cout<<"2 1 2"<<"\n";}
		 	else if(n==3){
		 		cout<<"1"<<"\n";
		 		cout<<"3 1 2 3"<<"\n";}
		 }
		 else{
		 	if(n%2==0){
			 
		 	cout<<(n/2L)<<"\n";
		 	for(ll i=1;i<n;i+=2)
		        {
		            cout<<"2 "<<i<<" "<<(i+1L)<<"\n";
		        }
			}
		    else{
		    	cout<<(n/2L)<<"\n";
		    	for(ll i=1;i<n;i+=2)
		        {
		        	if(i<n-2)
		            	cout<<"2 "<<i<<" "<<(i+1L)<<"\n";
		            else{
		            	cout<<"3 "<<i<<" "<<(i+1L)<<" "<<(i+2L)<<"\n";
		            	break;}
		        }
			}
		 }
	}
	return 0;	
}
