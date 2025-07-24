
// Single Responsibility Principle
class User {
    private String name;
    public User(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
}

class UserPersistence {
    public void saveUser(User user) {
        System.out.println("Saving user: " + user.getName());
    }
}

public class SingleResponsibilityPrinciple {
    public static void main(String[] args) {
        User user = new User("Abhigna");
        UserPersistence persistence = new UserPersistence();
        persistence.saveUser(user);
    }
}
