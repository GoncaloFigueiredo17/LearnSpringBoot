package Entities;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;

@Entity
public class User {
    @Id                                                     //indica que a primeira variavel é a PK
    @GeneratedValue(strategy = GenerationType.IDENTITY)     //gera um id aleatorio
    private long id;
    private String username;
    private int age;
}
