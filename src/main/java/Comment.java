import lombok.NoArgsConstructor;

import javax.persistence.*;
@Entity
@NoArgsConstructor
public class Comment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "comment_id")
    private Long id = null;
    @ManyToOne
    private User user;
    @ManyToOne
    @JoinTable(name = "comment_item", joinColumns = @JoinColumn(name = "item"),
    inverseJoinColumns = @JoinColumn(name = "comment"))
    private Item item;
    private String content;
}
