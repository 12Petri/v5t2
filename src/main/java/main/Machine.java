package main;

public class Machine {
    private String type;
    private String model;
    private Worker operator;

    public Machine(String type, String model, Worker operator) {
        this.type = type;
        this.model = model;
        this.operator = operator;
    }
    
    public void printMachineDetails() {
        System.out.println("Koneen tiedot: " + type + ", " + model);
        System.out.println("Työntekijän tiedot: " + operator.getWorkerName() + ", " + operator.getWorkerRole());
    }
}