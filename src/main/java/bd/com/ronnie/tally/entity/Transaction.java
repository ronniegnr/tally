package bd.com.ronnie.tally.entity;

import bd.com.ronnie.tally.enumeration.TransactionMedium;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
public class Transaction extends AbstractAuditingEntity {

    @ManyToOne(optional = false)
    @JoinColumn(name = "account_head_inner_id")
    private AccountHeadInner accountHeadInner;

    @Size(min = 1, max = 255)
    private String comment;

    @Enumerated(EnumType.STRING)
    private TransactionMedium transactionMedium;

    @NotNull
    private Double amount;

    public AccountHeadInner getAccountHeadInner() {
        return accountHeadInner;
    }

    public void setAccountHeadInner(AccountHeadInner accountHeadInner) {
        this.accountHeadInner = accountHeadInner;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public TransactionMedium getTransactionMedium() {
        return transactionMedium;
    }

    public void setTransactionMedium(TransactionMedium transactionMedium) {
        this.transactionMedium = transactionMedium;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }
}
