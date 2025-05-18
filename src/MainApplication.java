abstract public class Account{
    protected int id;
    protected String name;
    protected DataSource myData;

    public void performOperation(DataSource _myData){
       myData = _myData;
       myData.execute();
    }
}
public class Admin extends Account{
    private String AuthPassowrd;

    public Admin(int _id, String _name, String _password){
        id = _id;
        name = _name;
        AuthPassowrd = _password;
    }
}


public class User extends Account {
    public User(int _id, String _name) {
        id = _id;
        name = _name;
    }
}
public interface DataSource {
    public void execute();
}

public class Update implements DataSource {
    @Override
    public void execute() {
        System.out.println("Data has been updated successfully");
    }

}
 public class Delete implements DataSource {
    @Override
     public void execute() {
        System.out.println("Data has been deleted successfully");
    }
 }
 public class MainApplication{
    public static void main(String[] args) {
        Admin curAdmin = new Admin(1234, "Stephen", "Color123");
        User curUser = new User(4455, "John");

        curAdmin.performOperation(new Update());
        curUser.performOperation(new Delete());
    }
 }

