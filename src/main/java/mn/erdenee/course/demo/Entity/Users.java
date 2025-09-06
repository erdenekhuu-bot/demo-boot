package mn.erdenee.course.demo.Entity;

import jakarta.persistence.*;
import mn.erdenee.course.demo.Enum.ProfileType;

@Entity
@Table(name = "users")
public class Users {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    @Enumerated(EnumType.STRING)
    @Column(name = "usertype")
    private ProfileType usertype;

    @Column(name = "phone")
    private String phone;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public ProfileType getUsertype(){
        return usertype;
    }


    public void setUsertype(ProfileType usertype) {
        this.usertype = usertype;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPhone() {
        return phone;
    }
}
