package dobleh;

public class persona {
    private String name;
    private String address;

    public persona(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "persona[nombre=" + name + ",direccion=" + address + "]";
    }
}
