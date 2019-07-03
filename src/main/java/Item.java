import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.List;
import java.util.Set;
@Entity(name = "item")
@NoArgsConstructor
public class Item {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ITEM_ID")
    private Long id = null;
    @Column(name = "ITEM_NAME")
    private String name;
    @Column(name = "DESCRIPTION")
    private String description;
    private BigDecimal reservePrice;
    @ManyToMany(mappedBy = "items")
    private Set<Category> categories ;
    @OneToMany
    @JoinTable(name = "comment_item", joinColumns = @JoinColumn(name = "item"),
            inverseJoinColumns = @JoinColumn(name = "comment"))
//    @JoinTable(name = "comment_item", joinColumns = {@JoinColumn(name = "item")},
//            inverseJoinColumns = {@JoinColumn(name = "comment")})
    List<Comment> comments;
}
