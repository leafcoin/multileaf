package org.multibit.viewsystem.dataproviders;


/**
 * DataProvider for send leafcoin and send leafcoin confirm action
 * @author jim
 *
 */
public interface BitcoinFormDataProvider extends DataProvider { 
    /**
     * Get the address
     */
    public String getAddress();
    
    /**
     * Get the label
     */
    public String getLabel();
    
    /**
     * Get the amount (denominated in BTC).
     */
    public String getAmount();
    
    /**
     * Get the amount (denominated in fiat)
     */
    public String getAmountFiat();
}
