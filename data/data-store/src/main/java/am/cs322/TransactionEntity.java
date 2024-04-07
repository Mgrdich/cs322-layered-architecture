package am.cs322;

import jakarta.persistence.*;

@Entity
@Table(name="Transactions")
public class TransactionEntity {
    @Id
    @GeneratedValue
    private Long id;

    @Column()
    private String type;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id")
    private UserEntity user;
}
