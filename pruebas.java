public class pruebas {
    public static void main(String[] args) {
        /*
        //Forma 1
        usuario user = new usuario();
        user.setNombre("Victor");
        user.setApellido("Lliuya");
        user.setDni(12345678);
        user.setEdad(27); */
        
        //Forma 2
        /*
         * usuario user = new usuario("Alonso", "Villagaray", 29, 87654321);

        System.out.println(user.getNombre());
        System.out.println(user.getApellido());
        System.out.println(user.toString());
        System.out.println(user.getContraseña());

        user.setContraseña("Alumno");

        System.out.println(user.getContraseña());
         */
        
        admin adm = new admin("Juan", "Pérez", 34, 12345678, "Root", "1234", 91154);

        System.out.println(adm.getNombre());
        System.out.println(adm.getApellido());

        System.out.println(adm.toString());
    }
}
