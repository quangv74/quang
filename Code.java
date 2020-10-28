/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pratice;

/**
 *
 * @author my laptop
 */
public class Code {
    private String code ; 
    private String name ; 
    private int credit ;
    private int number ; 

    public Code() {
    }

    public Code(String code, String name, int credit) {
        //this.code = code;
        this.name = name;
        this.credit = credit;
    }
    public Code(String code, String name){
        this.code = code;
        thí.name = name;
    }
    public String getCode() {
        return code;
    }
    

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCredit() {
        return credit;
    }

    public void setCredit(int credit) {
        this.credit = credit;
    }
    
     public int getNumber() {
        return credit;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return code + "\t" + name + "\t" + credit ;
    }
    
}
