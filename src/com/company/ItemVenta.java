package com.company;

public class ItemVenta {
    int id;
    String descripcion;
    int cantidad;
    double pUnitario;
    double pTotal;

    public ItemVenta(int id, String descripcion, int cantidad, double pUnitario) {
        this.id = id;
        this.descripcion = descripcion;
        this.cantidad = cantidad;
        this.pUnitario = pUnitario;
        this.pTotal = getTotal();
    }

    public double getTotal(){
        return this.cantidad * this.pUnitario;
    }

    public void showItemVenta(){
        String output = String.format("ItemVenta[id=%d, descripcion=%s, cantidad=%d, pUnitario=%1.2f, pTotal=%1.2f]", this.id, this.descripcion, this.cantidad, this.pUnitario, this.pTotal);
        System.out.println(output);
    }
}
