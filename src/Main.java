import com.enigma.model.Mobil;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
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
        System.out.println(Innova.print());
    }
}
