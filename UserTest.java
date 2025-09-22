abstract class User {

    abstract void showMessage(); 

    public void displayUserType(){
        System.out.println("User type selected");
    }
 }

class AdminUser extends User{

    public void showMessage(){
    System.out.println("Welcome, Admin!");
}
}

class GuestUser extends User{

    public void showMessage(){
    System.out.println("Welcome, User!");
}
}


 class UserTest{
    public static void main(String args[]){
        AdminUser a= new AdminUser();
        a.showMessage();
        a.displayUserType();
        GuestUser g = new GuestUser();
        g.showMessage();
        g.displayUserType();
    }


 }
