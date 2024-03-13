package player;

public class Player {
    private String name;
    private char symbol;
    private int age;
    private String contact_no;
    private String address;
    private String email;
    
    public void setPlayerDetail(String name,char symbol,int age,String contact_no,String address,String email){
        this.name=name;
        this.symbol=symbol;
        this.age=age;
        this.contact_no=contact_no;
        this.address=address;
        this.email=email;
    }
    public void setPlayernameage(String name,int age){
        this.name=name;
        this.age=age;
    }
    public void setPlayernameagesymbol(String name,int age,char symbol){
        this.name=name;
        this.age=age;
        this.symbol=symbol;
    }
    public void setPlayernamesymbol(String name,char symbol){
        this.name=name;
        this.symbol=symbol;
    }
    public void changeSymbol(char symbol){
        this.symbol=symbol;
    }
    public String getPlayerName(){
        return this.name;
    }
    public void getPlayerNamesymbol(){
        System.out.println("Player name-> " + this.name);
        System.out.println("Player symbol-> " + this.symbol);
    }
    public char getPlayerSymbol(){
        return this.symbol;
    }
    public void getPlayernameagesymbol(){
        System.out.println("Player name-> " + this.name);
        System.out.println("Player age-> " + this.age);
        System.out.println("Player symbol-> " + this.symbol);
    }

    public void getPlayerDetails(){
        System.out.println("Player name-> " + this.name);
        System.out.println("Player symbol-> " + this.symbol);
        System.out.println("Player age-> " + this.age);
        System.out.println("Player contactNumber-> " + this.contact_no);
        System.out.println("Player adress-> " + this.address);
        System.out.println("Player email-> " + this.email);
    }
}
