package org.example;

import org.example.misClases.Club.Divisiones.ClubPrimera;
import org.example.misClases.Club.Divisiones.ClubSegunda;
import org.example.misClases.Humano.Jugador;
import org.example.misClases.Humano.Simpatizante.Barra;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

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
        ArrayList<Jugador> playersTeam1 = new ArrayList<Jugador>();
        playersTeam1.add(jugador1);
        playersTeam1.add(jugador2);
        playersTeam1.add(jugador3);
        playersTeam1.add(jugador4);
        playersTeam1.add(jugador5);
        ArrayList<Jugador> playersTeam2 = new ArrayList<Jugador>();
        playersTeam2.add(jugador6);
        playersTeam2.add(jugador7);
        playersTeam2.add(jugador8);
        playersTeam2.add(jugador9);
        playersTeam2.add(jugador10);

        ClubPrimera boca= new ClubPrimera(105, 18, 10,3,playersTeam1,"Boca Juniors");
        ClubSegunda riber= new ClubSegunda(120,10,2,true, playersTeam2,"River Plate");

        List<Jugador> bosterosMas10Goles = boca.getEquipo().stream().filter(jugador -> jugador.getGoals() >= 10).collect(Collectors.toList());

        bosterosMas10Goles.stream().forEach(jugador -> System.out.println(jugador.getName()));


        System.out.println( boca.jugarPartido(riber)  );
        Barra barra1= new Barra("Rafa Di Zeo",345,"Guemes","higher","robbery", 5);
        Barra barra2= new Barra("Mauro Martin", 789,"Colon","normal","drug dealer",3);
        Barra barra3= new Barra("el abuelo",45,"Abedules","very higher","corruption",5);
        ArrayList<Barra> Barrasbocajrs= new ArrayList<Barra>();
        Barrasbocajrs.add(barra1);
        Barrasbocajrs.add(barra2);
        Barrasbocajrs.add(barra3);
        Barrasbocajrs.stream().forEach(barra->{
            barra.setDangerLevel(barra.getDangerLevel()-1);
            System.out.println(barra.getDangerLevel());
        });



    }
}