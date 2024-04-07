package am.cs322;

import jakarta.persistence.*;

@Entity
@Table(name="Transactions")
public class TransactionEntity {
    @Id
    @GeneratedValue
    private Long id;

    @Enumerated(EnumType.ORDINAL)
    private TransactionType type;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id")
    private UserEntity user;
}
