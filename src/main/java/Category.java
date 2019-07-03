import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;
@Entity(name = "category")
@NoArgsConstructor
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "CATEGORY_ID")
    private Long id = null;
    @Column(name = "OBJ_VERSION")
    private int version = 0;
    @Column(name = "CATEGORY_NAME")
    private String name;
    @ManyToMany
    @JoinTable(name = "category_items",
    joinColumns = @JoinColumn(name = "category_ID"),
    inverseJoinColumns = @JoinColumn(name = "item_ID"))
    private List<Item> items;
}
