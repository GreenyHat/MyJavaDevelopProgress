package myjavadevelopprogress.pildoras_informaticas.POO.Ex_Branch;

public class Package {

    private byte sendRef;
    private double weight;
    private String idSender;
    private byte sendPriority;// 0 normal, 1 hight, 2 urgent

    public Package() {
        this.sendRef = sendRef;
        this.weight = weight;
        this.idSender = idSender;
        this.sendPriority = sendPriority;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setSendPriority(byte sendPriority) {
        this.sendPriority = sendPriority;
    }

    public double getWeight() {
        return weight;
    }

    public byte getSendPriority() {
        return sendPriority;
    }

}
