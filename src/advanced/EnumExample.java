package advanced;

import java.util.logging.Level;

 enum Levels
{
     EASY,
     MEDIUM,
     HARD
}

public class EnumExample
{
     public static void main(String[] args)
     {
          Levels myLevel = Levels.HARD;
          switch (myLevel)
          {
               case EASY : System.out.println("EASY Level "); break;
               case MEDIUM : System.out.println("MEDIUM Level "); break;
               case HARD : System.out.println("HARD Level "); break;
          }
     }
}







/*
enum Level{
     EASY,
     MEDIUM,
     HARD
}


public class EnumExample {
     public static void main(String[] args) {

          Level myLevel = Level.EASY;
          switch (myLevel){
               case EASY:
                    System.out.println("Easy Level. ");
                    break;
               case MEDIUM:
                    System.out.println("Medium Level. ");
                    break;
               case HARD:
                    System.out.println("Hard Level. ");
                    break;
          }
     }
}
*/








