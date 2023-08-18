class Topping {
    private String nombre;

    public Topping(String nombre) {
        this.nombre = nombre;
    }

    public void agregar(Pizza pizza) {
        System.out.println("Se agrega el topping " + nombre + " a la pizza " + pizza.getNombre() + ".");
        pizza.getIngredientes().add(nombre);
    }
}