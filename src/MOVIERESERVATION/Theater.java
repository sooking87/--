package MOVIERESERVATION;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Theater {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TheaterFunction func = new TheaterFunction();
        // Make List that playing movies
        HashMap<Integer, Movie> movieList = new HashMap<>();

        movieList.put(1, new Movie("Ambulance", 10000));
        movieList.put(2, new Movie("Morbius", 12000));
        movieList.put(3, new Movie("Sonic the Hedgehog 2", 8000));
        movieList.put(4, new Movie("Hot Blooded", 9000));

        // Make List that users
        ArrayList<Customer> customerList = new ArrayList<>();
        customerList.add(new Customer("SohnSooKyoung"));
        customerList.add(new Customer("SohnMinGook"));
        customerList.add(new VIP("Park"));
        customerList.add(new VIP("Song"));

        // An infinite Loop is used for the premise that multiple people make a
        // reservation.
        while (true) {
            System.out.println("Start SSK System");
            try {
                System.out.print("Server...Who want to reserve a movie? Put index of Person. >> ");
                int customerNum = sc.nextInt(); // customerList.get(customerNum - 1) is an user
                if (customerNum <= 0 || customerNum > customerList.size()) {
                    throw new OutOfUsersIndexException();
                }
                Customer user = customerList.get(customerNum - 1);

                String ans; // variable for answer
                Movie movie;
                System.out.print(
                        "Reservation: 1, Reservation cancellation: 2, Reservation inquiry: 3, Force close: 4 >> ");
                int answer = sc.nextInt();
                switch (answer) {
                    case 1:
                        func.showMovieList(movieList);
                        System.out.print("Which movie would you like to see? >> ");
                        int movieNum = sc.nextInt();
                        if (movieNum <= 0 || movieNum > movieList.size()) {
                            throw new OutOfMoviesIndexException();
                        }
                        movie = movieList.get(movieNum);
                        System.out
                                .print("Do you want to look up seat numbers that have already been reserved?(Y/N) >> ");
                        ans = sc.next();
                        ans = ans.toLowerCase();
                        if (ans.compareTo("y") == 0 || ans.compareTo("yes") == 0) {
                            movie.showReservedSeat();
                        }
                        while (true) {
                            System.out.print("Which seat would you like to reserve?(1~30) >> ");
                            int seatNum = sc.nextInt();
                            if (movie.reservedSeat(seatNum) == 0) {
                                // Setting for User Field
                                user.setBonusPoint(movie.getPrice());
                                user.setReservedMovie(movie.getMovieName());
                                user.setMoviePrice(movie.getPrice());
                                user.setSeat(seatNum);
                                user.setMovieNum(movieNum);
                                user.showCustomerInfo();
                                break;
                            }
                        }
                        // Complete Booking
                        break;
                    case 2:
                        user.showCustomerInfo();
                        if (user.getReservedMovie() == null)
                            break;
                        else {
                            System.out.print("Are you sure that you want to CANCEL "
                                    + user.getReservedMovie() + "???(Y/N) >> ");
                            ans = sc.next();
                            movie = movieList.get(user.getMovieNum());

                            // Cancel Booking -> Fixing Seats, Fixing Object of Customer's Fields
                            if (ans.compareTo("y") == 0 || ans.compareTo("yes") == 0) {
                                movie.removeSeat(user.getSeat());
                                user.resetBonusPoint(user.getMoviePrice());
                                user.setReservedMovie(null);
                                System.out.println("Cancel DONE");
                            }
                            break;
                        }
                    case 3: // Reservation inquiry
                        user.showCustomerInfo();
                    case 4: // Shut down the system.
                        break;
                    default:
                        System.out.println(
                                "The corresponding number of the system command was not entered. The number of system commands is 1, 2, 3, 4.");
                        break;

                }
                System.out.println("Your reservation system has been shut down.");
                System.out.print("Are you sure you want to SHUT DOWN the reservation SERVER?(Y/N) >> ");
                String isOFF = sc.next();
                if (isOFF.compareTo("y") == 0 || isOFF.compareTo("yes") == 0) {
                    System.out.println("Shut Down the reservation SERVER.");
                    break;
                }
                System.out.println();
            } catch (NoSetMoviesException e) { // Occurs when a value does not exist in movieList.
                e.printStackTrace();
                System.out.println();
            } catch (OutOfUsersIndexException e) { // Occurs when the index of customerList is exceeded.
                System.out
                        .println("User is total " + customerList.size() + ".(1 ~ " + customerList.size() + ")");
                System.out.println(e);
                System.out.println();
            } catch (OutOfMoviesIndexException e) { // Occurs when the index of movieLIst is exceeded.
                System.out.println(
                        "Movies that playing is total " + movieList.size() + ".(1 ~ " + movieList.size() + ")");
                System.out.println(e);
                System.out.println();
            } catch (InputMismatchException e) { // Occurs when a string is entered incorrectly
                sc = new Scanner(System.in); // Code to fix bugs in the Scanner
                System.out.println("Put Number Type.");
                System.out.println(e);
                System.out.println();
            } catch (NoReservedMovieException e) { // Occurs when no movie is playing (movieList.size() == 0)
                e.printStackTrace();
                System.out.println();
            } catch (OutOfSeatsException e) { // Occurs when the seat number you want to reserve does not exist.
                e.printStackTrace();
                System.out.println();
            }
        }
        sc.close();
    }
}
