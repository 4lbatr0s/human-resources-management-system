package coding.hrms.entities.concretes;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.*;


@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "users")
@Data
@Inheritance(strategy = InheritanceType.JOINED)
public class User {

     @Id
     @GeneratedValue(strategy = GenerationType.IDENTITY)
     @Column(name = "id")
     @NotEmpty
     private int id;

     @Email
     @Pattern(regexp = "^[a-zA-Z0-9_!#$%&'*+/=?`{|}~^.-]+@[a-zA-Z0-9.-]+$")
     @Column(name = "email", unique = true)
     @NotEmpty
     private String email;

     @Column(name = "password")
     @NotEmpty
     private String Password;

     public int getId () {
          return id;
     }

     public void setId ( int id ) {
          this.id = id;
     }

     public String getEmail () {
          return email;
     }

     public void setEmail ( String email ) {
          this.email = email;
     }

     public String getPassword () {
          return Password;
     }

     public void setPassword ( String password ) {
          Password = password;
     }

}
