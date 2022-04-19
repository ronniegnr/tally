package bd.com.ronnie.tally.entity;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
public class AccountHeadInner extends AbstractAuditingEntity {

    @NotNull
    @Size(min = 1, max = 255)
    private String name;

    @NotNull
    @Size(min = 1, max =1023)
    private String description;

    @ManyToOne(optional = false)
    @JoinColumn(name = "account_head_id")
    private AccountHead accountHead;

    @NotNull
    @Enumerated(EnumType.STRING)
    private Status status;

    public enum Status {ACTIVE, INACTIVE}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public AccountHead getAccountHead() {
        return accountHead;
    }

    public void setAccountHead(AccountHead accountHead) {
        this.accountHead = accountHead;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }
}
