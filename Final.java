import java.util.*;
public class Final{
  public static void main(String[] args){
    ArrayList Small = new ArrayList();
    ArrayList Big = new ArrayList();
    int game_loop=1;
    int zen=0;
    int money=100;
    Player p1 = new Player(money,zen,Big,Small);
    while(game_loop==1){
    Scanner player = new Scanner(System.in);
    System.out.println("What Your name?");
    String name = player.nextLine();
    System.out.println("Boss: "+name+" you were a good worker, I am sad you are leaving the company. Good luck on becoming a monk.");
    System.out.println("Boss: "+name+" you get 30day.");
    for(int i = 0; i<30;i++){
    Temple p2 = new Temple(p1);
    System.out.println("Collecting from all temples...");
    for(int j=0;j<p1.Small.size();j++){
      p1.zen=p1.zen+3;
      System.out.println("Collecting 3 Zen from"+p1.Small.get(j));
    }
    for(int j=0;j<p1.Big.size();j++){
      p1.money=p1.money+15;
      p1.zen=p1.zen+5;
      System.out.println("Collecting $15 and 5 Zen from"+p1.Big.get(j));
    }
    System.out.println("Done collecting from temples...");
    }
    System.out.println("Game Over");
    Scanner tem = new Scanner(System.in);
    System.out.println("ReGame? < Press 1");
    game_loop = tem.nextInt();
    }
  }
}