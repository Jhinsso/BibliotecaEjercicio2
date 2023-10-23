package common;

public class Autor {
    private Integer id;
    private String name ;
    private String subname;
    private String birthday;

    public Integer getId(){
        return id;
    }
    public void  setId(Integer id){
        this.id = id;
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
