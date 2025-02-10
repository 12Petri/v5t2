package main;

import java.util.ArrayList;

public class Factory {
    private String name;
    private ArrayList<Machine> machines;
    
    public Factory(String name) {
        this.name = name;
        this.machines = new ArrayList<>();
    }
    
    public void addMachine(String type, String model, String name, String Role) {
        Worker worker = new Worker(name, Role);
        Machine machine = new Machine(type, model, worker);
        machines.add(machine);
        System.out.println("Kone lisätty!");
    }

    public void showMachines() {
        if (machines == null) {
            System.out.println("Ei koneita lisättynä.");
        }
        else {
            System.out.println("Tehtaasta " + name + " löytyy seuraavat koneet:");
            for (Machine machine : machines) {
                machine.printMachineDetails();
                System.out.println();
            }
        }
    }
}