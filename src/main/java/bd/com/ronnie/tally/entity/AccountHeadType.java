package bd.com.ronnie.tally.entity;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
public class AccountHeadType extends AbstractAuditingEntity {

    public static AccountHeadType newObjectWithDefaults() {
        AccountHeadType accountHeadType = new AccountHeadType();
        accountHeadType.status = Status.ACTIVE;
        return accountHeadType;
    }

    @NotNull
    @Size(min = 1, max = 255)
    private String name;

    @NotNull
    @Size(min = 1, max = 1023)
    private String description;

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

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }
}
