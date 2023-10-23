package common;
//*
public class Prestados {

    private Integer id;
    private String datstart;
    private String datend;
    private User user;
    private Libros books;

    public Integer getId(){
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
    public String getDatstart(){
        {return datstart;}
    }
    public void setDatstart(String datstart)
    {this.datstart=datstart;}
    public String getDatend(){
        return datend;
    }
    public void setDatend(String datend){
        this.datend=datend;
    }
    public User getUser() {return user;}
    public void setUser(User user){this.user=user;}
    public Libros getBooks(){return books;}
    public void setBooks(Libros books){this.books=books;}

}
