public class Computer {
    private int memory;
    private int cpu;
    private String name;

    Computer(){};
    Computer(int memory, int cpu, String name){
        this.memory = memory;
        this.cpu = cpu;
        this.name = name;
    }

    void setMemory(int m){
        memory = m;
    }
    void getMemory(){
        System.out.print("Memory: " + memory + " ");
    }

    void setCpu(int c){
        cpu = c;
    }
    void getCpu(){
        System.out.print("Cpu: " + cpu + " ");
    }

    void setName(String n){
        name = n;
    }
    void getName(){
        System.out.print("Name: " + name);
    }
}
