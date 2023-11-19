package p2;
 
class Book{
    int price;
    static int count; 

    public Book(int price) {
        this.price = price;
        count++;
    }    
}
