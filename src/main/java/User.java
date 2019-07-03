import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;
@Table(name = "HHH")
@Entity(name="users__")
@NoArgsConstructor
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "USER_ID")
    private Long id = null;
    private int version = 0;
    private String firstName;
    private String lastName;
    private String email;
    @Column(name = "RANK")
    private int ranking = 0;
    @Column(name = "IS_ADMIN")
    private boolean admin = false;
    @OneToMany(mappedBy = "user")
    List<Comment> comments;
    @OneToMany(mappedBy = "user")
    List<Address> addresses;
}
