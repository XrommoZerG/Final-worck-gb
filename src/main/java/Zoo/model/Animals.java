package Zoo.model;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;

public abstract class Animals implements Serializable {

    private int id;
    private String name;
    private LocalDate birdayDate;
    public  String type;
    public List<String> commands;


    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public LocalDate getBirdayDate() {
        return birdayDate;
    }

    public String getType() {
        return type;
    }

    public String getCommands(){
        if(!(this.commands).isEmpty()){
            StringBuilder stringBuilder = new StringBuilder("Команды: ");
            stringBuilder.append(this.commands);
            return stringBuilder.toString();
        }
        return null;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBirdayDate(LocalDate birdayDate) {
        this.birdayDate = birdayDate;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void addComands(String comand){
        this.commands.add(comand);
    }
    @Override
    public  String toString(){
        return "№: " + id + ", вид: " + type + ", имя: " + name + ", дата рождения: " + birdayDate +"/n";
    }
}
