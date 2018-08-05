package structural.facade

class Computer {

    private CPU cpu
    private Memory memory
    private HardDrive hardDrive

    Computer() {
        this.cpu = new CPU()
        this.memory = new Memory()
        this.hardDrive = new HardDrive()
    }

    void startComputer() {
        cpu.freeze()
        memory.load(1, hardDrive.read(1, 1))
        cpu.jump(1)
        cpu.execute()
    }
}
