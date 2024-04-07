package am.cs322.model;

import jakarta.persistence.*;

@Entity
@Table(name="transactions")
public class TransactionEntity {
    public TransactionEntity() {

    }
    public TransactionEntity(TransactionType type, UserEntity user) {
        this.type = type;
        this.user = user;
    }

    @Id
    @GeneratedValue
    private Long id;

    @Enumerated(EnumType.ORDINAL)
    private TransactionType type;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id")
    private UserEntity user;
}
