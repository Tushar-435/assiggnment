class Unaryop{
public static void main(String ...args){
int a = 5;
int b =7;
// postfix & prefix for increment
System.out.println(a++);
System.out.println(++a);
//  prefix & postfix for decrement
System.out.println(a--);
System.out.println(--a);
System.out.println(a++ + ++b);
System.out.println(b++ + ++a);
System.out.println(++b + b++);
System.out.println(a++ + ++a);
}}