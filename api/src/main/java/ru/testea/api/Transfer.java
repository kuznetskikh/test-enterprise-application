package ru.testea.api;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;

/**
 * Account transfer.
 *
 * @author Vadim Kuznetskikh
 */
@Entity
@DiscriminatorValue("TRANSFER")
public class Transfer
extends Operation
{
    @NotNull
    @ManyToOne(optional = false)
    @JoinColumn(name = "source_account_id", nullable = false)
    private Account sourceAccount;

    @NotNull
    @ManyToOne(optional = false)
    @JoinColumn(name = "target_account_id", nullable = false)
    private Account targetAccount;

    /**
     * Creates a new account transfer.
     */
    public Transfer()
    {
    }

    /**
     * Gets the source account.
     *
     * @return source account.
     */
    public Account getSourceAccount()
    {
        return sourceAccount;
    }

    /**
     * Sets the source account.
     *
     * @param sourceAccount
     *        source account.
     */
    public void setSourceAccount(
        Account sourceAccount)
    {
        this.sourceAccount = sourceAccount;
    }

    /**
     * Gets the target account.
     *
     * @return target account.
     */
    public Account getTargetAccount()
    {
        return targetAccount;
    }

    /**
     * Sets the target account.
     *
     * @param targetAccount
     *        target account.
     */
    public void setTargetAccount(
        Account targetAccount)
    {
        this.targetAccount = targetAccount;
    }
}
