package common;

import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

        Scanner scanner= new Scanner(System.in);
        /**
        * GENERO
        */
        Genre genre= new Genre();
        System.out.println("Introduce un genero:");
        genre.setId(scanner.nextInt());

        System.out.println("Introduce el NOMBRE de un genero");
        genre.setName(scanner.next());

        System.out.println("Introduce una descripcion del genero");
        genre.setDescription(scanner.next());
        /**
         * LIBROS
         */
        Libros book= new Libros();
        System.out.println("Introduce un ISBN:");
        book.setIsbn(scanner.nextInt());

        System.out.println("Introduce el TITULO de un libro");
        book.setTitle(scanner.next());

        book.setAutor(book.getAutor());

        book.setGenre(genre);

        System.out.println("Introduce una fecha de PUBLICACION del libro");
        book.setPublication(scanner.next());
        /**
         * AUTOR
         */
        Autor autor= new Autor();
        System.out.println("Introduce un common.Autor:");
        autor.setId(scanner.nextInt());

        System.out.println("Introduce el NOMBRE de un AUTOR");
        autor.setName(scanner.next());

        System.out.println("Introduce los APELLIDOS de un AUTOR");
        autor.setSubname(scanner.next());

        System.out.println("Introduce la fecha de NACIMIENTO de un AUTOR");
        autor.setBirthday(scanner.next());
        /**
         * USUARIO
         */
        User user= new User();
        System.out.println("Introduce el DNI de un USUARIO");
        user.setDni(scanner.nextInt());

        System.out.println("Introduce el NOMBRE de un USUARIO");
        user.setName(scanner.next());

        System.out.println("Introduce los APELLIDOS de un USUARIO");
        user.setSubname(scanner.next());

        System.out.println("Introduce la fecha de NACIMIENTO de un USUARIO");
        user.setBirthday(scanner.next());
        /**
         * Loan
         */
        Prestados loan= new Prestados();
        loan.getId();
        loan.getUser();
        loan.getBooks();
        loan.getDatstart();
        loan.getDatend();

    }
}