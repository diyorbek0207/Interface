public class Player implements Information{
    private String nameOfPlayer;
    private String sportTyp;
    private int numberPasition;
    private String teamName;
    @Override
    public void getinfo() {

    }

    @Override
    public void getTeamNaem() {

    }

    public String getNameOfPlayer(){
        return nameOfPlayer;
    }
    public String getSportTyp(){
        return sportTyp;
    }
    public int getNumberPasition(){
        return numberPasition;
    }
    public String getTeamName(){
        return teamName;
    }
}
