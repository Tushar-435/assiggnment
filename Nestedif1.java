class Nestedif1 {
public static void main(String[] args) {
String address = "Bahadurgarh, India" ;
if(address.endsWith("America")) { // true

if(address.contains("Dunlop")) { // false
System.out.println("Your City is Dunlop");
}
else if(address.contains("India")) { // false
System.out.println("Your City is India");
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
