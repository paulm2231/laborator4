package lab4_1;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        List<Ex1>electronice=new ArrayList<Ex1>();
        BufferedReader buffer=new BufferedReader(new InputStreamReader(new FileInputStream("electronice.txt")));
        String s;
        int n=0;

        while((s= buffer.readLine())!=null)
        {
            String[]x=s.split(";");
            int nr_inv=Integer.parseInt(x[1]);
            int pret=Integer.parseInt(x[2]);
            Situatie situatie=Situatie.valueOf(x[4]);

            if(s.contains("imprimanta"))
            {
                int ppm=Integer.parseInt(x[5]);
                int p_car=Integer.parseInt((x[6]));
                Mod modTiparire=Mod.valueOf(x[8]);
                electronice.set(n, new Imprimanta(x[0], nr_inv, pret, x[3], situatie, ppm, x[7], p_car, modTiparire));

            }

        }
    }
}