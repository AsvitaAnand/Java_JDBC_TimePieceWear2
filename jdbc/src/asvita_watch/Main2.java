package asvita_watch;
import asvita_watch.Invalid;
import asvita_watch.Inventory;
import asvita_watch.login;
import asvita_watch.user;
import asvita_watch.watch;
import java.util.*;
public class Main2 {
public static void main(String[] args)
{
login l=new login();
Inventory in=new Inventory();
watch emp=new watch();
watch f;
int op;
while(true) {
Scanner sc=new Scanner(System.in);
System.out.println("Enter the name:");
String name=sc.next()+sc.nextLine();
System.out.println("Enter the password:");
String pwd=sc.next()+sc.nextLine();
user u=new user(name,pwd);
try {
if((u.getLname().equals("Asvi")))
{
do {
 System.out.println("1.Add 2.Update 3.Remove 4.Show 5.logout -1.Exit");
 System.out.println("Enter the option:");
 op=sc.nextInt();
 switch(op)
 {
    case 1:
    System.out.println("Welcome to watch shop");
    f=new watch();
    /*System.out.println("Enter the Name:");
	 f.setName(sc.next()+sc.nextLine());
	 System.out.println("Enter the ID:");
	 f.setId(sc.next()+sc.nextLine());
	 System.out.println("Enter the Price");
	 f.setCost(sc.nextInt());*/
    System.out.println("enter id,name,price:");
    emp.setId(sc.next()+sc.nextLine());
    emp.setName(sc.next()+sc.nextLine());
    emp.setCost(sc.nextInt());
	 boolean addSts=in.add(emp);
	 if(addSts) {
		 System.out.println("watch details added");
	 }
	 else {
		 System.out.println("watch details not added");
	 }
    break;
    case 2:
    System.out.println("Enter the price to update the name:");
    int Cost =sc.nextInt();
    emp.setCost(Cost);
    System.out.println("Enter the new name:");
    emp.setName(sc.next());
    in.update(emp);
    /*in.update(id1,pr);*/
    break;
    case 3:
    System.out.println("Enter the id to remove:");
    String id=sc.next();
    in.remove(id);
    System.out.println("item deleted");
   /* in.remove(sc.next()+sc.nextLine());*/
    break;
    case 4:
    in.show();
    break;
    case 5:
    in.show();
    l.logout();
    System.out.println("Enter the name:");
name=sc.next()+sc.nextLine();
System.out.println("Enter the password:");
pwd=sc.next()+sc.nextLine();
break;
    case -1:
    System.out.println(in.search(sc.next()+sc.nextLine()));
    break;
 }
 }while(op!=-1);
}
else {
throw new Invalid("invalid username");
}             
}
catch(Invalid e) {
	System.out.println(e.getMessage());
}
}
}
}



