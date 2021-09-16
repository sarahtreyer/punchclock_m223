package ch.zli.m223.punchclock.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Category{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String categoryName;
    private String categoryLenght;


    @OneToMany(fetch = FetchType.LAZY, mappedBy = "employee")
    private List<Entity> entryId;

    public long getId() {
        return id;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String username) {
        this.categoryName = categoryName;
    }

    public String getCategoryLength() {
        return categoryLenght;
    }

    public void setCategoryLength(String categoryLenght) {
        this.categoryLenght = categoryLenght;
    }
}