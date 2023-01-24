class Nestedif {
public static void main(String[] args) {
String address = "kolkata, India" ;
if(address.endsWith("India")) { // true

if(address.contains("Dunlop")) { // false
System.out.println("Your City is Dunlop");
}
else if(address.contains("Newtown")) { // false
System.out.println("Your City is Newtown");
}
else {
System.out.println(address.split(" , ")[0]);
}
}
else {
System.out.println("You are not living in India");
}
}
}
