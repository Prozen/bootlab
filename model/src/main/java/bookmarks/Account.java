package bookmarks;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by Pavel on 09/02/15.
 */
@Entity
public class Account {
    @OneToMany(mappedBy = "account")
    private Set<Bookmark> bookmarks = new HashSet<>();
    @Id
    @GeneratedValue
    private Long id;
    private String username;
    @JsonIgnore
    private String password;


    public Account(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public String getPassword() {
        return password;
    }

    public String getUsername() {
        return username;
    }

    public Long getId() {
        return id;
    }

    Account(){

    }
}
