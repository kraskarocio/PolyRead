package com.polyread.backend.user;
import jakarta.persistence.Entity;
import com.polyread.backend.words.UserWord;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import jakarta.persistence.Column;
import jakarta.persistence.OneToMany;
import jakarta.persistence.CascadeType;
import java.util.List;
import java.util.ArrayList;


@Entity
@Table(name = "users")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class User {
   /**
    * Unique identifier for the user.
    */
   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   private Long id;
    /**
     * The username of the user.
     */
    @Column(unique = true)
    private String username;
    /**
     * The email of the user.
     */
    @Column(unique = true)
    private String email;
    /**
     * The password of the user.
     */
    private String password;

    /**
     * The words associated with the user.
     */
    @OneToMany(
        mappedBy = "userId",
        cascade = CascadeType.ALL,
        orphanRemoval = true
    )
    private List<UserWord> words = new ArrayList<>();
}
