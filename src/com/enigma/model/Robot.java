package com.enigma.model;

public class Robot {
    Directions directions;
    private Integer postX=0;
    private Integer postY=0;
    private Integer fuel=0;
    private Integer lMove=0;
    private final String F="F";
    private final String B="B";
    private final String R="R";
    private final String L="L";
    private char [] commands;

    public Robot(Integer x, Integer y, Directions directions){
        this.postX = x;
        this.postY = y;
        this.directions = directions;
    }
    public Integer fillFuel(Integer fuel){
        this.fuel = this.fuel + fuel;
        return fuel;
    }
    public String setCommands(String comman){
        this.commands = comman.toCharArray();
        return "";
    }
    public String move (String movement, Directions direction){
        if (movement.equals(R)) {
            if (String.valueOf(direction).equals("NORTH")){
                this.directions = Directions.EAST;
                System.out.println("" + this.directions);
            }else if(String.valueOf(direction).equals("EAST")){
                this.directions = Directions.SOUTH;
            }else if(String.valueOf(direction).equals("SOUTH")){
                this.directions = Directions.WEST;
            }else if(String.valueOf(direction).equals("WEST")){
                this.directions = Directions.NORTH;
            }else{
                System.out.println("ARAH YANG ANDA MASUKAN SALAH!");
            }
        }else if (movement.equals(L)){
            if (String.valueOf(direction).equals("NORTH")){
                this.directions = Directions.WEST;
            }else if(String.valueOf(direction).equals("WEST")){
                this.directions = Directions.SOUTH;
            }else if(String.valueOf(direction).equals("SOUTH")){
                this.directions = Directions.EAST;
            }else if(String.valueOf(direction).equals("EAST")){
                this.directions = Directions.NORTH;
            }else{
                System.out.println("ARAH YANG ANDA MASUKAN SALAH!");
            }
        }else if(movement.equals(F)){
            if (String.valueOf(direction).equals("NORTH")){
                this.postY++;
                this.directions = Directions.NORTH;
            }else if(String.valueOf(direction).equals("WEST")){
                this.postX--;
                this.directions = Directions.WEST;
            }else if(String.valueOf(direction).equals("SOUTH")){
                this.postY--;
                this.directions = Directions.SOUTH;
            }else if(String.valueOf(direction).equals("EAST")){
                this.postX++;
                this.directions = Directions.EAST;
            }else{
                System.out.println("ARAH YANG ANDA MASUKAN SALAH!");
            }
        }else if(movement.equals(B)){
            if (String.valueOf(direction).equals("NORTH")){
                this.postY = this.postY - 1;
                this.directions = Directions.NORTH;
            }else if(String.valueOf(direction).equals("WEST")){
                this.postX++;
                this.directions = Directions.WEST;
            }else if(String.valueOf(direction).equals("SOUTH")){
                this.postY++;
                this.directions = Directions.SOUTH;
            }else if(String.valueOf(direction).equals("EAST")){
                this.postX--;
                this.directions = Directions.EAST;
            }else{
//                System.out.println("ARAH YANG ANDA MASUKAN SALAH!");
            }
        }else{
           // System.out.println("ARAH YANG ANDA MASUKAN SALAH!");
        }
        return "";
    }
    public String run(Directions direct){
        for (int i=0; i<this.commands.length; i++){
            move(String.valueOf(this.commands[i]), this.directions);
            System.out.println(this.commands[i] + getPost() + " " + this.directions);
        }
        return "";
    }
    public String getPost(){
        return "(" + postX + "," + postY + ")";
    }
}

