package com.myApp;

import java.util.Map;

public class UserService {

static {
    UsersMap.getInstance().put("admin", new User("admin","admin"));
}

    public static void addUser(User user) {
        UsersMap.getInstance().put(user.getLogin(), user);
    }

    public static boolean checkUserInMap(String userName){
        for(String u:  UsersMap.getInstance().keySet()){
            if(u.equalsIgnoreCase(userName)){
                return true;
            }
        }
        return false;
    }

    public static boolean checkUserLogPass(String userName, String password){
        if(checkUserInMap(userName)){
           if( UsersMap.getInstance().get(userName).getPassword().equalsIgnoreCase(password)){
               return true;
           }
        }
        return false;
    }

   /* public static void serializeUsers(){
        Map<String,User> copyRegisteredUsers = users;
        try(FileOutputStream fos = new FileOutputStream("D:\\Projects\\firstApp\\service\\src\\main\\resources\\RegisteredUsers.bin");
        ObjectOutputStream ous = new ObjectOutputStream(fos)){
            ous.writeObject(copyRegisteredUsers);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void deSerializeUsers(){
        try(FileInputStream fis = new FileInputStream("D:\\Projects\\firstApp\\service\\src\\main\\resources\\RegisteredUsers.bin");
        ObjectInputStream ois = new ObjectInputStream(fis)){
            Map<String, User> copyRegisteredUsers = (Map<String, User>) ois.readObject();
            users = copyRegisteredUsers;
        }catch(ClassNotFoundException e){
            System.out.println("Класс не найден");
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }*/


    public static Map<String, User> getUsers() {
        return  UsersMap.getInstance();
    }

    public static boolean deleteUser(User user){
        //Код удаления ветка 1
        return true;
    }
}
