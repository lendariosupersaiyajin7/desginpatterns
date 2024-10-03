package Facade;
class CPU {
    public void start() {
        System.out.println("CPU inicializada.");
    }

    public void execute() {
        System.out.println("CPU executando instruções.");
    }
}

class Memory {
    public void load(long position, String data) {
        System.out.println("Carregando dados na posição " + position + ": " + data);
    }
}

class HardDrive {
    public String read(long lba, int size) {
        return "Dados do disco lidos.";
    }
}
