public class DebugPlay
{
   String title;
   String author;

   DebugPlay(String title, String author)
   {
      this.title = title;
      this.author = author;
   }

   public DebugPlay(String title) {
   }

   public void display()
   {
      System.out.println("The performance is " + title +
        " by " + author);
   }
}