package lab1.task5;

public class DragonLaunch {
   public static void main(String[] args) {
       Dragon dr = new Dragon();

//       dr.kidnap(new Person(Gender.BOY));
//       dr.kidnap(new Person(Gender.GIRL));
//       dr.kidnap(new Person(Gender.BOY));
//       dr.kidnap(new Person(Gender.GIRL));
//       dr.kidnap(new Person(Gender.BOY));

       dr.kidnap(new Person(Gender.GIRL));
       dr.kidnap(new Person(Gender.BOY));
       dr.kidnap(new Person(Gender.GIRL));
       dr.kidnap(new Person(Gender.BOY));

       System.out.println("WIll eat? " + dr.willDragonEat());
   }


}
