package a_4_5_Encapsulation;


import java.util.Random;

public class KraftBankCustomer {

    private int cutomerId;
    private   String customerFullName;
    public  boolean isSms;
    private double customerAccount;
    private String customerToken;


    public KraftBankCustomer(int cutomerId, String customerFullName, boolean isSms) {
        this.cutomerId = cutomerId;
        this.customerFullName = customerFullName;
        this.isSms = isSms;

        Random random= new Random();
        this.customerToken=cutomerId+customerFullName.substring(0,2)+12;
    }

    public int getCutomerId() {
        return cutomerId;
    }

    public String getCustomerFullName() {
        return customerFullName;
    }

    public void setCustomerFullName(String token, String customerFullName){
        if (customerToken.equals(this.customerToken)){
            this.customerFullName=customerFullName;
        }else {
            System.err.println("Auothorize");
        }
    }

    public double getCustomerAccount() {
        return customerAccount;
    }

    public String getCustomerToken() {
        return customerToken;
    }

    public boolean getSms() {
        return isSms;
    }

    public void setIsSms(boolean sms) {
        isSms = sms;
    }

    public void  addMonet(double money){
        this.customerAccount+=money;
    }






}
