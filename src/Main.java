public class Main {
    public static void main(String[] args) {
        // Crear objetos Customer con datos diferentes
        Customer customer1 = new Customer("Ana", "García", "12345678X");
        Customer customer2 = new Customer("Carlos", "López", "23456789Y");
        Customer customer3 = new Customer("Laura", "Martínez", "34567890Z");

        // Puedes usar métodos getters para acceder a los datos de los clientes
        System.out.println("Cliente 1: " + customer1.getNombre() + " " + customer1.getApellido() + ", DNI: " + customer1.getDni());
        System.out.println("Cliente 2: " + customer2.getNombre() + " " + customer2.getApellido() + ", DNI: " + customer2.getDni());
        System.out.println("Cliente 3: " + customer3.getNombre() + " " + customer3.getApellido() + ", DNI: " + customer3.getDni());
    }
}
