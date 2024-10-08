package asvita_watch;

import java.util.*;

public class login {

public Boolean Validate(user u)

     {

    if((u.getLname().equals("Asvi")))

    {

    return true;

    }

    else

    {

    return false;

    }

     }

public void logout() {

Inventory in=new Inventory();

Scanner sc = new Scanner(System.in);

System.out.println("Logged out successfully");



}

}
