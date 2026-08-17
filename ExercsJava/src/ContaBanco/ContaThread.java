package ContaBanco;

public class ContaThread implements Runnable{

    String transationId;
    Double amount;

    public ContaThread(String transationId, Double amount) {
        this.transationId = transationId;
        this.amount = amount;
    }

    @Override
    public void run() {

        if(transationId.equals("loan")) throw new IllegalArgumentException();

        try {
            Thread.sleep(1000);

        } catch (InterruptedException e) {
            System.out.println("Impossible realize transaction");
        }

    }
}
