package solidexamplecode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StudentUserImpl implements User{
    long utr, mobNo;
    String name, email;

    public StudentUserImpl(long utr, long mobNo, String name, String email) {
        this.utr = utr;
        this.mobNo = mobNo;
        this.name = name;
        this.email = email;
    }
    Map<User,Map<Book,Integer>>noOfBooksWithUserMap = new HashMap<>();
    List<User>listOfStudentUser = new ArrayList<>();

    public StudentUserImpl() {
    }

    public long getUtr() {
        return utr;
    }

    public void setUtr(long utr) {
        this.utr = utr;
    }

    public long getMobNo() {
        return mobNo;
    }

    public void setMobNo(long mobNo) {
        this.mobNo = mobNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public boolean isEligible() {
        //to be written
        return false;
    }

    @Override
    public void addUser(User user) {
        if(!listOfStudentUser.contains(user)) {
            listOfStudentUser.add(user);
        } else{
            System.out.println("This was user already Exist..");
        }
    }

    @Override
    public void addBooksForTheUser(Book book) {
        if(!noOfBooksWithUserMap.containsKey(user)) {
            noOfBooksWithUserMap.put(book,)
        }
    }

    @Override
    public void removeBooksForTheUser() {

    }
}
