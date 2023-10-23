package common;

public class Libros {
    private Integer isbn;
    private String title;
    private Autor autor;
    private Genre genre;
    private String publication;

    public Integer getIsbn(){
        return isbn;
    }
    public void  setIsbn(Integer isbn){
        this.isbn = isbn;
    }

    public String getTitle(){
        return title;
    }
    public void setTitle(String title){
        this.title = title;
    }

    public Autor getAutor(){
        return autor;
    }
    public void setAutor(Autor autor) {
        this.autor = autor;
    }
    public Genre getGenre () {
        return genre;
    }
    public void setGenre(Genre genre){
        this.genre = genre;
    }
    public String getPublication () {
        return publication;
    }
    public void setPublication(String publication){
        this.publication = publication;
    }
}
