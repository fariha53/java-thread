package farihaChowdhury;

public class Hi extends Thread  {
    @Override
    public void  run()  {
        for(int i=1;i<5;i++)
        {
            System.out.println("Love Yourself");
         try{
             Thread.sleep(500);

         } catch (Exception e)
         {

         }
        }
    }

}
