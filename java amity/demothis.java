class demothis {
int data;
demothis(int data) {
this.data = data;
System.out.println(data);
}
void display(){
System.out.println(data);
}
public static void main(String args[]) {
demothis ob = new demothis(100);
ob.display();
}
}