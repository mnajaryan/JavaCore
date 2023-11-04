package homework.onlineShop.storage;

import homework.onlineShop.model.User;
import homework.onlineShop.model.enamModel.UserType;

public class UserStorage {
    private User[] users = new User[10];
    private int size;

    public void add(User user) {
        if (size == users.length) {
            extend();
        }
        users[size++] = user;
    }

    private void extend() {
        User[] tmp = new User[users.length + 10];
        System.arraycopy(users, 0, tmp, 0, users.length);
        users = tmp;
    }

    public void printUsers() {
        for (int i = 0; i < size; i++) {
            if (users[i].getUserType() == UserType.USER){
                System.out.println(users[i].getUserId() + " " + users[i].getName() + " " + users[i].getEmail() + " "
                        + users[i].getPassword() + " " + users[i].getUserType() );
            }
        }
    }
    public User isUser(String email, String password){
        for (int i = 0; i < size; i++) {
            if (users[i].getEmail().equals(email) && users[i].getPassword().equals(password)){
                 return users[i];
            }
        }
        return null;
    }
}
