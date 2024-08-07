package utp.database;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;

import utp.model.Date;
import utp.model.Format;
import utp.model.Movie;
import utp.model.Seat;
import utp.model.Time;
import utp.model.User;
import utp.model.Boucher;

public class CineplanetDB {

  //atributos
  private static CineplanetDB instance;
  private ArrayList<User> userList;
  private ArrayList<Movie> movieList;
  private ArrayList<Date> dateList; //Lista de fecha
  private ArrayList<Time> timeList; //Lista de horario
  private ArrayList<Format> formatList; //Lista de formato
  private ArrayList<Seat> seatList; // Lista de butacas
  private ArrayList<Boucher> boucherList; // Lista de boucher 

  //metodo construtor 
  private CineplanetDB () {

    userList = new ArrayList<>();

    //llenando lista de usuarios
    userList.add(new User("Keyla", "1234"));
    userList.add(new User("Roxana", "10701"));
    userList.add(new User("Calixto", "123"));
    userList.add(new User("Omar", "9876"));
    userList.add(new User("Manuel", "6543"));

    /* --------------------------------------------------------------------------- */

    movieList = new ArrayList<>();
    dateList = new ArrayList<>();
    timeList = new ArrayList<>();
    formatList = new ArrayList<>();
    seatList = new ArrayList<>();
    boucherList = new ArrayList<>();

    // Horario 1
    timeList.add(new Time(LocalTime.of(15, 00), 1));
    seatList.add(new Seat(1, 2));

    timeList.add(new Time(LocalTime.of(18, 00), 2));
    seatList.add(new Seat(2, 1));

    timeList.add(new Time(LocalTime.of(21, 00), 3));
    seatList.add(new Seat(3, 3));

    //Fecha 1
    dateList.add(new Date(LocalDate.of(2024, 05, 17), timeList));

    timeList.clear();
    timeList.add(new Time(LocalTime.of(15, 00), 3));
    seatList.add(new Seat(3, 2));

    timeList.add(new Time(LocalTime.of(18, 00), 4));
    seatList.add(new Seat(4, 5));

    dateList.add(new Date(LocalDate.of(2024, 05, 18), timeList));
    
    timeList.clear();
    timeList.add(new Time(LocalTime.of(18, 00), 5));
    seatList.add(new Seat(5, 4));

    dateList.add(new Date(LocalDate.of(2024, 05, 20), timeList));

    //formato1
    formatList.add(new Format("2D", 12.00, dateList));

    //---------------------------------------------------------------------//

    //Horario 2
    timeList.clear();
    timeList.add(new Time(LocalTime.of(17, 30), 6));
    seatList.add(new Seat(6, 2));
    timeList.add(new Time(LocalTime.of(20, 30), 7));
    seatList.add(new Seat(7, 8));
    //fecha 2
    dateList.clear();
    dateList.add(new Date(LocalDate.of(2024, 07, 27), timeList));
    dateList.add(new Date(LocalDate.of(2024, 07, 30), timeList));

    //formato 2
    formatList.add(new Format("3D",  17.00, dateList));
    
    // llenando lista de peliculas
    movieList.add(new Movie("Amigos Imaginarios", "amigos-imaginarios.png", "Animacion", "A", false, LocalTime.of(1, 44),formatList));
    movieList.add(new Movie("Bad Boys para siempre", "bad-boys.png", "Accion", "R", false, LocalTime.of(2, 4), formatList));
    movieList.add(new Movie("Madame Web", "madam-web.png", "Accion", "B", false, LocalTime.of(1, 56), formatList));
    movieList.add(new Movie("John Wick: Sin control ", "john-wick.png", "Accion", "C", false, LocalTime.of(1, 41) ,formatList));
    movieList.add(new Movie("El Planeta De Los Simios: Nuevo Reino", "kingdom-of-the planet-of-the-apes.png", "Accion", "B", false, LocalTime.of(2, 25) ,formatList));
    movieList.add(new Movie("El cover", "cover.png", "Musical", "A", false, LocalTime.of(1, 23) ,formatList));
    movieList.add(new Movie("Role-play", "role-play.png", "Accion", "R", false, LocalTime.of(1, 40), formatList));
    movieList.add(new Movie("Orion-and-the-Dark", "orion-and-the-dark.png", "Animacion", "TV-Y7", false, LocalTime.of(1, 33), formatList));
    movieList.add(new Movie("Spiderman", "spiderman.png", "Accion", "A", false, LocalTime.of(2, 28), formatList));
    movieList.add(new Movie("Fright Night", "fright-night.png", "Terror", "B", false, LocalTime.of(1, 46), formatList));    
    movieList.add(new Movie("Venom", "venom-3.png", "Accion", "B", false, LocalTime.of(2, 15), formatList));    
    movieList.add(new Movie("Joker", "joker.png", "Crimen", "B", false, LocalTime.of(2, 2), formatList));    

  }
  
  //patron de diseño singleton
  public static CineplanetDB getInstance() {
    if (instance == null) {
        instance = new CineplanetDB();
    }
    return instance;
  }

  //metodo para obtener lista de usuarios
  public ArrayList<User> getUserList() {
      return userList;
  }

  //metodo para obtener lista de peliculas
  public ArrayList<Movie> getMovieList(){
    return movieList;
  }
  public ArrayList<Seat> getSeatList() {
      return seatList;
  }

  public ArrayList<Boucher> getBoucherList() {
    return boucherList;
  }

}
