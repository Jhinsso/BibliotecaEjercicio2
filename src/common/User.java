package common;

public class User {
    private Integer dni;
    private String name ;
    private String subname;
    //*
    private String birthday;

    public Integer getDni(){
        return dni;
    }
    public void  setDni(Integer id){
        this.dni = dni;
    }

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }

    public String getSubname(){
        return subname;
    }
    public void setSubname(String description) {
        this.subname = subname;
    }
    public String getBirthday () {
        return birthday;
    }
    public void setBirthday(String birthday){
        this.birthday = birthday;
    }
}
