package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;

    private int cheesePrice;

    private int toppingsPrice;
    private int takeAwayPrice;
    //Variables for checking
    private boolean isCheeseAdded;
    private boolean isToppingsAdded;
    private boolean isTakeAwayAdded;
    private boolean isBillGenerated;

    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        // your code goes here
        this.cheesePrice = 80;
        this.takeAwayPrice = 20;
        if(isVeg) {
            this.price = 300;
            this.toppingsPrice = 70;
        }
        else {
            this.price = 400;
            this.toppingsPrice = 120;
        }
        this.isCheeseAdded = false;
        this.isToppingsAdded = false;
        this.isTakeAwayAdded = false;
        this.isBillGenerated = false;

        this.bill = "Base Price Of The Pizza: "+this.price+"\n";
    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
        // your code goes here
        if(isCheeseAdded == false){
            this.price += this.cheesePrice;
            isCheeseAdded = true;
        }

    }

    public void addExtraToppings(){
        // your code goes here
        if(isToppingsAdded == false){
            this.price += this.toppingsPrice;
            isToppingsAdded = true;
        }
    }

    public void addTakeaway(){
        // your code goes here
        if(isTakeAwayAdded == false){
            this.price += this.takeAwayPrice;
            isTakeAwayAdded = true;
        }
    }

    public String getBill(){
        // your code goes here

        if(isBillGenerated == false){
            if(isCheeseAdded)
                this.bill += "Extra Cheese Added: "+cheesePrice+"\n";
            if(isToppingsAdded)
                this.bill += "Extra Toppings Added: "+toppingsPrice+"\n";
            if(isTakeAwayAdded)
                this.bill += "Paperbag Added: "+takeAwayPrice+"\n";
            this.bill += "Total Price: "+price+"\n";
            isBillGenerated = true;
        }
        return this.bill;
    }
}
