class P{
int money=20000;
String car="bmw";
P(){
System.out.println("Ajay is cool");}
void parent(){
System.out.println("money: "+money);
System.out.println("Car: "+car);}}

class C extends P{
int money=10000;
void use(){
System.out.println("Money: "+money);
System.out.println("Money1: "+super.money);}}

class Demo3{
public static void main(String args[]){
C c=new C();
c.use();}}
