/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package IRS;

/**
 *
 * @author DX
 */
public class Bank {
    
    public long getCheckAccountAmount(long id){
        return id%100*100;
    }
    
    public long getDepositAccountAmount(long id){
        return id%10*1500;
    }
    
}
