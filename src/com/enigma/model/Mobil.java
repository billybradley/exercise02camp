package com.enigma.model;
public class Mobil {
    private Integer postX;
    private Integer postY;
    private char [] commands;
    private final String F="F";
    private final String B="B";
    private final String R="R";
    private final String L="L";
    private Integer lMove=0;
    private Integer fuel=0;
    public Integer fuelAgain=fuel;

    public Mobil(Integer x, Integer y){
        this.postX = x;
        this.postY = y;
    }
    public Integer fillFuel(Integer fuel){
        this.fuel = this.fuel + fuel;
        return fuel;
    }
    public String setCommands(String comman){
        this.commands = comman.toCharArray();
        return "";
    }
    public String move (String movement){
            if (movement.equals(R)) {
                this.postX++;
            }else if(movement.equals(F)){
                this.postY++;
            }else if(movement.equals(L)){
                this.postX--;
            }else if(movement.equals(B)){
                this.postY--;
            }else{
                return "";
            }
        return "";
    }
    public String run(){
        lMove = this.commands.length - (this.fuel*3);
        for (int i=0; i<this.commands.length; i++){
            if(fuel==0){
                System.out.println("Bensin Habis!");
                break;
            }
            move(String.valueOf(this.commands[i]));
            System.out.println(this.commands[i] + getPost() + this.fuel);
            if ((i+1)%3==0){
                dcreaseFuel(1);
            }
        }
        if(this.fuel==0){

        }
        vFuel();
        return "";
    }
    private void dcreaseFuel(int decr){
        this.fuel = this.fuel - decr;
    }
    public void vFuel(){
        for(int i=0; i<this.commands.length; i++){
            if((i+1)%3==0){
                this.fuel--;
            }
        }
        if (this.fuel==0){
            System.out.println("Your Fuel is Empty!");
        }else{
            System.out.println("Your Move Left : " + lMove);
        }
        this.fuel=0;
    }
    public String getPost(){
        return "(" + postX + "," + postY + ")";
    }
    public String print() {
        return "Mobil{" +
                "postX=" + postX +
                ", postY=" + postY +
                ", fuel=" + fuel +
                ", commands=" + commands +
                '}';
    }
}
