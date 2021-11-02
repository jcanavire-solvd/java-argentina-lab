package org.example;

import org.example.misClases.Club.Cancha.Estadio;
import org.example.misClases.Club.Divisiones.ClubPrimera;
import org.example.misClases.Club.Divisiones.ClubSegunda;
import org.example.misClases.Humano.Jugador;

/**
 * Hello world!
 *
 */
public class App 
{

    public static void main( String[] args )
    {
        Jugador jugador1= new Jugador("delantero", 5, 2,45, "Hurtado", 23654,"Barranquilla");
        Jugador jugador2= new Jugador("defensor", 14, 1,8, "Miguel", 54311,"Caballito");
        Jugador jugador3= new Jugador("arquero", 2, 5,1, "Spider", 4111,"New York");
        Jugador jugador4= new Jugador("mediocampista", 22, 4,65, "Mago", 799,"Howarts");
        Jugador jugador5= new Jugador("delantero", 3, 2,10, "Wanchope", 41304,"Cordoba");
        Jugador jugador6= new Jugador("delantero", 5, 2,45, "evilHurtado", 23654,"Barranquilla");
        Jugador jugador7= new Jugador("defensor", 14, 1,8, "evilMiguel", 54311,"Caballito");
        Jugador jugador8= new Jugador("arquero", 2, 5,1, "evilSpider", 4111,"New York");
        Jugador jugador9= new Jugador("mediocampista", 22, 4,65, "evilMago", 799,"Howarts");
        Jugador jugador10= new Jugador("delantero", 3, 2,10, "evilWanchope", 41304,"Cordoba");
        Jugador[] playersTeam1 = {jugador1, jugador2, jugador3,jugador4,jugador5};
        Jugador[] playersTeam2 ={jugador6, jugador7,jugador8,jugador9,jugador10};

        ClubPrimera boca= new ClubPrimera(105, 18, 10,3,playersTeam1,"Boca Juniors");
        ClubSegunda riber= new ClubSegunda(120,10,2,true, playersTeam2,"River Plate");



        System.out.println( boca.jugarPartido(riber)  );

    }
}