package farihaChowdhury;

public class Hello extends Thread {
    @Override
    public void  run()
    {
       for(int i=1;i<5;i++)
       {
           System.out.println("I Love java");

           try{
               Thread.sleep(500);

           } catch (Exception e)
           {

           }
       }
    }

}
