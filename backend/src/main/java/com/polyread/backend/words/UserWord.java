package com.polyread.backend.words;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import jakarta.persistence.Column;
import jakarta.persistence.UniqueConstraint;
import jakarta.persistence.Enumerated;
import jakarta.persistence.EnumType;

@Entity
@Table(
    name = "user_words",
    uniqueConstraints = {
        @UniqueConstraint(columnNames = {"user_id", "word"})
    }
)
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class UserWord {
   /**
    * Unique identifier for the word.
    */
   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   private Long id;

   /**
    * The word text.
    */
   @Column(nullable = false)
   private String word;
   /**
    * The definition of the word.
    */
   private String definition;
   /**
    * The language of the word.
   */
   private String language;
   /**
    * The user ID associated with the word.
    */
   @Column(name = "user_id")
   private Long userId;

   /**
    * The state of the word for the user.
    */
   @Column(nullable = false)
   @Enumerated(EnumType.STRING)
   private States state;
}
