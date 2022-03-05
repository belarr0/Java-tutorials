public class Computer {
    private int memory;
    private int cpu;
    private String name;

    /*
    Computer(int defMemory, int defCpu, String defName){
        memory = defMemory;
        cpu = defCpu;
        name = defName;
    }
     */

    Computer () {};

    Computer(int memory, int cpu, String name){
        this.memory = memory;
        this.cpu = cpu;
        this.name = name;
    }

    void setMemory(int m){
        memory = m;
    }
    void setCpu(int c) {
        cpu = c;
    }
    void setName(String n) {
        name = n;
    }

    void getCpu(){
        System.out.println("Cpu: " + cpu);
    }
    void getMemory(){
        System.out.println("Memory: " + memory);
    }
    void getName(){
        System.out.println("Name: " + name);
    }

}
