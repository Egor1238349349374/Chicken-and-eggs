public class Main {
    public static void main(String[] args) {
        Animals chicken = new Animals("Курица");
        Animals egg = new Animals("Яйцо");
        egg.start();
        chicken.start();
        try{
            egg.join();
            if (chicken.isAlive()) {
                System.out.println("Победила курица!");
            } else {
                System.out.println("Победило яйцо!");
            }
        }
        catch (Exception ex){
            ex.getMessage();
        }
    }
}
class Animals extends Thread{
    String Name;
    Animals(String name){
        Name = name;
    }

    public void run(){
        for(int i = 0; i < 5; i++) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.getMessage();
            }
            System.out.println(Name);
        }
    }
}

