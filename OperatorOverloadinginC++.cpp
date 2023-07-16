#include <iostream>
using namespace std;

class Demo{
    int a;
    public:
        void getData(){
            cin>>a;
            
        }
        void putData(){
            cout<<"Data is :"<<a<<endl;
        }
        Demo operator+ (Demo bb){
            Demo cc;
            cc.a = a + bb.a;
            return cc;
        }

};
int main() {
    // Demo a;
    // a.getData();
    // a.putData();
    Demo aa,bb,cc;
    aa.getData();
    bb.getData();
    cc = aa+bb;
    cc.putData();

}
