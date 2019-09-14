import com.enigma.model.Directions;
import com.enigma.model.Mobil;
import com.enigma.model.Robot;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Your Coordinate X,Y,DIRECTION(NORTH ,EAST ,SOUTH ,WEST) : ");
        String coordinate = br.readLine();
        String [] posts = coordinate.split(",");
        System.out.println("Your Coordinate is : " + posts[0] + "," + posts[1] + "," + posts[2]);
        Robot mark2 = new Robot(Integer.parseInt(posts[0]), Integer.parseInt(posts[1]), Directions.valueOf(posts[2]));

        System.out.print("Make Your Move : ");
        String inputMove = br.readLine();
        mark2.move(mark2.setCommands(inputMove), Directions.valueOf(posts[2]));
        mark2.run(Directions.valueOf(posts[2]));

    }
        /* Running For Mobil        System.out.print("Fill your fuel : ");
        Integer inputFuel = Integer.parseInt(br.readLine());
        mark2.fillFuel(inputFuel);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Input Your Coordinate x,y : ");
        String coordinate = br.readLine();
        String [] posts = coordinate.split(",");
        System.out.println("Your Coordinate is : " + posts[0] + "," + posts[1]);
        Mobil Innova = new Mobil(Integer.parseInt(posts[0]), Integer.parseInt(posts[1]));

        System.out.print("Fill Your Fuel : ");
        String inputFuel = br.readLine();
        Integer fillFuel = Integer.parseInt(inputFuel);
        Innova.fillFuel(fillFuel);

        System.out.print("Make Your Move : ");
        String inputMove = br.readLine();
        Innova.move(Innova.setCommands(inputMove));
        Innova.run();

        if(Innova.fuelAgain==0) {
            System.out.println("Want to fill fuel again? Yes or No");
            String inputFuel1 = br.readLine();
            switch (inputFuel1) {
                case "Yes":
                    System.out.print("Fill Your Fuel Again : ");
                    inputFuel = br.readLine();
                    fillFuel = Integer.parseInt(inputFuel);
                    Innova.fillFuel(fillFuel);

                    System.out.print("Make Your Move : ");
                    inputMove = br.readLine();
                    Innova.move(Innova.setCommands(inputMove));
                    Innova.run();
                    break;
                case "No":
                    System.out.println("Selamat Diam Dijalan!");
                    break;
            }
        }else{
            System.out.println("Your Fuel Not Empty!");
        }
        System.out.println(Innova.print());

    }
    */
}
