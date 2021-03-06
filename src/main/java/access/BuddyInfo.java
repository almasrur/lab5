package access;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class BuddyInfo {

    @Id
    private int id;

    private String name, address, phone;
    
    public BuddyInfo(String name, String address, String phone){
        this.name = name;
        this.address = address;
        this.phone = phone;
    }

    public BuddyInfo(){
    }

    public int getId(){
        return this.id;
    }
    
    public String getName(){
        return name;
    }
    
    public String getAddress(){
        return address;
    }
    
    public String getPhone() {
        return phone;
    }

    public void setId(int id){this.id = id;}

    public void setName(String name){
        this.name = name;
    }

    public void setAddress(String address){
        this.address = address;
    }

    public void setPhone(String phone){
        this.phone = phone;
    }
    
    public String toString(){
        return name + " " + address + " " + phone;
    }

}
