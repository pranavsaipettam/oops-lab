#include<iostream>
#include<string.h>
using namespace std;

struct Publication{
    string title;
    float price;
    string authorName;

    void getData(){
        cout<<"enter the title:"<<endl;
        cin>>title;
        cout<<"enter the price:"<<endl;
        cin>>price;
        cout<<"enter the author name:"<<endl;
        cin>>authorName;

    }
    void display(){
        
        cout<<"the title:"<<title<<endl;
        cout<<"the price:"<<price<<endl;
        cout<<"the author name:"<<authorName<<endl;
        }

};

struct book: public Publication{
    int count;
    void getData(){
        Publication::getData();
        cout<<"Enter the number of pages in the book: "<<endl;
        cin>>count;
    }
    void display(){
        Publication::display();
        cout<<"no.of pages in the book is: "<<count<<endl;
    }
};
struct ebook: public Publication{
    int time;
    void getData(){
        Publication::getData();
        cout<<"Enter the time: "<<endl;
        cin>>time;
    }
    void display(){
        Publication::display();
        cout<<"the time is: "<<time<<endl;
    }
};

int main(){
    struct book b;
    struct ebook e;
    
    cout<<"enter the details of book: "<<endl;
    b.getData();
    cout<<"the details of book are: "<<endl;
    b.display();
    cout<<"enter the details of ebook: "<<endl;
    e.getData();
    cout<<"the details of ebook are: "<<endl;
    e.display();
    
    return 0;

    
    }
