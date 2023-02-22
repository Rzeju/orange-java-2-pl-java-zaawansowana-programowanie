package pl.bonus.zad18_zad19_prezentacja;

import java.util.Objects;

public class Computer {

    private String processor;
    private String ram;
    private String graphicCard;
    private String producer;
    private String model;

    public Computer(String processor, String ram, String graphicCard, String producer, String model) {
        this.processor = processor;
        this.ram = ram;
        this.graphicCard = graphicCard;
        this.producer = producer;
        this.model = model;
    }

    public String getProcessor() {
        return processor;
    }

    public void setProcessor(String processor) {
        this.processor = processor;
    }

    public String getRam() {
        return ram;
    }

    public void setRam(String ram) {
        this.ram = ram;
    }

    public String getGraphicCard() {
        return graphicCard;
    }

    public void setGraphicCard(String graphicCard) {
        this.graphicCard = graphicCard;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Computer computer = (Computer) o;
        return Objects.equals(processor, computer.processor) && Objects.equals(ram, computer.ram) && Objects.equals(graphicCard, computer.graphicCard) && Objects.equals(producer, computer.producer) && Objects.equals(model, computer.model);
    }

    @Override
    public int hashCode() {
        return Objects.hash(processor, ram, graphicCard, producer, model);
    }

    @Override
    public String toString() {
        return "Computer{" +
                "processor='" + processor + '\'' +
                ", ram='" + ram + '\'' +
                ", graphicCard='" + graphicCard + '\'' +
                ", producer='" + producer + '\'' +
                ", model='" + model + '\'' +
                '}';
    }
}
