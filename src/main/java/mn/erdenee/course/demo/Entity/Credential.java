package mn.erdenee.course.demo.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "credential")
public class Credential {
    @Id
    @Column(name = "user_id")
    private Long userId;

    @Column(name = "password_hash")
    private String password_hash;

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public void setPassword_hash(String password_hash) {
        this.password_hash = password_hash;
    }

    public String getPassword_hash() {
        return password_hash;
    }
}
