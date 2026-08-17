package org.massambani;

import ContaBanco.ContaThread;
import geometric.MainOfGeometric;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {



		List<ContaThread> tasks = new ArrayList<>();

		tasks.add(new ContaThread("debit", 3000.0));
		tasks.add(new ContaThread("loan", 3000.0));
		tasks.add(new ContaThread("credit", 1000.0));



		var workers = new ArrayList<Thread>();
		tasks.forEach(t -> {
			Thread worker = new Thread(t);
			worker.setName("Thread actual");
			workers.add(worker);
			worker.start();

			System.out.println("Iniciada: " + worker.getName());

        });
		workers.forEach(w -> {
            try {
                w.join();
            } catch (InterruptedException e) {
				System.out.println("Impossible realize transaction workers");
            }

        });

		System.out.println("Process Finished");

	}
	
	
	

}
