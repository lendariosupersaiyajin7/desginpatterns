package Facade;

public class ComputerFacade {
    private CPU cpu;
    private Memory memory;
    private HardDrive hardDrive;

    public ComputerFacade() {
        this.cpu = new CPU();
        this.memory = new Memory();
        this.hardDrive = new HardDrive();
    }

    public void start() {
        System.out.println("Iniciando o computador...");
        cpu.start();
        String bootData = hardDrive.read(0, 1024);
        memory.load(0, bootData);
        cpu.execute();
        System.out.println("Computador inicializado com sucesso!");
    }
}
