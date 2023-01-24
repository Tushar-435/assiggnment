class Nestedif2 {
public static void main(String[] args) {
String address = "Bahadurgarh, India" ;
if(address.endsWith("America")) {

if(address.contains("Dunlop")) { 
System.out.println("Your City is Dunlop");
}
else if(address.contains("Bahadurgarh")) { 
System.out.println("Your City is Bahadurgarh");
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